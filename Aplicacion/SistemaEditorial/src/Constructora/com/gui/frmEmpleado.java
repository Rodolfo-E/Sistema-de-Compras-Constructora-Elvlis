package Constructora.com.gui;

import Constructora.com.jdbc.clsEmpleado;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frmEmpleado extends javax.swing.JFrame {

    clsEmpleado objempleado = new clsEmpleado();
    String nom = "", ape = "", dire = "", corre = "", sex = "";
    int dis = 0, usu = 0,cod=0;
    int tel = 0;
    Date fe=null;
    String sue = "";
    boolean est = false, res = false;
   byte foto[];

    public frmEmpleado() {
        initComponents();
        objempleado.MostrarEmpleadoTodo(jtbEmpleado);
        objempleado.ConsultarDistrito(cboDistrito);
        objempleado.ConsultarUsuario(cboUsuario);
        this.setLocationRelativeTo(null);
        chkEstado.setSelected(true);
       
         lblCodEmp.setVisible(true);
        lblUsuario.setVisible(true);
        PonerIcono();
       // CargarGenero();
     
        Bloquear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbEmpleado = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        bgtnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSue = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        cboDistrito = new javax.swing.JComboBox();
        cboUsuario = new javax.swing.JComboBox();
        txtfech = new com.toedter.calendar.JDateChooser();
        lblCodEmp = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFoto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rbM = new javax.swing.JRadioButton();
        rbF = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Mantenimiento Empleado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 570, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 340, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 340, -1));
        jPanel1.add(txtCorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 340, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Distrito");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        jtbEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 740, 170));

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        bgtnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgtnRegresar.setText("Regresar");
        bgtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgtnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(bgtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, -1));
        jPanel1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 340, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Direccion");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 340, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Genero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        jPanel1.add(txtSue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 340, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Sueldo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        chkEstado.setText("Habilitado");
        jPanel1.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 100, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Estado");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jPanel1.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 340, -1));

        jPanel1.add(cboUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 340, -1));
        jPanel1.add(txtfech, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 340, -1));

        lblCodEmp.setText("lblCodEmp");
        jPanel1.add(lblCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        lblUsuario.setText("lblUsuario");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        lblImagen.setText("lblImagen");
        lblImagen.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 170, 170));

        jButton1.setText("Buscar Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 130, -1));
        jPanel1.add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 230, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Foto");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        genero.add(rbM);
        rbM.setText("Masculino");
        jPanel1.add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 190, 90, -1));

        genero.add(rbF);
        rbF.setText("Femenino");
        jPanel1.add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 190, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
     try{
         if(txtNombre.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese su nombre","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtNombre.requestFocus();
         }else if(txtApellido.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese su apellido","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtApellido.requestFocus();
         }else if(txtCorr.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese su correo","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtCorr.requestFocus();
         }else if(txtDir.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese su direccion","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtDir.requestFocus();
         }else if(rbM.isSelected()==false && rbF.isSelected()==false){
             JOptionPane.showMessageDialog(null, "Seleccione su sexo","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             rbM.requestFocus();
         }else if(txtfech.getDate()==null){
             JOptionPane.showMessageDialog(null, "Seleccione su fecha de nacimiento","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtfech.requestFocus();
         }else if(txtTel.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese su numero de telefono","Error de Validacion",JOptionPane.INFORMATION_MESSAGE);
             txtTel.requestFocus();
             
         }else if(txtSue.getText().equals("")==true){
             JOptionPane.showMessageDialog(null, "Ingrese el sueldo");
             txtSue.requestFocus();
         }else if(cboDistrito.getSelectedIndex()==0){
             JOptionPane.showMessageDialog(null,"Seleccione el distrito");
             cboDistrito.requestFocus();
         }else if(cboUsuario.getSelectedIndex()==0){
             JOptionPane.showMessageDialog(null, "Seleccione el distrito");
             cboUsuario.requestFocus();
         }else{
          nom = txtNombre.getText();
        ape = txtApellido.getText();
        corre = txtCorr.getText();
        dire = txtDir.getText();
        if(rbM.isSelected()==true){
            sex="Masculino";
        }else if(rbF.isSelected()==true){
            sex="Femenino";
        }
        fe = txtfech.getDate();
        java.sql.Date fechDate = new java.sql.Date(fe.getTime());
        tel = Integer.parseInt(txtTel.getText());
        sue = txtSue.getText();
         File ruta= new File(txtFoto.getText());
        dis = cboDistrito.getSelectedIndex();
        usu = cboUsuario.getSelectedIndex();        est = chkEstado.isSelected();
        objempleado.setNombre(nom);
        objempleado.setApellido(ape);
        objempleado.setCorreo(corre);
        objempleado.setDireccion(dire);
        objempleado.setSexo(sex);
        objempleado.setFecha(fechDate);
        objempleado.setTelefono(tel);
        objempleado.setSueldo(sue);
         //enviar la imagen
       
       try{
           
           byte[]icono =new byte[(int) ruta.length()];
           InputStream input = new FileInputStream(ruta);
           input.read(icono);
           objempleado.setFoto(icono);
           
       }catch(IOException ex){
           objempleado.setFoto(null);
           System.err.println(ex.toString());
           
       }

        objempleado.setNomdistrito(dis);
        objempleado.setNomusuario(usu);

        objempleado.setEstado(est);

        res = objempleado.RegistrarEmpleado(objempleado);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Empleado Registrado");
            objempleado.MostrarEmpleadoTodo(jtbEmpleado);
            Limpiar();
            Bloquear();

        } else {
            JOptionPane.showMessageDialog(null, "No se registro el Empleado ");
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

    private void bgtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgtnRegresarActionPerformed
        frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblUsuario.setText(lblUsuario.getText());
       formulario. lblCodEmp.setText(lblCodEmp.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bgtnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    try{
        cod=Integer.parseInt(lblCodEmp.getText());
          nom = txtNombre.getText();
        ape = txtApellido.getText();
        corre = txtCorr.getText();
        dire = txtDir.getText();
        if(rbM.isSelected()==true){
            sex="Masculino";
        }else if(rbF.isSelected()==true){
            sex="Femenino";
        }
        fe = txtfech.getDate();
        java.sql.Date fechDate = new java.sql.Date(fe.getTime());
        tel = Integer.parseInt(txtTel.getText());
        sue = txtSue.getText();
          File ruta= new File(txtFoto.getText());
        dis = cboDistrito.getSelectedIndex();
        usu = cboUsuario.getSelectedIndex();

        est = chkEstado.isSelected();
        objempleado.setCodigo(cod);
        objempleado.setNombre(nom);
        objempleado.setApellido(ape);
        objempleado.setCorreo(corre);
        objempleado.setDireccion(dire);
        objempleado.setSexo(sex);
        objempleado.setFecha(fechDate);
        objempleado.setTelefono(tel);
        objempleado.setSueldo(sue);
          //enviar la imagen
       
       try{
           
           byte[]icono =new byte[(int) ruta.length()];
           InputStream input = new FileInputStream(ruta);
           input.read(icono);
           objempleado.setFoto(icono);
           
       }catch(IOException ex){
           objempleado.setFoto(null);
           System.err.println(ex.toString());
           
       }
        objempleado.setNomdistrito(dis);
        objempleado.setNomusuario(usu);

        objempleado.setEstado(est);

        res = objempleado.ActualizarEmpleado(objempleado);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            objempleado.MostrarEmpleadoTodo(jtbEmpleado);
            Limpiar();
            Bloquear();

        } else {
            JOptionPane.showMessageDialog(null, "No se Actualizo el empleado ");
            Limpiar();

        }
         
     }catch(Exception ex){
         System.err.println(ex.toString());
     }

    }//GEN-LAST:event_btnActualizarActionPerformed
private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }
    private void jtbEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbEmpleadoMouseClicked
      try{
        if (evt.getButton() == 1) {
            int fila = jtbEmpleado.getSelectedRow();
            lblCodEmp.setText(jtbEmpleado.getValueAt(fila,0).toString());
            txtNombre.setText(jtbEmpleado.getValueAt(fila,1).toString());
            txtApellido.setText(jtbEmpleado.getValueAt(fila,2).toString());
            txtCorr.setText(jtbEmpleado.getValueAt(fila,3).toString());
            txtDir.setText(jtbEmpleado.getValueAt(fila,4).toString());
           if(jtbEmpleado.getValueAt(fila,5).toString().equals("Masculino")){
               rbM.setSelected(true);
           }else if(jtbEmpleado.getValueAt(fila,5).toString().equals("Femenino")){
               rbF.setSelected(true);
           }
           SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
           String fecha= (jtbEmpleado.getValueAt(fila,6).toString());
            Date dato= null;
            try{
               dato=formatoDelTexto.parse(fecha);
               txtfech.setDate(dato);
            }catch(ParseException ex){
                System.out.println(ex.toString());
            }
            txtTel.setText(jtbEmpleado.getValueAt(fila,7).toString());
            txtSue.setText(jtbEmpleado.getValueAt(fila,8).toString());
           
            cboDistrito.setSelectedItem(jtbEmpleado.getValueAt(fila,9).toString());
            cboUsuario.setSelectedItem(jtbEmpleado.getValueAt(fila,10).toString());
            if (jtbEmpleado.getValueAt(fila,11).toString().equals("Habilitado")) {
                chkEstado.setSelected(true);
            } else {
                chkEstado.setSelected(false);
            }

        }
      }catch(Exception ex){
          System.err.println(ex.toString());
      }
    }//GEN-LAST:event_jtbEmpleadoMouseClicked
public void MostrarFecha(){
    Date fecha=new Date();
    txtfech.setDate(fecha);
}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          try{
        cod=Integer.parseInt(lblCodEmp.getText());
     
        objempleado.setCodigo(cod);

        res = objempleado.EliminarEmpleado(objempleado);
        if (res = true) {
            JOptionPane.showMessageDialog(null, "Empleado eliminado");
            objempleado.MostrarEmpleadoTodo(jtbEmpleado);
            Limpiar();
            Bloquear();

        } else {
            JOptionPane.showMessageDialog(null, "No se elimino el Empleado ");
            Limpiar();

        }
         
     }catch(Exception ex){
         System.err.println(ex.toString());
     }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed
    void Desbloquear() {
        btnActualizar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnRegistrar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtNombre.setEditable(true);
        txtApellido.setEditable(true);
        txtCorr.setEditable(true);
        txtSue.setEditable(true);
        lblImagen.setEnabled(true);
        txtTel.setEditable(true);
        cboDistrito.setEditable(true);
        rbM.setEnabled(true);
        rbF.setEnabled(true);
        cboUsuario.setEditable(true);
        btnNuevo.setEnabled(false);

    }

    void Bloquear() {
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnNuevo.setEnabled(true);
        txtNombre.setEditable(false);
        txtApellido.setEditable(false);
        txtCorr.setEditable(false);
        txtSue.setEditable(false);
        lblImagen.setEnabled(false);
        txtTel.setEditable(false);
        cboDistrito.setEditable(false);
        rbM.setEnabled(false);
        rbF.setEnabled(false);
        cboUsuario.setEditable(false);

    }

 /*   void CargarGenero() {
        cboSexo.addItem("Seleccione una opcion");
        cboSexo.addItem("Masculino");
        cboSexo.addItem("Femenino");

    }*/

    void Limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDir.setText("");
        txtCorr.setText("");
        txtfech.setDate(null);
        txtTel.setText("");
        txtSue.setText("");
        lblImagen.setText("");
        cboDistrito.setSelectedIndex(0);
        cboUsuario.setSelectedIndex(0);
        genero.clearSelection();
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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bgtnRegresar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboDistrito;
    private javax.swing.JComboBox cboUsuario;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbEmpleado;
    public javax.swing.JLabel lblCodEmp;
    private javax.swing.JLabel lblImagen;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorr;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSue;
    private javax.swing.JTextField txtTel;
    private com.toedter.calendar.JDateChooser txtfech;
    // End of variables declaration//GEN-END:variables
}
