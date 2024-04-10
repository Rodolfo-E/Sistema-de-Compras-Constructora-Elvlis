

package Constructora.com.gui;

import Constructora.com.jdbc.clsCategoria;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;



public class frmCategoria extends javax.swing.JFrame {
    clsCategoria objcategoria=new clsCategoria();
    int cod=0,codpro=0;
    String nom="",pro="";
    boolean res=false,est=false;
    public frmCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        objcategoria.MostrarCategoriaTodo(jtbCategoria);
        objcategoria.ConsultarProducto(cboProducto);
        chkEstado.setSelected(true);
        lblCodEmp.setVisible(false);
        lblUsuario.setVisible(false);    
        PonerIcono();
        Bloquear();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCategoria = new javax.swing.JTable();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnActulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        cboProducto = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCodCat = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Mantenimiento Categoria");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 470, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 570, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Productos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jtbCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbCategoria);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 620, 160));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 250, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        btnRegistro.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        btnActulizar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnActulizar.setText("Actualizar");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Estado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        chkEstado.setText("Habilitado");
        jPanel1.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jPanel1.add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 250, -1));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodEmp.setText("lblCodEmp");
        jPanel4.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel4.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        lblCodCat.setText("lblCodCat");
        jPanel4.add(lblCodCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 590, 120));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 620, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       try{
           if(txtNom.getText().equals("")==true){
               JOptionPane.showMessageDialog(null,"Ingrese un nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
               txtNom.requestFocus();   
           }else if(cboProducto.getSelectedIndex()==0){
               JOptionPane.showMessageDialog(null, "Seleccione un producto","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
                cboProducto.requestFocus();
                       
           }else{
            nom=txtNom.getText();
      //  codpro=Integer.parseInt(txtPro.getText());
        codpro=cboProducto.getSelectedIndex();
        
        if(chkEstado.isSelected()==true){
           est=true;
       }else{
           est=false;
        }
        objcategoria.setNombre(nom);
       // objcategoria.setCodigoproducto(codpro);
        objcategoria.setCodigoproducto(codpro);
        objcategoria.setEstado(est);
        
        res=objcategoria.RegistrarCategoria(objcategoria);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Categoria Registrado");
            objcategoria.MostrarCategoriaTodo(jtbCategoria);
            Limpiar();
            Bloquear();
           
        }else{
            JOptionPane.showMessageDialog(null,"No se registro la Categoria ");
            Limpiar();
            
        }
           }
       }catch(Exception ex){
           System.err.println(ex.toString());
       }
       
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        Desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        try{

            cod=Integer.parseInt(lblCodCat.getText());
            nom=txtNom.getText();
             codpro=cboProducto.getSelectedIndex();
     
            est=chkEstado.isSelected();
            
            
            objcategoria.setCodigo(cod);
            objcategoria.setNombre(nom);
            objcategoria.setCodigoproducto(codpro);
            objcategoria.setEstado(est);

            res=objcategoria.ActualizarCategoria(objcategoria);
            if(res==true){
                JOptionPane.showMessageDialog(null,"Se actualizo categoria" );
                 objcategoria.MostrarCategoria(jtbCategoria);
                Limpiar();
                Bloquear();
                btnNuevo.setEnabled(est);
               

            }else{
                JOptionPane.showMessageDialog(null,"No se actualizo la Categoria");
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
    private void jtbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbCategoriaMouseClicked
        try{
             
        if(evt.getButton()==1){
             int fila=jtbCategoria.getSelectedRow();
             lblCodEmp.setText(jtbCategoria.getValueAt(fila,0).toString());
             txtNom.setText(jtbCategoria.getValueAt(fila,1).toString());
             cboProducto.setSelectedItem(jtbCategoria.getValueAt(fila,2).toString());
             if(jtbCategoria.getValueAt(fila, 3).toString().equals("Habilitado")){
                 chkEstado.setSelected(true);
             }else{
                 chkEstado.setSelected(false);
             }
         }
        }catch(Exception ex){
            System.err.println(ex.toString());
        }
       
    }//GEN-LAST:event_jtbCategoriaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
             cod=Integer.parseInt(lblCodCat.getText());
        
        objcategoria.setCodigo(cod);
        res=objcategoria.EliminarCategoria(objcategoria);
        if(res=true){
            JOptionPane.showMessageDialog(null,"Categoria Eliminada");
            objcategoria.MostrarCategoria(jtbCategoria);
            Limpiar();
           Bloquear();
        }else{
            JOptionPane.showMessageDialog(null,"No se elimino la categoria ");
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
    void Bloquear(){
        txtNom.setEnabled(false);

        btnRegistro.setEnabled(false);
        btnActulizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }
    void Desbloquear(){
        txtNom.setEnabled(true);
        lblCodEmp.setVisible(true);
     
        btnRegistro.setEnabled(true);
        btnActulizar.setEnabled(true);
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
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbCategoria;
    private javax.swing.JLabel lblCodCat;
    public javax.swing.JLabel lblCodEmp;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
