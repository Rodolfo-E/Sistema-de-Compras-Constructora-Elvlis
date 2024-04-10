

package Constructora.com.gui;

import Constructora.com.jdbc.clsDetalleCompras;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import javax.swing.JOptionPane;

public class frmDetallesdeProducto extends javax.swing.JFrame {
    clsDetalleCompras objdetalleCompras=new clsDetalleCompras();
    String nom="";
    String imp="",can="";
    Date fec=null;
    int com=0,cod=0;
    boolean res=false ,est=false;
    public frmDetallesdeProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        objdetalleCompras.MostrarDetalledeCompras(jtbDetalles);
        objdetalleCompras.ConsultarCompra(cboCompra);
        chkEstado.setSelected(true);
        lblDetalle.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDetalles = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        txtImpor = new javax.swing.JTextField();
        txtCan = new javax.swing.JTextField();
        txtfech = new com.toedter.calendar.JDateChooser();
        cboCompra = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblDetalle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Detalles de Producto");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 470, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 600, 80));

        jtbDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDetallesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDetalles);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 670, 190));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 660, 70));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 250, -1));
        jPanel4.add(txtImpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, -1));
        jPanel4.add(txtCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, -1));
        jPanel4.add(txtfech, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 250, -1));

        jPanel4.add(cboCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 250, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Nombre Detalle");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Importe");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Fecha");
        jLabel6.setToolTipText("");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Compra");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Estado");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        chkEstado.setText("Habilitado");
        jPanel4.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel4.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 46, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel4.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, 20));

        lblDetalle.setText("lblDetalle");
        jPanel4.add(lblDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 660, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       try{
     if(txtNom.getText().equals("")==true){
         JOptionPane.showMessageDialog(null, "Ingre el nombre del detalle","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
         txtNom.requestFocus();
     }else if(txtImpor.getText().equals("")==true){
         JOptionPane.showMessageDialog(null, "Ingre el importe","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
         txtImpor.requestFocus();
     }else if(txtCan.getText().equals("")==true){
         JOptionPane.showMessageDialog(null, "Ingre la cantidad","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
         txtCan.requestFocus();
     }else if(txtfech.getDate()==null){
         JOptionPane.showMessageDialog(null, "Seleccione la fecha","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
         txtfech.requestFocus();
     }else if(cboCompra.getSelectedIndex()==0){
         JOptionPane.showMessageDialog(null,"Seleccione la compra","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
         cboCompra.requestFocus();
                 
     }else{
     
         
           
      nom =txtNom.getText();
      imp=txtImpor.getText();
      can=txtCan.getText();
       fec=txtfech.getDate();
       
       java.sql.Date fechDate=new java.sql.Date(fec.getTime());
       com=cboCompra.getSelectedIndex();

       est=chkEstado.isSelected();
       //enviamos los datos a la clase
       objdetalleCompras.setDetalleproducto(nom);
       objdetalleCompras.setImporte(imp);
       objdetalleCompras.setCantidad(can);
       objdetalleCompras.setFechapedido(fechDate);
       objdetalleCompras.setCompra(com);
       
       //enviar la imagen
     
       objdetalleCompras.setEstado(est);
       //llamamos la funcion para registrar el autor
       res=objdetalleCompras.RegistrarDetalledeComprars(objdetalleCompras);
       if(res==true){
           JOptionPane.showMessageDialog(null,"Se registro el Detalle de producto" );
           objdetalleCompras.MostrarDetalledeCompras(jtbDetalles);
            Limpiar();
           Bloquear();
         
       }else{
           JOptionPane.showMessageDialog(null,"No se registro el Detalle de producto");
             Limpiar();
       }
             }
    }catch(HeadlessException ex){
    System.err.println(ex.toString());
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed
public void MostrarFecha(){
    Date fecha=new Date();
    txtfech.setDate(fecha);
}
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       try{
     cod=Integer.parseInt(lblDetalle.getText());
           
      nom =txtNom.getText();
      imp=txtImpor.getText();
      can=txtCan.getText();
       fec=txtfech.getDate();
       java.sql.Date fechDate=new java.sql.Date(fec.getTime());
       com=cboCompra.getSelectedIndex();

       est=chkEstado.isSelected();
       //enviamos los datos a la clase
       objdetalleCompras.setCodigo(cod);
       objdetalleCompras.setDetalleproducto(nom);
       objdetalleCompras.setImporte(imp);
       objdetalleCompras.setCantidad(can);
       objdetalleCompras.setFechapedido(fechDate);
       objdetalleCompras.setCompra(com);
       
       //enviar la imagen
     
       objdetalleCompras.setEstado(est);
       //llamamos la funcion para registrar el autor
       res=objdetalleCompras.ActualizarDetalledeCompras(objdetalleCompras);
       if(res==true){
           JOptionPane.showMessageDialog(null,"Se Actulizo el Detalle de producto" );
           objdetalleCompras.MostrarDetalledeCompras(jtbDetalles);
            Limpiar();
           Bloquear();
         
       }else{
           JOptionPane.showMessageDialog(null,"No se Actulizo el Detalle de producto");
             Limpiar();
       }
       
    }catch(HeadlessException ex){
    System.err.println(ex.toString());
   }
    }//GEN-LAST:event_btnActualizarActionPerformed
private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void jtbDetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDetallesMouseClicked
        try{
        if(evt.getButton()==1){
             int fila=jtbDetalles.getSelectedRow();
             lblDetalle.setText(jtbDetalles.getValueAt(fila,0).toString());
               txtNom.setText(jtbDetalles.getValueAt(fila,1).toString());
             txtImpor.setText(jtbDetalles.getValueAt(fila,2).toString());
                  txtCan.setText(jtbDetalles.getValueAt(fila,3).toString());
                       SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                  String fecha=(jtbDetalles.getValueAt(fila,4).toString());
                  Date dato= null;
                   try{
               dato=formatoDelTexto.parse(fecha);
               txtfech.setDate(dato);
            }catch(ParseException ex){
                System.out.println(ex.toString());
            }               
              cboCompra.setSelectedItem(jtbDetalles.getValueAt(fila,5).toString());                 
             if(jtbDetalles.getValueAt(fila,6).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_jtbDetallesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
     
      cod=Integer.parseInt(lblDetalle.getText());
     
      
       //llamamos la funcion para registrar el autor
       res=objdetalleCompras.RegistrarDetalledeComprars(objdetalleCompras);
       if(res==true){
           JOptionPane.showMessageDialog(null,"Se elimino el Detalle de producto" );
           objdetalleCompras.MostrarDetalledeCompras(jtbDetalles);
            Limpiar();
           Bloquear();
         
       }else{
           JOptionPane.showMessageDialog(null,"No se elimino el Detalle de producto");
             Limpiar();
       }
       
    }catch(HeadlessException ex){
    System.err.println(ex.toString());
   }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
            frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btnRegresarActionPerformed
  void Limpiar(){
      txtNom.setText("");
      txtCan.setText("");
      txtImpor.setText("");
      txtfech.setDate(null);
      cboCompra.setSelectedIndex(0);
      chkEstado.setSelected(false);
      txtNom.requestFocus();
  }
  void Bloquear(){
        txtNom.setEnabled(false);
        txtCan.setEnabled(false);
        txtCan.setText("");
        txtfech.setDate(null);
        cboCompra.setEnabled(false);
        chkEstado.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom.setEnabled(true);
         txtCan.setEnabled(true);
       cboCompra.setEnabled(true);
     
        lblDetalle.setVisible(true);
        chkEstado.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnNuevo.setEnabled(false);
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
            java.util.logging.Logger.getLogger(frmDetallesdeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDetallesdeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDetallesdeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDetallesdeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDetallesdeProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboCompra;
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
    private javax.swing.JTable jtbDetalles;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblDetalle;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCan;
    private javax.swing.JTextField txtImpor;
    private javax.swing.JTextField txtNom;
    private com.toedter.calendar.JDateChooser txtfech;
    // End of variables declaration//GEN-END:variables
}
