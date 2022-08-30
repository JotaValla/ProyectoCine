package Vista;

//@author Jimmy Valladares
import Negocio.Conexion;
import Negocio.OpcionesTabla;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JFSalaPelicula extends javax.swing.JFrame {

    DefaultTableModel modelo;
    PreparedStatement preConsulta;
    Connection obtenerConexion;
    ResultSet resultadoTabla;
    Conexion conexion;
    OpcionesTabla operacionesTabla;
    ActionEvent evt = null;

    public JFSalaPelicula() {
        initComponents();
        operacionesTabla = new OpcionesTabla();
        btnCargarPeliculaActionPerformed(evt);
        btnCargarSalaActionPerformed(evt);
        btnCargarPeliculaSalaActionPerformed(evt);
        this.setLocationRelativeTo(this);
    }

    //Getters and setters
    public JTable getjTPeliculaSala() {
        return jTPeliculaSala;
    }

    public void setjTPeliculaSala(JTable jTPeliculaSala) {
        this.jTPeliculaSala = jTPeliculaSala;
    }

    public void limpiar() {
        txtIDSala.setText("");
        txtIDPelicula.setText("");
        txtCodigoBuscarPelicula.setText("");
        txtCodigoBuscarSala.setText("");
        txtIDPelicula.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtSalas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPeliculas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDSala = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDPelicula = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTPeliculaSala = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtIdSalaAsientoBuscar = new javax.swing.JTextField();
        btnCargarPeliculaSala = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCargarSala = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoBuscarSala = new javax.swing.JTextField();
        txtCodigoBuscarPelicula = new javax.swing.JTextField();
        btnCargarPelicula = new javax.swing.JButton();

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de Peliculas"));

        jtPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo de la pelicula", "Nombre de la pelicula", "Genero de la pelicula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jtPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPeliculas);

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

        jLabel2.setText("Codigo de la pelicula:");

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

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDSala))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 120, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(17, 17, 17))
        );

        jTPeliculaSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Sala", "ID Pelicula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTPeliculaSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPeliculaSalaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTPeliculaSala);

        jLabel5.setText("Codigo de la pelicula-sala para una busqueda especifica:");

        btnCargarPeliculaSala.setText("Cargar Tabla");
        btnCargarPeliculaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPeliculaSalaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nro de la pelicula a buscar:");

        btnCargarSala.setText("Cargar tabla de salas");
        btnCargarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarSalaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nro de sala para buscarla:");

        btnCargarPelicula.setText("Cargar tabla de peliculas");
        btnCargarPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCargarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPeliculaActionPerformed(evt);
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
                .addComponent(btnCargarPeliculaSala, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtCodigoBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtCodigoBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdSalaAsientoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarPeliculaSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPeliculasMouseClicked
        preConsulta = null;
        resultadoTabla = null;
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        try {

            int Fila = jtPeliculas.getSelectedRow();
            String codigo = jtPeliculas.getValueAt(Fila, 0).toString();
            String consulta = "Select * FROM pelicula WHERE id_pelicula = ?";
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, codigo);
            resultadoTabla = preConsulta.executeQuery();

            while (resultadoTabla.next()) {
                txtIDPelicula.setText(resultadoTabla.getString("id_pelicula"));
            }
            txtIDPelicula.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jtPeliculasMouseClicked

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

    private void btnCargarPeliculaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPeliculaSalaActionPerformed
        String SalaPeliculaCargar = txtIdSalaAsientoBuscar.getText();
        String where = "";
        String nombreTablaSQL = "sala_has_pelicula";

        String[] columnasNombres = new String[jTPeliculaSala.getColumnCount()];
        for (int i = 0; i < columnasNombres.length; i++) {
            columnasNombres[i] = jTPeliculaSala.getColumnName(i);
        }

        if (!"".equals(SalaPeliculaCargar)) {
            where = " WHERE sala_id_sala = '" + SalaPeliculaCargar + "'";
        }

        //modelo de la tabla
        try {
            modelo = new DefaultTableModel();
            jTPeliculaSala.setModel(modelo);
            preConsulta = null;
            resultadoTabla = null;
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            operacionesTabla.cargarTabla(preConsulta, obtenerConexion, resultadoTabla, modelo, nombreTablaSQL, where, columnasNombres);
            limpiar();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnCargarPeliculaSalaActionPerformed

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

    private void btnCargarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPeliculaActionPerformed
        String PeliculaACargar = txtCodigoBuscarPelicula.getText();
        String where = "";
        String nombreTablaSQL = "pelicula";

        String[] columnasNombres = new String[jtPeliculas.getColumnCount()];
        for (int i = 0; i < columnasNombres.length; i++) {
            columnasNombres[i] = jtPeliculas.getColumnName(i);
        }

        if (!"".equals(PeliculaACargar)) {
            where = " WHERE id_pelicula = '" + PeliculaACargar + "'";
        }

        try {
            //modelo de la tabla
            modelo = new DefaultTableModel();
            jtPeliculas.setModel(modelo);

            preConsulta = null;
            resultadoTabla = null;

            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            operacionesTabla.cargarTabla(preConsulta, obtenerConexion, resultadoTabla, modelo, nombreTablaSQL, where, columnasNombres);
            limpiar();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCargarPeliculaActionPerformed

    //Metodo verificar sala
    public boolean verificarSalaP(int sala) {
        boolean verificacion = false;
        int id = 0;
        for (int i = 0; i < jTPeliculaSala.getRowCount(); i++) {
            id = Integer.parseInt(jTPeliculaSala.getValueAt(i, 0).toString());
            if (id != sala) {
                verificacion = true;
            } else {
                verificacion = false;
                break;
            }
        }
        return verificacion;
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        preConsulta = null;
        modelo = new DefaultTableModel();
        int cantColumnas = jTPeliculaSala.getColumnCount();
        try {
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            String consulta = "INSERT INTO sala_has_pelicula(sala_id_sala, pelicula_id_pelicula) VALUES(?, ?)";
            if (verificarSalaP(Integer.parseInt(txtIDSala.getText())) == true) {
                preConsulta = obtenerConexion.prepareStatement(consulta);

                preConsulta.setString(1, txtIDSala.getText());
                preConsulta.setString(2, txtIDPelicula.getText());

                preConsulta.execute();

                JOptionPane.showMessageDialog(null, "Relacion Guardada");
                Object[] fila = new Object[cantColumnas];
                fila[0] = txtIDSala.getText();
                fila[1] = txtIDPelicula.getText();
                modelo.addRow(fila);
                limpiar();
                btnCargarPeliculaSalaActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Esta sala ya esta transmitiendo una pelicula");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Guardar la relacion");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTPeliculaSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPeliculaSalaMouseClicked
        preConsulta = null;
        resultadoTabla = null;
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();

        try {
            int Fila = jTPeliculaSala.getSelectedRow();
            String sala = jTPeliculaSala.getValueAt(Fila, 0).toString();
            String pelicula = jTPeliculaSala.getValueAt(Fila, 1).toString();
            String consulta = "Select * FROM sala_has_pelicula WHERE sala_id_sala = ? AND pelicula_id_pelicula = ?";
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, sala);
            preConsulta.setString(2, pelicula);
            resultadoTabla = preConsulta.executeQuery();

            while (resultadoTabla.next()) {
                txtIDSala.setText(resultadoTabla.getString("sala_id_sala"));
                txtIDPelicula.setText(resultadoTabla.getString("pelicula_id_pelicula"));
            }
            txtIDPelicula.setEnabled(true);
            txtIDSala.setEnabled(false);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTPeliculaSalaMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        preConsulta = null;
        modelo = new DefaultTableModel();
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();

        try {
            String idSala = jTPeliculaSala.getValueAt(jTPeliculaSala.getSelectedRow(), 0).toString();
            String idPelicula = jTPeliculaSala.getValueAt(jTPeliculaSala.getSelectedRow(), 1).toString();
            String consulta = "UPDATE sala_has_pelicula set pelicula_id_pelicula = " + txtIDPelicula.getText() + " WHERE sala_id_sala = "
                    + idSala + " AND pelicula_id_pelicula = " + idPelicula;
            preConsulta = obtenerConexion.prepareStatement(consulta);
            System.out.println(consulta);
            preConsulta.execute();
            JOptionPane.showMessageDialog(null, "Relacion Actualizada");
            btnCargarPeliculaSalaActionPerformed(evt);
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
        int opcion;
        try {
            int Fila = jTPeliculaSala.getSelectedRow();
            String sala = jTPeliculaSala.getValueAt(Fila, 0).toString();
            String pelicula = jTPeliculaSala.getValueAt(Fila, 1).toString();
            String desactivarLlave = "SET FOREIGN_KEY_CHECKS = 0";
            String consulta = "DELETE FROM sala_has_pelicula WHERE sala_id_sala = ? AND pelicula_id_pelicula = ?";
            System.out.println(consulta);
            opcion = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea eliminar la relacion", "Relacion de tablas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            preConsulta2 = obtenerConexion.prepareStatement(desactivarLlave);
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, sala);
            preConsulta.setString(2, pelicula);
            if (opcion == JOptionPane.YES_OPTION) {
                preConsulta2.execute();
                preConsulta.execute();
                modelo.removeRow(Fila);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        btnCargarPeliculaSalaActionPerformed(evt);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSalaPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarPelicula;
    private javax.swing.JButton btnCargarPeliculaSala;
    private javax.swing.JButton btnCargarSala;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTPeliculaSala;
    private javax.swing.JTable jtPeliculas;
    private javax.swing.JTable jtSalas;
    private javax.swing.JTextField txtCodigoBuscarPelicula;
    private javax.swing.JTextField txtCodigoBuscarSala;
    private javax.swing.JTextField txtIDPelicula;
    private javax.swing.JTextField txtIDSala;
    private javax.swing.JTextField txtIdSalaAsientoBuscar;
    // End of variables declaration//GEN-END:variables

}
