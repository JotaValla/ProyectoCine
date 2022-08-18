package Negocio;

import java.sql.*;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//@author Jimmy Valladares
public class OpcionesTabla {
    

    
    public void cargarTabla(PreparedStatement preConsulta, Connection obtenerConexion, ResultSet resultadoTabla, DefaultTableModel modelo, String nombreTabla, String busquedaEspecifica, String[] nombreColumnas) throws SQLException {

        String consulta = "SELECT * FROM " + nombreTabla + busquedaEspecifica;
        System.out.println(consulta);

        preConsulta = obtenerConexion.prepareStatement(consulta);
        resultadoTabla = preConsulta.executeQuery(); // inicializa la consulta

        //Para la tabla
        ResultSetMetaData resultadoTablapersonas = resultadoTabla.getMetaData();
        int cantidadColumnas = resultadoTablapersonas.getColumnCount();

        for (int i = 0; i < cantidadColumnas; i++) {
            modelo.addColumn(nombreColumnas[i]);
        }

        //Recorrer los datos de la consulta
        while (resultadoTabla.next()) { // Mientras deje de haber resultados
            //El modelo de la tabla requiere objetos es decir las filas
            Object[] filas = new Object[cantidadColumnas];

            for (int i = 0; i < cantidadColumnas; i++) {
                filas[i] = resultadoTabla.getObject(i + 1); //Obtener los datos de la consulta
            }
            modelo.addRow(filas);
        }

    }

    public void guardarDatos(PreparedStatement preConsulta, Connection obtenerConexion, ResultSet resultadoTabla, String nombreTablaConAtributos, String[] datosObtenidos, DefaultTableModel modelo, int cantColumnas) throws SQLException {
        String consulta = "INSERT INTO " + nombreTablaConAtributos;

        preConsulta = obtenerConexion.prepareStatement(consulta);

        for (int i = 0; i < cantColumnas; i++) {
            preConsulta.setString(i + 1, datosObtenidos[i]);
            System.out.println(datosObtenidos[i]);
        }
        preConsulta.execute();
        Object[] fila = new Object[cantColumnas];
        for (int i = 0; i < fila.length; i++) {
            fila[i] = datosObtenidos[i];
        }
        modelo.addRow(fila);
    }

    public void eliminarDatos(int filaSeleccionada, String llavePrimaria, String nombreTabla, String nombrePK, PreparedStatement preconsulta, PreparedStatement preconsulta2, Connection obtenerConexion, DefaultTableModel modelo) throws SQLException {
        String consulta = "DELETE FROM " + nombreTabla + " WHERE " + nombrePK + " = ?";
        System.out.println(consulta);
        int opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar la fila", "Eliminar Filas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String desactivarLlave = "SET FOREIGN_KEY_CHECKS = 0";
        preconsulta2 = obtenerConexion.prepareStatement(desactivarLlave);
        preconsulta = obtenerConexion.prepareStatement(consulta);
        preconsulta.setString(1, llavePrimaria);
        if (opcion == JOptionPane.YES_OPTION) {
            preconsulta2.execute();
            preconsulta.execute();
        }
    }

}
