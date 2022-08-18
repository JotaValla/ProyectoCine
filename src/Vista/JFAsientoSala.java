package Vista;

//@author Jimmy Valladares
import Negocio.Conexion;
import Negocio.OpcionesTabla;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFAsientoSala extends javax.swing.JFrame {

    JFAsiento tablaAsiento;
    DefaultTableModel modelo;
    PreparedStatement preConsulta;
    Connection obtenerConexion;
    ResultSet resultadoTabla;
    Conexion conexion;
    OpcionesTabla operacionesTabla;
    ActionEvent evt = null;

    public JFAsientoSala() {
        initComponents();
        //setIconImage(getIconImage());
        tablaAsiento = new JFAsiento();
        operacionesTabla = new OpcionesTabla();
        btnCargarAsientoActionPerformed(evt);
        btnCargarSalaActionPerformed(evt);
        btnCargarAsientoSalaActionPerformed(evt);
        txtIDsalaAsiento.setEnabled(false);
        this.setLocationRelativeTo(this);
    }

    public void limpiar() {
        txtIdSalaAsientoBuscar.setText("");
        txtIDsalaAsiento.setText("");
        txtIDSala.setText("");
        txtIDAsiento.setText("");
        txtCodigoBuscarAsiento.setText("");
        txtCodigoBuscarSala.setText("");
    }

    //Imagen
//    @Override
//    public Image getIconImage() {
//        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Images/menu.png"));
//        return icono;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSalas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAsientos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDSala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIDsalaAsiento = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbDisponibilidad = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAsientoSala = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdSalaAsientoBuscar = new javax.swing.JTextField();
        btnCargarAsientoSala = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCargarSala = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoBuscarSala = new javax.swing.JTextField();
        txtCodigoBuscarAsiento = new javax.swing.JTextField();
        btnCargarAsiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ASIENTO SALA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de salas"));

        jtSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero de sala", "Codigo de la pelicula", "Tipo de sala"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSalasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtSalas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Asientos"));

        jtAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo del asiento", "Fila ", "Columna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAsientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAsientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAsientos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Codigo de la sala:");

        jLabel2.setText("Codigo del asiento:");

        jLabel3.setText("ID sala-asiento:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel4.setText("Disponibilidad");

        jcbDisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtIDsalaAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIDSala))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIDAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIDsalaAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(17, 17, 17))
        );

        jTAsientoSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Asiento - Sala", "ID Sala", "ID Asiento", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTAsientoSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAsientoSalaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTAsientoSala);

        jLabel5.setText("Codio del asiento-sala para una busqueda especifica:");

        btnCargarAsientoSala.setText("Cargar Tabla");
        btnCargarAsientoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAsientoSalaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nro del asiento a buscar");

        btnCargarSala.setText("Cargar tabla de salas");
        btnCargarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarSalaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nro de sala para buscarla:");

        btnCargarAsiento.setText("Cargar tabla de asientos");
        btnCargarAsiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCargarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarAsientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(txtIdSalaAsientoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargarAsientoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoBuscarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3))
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoBuscarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCargarSala)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoBuscarSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoBuscarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdSalaAsientoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarAsientoSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtAsientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAsientosMouseClicked
        preConsulta = null;
        resultadoTabla = null;
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        try {

            int Fila = jtAsientos.getSelectedRow();
            String codigo = jtAsientos.getValueAt(Fila, 0).toString();
            String consulta = "Select * FROM asiento WHERE id_asiento = ?";
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, codigo);
            resultadoTabla = preConsulta.executeQuery();

            while (resultadoTabla.next()) {
                txtIDAsiento.setText(resultadoTabla.getString("id_asiento"));
            }
            txtIDAsiento.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtAsientosMouseClicked

    private void jtSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSalasMouseClicked
        preConsulta = null;
        resultadoTabla = null;
        try {
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();

            int Fila = jtSalas.getSelectedRow();
            String codigo = jtSalas.getValueAt(Fila, 0).toString();
            String consulta = "Select * FROM sala WHERE id_sala = ?";

            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, codigo);
            resultadoTabla = preConsulta.executeQuery();

            while (resultadoTabla.next()) {
                txtIDSala.setText(resultadoTabla.getString("id_sala"));
            }
            txtIDSala.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtSalasMouseClicked

    private void btnCargarAsientoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAsientoSalaActionPerformed
        String SalaAsientoCargar = txtIdSalaAsientoBuscar.getText();
        String where = "";
        String nombreTablaSQL = "sala_asiento";

        String[] columnasNombres = new String[jTAsientoSala.getColumnCount()];
        for (int i = 0; i < columnasNombres.length; i++) {
            columnasNombres[i] = jTAsientoSala.getColumnName(i);
        }

        if (!"".equals(SalaAsientoCargar)) {
            where = " WHERE id_asiento_sala = '" + SalaAsientoCargar + "'";
        }

        //modelo de la tabla
        try {
            modelo = new DefaultTableModel();
            jTAsientoSala.setModel(modelo);
            preConsulta = null;
            resultadoTabla = null;
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            operacionesTabla.cargarTabla(preConsulta, obtenerConexion, resultadoTabla, modelo, nombreTablaSQL, where, columnasNombres);
            limpiar();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnCargarAsientoSalaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCargarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarSalaActionPerformed
        String SalaACargar = txtCodigoBuscarSala.getText();
        String where = "";

        String[] columnasNombres = new String[jtSalas.getColumnCount()];
        for (int i = 0; i < columnasNombres.length; i++) {
            columnasNombres[i] = jtSalas.getColumnName(i);
        }

        String nombreTablaSQL = "sala";

        if (!"".equals(SalaACargar)) {
            where = " WHERE id_sala = '" + SalaACargar + "'";
        }

        try {
            //modelo de la tabla
            modelo = new DefaultTableModel();
            jtSalas.setModel(modelo);

            preConsulta = null;
            resultadoTabla = null;

            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            operacionesTabla.cargarTabla(preConsulta, obtenerConexion, resultadoTabla, modelo, nombreTablaSQL, where, columnasNombres);
            limpiar();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCargarSalaActionPerformed

    private void btnCargarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarAsientoActionPerformed
        String AsientoACargar = txtCodigoBuscarAsiento.getText();
        String where = "";
        String nombreTablaSQL = "asiento";

        String[] columnasNombres = new String[jtAsientos.getColumnCount()];
        for (int i = 0; i < columnasNombres.length; i++) {
            columnasNombres[i] = jtAsientos.getColumnName(i);
        }

        if (!"".equals(AsientoACargar)) {
            where = " WHERE id_asiento = '" + AsientoACargar + "'";
        }

        try {
            //modelo de la tabla
            modelo = new DefaultTableModel();
            jtAsientos.setModel(modelo);

            preConsulta = null;
            resultadoTabla = null;

            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            operacionesTabla.cargarTabla(preConsulta, obtenerConexion, resultadoTabla, modelo, nombreTablaSQL, where, columnasNombres);
            limpiar();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCargarAsientoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        preConsulta = null;
        modelo = new DefaultTableModel();
        int cantColumnas = jTAsientoSala.getColumnCount() - 1;
        try {
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            String consulta = "INSERT INTO sala_asiento(id_sala, id_asiento, disponibilidad) VALUES(?, ?, ?)";
            Boolean disponibilidad = null;
            if (jcbDisponibilidad.getSelectedIndex() == 0) {
                disponibilidad = false;
            } else {
                disponibilidad = true;
            }

            preConsulta = obtenerConexion.prepareStatement(consulta);

            preConsulta.setString(1, txtIDSala.getText());
            preConsulta.setString(2, txtIDAsiento.getText());
            preConsulta.setBoolean(3, disponibilidad);

            preConsulta.execute();

            JOptionPane.showMessageDialog(null, "Relacion Guardada");
            Object[] fila = new Object[cantColumnas];
            fila[0] = txtIDSala.getText();
            fila[1] = txtIDAsiento.getText();
            fila[2] = disponibilidad;
            modelo.addRow(fila);
            limpiar();
            btnCargarAsientoSalaActionPerformed(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar la relacion");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTAsientoSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAsientoSalaMouseClicked
        preConsulta = null;
        resultadoTabla = null;
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        String disponibilidad = "";
        if (jcbDisponibilidad.getSelectedIndex() == 0) {
            disponibilidad = "false";
        } else {
            disponibilidad = "true";
        }
        try {
            int Fila = jTAsientoSala.getSelectedRow();
            String codigo = jTAsientoSala.getValueAt(Fila, 0).toString();
            String consulta = "Select * FROM sala_asiento WHERE id_asiento_sala = ?";
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, codigo);
            resultadoTabla = preConsulta.executeQuery();

            while (resultadoTabla.next()) {
                int indice = 0;
                if (resultadoTabla.getBoolean("disponibilidad") == false) {
                    indice = 0;
                } else {
                    indice = 1;
                }
                txtIDsalaAsiento.setText(resultadoTabla.getString("id_asiento_sala"));
                txtIDSala.setText(resultadoTabla.getString("id_sala"));
                txtIDAsiento.setText(resultadoTabla.getString("id_asiento"));
                jcbDisponibilidad.setSelectedIndex(indice);
            }
            txtIDAsiento.setEnabled(false);
            txtIDSala.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTAsientoSalaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        preConsulta = null;
        modelo = new DefaultTableModel();
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        Boolean disponibilidad = null;

        if (jcbDisponibilidad.getSelectedIndex() == 0) {
            disponibilidad = false;
        } else {
            disponibilidad = true;
        }
        try {
            String idAsientoSala = jTAsientoSala.getValueAt(jTAsientoSala.getSelectedRow(), 0).toString();
            String consulta = "UPDATE sala_asiento set disponibilidad = " + disponibilidad + " WHERE id_asiento_sala = " + idAsientoSala;
            preConsulta = obtenerConexion.prepareStatement(consulta);
            System.out.println(consulta);
            preConsulta.execute();
            JOptionPane.showMessageDialog(null, "Relacion Actualizada");
            btnCargarAsientoSalaActionPerformed(evt);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar el asiento");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        modelo = new DefaultTableModel();
        PreparedStatement preConsulta2 = null;
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        try {
            int Fila = jTAsientoSala.getSelectedRow();
            String codigo = jTAsientoSala.getValueAt(Fila, 0).toString();
            String nombreTabla = "sala_asiento";
            String nombrePK = "id_asiento_sala";
            operacionesTabla.eliminarDatos(Fila, codigo, nombreTabla, nombrePK, preConsulta, preConsulta2, obtenerConexion, modelo);
            btnCargarAsientoSalaActionPerformed(evt);
            limpiar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAsientoSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarAsiento;
    private javax.swing.JButton btnCargarAsientoSala;
    private javax.swing.JButton btnCargarSala;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTAsientoSala;
    private javax.swing.JComboBox<String> jcbDisponibilidad;
    private javax.swing.JTable jtAsientos;
    private javax.swing.JTable jtSalas;
    private javax.swing.JTextField txtCodigoBuscarAsiento;
    private javax.swing.JTextField txtCodigoBuscarSala;
    private javax.swing.JTextField txtIDAsiento;
    private javax.swing.JTextField txtIDSala;
    private javax.swing.JTextField txtIDsalaAsiento;
    private javax.swing.JTextField txtIdSalaAsientoBuscar;
    // End of variables declaration//GEN-END:variables

}
