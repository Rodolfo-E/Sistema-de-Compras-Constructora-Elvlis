
package Constructora.com.gui;

import Constructora.com.jdbc.clsCliente;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class frmCliente extends javax.swing.JFrame {
 
    clsCliente objcliente=new clsCliente();
    String nom="",ape="",ruc="",dni="",tel="";
    int distrito=0,producto=0,cod=0;
    boolean res=false,est=false;
   
    public frmCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        objcliente.MostrarClienteTodo(jtbCliente);
        objcliente.ConsultarDistrito(cboDistrito);
        objcliente.ConsultarProducto(cboProducto);
        lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
        lblCodCli.setVisible(false);
        PonerIcono();
        Bloquear();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bgtnSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        cboDistrito = new javax.swing.JComboBox();
        cboProducto = new javax.swing.JComboBox();
        txtTele = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodCli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento Cliente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 14, 570, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Dni");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jtbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 730, 210));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Apellido");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Distrito");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        bgtnSalir.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        bgtnSalir.setText("Regresar");
        bgtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgtnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bgtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 650, 70));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Producto");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel2.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 220, -1));
        jPanel4.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 220, -1));
        jPanel4.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 220, -1));

        jPanel4.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, -1));

        jPanel4.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 220, -1));
        jPanel4.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 220, -1));

        chkEstado.setText("Habilitado");
        jPanel4.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Estado");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel4.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        lblCodCli.setText("lblCodCli");
        jPanel4.add(lblCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 640, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            if(txtNombre.getText().equals("")==true){
                JOptionPane.showMessageDialog(null,"Ingrese su nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtNombre.requestFocus();
            }else if(txtApellido.getText().equals("")==true){
                JOptionPane.showMessageDialog(null,"Ingrese su apellido","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtApellido.requestFocus();
            }else if(txtDni.getText().equals("")==true){
                JOptionPane.showMessageDialog(null,"Ingrese su Dni","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtDni.requestFocus();
            }else if(cboDistrito.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Seleccione el distrito","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                cboDistrito.requestFocus();
            }else if(cboProducto.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(null,"Seleccione el producto","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                cboProducto.requestFocus();
            }else if(txtTele.getText().equals("")==true){
                JOptionPane.showMessageDialog(null,"Ingrese su numero de telefono","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                txtTele.requestFocus();
            }else{
            
        nom=txtNombre.getText();
         ape=txtApellido.getText();
         dni=txtDni.getText();
         distrito=cboDistrito.getSelectedIndex();
         producto=cboProducto.getSelectedIndex();
         tel=txtTele.getText();
               
        
       est=chkEstado.isSelected();
      
        objcliente.setNombre(nom);
         objcliente.setApellido(ape);
          objcliente.setDni(dni);
           objcliente.setCodigodistrito(distrito);
            objcliente.setCodigoproducto(producto);
             objcliente.setTelefono(tel);

        
        objcliente.setEstado(est);
        
        res=objcliente.RegistrarCliente(objcliente);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Cliente  Registrado");
            objcliente.MostrarClienteTodo(jtbCliente);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se registro el Cliente ");
            Limpiar();
            
        }
            }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void jtbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbClienteMouseClicked
         
        try{
             if(evt.getButton()==1){
             int fila=jtbCliente.getSelectedRow();
             lblCodCli.setText(jtbCliente.getValueAt(fila,0).toString());
             txtNombre.setText(jtbCliente.getValueAt(fila,1).toString());
             txtApellido.setText(jtbCliente.getValueAt(fila,2).toString());
                txtDni.setText(jtbCliente.getValueAt(fila,3).toString());
                   cboDistrito.setSelectedItem(jtbCliente.getValueAt(fila,4).toString());
                   cboProducto.setSelectedItem(jtbCliente.getValueAt(fila,5).toString());
                   txtTele.setText(jtbCliente.getValueAt(fila,6).toString());
             if(jtbCliente.getValueAt(fila,7).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
       
    }//GEN-LAST:event_jtbClienteMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
        
        cod=Integer.parseInt(lblCodCli.getText());
        nom=txtNombre.getText();
         ape=txtApellido.getText();
         dni=txtDni.getText();
         distrito=cboDistrito.getSelectedIndex();
         producto=cboProducto.getSelectedIndex();
         tel=txtTele.getText();
            
        
       est=chkEstado.isSelected();
        objcliente.setCodigo(cod);
        objcliente.setNombre(nom);
         objcliente.setApellido(ape);
          objcliente.setDni(dni);
           objcliente.setCodigodistrito(distrito);
            objcliente.setCodigoproducto(producto);
             objcliente.setTelefono(tel);

        
        objcliente.setEstado(est);
        
        res=objcliente.ActualizarCliente(objcliente);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Cliente  Actulizado");
            objcliente.MostrarClienteTodo(jtbCliente);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se Actulizo el Cliente ");
            Limpiar();
            
        }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
        
        cod=Integer.parseInt(lblCodCli.getText());
      
        objcliente.setCodigo(cod);

        
        res=objcliente.EliminarCliente(objcliente);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Cliente  Eliminado");
            objcliente.MostrarClienteTodo(jtbCliente);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se Elimino el Cliente ");
            Limpiar();
            
        }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void bgtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgtnSalirActionPerformed
        frmMenuPrincipal formulario=new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bgtnSalirActionPerformed

   void Bloquear(){
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtDni.setEnabled(false);
       cboDistrito.setEnabled(false);
        cboProducto.setEnabled(false);
        txtTele.setEnabled(false);
  
        chkEstado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
         txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtDni.setEnabled(true);
        cboDistrito.setEnabled(true);
        cboProducto.setEnabled(true);
        txtTele.setEnabled(true);

        chkEstado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(true);
    }
    
    void Limpiar(){
    txtNombre.setText("");
    txtApellido.setText("");
    txtDni.setText("");
    cboDistrito.setSelectedIndex(0);
    cboProducto.setSelectedIndex(0);
    txtTele.setText("");
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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bgtnSalir;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCliente;
    private javax.swing.JLabel lblCodCli;
    public javax.swing.JLabel lblCodEmp;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTele;
    // End of variables declaration//GEN-END:variables
}
