

package Constructora.com.gui;

import Constructora.com.jdbc.clsEmpleado;
import Constructora.com.jdbc.clsProveedor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class frmBusquedaProveedor extends javax.swing.JFrame {
    clsProveedor objproveedor=new clsProveedor();
     clsEmpleado objEmpleado = new clsEmpleado();
    int criterio;
    String val="";
    public frmBusquedaProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        objproveedor.MostrarProveedorTodo(jtbProveedor);
        lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
        PonerIcono();
        CargarCombo();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboFiltro = new javax.swing.JComboBox();
        txtVal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblCodProve = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProveedor = new javax.swing.JTable();
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
        jLabel1.setText("Busqueda Proveedor");
        jLabel1.setToolTipText("");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 380, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 530, 60));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 170, 30));

        txtVal.setToolTipText("");
        txtVal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValKeyPressed(evt);
            }
        });
        jPanel4.add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Filtro");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

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
        jPanel4.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 90, -1));

        lblCodigo.setText("lblCodigo");
        jPanel4.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        lblCodProve.setText("lblCodProve");
        jPanel4.add(lblCodProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 710, 90));

        jtbProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbProveedor.setToolTipText("");
        jtbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProveedor);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 710, 180));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValKeyPressed
        criterio = cboFiltro.getSelectedIndex();
        val = txtVal.getText();
        switch (criterio) {
            case 0:
            if (txtVal.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una opcion del filtro", "Error en la Busqueda", JOptionPane.ERROR_MESSAGE);
                txtVal.setText("");
                cboFiltro.requestFocus();
            }
            break;
            case 1:
            if (txtVal.getText().equals("")) {
                objproveedor.MostrarProveedorTodo(jtbProveedor);
            } else {
                objproveedor.BuscarProveedor(jtbProveedor, "codprove", val);
            }

            break;
            case 2:
            if (txtVal.getText().equals("")) {
                objproveedor.MostrarProveedorTodo(jtbProveedor);
            } else {
                objproveedor.BuscarProveedor(jtbProveedor, "nomprove", val);
            }
            break;
            case 3:
            if (txtVal.getText().equals("")) {
                objproveedor.MostrarProveedorTodo(jtbProveedor);
            } else {
                objproveedor.BuscarProveedor(jtbProveedor, "corprove", val);
            }
            break;
             case 4:
            if (txtVal.getText().equals("")) {
                objproveedor.MostrarProveedorTodo(jtbProveedor);
            } else {
                objproveedor.BuscarProveedor(jtbProveedor, "nomdis", val);
            }
            break;

            default:
            if (txtVal.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una opcion del filtro", "Error en la Busqueda", JOptionPane.ERROR_MESSAGE);
                txtVal.setText("");
                cboFiltro.requestFocus();
            }
        }
    }//GEN-LAST:event_txtValKeyPressed
private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    
    void CargarCombo(){
    cboFiltro.addItem("Seleccione un filtro");
    cboFiltro.addItem("Codigo");
    cboFiltro.addItem("Nombre");
    cboFiltro.addItem("Correo");
    cboFiltro.addItem("Ditrito");
    
}
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        frmBoleto formulario = new frmBoleto();
        formulario.lblCodCli.setText(lblCodProve.getText());
        formulario.lblCodigo.setText(lblCodigo.getText());
        formulario.lblCodUsu.setText(lblUsuario.getText());
        objproveedor.setCodigo(Integer.parseInt(lblCodProve.getText()));
        objEmpleado.setCodigo(Integer.parseInt(lblCodigo.getText()));
        formulario.txtProve.setText(objproveedor.CargarProveedor());
        formulario.txtEmp.setText(objEmpleado.CargarEmpleado());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jtbProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProveedorMouseClicked
         if (evt.getButton() == 1) {
            int fila = jtbProveedor.getSelectedRow();
            lblCodProve.setText(jtbProveedor.getValueAt(fila, 0).toString());
        }
    }//GEN-LAST:event_jtbProveedorMouseClicked

  
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
            java.util.logging.Logger.getLogger(frmBusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBusquedaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProveedor;
    public javax.swing.JLabel lblCodEmp;
    public javax.swing.JLabel lblCodProve;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
