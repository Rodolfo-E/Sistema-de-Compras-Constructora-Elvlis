

package Constructora.com.gui;


import Constructora.com.jdbc.clsProveedor;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class frmProveedor extends javax.swing.JFrame {
    clsProveedor objProveedor=new clsProveedor();
     String nom="",corr="";
     int tel=0,dis=0,ruc=0;
     int cod=0;
     boolean res=false,est=false;
    public frmProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        objProveedor.MostrarProveedorTodo(jtbProveedor);
        objProveedor.ConsultarDistrito(cboDistrito);
        chkEstado.setSelected(true);
        lblCodProve.setVisible(false);
         lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
        PonerIcono();
        Bloquear();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProveedor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNom2 = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblCodEmp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chkEstado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cboDistrito = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodProve = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnActulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento Proveedor");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 470, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 630, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Telefono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

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
        jtbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProveedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 720, 150));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        jPanel1.add(txtNom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, -1));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel1.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkEstado.setText("Habilitado");
        jPanel3.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Estado");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jPanel3.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Distrito");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel3.add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Correo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel3.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Ruc");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel3.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        lblCodProve.setText("jLabel8");
        jPanel3.add(lblCodProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 690, 200));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistro.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnActulizar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnActulizar.setText("Actualizar");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 690, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
         try{
             if(txtNom2.getText().equals("")==true){
                 JOptionPane.showMessageDialog(null,"Ingrese el nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                 txtNom2.requestFocus();
             }else if(txtTel.getText().equals("")==true){
                 JOptionPane.showMessageDialog(null,"Ingrese su telefono","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                 txtTel.requestFocus();
             }else if(txtCor.getText().equals("")==true){
                 JOptionPane.showMessageDialog(null,"Ingrese su correo","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                 txtCor.requestFocus();
             }else if(txtNom2.getText().equals("")==true){
                 JOptionPane.showMessageDialog(null,"Ingrese el nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                 txtNom2.requestFocus();
             }else if(cboDistrito.getSelectedIndex()==0){
                 JOptionPane.showMessageDialog(null,"Seleccione el distrito","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                 cboDistrito.requestFocus();
             }else if(txtRuc.getText().equals("")==true){
                 JOptionPane.showMessageDialog(null,"Ingrese su ruc");
                 txtRuc.requestFocus();
             }
                nom=txtNom2.getText();
                tel=Integer.parseInt(txtTel.getText());
                 corr=txtCor.getText();
                 dis=cboDistrito.getSelectedIndex();
                 ruc=Integer.parseInt(txtRuc.getText());
           
                est=chkEstado.isSelected();
                //enviamos los datos a la clase
                objProveedor.setNombre(nom);
               objProveedor.setTelefono(tel);
               objProveedor.setCorreo(corr);
               objProveedor.setCodigodistrito(dis);
               objProveedor.setRuc(ruc);
               objProveedor.setEstado(est);
     
                
                //llamamos la funcion para registrar el autor
                res=objProveedor.RegistrarProveedor(objProveedor);
                if(res==true){
                    JOptionPane.showMessageDialog(null,"Se registro el Proveedor" );
                    objProveedor.MostrarProveedorTodo(jtbProveedor);
                    Limpiar();
                    Bloquear();

                }else{
                    JOptionPane.showMessageDialog(null,"No se registro el Proveedor");
                    Limpiar();
                }
            
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnRegistroActionPerformed
void Bloquear(){
        txtNom2.setEnabled(false);
        txtTel.setEnabled(false);
        txtCor.setEnabled(false);
        cboDistrito.setEnabled(false);
        chkEstado.setEnabled(false);
        btnRegistro.setEnabled(false);
        btnActulizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom2.setEnabled(true);
        txtTel.setEnabled(true);
        txtCor.setEnabled(true);
        cboDistrito.setEnabled(true);
        chkEstado.setEnabled(true);
        btnRegistro.setEnabled(true);
        btnActulizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(true);
    }
    
    void Limpiar(){
    txtNom2.setText("");
    txtTel.setText("");
    txtCor.setText("");
    cboDistrito.setSelectedIndex(0);
    chkEstado.setSelected(false);
}
    
    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
       try{
           cod=Integer.parseInt(lblCodProve.getText());
                nom=txtNom2.getText();
                tel=Integer.parseInt(txtTel.getText());
                 corr=txtCor.getText();
                 dis=cboDistrito.getSelectedIndex();
           
                est=chkEstado.isSelected();
                //enviamos los datos a la clase}
                objProveedor.setCodigo(cod);
                objProveedor.setNombre(nom);
               objProveedor.setTelefono(tel);
               objProveedor.setCodigodistrito(dis);
              objProveedor.setRuc(ruc);
               objProveedor.setCorreo(corr);
               objProveedor.setEstado(est);
 
                
                //enviar la imagen
                             
                //llamamos la funcion para registrar el autor
                res=objProveedor.ActualizarProveedor(objProveedor);
                if(res==true){
                    JOptionPane.showMessageDialog(null,"Se actualizo el Proveedor" );
                    objProveedor.MostrarProveedorTodo(jtbProveedor);
                    Limpiar();
                    Bloquear();

                }else{
                    JOptionPane.showMessageDialog(null,"No se actualizo el Proveedor");
                    Limpiar();
                }
            
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnActulizarActionPerformed
private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      try{
           cod=Integer.parseInt(lblCodProve.getText());
            
        objProveedor.setCodigo(cod);
        res=objProveedor.EliminarProveedor(objProveedor);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Proveedor Eliminado");
            objProveedor.MostrarProveedorTodo(jtbProveedor);
            Limpiar();
           Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino el Proveedor ");
            Limpiar();
            
        }
      }catch(Exception ex){
          System.err.println(ex.toString());
      }
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jtbProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProveedorMouseClicked
        try{
            if(evt.getButton()==1){
             int fila=jtbProveedor.getSelectedRow();
             lblCodProve.setText(jtbProveedor.getValueAt(fila,0).toString());
             txtNom2.setText(jtbProveedor.getValueAt(fila,1).toString());
                  txtTel.setText(jtbProveedor.getValueAt(fila,2).toString());
                       txtCor.setText(jtbProveedor.getValueAt(fila,3).toString());
                       cboDistrito.setSelectedItem(jtbProveedor.getValueAt(fila,4).toString());
                       txtRuc.setText(jtbProveedor.getValueAt(fila,5).toString());
             if(jtbProveedor.getValueAt(fila, 6).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
            
            
        }catch(Exception ex){
            System.err.println(toString());
        }
        
    }//GEN-LAST:event_jtbProveedorMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       frmMenuPrincipal formulario=new frmMenuPrincipal();
      formulario.lblCodEmp.setText(lblCodEmp.getText());
      formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    
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
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProveedor;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblCodProve;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtNom2;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
