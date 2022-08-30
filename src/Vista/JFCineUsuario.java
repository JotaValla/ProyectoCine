package Vista;

//@author Jimmy Valladares
import Negocio.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFCineUsuario extends javax.swing.JFrame {

    JFMenuCine jfmenuAdmin;
    JFPelicula peliculas;
    JFSala salas;
    JFSalaPelicula salaPelicula;
    DefaultTableModel modelo;
    PreparedStatement preConsulta;
    Connection obtenerConexion;
    ResultSet resultadoTabla;
    Conexion conexion;
    String sala, peliculaID;
    double precio;

    public JFCineUsuario() {
        initComponents();
        this.setLocationRelativeTo(this);
        jfmenuAdmin = new JFMenuCine();
        peliculas = new JFPelicula();
        salaPelicula = new JFSalaPelicula();
        SetImageLabel(jLabelPelicula, sala);
        cargarPeliculas();
        sala = "";
    }

    public void cargarPeliculas() {
        jCBPeliculas.addItem("Selecciona tu pelicula");
        for (int i = 0; i < peliculas.getJtPeliculas().getRowCount(); i++) {
            jCBPeliculas.addItem(peliculas.getJtPeliculas().getValueAt(i, 1).toString());
        }
        jCBPeliculas.setSelectedIndex(0);
    }

    //Método para adecuar la imagen al label
    public void SetImageLabel(JLabel label, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBPeliculas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelPelicula = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAsiento = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        precioAdulto = new javax.swing.JCheckBox();
        precioNiño = new javax.swing.JCheckBox();
        jTFDuracionPeli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCBSalas = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAsiento = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIngresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCBPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPeliculasActionPerformed(evt);
            }
        });

        jLabel1.setText("Peliculas en cartelera");

        jLabelPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Duración de la pelicula:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingreso de información"));

        jLabel7.setText("Nombre:");

        jLabel8.setText("Número de cédula:");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel9.setText("Dirección:");

        jLabel10.setText("Teléfono:");

        jLabel12.setText("Asiento seleccionado");

        txtAsiento.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreUsuario)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtAsiento))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de los boletos"));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ninos.png"))); // NOI18N
        jLabel6.setText("Precio niños:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pareja.png"))); // NOI18N
        jLabel5.setText("Precio adultos:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        precioAdulto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioAdulto.setText("6.00");
        precioAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioAdultoActionPerformed(evt);
            }
        });

        precioNiño.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioNiño.setText("5.00");
        precioNiño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioNiñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(precioNiño, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(precioAdulto)
                    .addComponent(precioNiño))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTFDuracionPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDuracionPeliActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese la sala de su preferencia:");

        jCBSalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBSalasMouseClicked(evt);
            }
        });
        jCBSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSalasActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asientos"));

        jTableAsiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Fila", "Columna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAsiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAsientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAsiento);

        jLabel2.setText("Escoge un asiento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnComprar.setText("Realizar compra");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpiar casilleros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMISalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMISalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Admin");

        jMIngresar.setText("Ingresar");
        jMIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIngresarActionPerformed(evt);
            }
        });
        jMenu2.add(jMIngresar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDuracionPeli, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jCBSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFDuracionPeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
    }//GEN-LAST:event_txtCedulaActionPerformed
    //Metodo para cargar salas
    public void cargarSalas(int fila) {
        jCBSalas.removeAllItems();
        int idPelicula = Integer.parseInt(peliculas.getJtPeliculas().getValueAt(fila, 0).toString());
        int idPeliculaSala;
        for (int i = 0; i < salaPelicula.getjTPeliculaSala().getRowCount(); i++) {
            idPeliculaSala = Integer.parseInt(salaPelicula.getjTPeliculaSala().getValueAt(i, 1).toString());
            if (idPelicula == idPeliculaSala) {
                jCBSalas.addItem(salaPelicula.getjTPeliculaSala().getValueAt(i, 0).toString());
            }
        }
    }

    private void jCBPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPeliculasActionPerformed
        if (jCBPeliculas.getSelectedIndex() == 0) {
            jCBSalas.removeAllItems();
            jCBSalas.addItem("Escoge tu sala");
        } else if (jCBPeliculas.getSelectedIndex() == 1) {
            cargarSalas(0);
            jTFDuracionPeli.setText("2:00 Horas");
            SetImageLabel(jLabelPelicula, "src/Imagenes/MonsterInc.png");
            peliculaID = peliculas.getJtPeliculas().getValueAt(0, 0).toString();
        } else if (jCBPeliculas.getSelectedIndex() == 2) {
            cargarSalas(1);
            jTFDuracionPeli.setText("2:00 Horas");
            SetImageLabel(jLabelPelicula, "src/Imagenes/trenbala.jpeg");
            peliculaID = peliculas.getJtPeliculas().getValueAt(1, 0).toString();
        } else if (jCBPeliculas.getSelectedIndex() == 3) {
            cargarSalas(2);
            jTFDuracionPeli.setText("2:00 Horas");
            SetImageLabel(jLabelPelicula, "src/Imagenes/dbs.jpeg");
            peliculaID = peliculas.getJtPeliculas().getValueAt(2, 0).toString();
        } else if (jCBPeliculas.getSelectedIndex() == 4) {
            cargarSalas(3);
            jTFDuracionPeli.setText("2:00 Horas");
            SetImageLabel(jLabelPelicula, "src/Imagenes/bolt.jpeg");
            peliculaID = peliculas.getJtPeliculas().getValueAt(3, 0).toString();
        } else if (jCBPeliculas.getSelectedIndex() == 5) {
            cargarSalas(4);
            jTFDuracionPeli.setText("2:00 Horas");
            SetImageLabel(jLabelPelicula, "src/Imagenes/it2.jpeg");
            peliculaID = peliculas.getJtPeliculas().getValueAt(4, 0).toString();
        } else {
            for (int i = 6; i < jCBPeliculas.getItemCount(); i++) {
                if (jCBPeliculas.getSelectedIndex() == i) {
                    cargarSalas(i - 1);
                    jTFDuracionPeli.setText("2:00 Horas");
                    SetImageLabel(jLabelPelicula, "src/Imagenes/default.jpeg");
                    peliculaID = peliculas.getJtPeliculas().getValueAt(i - 1, 0).toString();
                }
            }
        }
    }//GEN-LAST:event_jCBPeliculasActionPerformed


    private void jTFDuracionPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDuracionPeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDuracionPeliActionPerformed

    public void cargarTabla(String opcion) {
        try {
            //modelo de la tabla
            modelo = new DefaultTableModel();
            jTableAsiento.setModel(modelo);
            preConsulta = null;
            resultadoTabla = null;
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();

            String consulta = "SELECT id_asiento, fila, columna FROM asiento_has_sala S JOIN asiento A ON (S.asiento_id_asiento = A.id_asiento) AND disponibilidad = TRUE AND sala_id_sala = ?";
            System.out.println(consulta);

            preConsulta = obtenerConexion.prepareStatement(consulta);

            preConsulta.setString(1, opcion);

            resultadoTabla = preConsulta.executeQuery(); // inicializa la consulta

            //Para la tabla
            ResultSetMetaData resultadoTablapersonas = resultadoTabla.getMetaData();
            int cantidadColumnas = resultadoTablapersonas.getColumnCount();

            //Encabezados de las columnas para saber donde insertar
            modelo.addColumn("Codigo");
            modelo.addColumn("Fila");
            modelo.addColumn("Columna");

            //Recorrer los datos de la consulta
            while (resultadoTabla.next()) { // Mientras deje de haber resultados
                //El modelo de la tabla requiere objetos es decir las filas
                Object[] filas = new Object[cantidadColumnas];

                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = resultadoTabla.getObject(i + 1); //Obtener los datos de la consulta
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void actualizarDisponibilidad(String opcion) {

        preConsulta = null;
        modelo = new DefaultTableModel();
        conexion = new Conexion();
        obtenerConexion = conexion.getConexion();
        try {
            int Fila = jTableAsiento.getSelectedRow();
            String codigo = jTableAsiento.getValueAt(Fila, 0).toString();
            String consulta = "UPDATE asiento_has_sala set disponibilidad = 0 " + " WHERE asiento_id_asiento = " + codigo
                    + " AND sala_id_sala = " + opcion;
            preConsulta = obtenerConexion.prepareStatement(consulta);
            System.out.println(consulta);
            preConsulta.execute();
            cargarTabla(opcion);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    private void jCBSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSalasActionPerformed
        cargarTabla(jCBSalas.getItemAt(jCBSalas.getSelectedIndex()));
        sala = jCBSalas.getItemAt(jCBSalas.getSelectedIndex());
    }//GEN-LAST:event_jCBSalasActionPerformed

    public void setearDatos(String opcion) {
        preConsulta = null;
        resultadoTabla = null;
        try {
            conexion = new Conexion();
            obtenerConexion = conexion.getConexion();
            int Fila = jTableAsiento.getSelectedRow();
            String codigo = jTableAsiento.getValueAt(Fila, 0).toString();
            String consulta = "SELECT id_asiento, fila, columna FROM asiento_has_sala S JOIN asiento A "
                    + "ON (S.asiento_id_asiento = A.id_asiento) AND disponibilidad = TRUE AND sala_id_sala = ? WHERE id_asiento = ?";
            preConsulta = obtenerConexion.prepareStatement(consulta);
            preConsulta.setString(1, opcion);
            preConsulta.setString(2, codigo);
            resultadoTabla = preConsulta.executeQuery();
            while (resultadoTabla.next()) {
                txtAsiento.setText(resultadoTabla.getString("id_asiento"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jTableAsientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAsientoMouseClicked
        setearDatos(jCBSalas.getItemAt(jCBSalas.getSelectedIndex()));

    }//GEN-LAST:event_jTableAsientoMouseClicked

    private void jCBSalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBSalasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBSalasMouseClicked

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        JFTicket ticket = new JFTicket();
        JFPersona persona = new JFPersona();
        JFactura facturaTicket = new JFactura();
        String consulta2 = "INSERT INTO usuario(DNI, nombre, direccion, telefono) VALUES('" + txtCedula.getText() + "', '" + txtNombreUsuario.getText() + "', '" + txtDireccion.getText() + "', '" + txtTelefono.getText() + "')";
        persona.guardarDatos(consulta2, evt);
        JOptionPane.showMessageDialog(null, "Ticket generado");
        String consulta = "INSERT INTO ticket(vendido,precio,usuario_DNI,sala_id_sala,id_pelicula,id_asiento,id_sala) "
                + "VALUES ('Vendido', '" + precio + "', '" + txtCedula.getText() + "', '" + sala + "', '" + peliculaID + "', '" + txtAsiento.getText() + "', '" + sala + "')";
        ticket.guardarDatos(consulta, evt);
        String factura = ("\n\t\tFACTURA\nNombre: " + txtNombreUsuario.getText() + "\nDireccion: " + txtDireccion.getText() + "\nTelefono: "
                + txtTelefono.getText() + "\nCedula: " + txtCedula.getText() + "\nPelicula: "
                + (String) jCBPeliculas.getSelectedItem() + "\nSala: " + sala + "\nAsiento: " + txtAsiento.getText() + "\nPrecio: " + precio);
        facturaTicket.setVisible(true);
        facturaTicket.cargarFactura(factura, evt);
        actualizarDisponibilidad(jCBSalas.getItemAt(jCBSalas.getSelectedIndex()));
    }//GEN-LAST:event_btnComprarActionPerformed

    private void precioAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioAdultoActionPerformed
        precio = 6.50;
        precioNiño.setSelected(false);
    }//GEN-LAST:event_precioAdultoActionPerformed

    private void precioNiñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioNiñoActionPerformed
        precio = 5.50;
        precioAdulto.setSelected(false);
    }//GEN-LAST:event_precioNiñoActionPerformed

    private void jMIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngresarActionPerformed
        Login admin = new Login();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMIngresarActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jCBPeliculas.setSelectedIndex(0);
        jCBSalas.setSelectedIndex(0);
        txtAsiento.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtNombreUsuario.setText("");
        precioAdulto.setSelected(false);
        precioNiño.setSelected(false);
        SetImageLabel(jLabelPelicula, sala);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCineUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBPeliculas;
    private javax.swing.JComboBox<String> jCBSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPelicula;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenuItem jMIngresar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDuracionPeli;
    private javax.swing.JTable jTableAsiento;
    private javax.swing.JCheckBox precioAdulto;
    private javax.swing.JCheckBox precioNiño;
    private javax.swing.JTextField txtAsiento;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
