

package Constructora.com.gui;

import Constructora.com.jdbc.clsBoleto;
import Constructora.com.jdbc.clsDetalleBoleto;
import java.util
        .Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmBoleto extends javax.swing.JFrame {

    clsBoleto objboleto = new clsBoleto();
    clsDetalleBoleto objdetalle = new clsDetalleBoleto();
    DefaultTableModel modelo = null;

    int nro = 0, codcli = 0, codemp = 0, codeve = 0, can = 0;
    String nomcli = "";
    boolean est = false;
    
    public frmBoleto() {
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.setLocationRelativeTo(null);
        lblCodCli.setText("0");
        lblCodigo.setText("0");
        txtNro.setText("" + objboleto.GenerarCodigo());
        MostrarFecha();
        chkEstado.setSelected(true);
        CargarDetalle();
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        txtEmp = new javax.swing.JTextField();
        txtProve = new javax.swing.JTextField();
        txtFech = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblCodCli = new javax.swing.JLabel();
        lblCodUsu = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDetalleBoleto = new javax.swing.JTable();
        btnAgregarEvento = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTot = new javax.swing.JTextField();
        btnRegistrarBoleto = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Registro Boleto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 540, 60));

        jLabel2.setText("Nro:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        jPanel1.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, -1));
        jPanel1.add(txtEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, -1));
        jPanel1.add(txtProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 230, -1));
        jPanel1.add(txtFech, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 230, -1));

        chkEstado.setText("Habilitado");
        jPanel1.add(chkEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setText("lblCodigo");
        lblCodigo.setToolTipText("");
        jPanel3.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 41, -1, -1));

        lblCodCli.setText("lblCodCli");
        jPanel3.add(lblCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 66, -1, -1));

        lblCodUsu.setText("lblCodUsu");
        jPanel3.add(lblCodUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 98, -1, -1));

        btnBuscarCliente.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnBuscarCliente.setText("Buscar Provedor");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel3.setText("Empleado");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("Proveedor");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setText("Fecha");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setText("Estado");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 660, 210));

        jPanel4.setBackground(new java.awt.Color(204, 51, 0));

        jtbDetalleBoleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtbDetalleBoleto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDetalleBoletoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDetalleBoleto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 670, 190));

        btnAgregarEvento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnAgregarEvento.setText("Agregar Producto");
        btnAgregarEvento.setToolTipText("");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel7.setText("Total:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));
        jPanel1.add(txtTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 160, -1));

        btnRegistrarBoleto.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegistrarBoleto.setText("Registrar Boleto");
        btnRegistrarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarBoletoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarBoleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
      if (jtbDetalleBoleto.getRowCount() == 0) {
            frmBusquedaProducto formulario = new frmBusquedaProducto();
            formulario.lblCodCli.setText(lblCodCli.getText());
            formulario.lblCodEmp.setText(lblCodigo.getText());
            formulario.lblNro.setText(txtNro.getText());
            formulario.btnEnviar.setVisible(true);
            formulario.lblDatos.setText("" + jtbDetalleBoleto.getRowCount());
            formulario.setVisible(true);
            this.setVisible(false);
        } else {
            frmBusquedaProducto formulario = new frmBusquedaProducto();
            formulario.jtbAuxiliar.setModel(jtbDetalleBoleto.getModel());
            formulario.lblCodCli.setText(lblCodCli.getText());
            formulario.lblCodEmp.setText(lblCodigo.getText());
            formulario.lblNro.setText(txtNro.getText());
            formulario.btnEnviar.setVisible(true);
            formulario.lblDatos.setText("" + jtbDetalleBoleto.getRowCount());
            formulario.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void jtbDetalleBoletoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDetalleBoletoMouseClicked
        CalculaSuma();
    }//GEN-LAST:event_jtbDetalleBoletoMouseClicked

    private void btnRegistrarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarBoletoActionPerformed
      boolean est = false;
        codcli = Integer.parseInt(lblCodCli.getText());
        codemp = Integer.parseInt(lblCodigo.getText());
        est = chkEstado.isSelected();
        objboleto.setCodcliente(codcli);
        objboleto.setCodempleado(codemp);
        objboleto.setEstado(est);
        if (objboleto.AgregarBoleto(objboleto)) {
            for (int i = 0; i < jtbDetalleBoleto.getRowCount(); i++) {
                nro = Integer.parseInt(txtNro.getText());
                codeve = Integer.parseInt(jtbDetalleBoleto.getValueAt(i, 0).toString());
                can = Integer.parseInt(jtbDetalleBoleto.getValueAt(i, 3).toString());
                objdetalle.setNumero(nro);
                objdetalle.setCodevento(codeve);
                objdetalle.setCantidad(can);
                
                if (objdetalle.AgregarDetalle(objdetalle)) {
                    est = objdetalle.ActualizarDetalle(objdetalle);
                }
            }
            
            if (est) {
                JOptionPane.showMessageDialog(null, "Boleto Registrado", "Registro de Usuario", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Boleto no Registrado", "Registro de Usuario", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarBoletoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
     frmMenuPrincipal formulario = new frmMenuPrincipal();
        formulario.lblCodEmp.setText(lblCodigo.getText());
        formulario.lblUsuario.setText(lblCodUsu.getText());
        formulario.lblCodEmp.setVisible(false);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        frmBusquedaProveedor formulario = new frmBusquedaProveedor();
        formulario.lblCodigo.setText(lblCodigo.getText());
        formulario.lblUsuario.setText(lblCodUsu.getText());
        formulario.btnEnviar.setVisible(true);
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed
public void CargarDetalle() {
        Object[] fila = new Object[5];
        String columna[] = {"Codigo", "Nombre", "Precio", "Cantidad", "Subtotal"};
        modelo = new DefaultTableModel(null, columna);
        jtbDetalleBoleto.setModel(modelo);
    }
    
    public void MostrarFecha() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        txtFech.setText(formateador.format(ahora));
    }
    
    public void CalculaSuma() {
        int filas = jtbDetalleBoleto.getRowCount();
        double tot = 0, subt[] = null;
        if (jtbDetalleBoleto.getRowCount() == 0) {
            txtTot.setText("0");
        } else {
            subt = new double[jtbDetalleBoleto.getRowCount()];
            for (int i = 0; i <= filas - 1; i++) {
                subt[i] = Double.parseDouble(String.valueOf(jtbDetalleBoleto.getValueAt(i, 4)));
            }
            for (int i = 0; i <= filas - 1; i++) {
                tot = tot + subt[i];
            }
            txtTot.setText("" + tot);
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
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBoleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBoleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnRegistrarBoleto;
    private javax.swing.JButton btnRegresar;
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
    public javax.swing.JTable jtbDetalleBoleto;
    public javax.swing.JLabel lblCodCli;
    public javax.swing.JLabel lblCodUsu;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JTextField txtEmp;
    private javax.swing.JTextField txtFech;
    private javax.swing.JTextField txtNro;
    public javax.swing.JTextField txtProve;
    private javax.swing.JTextField txtTot;
    // End of variables declaration//GEN-END:variables
}
