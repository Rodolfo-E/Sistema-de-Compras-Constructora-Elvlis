

package Constructora.com.gui;

import Constructora.com.jdbc.clsPerfil;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class frmPerfil extends javax.swing.JFrame {

    clsPerfil objperfil=new clsPerfil();
     int cod=0;
    String nom="";
    boolean res=false,est=false;
    
    public frmPerfil() {
        initComponents();
         objperfil.MostrarPerfil(jtbPerfil);
         this.setLocationRelativeTo(null);
         
        Bloquear();
        lblCodPer.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPerfil = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        lblCodPer = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento de Perfil");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 440, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 580, 60));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 100, 290, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Estado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        chkEstado.setText("Habilitado");
        jPanel1.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));

        jtbPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPerfilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbPerfil);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 680, 190));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel1.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        lblCodPer.setText("lblCodPer");
        lblCodPer.setToolTipText("");
        jPanel1.add(lblCodPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 660, 120));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 670, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      try{
          
          if(txtNombre.getText().equals("")==true){
              JOptionPane.showMessageDialog(null,"Ingrese su nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
              txtNombre.requestFocus();
          }else{
              nom=txtNombre.getText();
        
        if(chkEstado.isSelected()==true){
           est=true;
       }else{
           est=false;
        }
        objperfil.setNombre(nom);
        objperfil.setEstado(est);
        
        res=objperfil.RegistrarPerfil(objperfil);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Perfil Registrado");
            objperfil.MostrarPerfil(jtbPerfil);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se registro el Perfil ");
            Limpiar();
            
        }
          }
      }catch(Exception ex){
          System.err.println(ex.toString());
      }
     
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jtbPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPerfilMouseClicked
         try{
             if(evt.getButton()==1){
             int fila=jtbPerfil.getSelectedRow();
             lblCodPer.setText(jtbPerfil.getValueAt(fila,0).toString());
             txtNombre.setText(jtbPerfil.getValueAt(fila,1).toString());
             if(jtbPerfil.getValueAt(fila, 2).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
         }catch(Exception ex){
             System.err.println(ex.toString());
         }
        
    }//GEN-LAST:event_jtbPerfilMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      try{

            cod=Integer.parseInt(lblCodPer.getText());
            nom=txtNombre.getText();
           
     
            if(chkEstado.isSelected()==true){
                est=true;
            }else{
                est=false;
            }
            objperfil.setNombre(nom);
            objperfil.setCodigo(cod);
            objperfil.setEstado(est);

            res=objperfil.ActualizarPerfil(objperfil);
            if(res==true){
                JOptionPane.showMessageDialog(null,"Se actualizo el Perfil" );
                Limpiar();
                Bloquear();
                btnNuevo.setEnabled(est);
                objperfil.MostrarPerfil(jtbPerfil);

            }else{
                JOptionPane.showMessageDialog(null,"No se actualizo el Perfil");
                Limpiar();
            }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        try{
            cod=Integer.parseInt(lblCodPer.getText());
        
        objperfil.setCodigo(cod);
        res=objperfil.EliminarPerfil(objperfil);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Perfil Eliminado");
             objperfil.MostrarPerfil(jtbPerfil);
            Limpiar();
           Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino el Perfil ");
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
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      frmMenuPrincipal formulario=new frmMenuPrincipal();
      formulario.lblCodEmp.setText(lblCodEmp.getText());
      formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed
void Bloquear(){
    txtNombre.setEditable(false);
    chkEstado.setSelected(false);
    btnRegistrar.setEnabled(false);
    btnActualizar.setEnabled(false);
    btnEliminar.setEnabled(false);
    txtNombre.requestFocus();
    
    
}

void Desbloquear(){
    txtNombre.setEditable(true);
    chkEstado.setSelected(true);
    btnRegistrar.setEnabled(true);
    btnActualizar.setEnabled(true);
    btnEliminar.setEnabled(true);
    txtNombre.requestFocus();
}
void Limpiar(){
    txtNombre.setText("");
    txtNombre.requestFocus();
    
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
            java.util.logging.Logger.getLogger(frmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbPerfil;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblCodPer;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
