

package Constructora.com.gui;

import Constructora.com.jdbc.clsProducto;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmProducto extends javax.swing.JFrame {
    clsProducto objproducto=new clsProducto();
    String nom="";
    int can=0,codProve=0;
   double pre=0;
    byte foto[];
    int cod=0;
     boolean est=false,res=false;

    public frmProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        objproducto.MostrarProductoTodo(jtbProducto);
        objproducto.ConsultarProveedor(cboProveedor);
        chkEstado.setSelected(true);
        lblCodPro.setVisible(false);
        
         lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);
        Bloquear();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCan = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProducto = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboProveedor = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnBuscarFoto = new javax.swing.JButton();
        chkEstado = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodPro = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento Producto");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 14, 610, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel2.add(txtCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 210, -1));
        jPanel2.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 210, -1));

        jtbProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbProducto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 670, 210));

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Proveedor");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jPanel2.add(cboProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, -1));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setText("lblImagen");
        lblImagen.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 170, 160));

        btnBuscarFoto.setText(" Buscar Foto");
        btnBuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFotoActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, -1));

        chkEstado.setText("Habilitado");
        jPanel4.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Estado");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel4.add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 210, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Foto");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel4.add(txtPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Precio");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel4.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel4.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        lblCodPro.setText("lblCodPro");
        jPanel4.add(lblCodPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 700, 200));

        jPanel5.setBackground(new java.awt.Color(204, 51, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 660, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFotoActionPerformed
        //permite abrir el explorador de windows desde java
        JFileChooser jfc=new JFileChooser();
        //indicar cuales son las extensiones del archivo qie se va a buscar
        FileNameExtensionFilter fil=new FileNameExtensionFilter("*.JPG, *.PNG,*.GIF","jpg","png","gif");
        //asignamos el filtro
        jfc.setFileFilter(fil);
        //abrimos la ventana de dialogo con filtro asignado
        int s=jfc.showOpenDialog(this);
        //evaluamos si seleccione una imagen se asigna la ruta ala caja de texto
        if(s==JFileChooser.APPROVE_OPTION){
            String rut=jfc.getSelectedFile().getAbsolutePath();
            txtFoto.setText(rut);
            CargarImagen();
        }
    }//GEN-LAST:event_btnBuscarFotoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       try{
        
           if(txtNom.getText().equals("")==true){
               JOptionPane.showMessageDialog(null, "Ingrese el nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               txtNom.requestFocus();
           }else if(txtCan.getText().equals("")==true){
               JOptionPane.showMessageDialog(null, "Ingrese la cantidad","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               txtCan.requestFocus();
           }else if(cboProveedor.getSelectedIndex()==0){
               JOptionPane.showMessageDialog(null, "Seleccione el proveedor","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               cboProveedor.requestFocus();
           }else if(txtPre.getText().equals("")==true){
               JOptionPane.showMessageDialog(null, "Ingrese su precio","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               txtPre.requestFocus();
           }else if(txtFoto.getText().equals("")==true){
               JOptionPane.showMessageDialog(null, "Seleccione su foto","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               txtFoto.requestFocus();
           }else{
        nom=txtNom.getText();
       
        can=Integer.parseInt(txtCan.getText());
        codProve=cboProveedor.getSelectedIndex();
         pre=Double.parseDouble(txtPre.getText());
       File ruta= new File(txtFoto.getText());
       est=chkEstado.isSelected();
       //enviamos los datos a la clase
       objproducto.setNombre(nom);
       objproducto.setCantidad(can);
       objproducto.setCodiprovedor(codProve);
       objproducto.setPrecio(pre);
   

       
       //enviar la imagen
       
       try{
           
           byte[]icono =new byte[(int) ruta.length()];
           InputStream input = new FileInputStream(ruta);
           input.read(icono);
           objproducto.setFoto(icono);
           
       }catch(IOException ex){
           objproducto.setFoto(null);
           System.err.println(ex.toString());
           
       }
       objproducto.setEstado(est);
       //llamamos la funcion para registrar el autor
       res=objproducto.RegistrarProducto(objproducto);
       if(res==true){
           JOptionPane.showMessageDialog(null,"Producto registrado" );
           objproducto.MostrarProductoTodo(jtbProducto);
            Limpiar();
           Bloquear();
         
       }else{
           JOptionPane.showMessageDialog(null,"No se registro el Producto");
             Limpiar();
       }
           }
    }catch(HeadlessException ex){
    System.err.println(ex.toString());
   
}
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jtbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbProductoMouseClicked
    try{
        if(evt.getButton()==1){
             int fila=jtbProducto.getSelectedRow();
             lblCodPro.setText(jtbProducto.getValueAt(fila,0).toString());
             txtNom.setText(jtbProducto.getValueAt(fila,1).toString());
                  txtCan.setText(jtbProducto.getValueAt(fila,2).toString());
                       cboProveedor.setSelectedItem(jtbProducto.getValueAt(fila,3).toString());
                         txtPre.setText(jtbProducto.getValueAt(fila,4).toString());
                          cod=Integer.parseInt(lblCodEmp.getText());
                             objproducto.setCodigo(cod);
                             objproducto.CargarImagen2(lblImagen, objproducto);
             if(jtbProducto.getValueAt(fila, 5).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
    }catch(Exception ex){
        System.err.println(ex.toString());
    }
        
        
    }//GEN-LAST:event_jtbProductoMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
        cod=Integer.parseInt(lblCodPro.getText());
        nom=txtNom.getText();
           pre=Double.parseDouble(txtPre.getText());
        can=Integer.parseInt(txtCan.getText());
        codProve=cboProveedor.getSelectedIndex();
       File ruta= new File(txtFoto.getText());
       est=chkEstado.isSelected();
       //enviamos los datos a la clase
       
       objproducto.setCodigo(cod);
       objproducto.setNombre(nom);
       objproducto.setCantidad(can);
       objproducto.setCodiprovedor(codProve);
       objproducto.setPrecio(pre);
   

       
       //enviar la imagen
       
       try{
           
           byte[]icono =new byte[(int) ruta.length()];
           InputStream input = new FileInputStream(ruta);
           input.read(icono);
           objproducto.setFoto(icono);
           
       }catch(IOException ex){
           objproducto.setFoto(null);
           System.err.println(ex.toString());
           
       }
       objproducto.setEstado(est);
       //llamamos la funcion para registrar el autor
       res=objproducto.ActualizarProducto(objproducto);
       if(res==true){
           JOptionPane.showMessageDialog(null,"Se actualizo el Producto" );
           objproducto.MostrarProductoTodo(jtbProducto);
            Limpiar();
           Bloquear();
         
       }else{
           JOptionPane.showMessageDialog(null,"No se actualizo el Producto");
             Limpiar();
       }
       
    }catch(HeadlessException ex){
    System.err.println(ex.toString());
   
}
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   try{
          
        cod=Integer.parseInt(lblCodPro.getText());
        
        objproducto.setCodigo(cod);
        
        //llamos la funcion para eliminar el autor
        res=objproducto.EliminarProducto(objproducto);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Producto Eliminado");
            objproducto.MostrarProducto(jtbProducto);
            Limpiar();
           Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino el Producto ");
            Limpiar();
            
        }
       
       
   }catch(Exception ex){
       System.err.println(ex.toString());
   }
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      frmMenuPrincipal formulario=new frmMenuPrincipal();
      formulario.lblCodEmp.setText(lblCodEmp.getText());
      formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed
  void Limpiar(){
      txtNom.setText("");
      txtCan.setText("");
      cboProveedor.setSelectedIndex(0);
      txtFoto.setText("");
      chkEstado.setSelected(false);
      lblImagen.setText("");
      txtNom.requestFocus();
      
  }
  void Bloquear(){
        txtNom.setEnabled(false);
        txtCan.setEnabled(false);
        cboProveedor.setEnabled(false);
        lblImagen.setEnabled(false);
        txtFoto.setEnabled(false);
        chkEstado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom.setEnabled(true);
         txtCan.setEnabled(true);
         lblImagen.setEnabled(true);
       cboProveedor.setEnabled(true);
        txtFoto.setEnabled(true);
        lblCodEmp.setVisible(true);
        chkEstado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
    }
    void CargarImagen(){
        try{
            //obetener la ruta de imagen y alamacenarla en una imageIcon
            ImageIcon icono=new ImageIcon(txtFoto.getText());
            Image image;
            
            int alto=lblImagen.getHeight();
            int ancho=lblImagen.getWidth();
            image=icono.getImage().getScaledInstance(alto, ancho, Image.SCALE_DEFAULT);
            lblImagen.setIcon(new ImageIcon(image));
        }catch(Exception ex){
            System.err.println(ex.toString());
            
        }
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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarFoto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboProveedor;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbProducto;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblCodPro;
    private javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCan;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPre;
    // End of variables declaration//GEN-END:variables
}
