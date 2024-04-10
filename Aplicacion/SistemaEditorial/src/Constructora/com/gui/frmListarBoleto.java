

package Constructora.com.gui;

import Constructora.com.jdbc.clsBoleto;
import Constructora.com.jdbc.clsDetalleBoleto;
import javax.swing.JOptionPane;


public class frmListarBoleto extends javax.swing.JFrame {
    clsBoleto objboleto = new clsBoleto();
    clsDetalleBoleto objdetalle = new clsDetalleBoleto();
    boolean est = false;

    public frmListarBoleto() {
        initComponents();
        objboleto.MostrarBoleto(jtbBoleto);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmEliminar = new javax.swing.JPopupMenu();
        jmiEliminarBoleto = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cboFiltro = new javax.swing.JComboBox();
        txtVal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbBoleto = new javax.swing.JTable();
        lblUsuario = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jpmEliminar.setToolTipText("zfcz");
        jpmEliminar.setLabel("eliminar");
        jpmEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpmEliminarMouseClicked(evt);
            }
        });

        jmiEliminarBoleto.setText("Eliminar Boleto");
        jmiEliminarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarBoletoActionPerformed(evt);
            }
        });
        jpmEliminar.add(jmiEliminarBoleto);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setComponentPopupMenu(jpmEliminar);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Listado de Boleto");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 380, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 490, 60));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 160, -1));

        txtVal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValKeyPressed(evt);
            }
        });
        jPanel4.add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Filtro");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, -1));

        lblNro.setText("lblNro");
        jPanel4.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lblEstado.setText("lblEstado");
        jPanel4.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        lblCod.setText("lblCod");
        jPanel4.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 650, 80));

        jtbBoleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbBoleto.setToolTipText("");
        jtbBoleto.setComponentPopupMenu(jpmEliminar);
        jtbBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtbBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbBoletoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbBoleto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 180));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValKeyPressed
     /*   criterio=cboFiltro.getSelectedIndex();
        val=txtVal.getText();
        switch(criterio){
            case 0:
            if(txtVal.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione una opcion del filtro","Error en la Busqueda",JOptionPane.ERROR_MESSAGE);
                txtVal.setText("");
                cboFiltro.requestFocus();
            }
            break;
            case 1:
            if(txtVal.getText().equals("")){
                objusuario.MostrarDistrito(jtbBoleto);
            }else{
                objusuario.BuscarDistrito(jtbBoleto, "coddis" ,val);
            }

            break;
            case 2:
            if(txtVal.getText().equals("")){
                objusuario.MostrarDistrito(jtbBoleto);
            }else{
                objusuario.BuscarDistrito(jtbBoleto, "nomdis" ,val);
            }
            break;

            default:
            if(txtVal.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione una opcion del filtro","Error en la Busqueda",JOptionPane.ERROR_MESSAGE);
                txtVal.setText("");
                cboFiltro.requestFocus();
            }
        }*/
    }//GEN-LAST:event_txtValKeyPressed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenuPrincipal formulario=new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jmiEliminarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarBoletoActionPerformed
          est = false;
        objboleto.setNumero(Integer.parseInt(lblNro.getText()));
        objboleto.setEstado(est);

        if (objboleto.EliminarBoleto(objboleto)) {
            objdetalle.setNumero(Integer.parseInt(lblNro.getText()));
            if (objdetalle.DevolverDetalle(objdetalle)) {
                JOptionPane.showMessageDialog(null, "Boleto Eliminado", "Eliminacion de Boleto", JOptionPane.INFORMATION_MESSAGE);
                objboleto.MostrarBoleto(jtbBoleto);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Boleto no eliminado", "Eliminacion de Boleto", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jmiEliminarBoletoActionPerformed

    private void jtbBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbBoletoMouseClicked
       if (evt.getButton() == 1) {
            int fila = jtbBoleto.getSelectedRow();
            lblNro.setText(jtbBoleto.getValueAt(fila, 0).toString());
            lblEstado.setText(jtbBoleto.getValueAt(fila, 6).toString());

        }
    }//GEN-LAST:event_jtbBoletoMouseClicked

    private void jpmEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpmEliminarMouseClicked
      
    }//GEN-LAST:event_jpmEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(frmListarBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListarBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListarBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListarBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListarBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiEliminarBoleto;
    private javax.swing.JPopupMenu jpmEliminar;
    private javax.swing.JTable jtbBoleto;
    public javax.swing.JLabel lblCod;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNro;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
