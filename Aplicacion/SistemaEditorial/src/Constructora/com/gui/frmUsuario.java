

package Constructora.com.gui;
import Constructora.com.jdbc.clsPerfil;
import Constructora.com.jdbc.clsUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frmUsuario extends javax.swing.JFrame {

    clsUsuario objusuario=new clsUsuario();

    String nom="",cla="";
    int cod=0,perfil=0;
   
    boolean est=false,res=false;
    public frmUsuario() {
        initComponents();
        objusuario.MostrarUsuarioTodo(jtbUsuario);
        objusuario.ConsultarPerfil(cboPerfil);
         this.setLocationRelativeTo(null);
        Bloquear();
        lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
        chkEstado.setSelected(true);
        PonerIcono();
    }
     
                      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        lblCodUsu = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboPerfil = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbUsuario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnRegre = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Nombre :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 14, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Perfil:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 264, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Estado :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        chkEstado.setText("Habilitado");
        jPanel2.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        lblCodUsu.setText("jLabel8");
        lblCodUsu.setToolTipText("");
        jPanel2.add(lblCodUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        lblCodEmp.setToolTipText("");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));
        jPanel2.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 264, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Clave");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jPanel2.add(cboPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 260, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 570, 180));

        jtbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbUsuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 580, 130));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegre.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegre.setText("Regresar");
        btnRegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAct.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAct.setText("Actualizar");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnAct)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(33, 33, 33)
                .addComponent(btnRegre)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegre)
                    .addComponent(btnEliminar)
                    .addComponent(btnAct)
                    .addComponent(btnRegistrar))
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 600, 70));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 520, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
        txtNom.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            if( txtNom.getText().equals("")==true){
                JOptionPane.showMessageDialog(null, "Ingres su nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtNom.requestFocus();
            }else if(txtClave.getText().equals("")==true){
                JOptionPane.showMessageDialog(null, "Ingres su clave","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtClave.requestFocus();
            }else if(cboPerfil.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Seleccione su perfil","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                cboPerfil.requestFocus();
           
            }else{

                nom=txtNom.getText();
                cla=txtClave.getText();
                  perfil=cboPerfil.getSelectedIndex();
           
                est=chkEstado.isSelected();
                //enviamos los datos a la clase
                objusuario.setNombre(nom);
                objusuario.setClave(cla); 
                objusuario.setNombreperfil(perfil);
                objusuario.setEstado(est);
                //enviar la imagen
                
                
                //llamamos la funcion para registrar el autor
                res=objusuario.RegistrarUsuario(objusuario);
                if(res==true){
                    JOptionPane.showMessageDialog(null,"Se registro el Usuario" );
                    objusuario.MostrarUsuarioTodo(jtbUsuario);
                    Limpiar();
                    Bloquear();

                }else{
                    JOptionPane.showMessageDialog(null,"No se registro el Usuario");
                    Limpiar();
                }
            }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed
 
    
    void Limpiar(){
      txtNom.setText("");
      txtClave.setText("");
      cboPerfil.setSelectedIndex(0);
      chkEstado.setSelected(false);
      txtNom.requestFocus();
  }
   void Bloquear(){
        txtNom.setEnabled(false);
        txtClave.setEditable(false);
        cboPerfil.setEditable(false);
        chkEstado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnAct.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom.setEnabled(true);
        txtClave.setEditable(true);
        cboPerfil.setEditable(true);
        lblCodUsu.setVisible(true);
        chkEstado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnAct.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
    }
 
    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        try{

            cod=Integer.parseInt(lblCodUsu.getText());
            nom=txtNom.getText();
            cla=txtClave.getText();
            perfil=cboPerfil.getSelectedIndex();
     
            est=chkEstado.isSelected();
            
             objusuario.setCodigo(cod);
            objusuario.setNombre(nom);
             objusuario.setClave(cla);
             objusuario.setNombreperfil(perfil);
   
            objusuario.setEstado(est);

            res=objusuario.ActualizarUsuario(objusuario);
            if(res==true){
                JOptionPane.showMessageDialog(null,"Se actualizo el Usuario" );
                Limpiar();
                Bloquear();
                btnNuevo.setEnabled(est);
                objusuario.MostrarUsuarioTodo(jtbUsuario);

            }else{
                JOptionPane.showMessageDialog(null,"No se actualizo el Usuario");
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
        cod=Integer.parseInt(lblCodUsu.getText());

        objusuario.setCodigo(cod);

        //llamos la funcion para eliminar el autor
        res=objusuario.EliminarUsuario(objusuario);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Usuario Eliminado");
            objusuario.MostrarUsuarioTodo(jtbUsuario);
            Limpiar();
            Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino el Usuario ");
            Limpiar();

        }
       }catch(Exception ex){
           System.err.println(ex.toString());
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreActionPerformed
        frmMenuPrincipal formulario=new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());;
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegreActionPerformed

    private void jtbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuarioMouseClicked

        try{
         int fila=jtbUsuario.getSelectedRow();
        lblCodUsu.setText(jtbUsuario.getValueAt(fila,0).toString());
        txtNom.setText(jtbUsuario.getValueAt(fila,1).toString());
        txtClave.setText(jtbUsuario.getValueAt(fila,2).toString());

       
        //asignamos el valor a la variable
        cod=Integer.parseInt(lblCodUsu.getText());
        //enviamos el codigo a la clase
        objusuario.setCodigo(cod);
        //llamamos el procedimiento para cargar la imagen
        
        cboPerfil.setSelectedItem(jtbUsuario.getValueAt(fila,3).toString());

        if(jtbUsuario.getValueAt(fila, 4).toString().equals("Habilitado")){
            chkEstado.setSelected(true);
        }else{
            chkEstado.setSelected(false);
        }
   
            
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
       
    }//GEN-LAST:event_jtbUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegre;
    private javax.swing.JComboBox cboPerfil;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbUsuario;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblCodUsu;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
