
package Negocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String baseDeDatos = "cine2";
    private final String user = "root";
    private final String password = "Parkour27";
    private final String url = "jdbc:mysql://localhost:3306/" + baseDeDatos;
    private Connection conexion = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException error) {
            System.out.println("El error fue:\n" + error);
        }
        return this.conexion;
    }
}
