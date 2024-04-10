
package Constructora.com.gui;

import Constructora.com.jdbc.clsDistrito;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmDistritoo extends javax.swing.JFrame {
    
    clsDistrito objdistrito= new clsDistrito();
    int cod=0;
    String nom="";
    boolean res=false,est=false;
    public frmDistritoo() {
        initComponents();
        this.setLocationRelativeTo(null);
        chkHabilitado.setSelected(false);
        objdistrito.MostrarDistrito(jtbDistrito);
        lblCodDis.setVisible(false);
        chkHabilitado.setSelected(true);
        lblCodDis.setVisible(false);
        lblUsuario.setVisible(false);
        lblCodEmp.setVisible(false);
     PonerIcono();
        Bloquear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkHabilitado = new javax.swing.JCheckBox();
        txtNom = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegre = new javax.swing.JButton();
        lblCodDis = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDistrito = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Distrito");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 11, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Estado:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        chkHabilitado.setText("Habilitado");
        jPanel2.add(chkHabilitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        jPanel2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 280, -1));

        btnNuevo.setBackground(new java.awt.Color(204, 0, 51));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 120, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(204, 0, 51));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 120, -1, -1));

        btnAct.setBackground(new java.awt.Color(204, 0, 51));
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        jPanel2.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 120, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 120, -1, -1));

        btnRegre.setBackground(new java.awt.Color(204, 0, 51));
        btnRegre.setText("Regresar");
        btnRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        lblCodDis.setText("lblCodDis");
        jPanel2.add(lblCodDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 71, 50));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 560, 150));

        jtbDistrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbDistrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDistritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDistrito);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 570, 155));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
        txtNom.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        
        try{
            if(txtNom.getText().equals("")==true){
                JOptionPane.showMessageDialog(null, "Ingrese el distrito","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtNom.requestFocus();
                
            }else{
            
            nom=txtNom.getText();
        
        if(chkHabilitado.isSelected()==true){
           est=true;
       }else{
           est=false;
        }
        objdistrito.setNombre(nom);
        objdistrito.setEstado(est);
        
        res=objdistrito.RegistrarDistrito(objdistrito);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Distrito Registrado");
            objdistrito.MostrarDistrito(jtbDistrito);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se registro el distrito ");
            Limpiar();
            
        }
        }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
         
        try{
        cod=Integer.parseInt(lblCodDis.getText());
        
        nom=txtNom.getText();
        if(chkHabilitado.isSelected()==true){
            est=true;
        }else{
            est=false;
        }
        objdistrito.setCodigo(cod);
        objdistrito.setNombre(nom);
        objdistrito.setEstado(est);
        
        res=objdistrito.ActualizarDistrito(objdistrito);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Distrito Actualizado");
            objdistrito.MostrarDistrito(jtbDistrito);
            Limpiar();
           Desbloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se actulizo el distrito");
            Limpiar();
            
        }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
        
       
        
    }//GEN-LAST:event_btnActActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        try{
             cod=Integer.parseInt(lblCodDis.getText());
        
        objdistrito.setCodigo(cod);
        res=objdistrito.EliminarDistrito(objdistrito);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Distrito Eliminado");
            objdistrito.MostrarDistrito(jtbDistrito);
            Limpiar();
           Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino el Distrito ");
            Limpiar();
            
        }
            
              
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
       
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void jtbDistritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDistritoMouseClicked
       try{
        if(evt.getButton()==1){
             int fila=jtbDistrito.getSelectedRow();
             lblCodDis.setText(jtbDistrito.getValueAt(fila,0).toString());
             txtNom.setText(jtbDistrito.getValueAt(fila,1).toString());
             if(jtbDistrito.getValueAt(fila, 2).toString().equals("Habilitado")){
                 chkHabilitado.setSelected(true);
             }else{
                 chkHabilitado.setSelected(false);
             }
         }
       }catch(Exception ex){
           System.err.println(ex.toString());
       }
    }//GEN-LAST:event_jtbDistritoMouseClicked

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        frmMenuPrincipal formulario=new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btnRegreActionPerformed
    void Bloquear(){
        txtNom.setEnabled(false);
        chkHabilitado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnAct.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom.setEnabled(true);
        lblCodDis.setVisible(true);
        chkHabilitado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnAct.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
    }
    void Limpiar(){
        txtNom.setText("");
        txtNom.requestFocus();
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
            java.util.logging.Logger.getLogger(frmDistritoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDistritoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDistritoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDistritoo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDistritoo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegre;
    private javax.swing.JCheckBox chkHabilitado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbDistrito;
    private javax.swing.JLabel lblCodDis;
    public javax.swing.JLabel lblCodEmp;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
