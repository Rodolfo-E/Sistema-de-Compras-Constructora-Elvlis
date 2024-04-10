package Constructora.com.gui;

import Constructora.com.jdbc.clsIngreso;
import Constructora.com.jdbc.clsUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TableView;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmIngreso extends javax.swing.JFrame {

    clsUsuario objusuario = new clsUsuario();
    String usu = "", clav = "";
    boolean est = false;
    int num;

    public frmIngreso() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        PonerIcono();
        CargarImagen();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
        txtCont = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 0));
        jPanel3.setForeground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ingreso al Sistema");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 490, 50));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setText("Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, -1));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, -1));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 110, -1));

        lblimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoem.jpg"))); // NOI18N
        lblimage.setToolTipText("");
        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblimage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 190, 200));

        txtCont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(txtCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 190, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 580, 270));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        boolean res = false, res2 = false;
        
        if (txtUsu.getText().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Ingrese el usurio","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
            txtUsu.requestFocus();
        } else if (txtCont.getText().equals("") == true) {
            JOptionPane.showMessageDialog(null, "Ingrese su contraseña","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
            txtCont.requestFocus();
        } else {

            List<String> sesion = new ArrayList<String>();
            usu = txtUsu.getText();
            clav = txtCont.getText();

            objusuario.setNombre(usu);
            objusuario.setClave(clav);
            // llamando al metodo para validar usuario
            res = objusuario.ValidarUsuario(objusuario);

            if (res == true) {
                res2 = objusuario.EstadoUsuario(objusuario);
                if (res2 == true) {
                    sesion = objusuario.ObtenerUsuario(objusuario);
                 //   JOptionPane.showMessageDialog(null, sesion.get(0));//codigo del empleado
                    //  JOptionPane.showMessageDialog(null, sesion.get(1));//nombre del empleadp
                    //   JOptionPane.showMessageDialog(null, sesion.get(2));//apellido del empleado
                    //   JOptionPane.showMessageDialog(null, sesion.get(3));//estado del empleado
                    //  JOptionPane.showMessageDialog(null, sesion.get(4));//nombre de usuario
                    //  JOptionPane.showMessageDialog(null, sesion.get(4));//nombre de perfil

                    JOptionPane.showMessageDialog(null, "Bienvenidos al Sistema", "Ingresando al Sistema", JOptionPane.INFORMATION_MESSAGE);
                    frmMenuPrincipal formulario = new frmMenuPrincipal();
                    formulario.lblUsuario.setText(" Usuario Conectado:  " + sesion.get(4));
                    formulario.lblCodEmp.setText(sesion.get(0));

                    switch (sesion.get(5).toLowerCase()) {
                        //para los menu
                        case "administrador del sistema":
                            formulario.jmMatenimiento.setVisible(true);
                            formulario.jmiAreaBusqueda.setVisible(true);
                   
                            formulario.jmReporte.setVisible(true);
           
                            formulario.jmSalir.setVisible(true);
                            break;
                        case "administrador":
                            formulario.jmMatenimiento.setVisible(false);
                            formulario.jmiAreaBusqueda.setVisible(true);
                          
                            formulario.jmReporte.setVisible(true);
                           
                            formulario.jmSalir.setVisible(true);
                            break;
                        case "vendedor":
                            formulario.jmMatenimiento.setVisible(false);
                            formulario.jmiAreaBusqueda.setVisible(true);
               
                            formulario.jmReporte.setVisible(false);
                          
                            formulario.jmSalir.setVisible(true);
                            break;
                        case "cajero":
                            formulario.jmMatenimiento.setVisible(false);
                            formulario.jmiAreaBusqueda.setVisible(true);
       
                            formulario.jmReporte.setVisible(false);
                  
                            formulario.jmSalir.setVisible(true);
                            break;
                        default:
                            formulario.jmMatenimiento.setVisible(false);
                            formulario.jmiAreaBusqueda.setVisible(false);
                       
                            formulario.jmReporte.setVisible(false);
                        
                            formulario.jmSalir.setVisible(true);
                    }
                    formulario.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no habilitado", "Error al Ingreso al Sistema", JOptionPane.ERROR_MESSAGE);
                    Limpiar();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Clave no valida", "Error al Ingreso al Sistema", JOptionPane.ERROR_MESSAGE);
                Limpiar();

            }
    }//GEN-LAST:event_btnIngresarActionPerformed
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?", "Saliendo del Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opcion == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnSalirActionPerformed
    //agragando un procedimiento para cambiar el icono de la aplicacion
    private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);

    }

    void CargarImagen() {
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/logoem.jpg"));
            Image imagen;
            int alto = lblimage.getHeight();
            int ancho = lblimage.getWidth();
            imagen = icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT);
            lblimage.setIcon(new ImageIcon(imagen));

        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }

    void Limpiar() {
        txtUsu.setText("");
        txtCont.setText("");
        txtUsu.requestFocus();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblimage;
    private javax.swing.JPasswordField txtCont;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
