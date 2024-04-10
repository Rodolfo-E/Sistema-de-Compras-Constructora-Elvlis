package Constructora.com.gui;

import Constructora.com.jdbc.clsCompras;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmCompras extends javax.swing.JFrame {

    clsCompras objcompras = new clsCompras();

    int pro = 0;
    boolean res = false, est = false;
    int cod = 0;

    public frmCompras() {
        initComponents();
        this.setLocationRelativeTo(null);
        objcompras.MostrarCompraTodo(jtbCompras);
        objcompras.ConsultarProveedor(cboProveedor);
        chkHabilitado.setSelected(true);
        lblCodCom.setVisible(false);
        lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
    PonerIcono();
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chkHabilitado = new javax.swing.JCheckBox();
        lblCodCom = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCompras = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnRegre = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Proveedor");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        chkHabilitado.setText("Habilitado");
        jPanel2.add(chkHabilitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblCodCom.setText("lblCodCom");
        jPanel2.add(lblCodCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 71, 50));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jPanel2.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Estado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 560, 110));

        jtbCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCompras);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 570, 155));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        btnRegre.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegre.setText("Regresar");
        btnRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(27, 27, 27)
                .addComponent(btnAct)
                .addGap(31, 31, 31)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnRegre)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegre)
                    .addComponent(btnEliminar)
                    .addComponent(btnAct)
                    .addComponent(btnRegistrar)
                    .addComponent(btnNuevo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 570, 70));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Compras");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 560, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      try{
          if(cboProveedor.getSelectedIndex()==0){
              JOptionPane.showMessageDialog(null, "Seleccione el provedor","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
              cboProveedor.requestFocus();
          }else{
           pro = cboProveedor.getSelectedIndex();
        est = chkHabilitado.isSelected();

        objcompras.setNombreproveedor(pro);
        objcompras.setEstado(est);

        res = objcompras.RegistrarCompra(objcompras);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Compra Registrado");
            objcompras.MostrarCompraTodo(jtbCompras);
            Limpiar();
            Bloquear();

        } else {
            JOptionPane.showMessageDialog(null, "No se registro el compra ");
            Limpiar();

        }
          }
      }catch(Exception ex){
          System.err.println(ex.toString());
      }
       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    void Bloquear() {
        cboProveedor.setEnabled(false);
        chkHabilitado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnAct.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }

    void Desbloquear() {
        cboProveedor.setEnabled(true);
    
        chkHabilitado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnAct.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
    }

    void Limpiar() {
        cboProveedor.setSelectedIndex(0);
        cboProveedor.requestFocus();
    }
    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
       try{
        cod = Integer.parseInt(lblCodCom.getText());
        pro = cboProveedor.getSelectedIndex();
        est = chkHabilitado.isSelected();
        objcompras.setCodigo(cod);
        objcompras.setNombreproveedor(pro);
        objcompras.setEstado(est);

        res = objcompras.ActualizarCompra(objcompras);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Compra Actualizado");
            objcompras.MostrarCompraTodo(jtbCompras);
            Limpiar();
            Desbloquear();
        } else {
            JOptionPane.showMessageDialog(null, "No se actulizo el la compra");
            Limpiar();

        }
       }catch(Exception ex){
           System.err.println(ex.toString());
       }

       

    }//GEN-LAST:event_btnActActionPerformed

private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            
         cod = Integer.parseInt(lblCodCom.getText());

        objcompras.setCodigo(cod);
        res = objcompras.EliminarCompra(objcompras);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Distrito Eliminado");
            objcompras.MostrarCompraTodo(jtbCompras);
            Limpiar();
            Bloquear();
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino el Distrito ");
            Limpiar();

        }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnRegreActionPerformed

    private void jtbComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbComprasMouseClicked
        try{
       if (evt.getButton() == 1) {
            int fila = jtbCompras.getSelectedRow();
            lblCodCom.setText(jtbCompras.getValueAt(fila, 0).toString());
            cboProveedor.setSelectedItem(jtbCompras.getValueAt(fila, 1).toString());
            if (jtbCompras.getValueAt(fila, 2).toString().equals("Habilitado")) {
                chkHabilitado.setSelected(true);
            } else {
                chkHabilitado.setSelected(false);
            }
        }

        }catch(Exception ex){
            System.err.println(ex.toString());
        }
        
     
    }//GEN-LAST:event_jtbComprasMouseClicked

  
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
            java.util.logging.Logger.getLogger(frmCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegre;
    private javax.swing.JComboBox cboProveedor;
    private javax.swing.JCheckBox chkHabilitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCompras;
    private javax.swing.JLabel lblCodCom;
    public javax.swing.JLabel lblCodEmp;
    public javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
