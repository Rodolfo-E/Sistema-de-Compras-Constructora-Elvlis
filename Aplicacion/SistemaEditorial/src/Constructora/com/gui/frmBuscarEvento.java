

package Constructora.com.gui;

import Constructora.com.jdbc.clsCliente;
import Constructora.com.jdbc.clsEmpleado;
import Constructora.com.jdbc.clsEvento;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class frmBuscarEvento extends javax.swing.JFrame {

   
    clsEvento objevento = new clsEvento();
    clsCliente objcliente = new clsCliente();
    clsEmpleado objempleado = new clsEmpleado();
    Object[] fila = new Object[5];
    public JTable jtbAuxiliar = new JTable();
    DefaultTableModel modeloaux;
    String nom = "";

    public frmBuscarEvento() {
        initComponents();
      //  CargarCombo();
        objevento.MostrarEvento(jtbEvento);
       btnEnviar.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboBusqueda = new javax.swing.JComboBox();
        txtVal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        lblCodEve = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCan = new javax.swing.JLabel();
        lblCodCli = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblDatos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEvento = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Busqueda de Eventos\n");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 430, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 560, 60));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cboBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, 30));

        txtVal.setToolTipText("");
        txtVal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValKeyPressed(evt);
            }
        });
        jPanel4.add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Filtro");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, -1));

        btnEnviar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 90, -1));

        lblPrecio.setText("lblPrecio");
        jPanel4.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        lblCodEve.setText("lblCodEve");
        jPanel4.add(lblCodEve, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblNombre.setText("lblNombre");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lblCan.setText("lblCan");
        jPanel4.add(lblCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        lblCodCli.setText("lblCodCli");
        jPanel4.add(lblCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblCod.setText("lblCod");
        jPanel4.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        lblNro.setText("lblNro");
        jPanel4.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblDatos.setText("lblDatos");
        jPanel4.add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 720, 90));

        jtbEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbEvento.setToolTipText("");
        jtbEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbEventoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbEventoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtbEvento);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 730, 180));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValKeyPressed
      
     /*    int valor = cboBusqueda.getSelectedIndex();
        nom = txtVal.getText();
        switch (valor) {
            case 0:

                if (txtVal.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "nomeve", nom);
                }
                break;

            case 1:
                if (txtVal.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "codeve", nom);
                }
                break;
            case 2:
                if (txtVal.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "nomeve", nom);
                }
                break;
            case 3:
                if (txtVal.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "feceve", nom);
                }
                break;
            case 4:
                if (txtNom.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "preeve", nom);
                }
                break;
            case 5:
                if (txtNom.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "caneve", nom);
                }
                break;
            case 6:
                if (txtNom.getText().equals("")) {
                    objevento.MostrarEvento(jtbEvento);
                } else {
                    objevento.BuscarEvento(jtbEvento, "esteve", nom);
                }
                break;
        }*/
        
    }//GEN-LAST:event_txtValKeyPressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jtbEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbEventoMouseClicked
     if (evt.getButton() == 1) {
            int fila = jtbEvento.getSelectedRow();
            lblCodEve.setText(jtbEvento.getValueAt(fila, 0).toString());
            lblNombre.setText(jtbEvento.getValueAt(fila, 1).toString());
            lblPrecio.setText(jtbEvento.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_jtbEventoMouseClicked

    private void jtbEventoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbEventoMousePressed
         JTable table = (JTable) evt.getSource();
        Point p = evt.getPoint();
        int row = table.rowAtPoint(p);
        if (evt.getClickCount() == 2) {
            int can = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de boletos a comprar"));
            lblCan.setText("" + can);

        }
    }//GEN-LAST:event_jtbEventoMousePressed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       frmBoleto formulario = new frmBoleto();
        int datos = Integer.parseInt(lblDatos.getText());
        if (datos == 0) {

            fila[0] = lblCodEve.getText();
            fila[1] = lblNombre.getText();
            fila[2] = lblPrecio.getText();
            fila[3] = lblCan.getText();
            fila[4] = Double.parseDouble(lblPrecio.getText()) * Integer.parseInt(lblCan.getText());
            formulario.modelo.addRow(fila);
        } else {
            modeloaux = (DefaultTableModel) jtbAuxiliar.getModel();
            fila[0] = lblCodEve.getText();
            fila[1] = lblNombre.getText();
            fila[2] = lblPrecio.getText();
            fila[3] = lblCan.getText();
            fila[4] = Double.parseDouble(lblPrecio.getText()) * Integer.parseInt(lblCan.getText());
            modeloaux.addRow(fila);
            formulario.jtbDetalleBoleto.setModel(modeloaux);

        }
        formulario.lblCodCli.setText(lblCodCli.getText());
        formulario.lblCodigo.setText(lblCodEmp.getText());
        objcliente.setCodigo(Integer.parseInt(lblCodCli.getText()));
        objempleado.setCodigo(Integer.parseInt(lblCodEmp.getText()));
        formulario.txtProve.setText(objcliente.CargarCliente());
        formulario.txtEmp.setText(objempleado.CargarEmpleado());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmBuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbEvento;
    private javax.swing.JLabel lblCan;
    private javax.swing.JLabel lblCod;
    public javax.swing.JLabel lblCodCli;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblCodEve;
    public javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNro;
    private javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
