package Constructora.com.gui;

import Constructora.com.jdbc.clsConexion;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class frmMenuPrincipal extends javax.swing.JFrame {
//declaramos la variables para el ancho y alto

    int anc = 0, alt = 0;
//creamos el objeto de la clase JPanelFondo
    JPanelFondo objimagen;
//creamos una variable de tipo dimension
    private Dimension dim;
    clsConexion objConexion=new clsConexion();
    String raiz="";

    public frmMenuPrincipal() {
        this.setResizable(false);
        initComponents();
        lblCodEmp.setVisible(false);
        //this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //permite maximizar la ventana
        this.setExtendedState(MAXIMIZED_BOTH);
        //obtenemos el tamaño de la ventana
        dim = super.getToolkit().getScreenSize();
        //ancho
        anc = (int) dim.getWidth();
        //alto
        alt = (int) dim.getHeight();
        //creamos el objeto pasandole como parametro el ancho y el alto
        objimagen = new JPanelFondo(anc, alt);
        //llamamos el procedimiento
        PonerFondo();
        PonerIcono();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jPFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        lblUsuario = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmMatenimiento = new javax.swing.JMenu();
        jmiCategoria = new javax.swing.JMenuItem();
        jmiClienteMantenimiento = new javax.swing.JMenuItem();
        jmiProveedorMantenimiento = new javax.swing.JMenuItem();
        jmiDetallesdeContratoM = new javax.swing.JMenuItem();
        jmiComprasMantenimiento = new javax.swing.JMenuItem();
        jmiDistritoMantemiento = new javax.swing.JMenuItem();
        jmiProductoBusqueda = new javax.swing.JMenuItem();
        jmiEmpleadoMantenimiento = new javax.swing.JMenuItem();
        jmiPerfilMantenimiento = new javax.swing.JMenuItem();
        jmiUsuarioMantenimiento = new javax.swing.JMenuItem();
        jmiAreaBusqueda = new javax.swing.JMenu();
        jmiCategoriaBusqueda = new javax.swing.JMenuItem();
        jmiClienteB = new javax.swing.JMenuItem();
        jmiProveedorBusqueda = new javax.swing.JMenuItem();
        jmiDetallesdeCompra = new javax.swing.JMenuItem();
        jmiComprasBusqueda = new javax.swing.JMenuItem();
        jmiDistrito = new javax.swing.JMenuItem();
        jmiProducto = new javax.swing.JMenuItem();
        jmiEmpleado = new javax.swing.JMenuItem();
        jmiPerfilB = new javax.swing.JMenuItem();
        jmiBuscarUsuario = new javax.swing.JMenuItem();
        jmProceso = new javax.swing.JMenu();
        jmiGenerarBoleto = new javax.swing.JMenuItem();
        jmiListarBoleto = new javax.swing.JMenuItem();
        jmReporte = new javax.swing.JMenu();
        jmiAreaReporte = new javax.swing.JMenuItem();
        jmiClienteReporte = new javax.swing.JMenuItem();
        jmiContratoReporte = new javax.swing.JMenuItem();
        jmiDetallesdeProductoReporte = new javax.swing.JMenuItem();
        jmiComprasReportes = new javax.swing.JMenuItem();
        jmiDistritoReporte = new javax.swing.JMenuItem();
        jmiProductoReporte = new javax.swing.JMenuItem();
        jmiEmpleadoReporte = new javax.swing.JMenuItem();
        jmiPerfilReporte = new javax.swing.JMenuItem();
        jmiUsuarioReporte = new javax.swing.JMenuItem();
        jmUtilidades = new javax.swing.JMenu();
        jmiCalculadora = new javax.swing.JMenuItem();
        jmiBlockdeNotas = new javax.swing.JMenuItem();
        jmiWord = new javax.swing.JMenuItem();
        jmiExel = new javax.swing.JMenuItem();
        jmiPaint = new javax.swing.JMenuItem();
        lblCodEmp = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        jMenu5.setText("jMenu5");

        jMenu8.setText("jMenu8");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem30.setText("jMenuItem30");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout jPFondoLayout = new javax.swing.GroupLayout(jPFondo);
        jPFondo.setLayout(jPFondoLayout);
        jPFondoLayout.setHorizontalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        jPFondoLayout.setVerticalGroup(
            jPFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        lblUsuario.setText("Usuario");
        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(lblUsuario);

        jmSalir.setText("Inicio");

        jmiCerrarSesion.setText("Cerrar Sesión");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jmSalir.add(jmiCerrarSesion);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmiSalir);

        jMenuBar1.add(jmSalir);

        jmMatenimiento.setText("Mantenimiento");

        jmiCategoria.setText("Categoria");
        jmiCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoriaActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiCategoria);

        jmiClienteMantenimiento.setText("Cliente");
        jmiClienteMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiClienteMantenimiento);

        jmiProveedorMantenimiento.setText("Proveedor");
        jmiProveedorMantenimiento.setToolTipText("");
        jmiProveedorMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedorMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiProveedorMantenimiento);

        jmiDetallesdeContratoM.setText("Detalles de Compra");
        jmiDetallesdeContratoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetallesdeContratoMActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiDetallesdeContratoM);

        jmiComprasMantenimiento.setText("Compras");
        jmiComprasMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComprasMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiComprasMantenimiento);

        jmiDistritoMantemiento.setText("Distrito");
        jmiDistritoMantemiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDistritoMantemientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiDistritoMantemiento);

        jmiProductoBusqueda.setText("Producto");
        jmiProductoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoBusquedaActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiProductoBusqueda);

        jmiEmpleadoMantenimiento.setText("Empleado");
        jmiEmpleadoMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpleadoMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiEmpleadoMantenimiento);

        jmiPerfilMantenimiento.setText("Perfil");
        jmiPerfilMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPerfilMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiPerfilMantenimiento);

        jmiUsuarioMantenimiento.setText("Usuario");
        jmiUsuarioMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioMantenimientoActionPerformed(evt);
            }
        });
        jmMatenimiento.add(jmiUsuarioMantenimiento);

        jMenuBar1.add(jmMatenimiento);

        jmiAreaBusqueda.setText("Busqueda");

        jmiCategoriaBusqueda.setText("Categoria");
        jmiCategoriaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoriaBusquedaActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiCategoriaBusqueda);

        jmiClienteB.setText("Cliente");
        jmiClienteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteBActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiClienteB);

        jmiProveedorBusqueda.setText("Proveedor");
        jmiProveedorBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProveedorBusquedaActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiProveedorBusqueda);

        jmiDetallesdeCompra.setText("Detalles de Compra");
        jmiDetallesdeCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetallesdeCompraActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiDetallesdeCompra);

        jmiComprasBusqueda.setText("Compras");
        jmiComprasBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComprasBusquedaActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiComprasBusqueda);

        jmiDistrito.setText("Distrito");
        jmiDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDistritoActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiDistrito);

        jmiProducto.setText("Producto");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiProducto);

        jmiEmpleado.setText("Empleado");
        jmiEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpleadoActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiEmpleado);

        jmiPerfilB.setText("Perfil");
        jmiPerfilB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPerfilBActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiPerfilB);

        jmiBuscarUsuario.setText("Usuario");
        jmiBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarUsuarioActionPerformed(evt);
            }
        });
        jmiAreaBusqueda.add(jmiBuscarUsuario);

        jMenuBar1.add(jmiAreaBusqueda);

        jmProceso.setText("Proceso");

        jmiGenerarBoleto.setText("Generar Boleto");
        jmiGenerarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGenerarBoletoActionPerformed(evt);
            }
        });
        jmProceso.add(jmiGenerarBoleto);

        jmiListarBoleto.setText("Listar Boleto");
        jmiListarBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListarBoletoActionPerformed(evt);
            }
        });
        jmProceso.add(jmiListarBoleto);

        jMenuBar1.add(jmProceso);

        jmReporte.setText("Reporte");

        jmiAreaReporte.setText("Categoria");
        jmiAreaReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAreaReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiAreaReporte);

        jmiClienteReporte.setText("Cliente");
        jmiClienteReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiClienteReporte);

        jmiContratoReporte.setText("Proveedor");
        jmiContratoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContratoReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiContratoReporte);

        jmiDetallesdeProductoReporte.setText("Detalles de Producto");
        jmiDetallesdeProductoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetallesdeProductoReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiDetallesdeProductoReporte);

        jmiComprasReportes.setText("Compras");
        jmiComprasReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComprasReportesActionPerformed(evt);
            }
        });
        jmReporte.add(jmiComprasReportes);

        jmiDistritoReporte.setText("Distrito");
        jmiDistritoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDistritoReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiDistritoReporte);

        jmiProductoReporte.setText("Producto");
        jmiProductoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiProductoReporte);

        jmiEmpleadoReporte.setText("Empleado");
        jmiEmpleadoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEmpleadoReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiEmpleadoReporte);

        jmiPerfilReporte.setText("Perfil");
        jmiPerfilReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPerfilReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiPerfilReporte);

        jmiUsuarioReporte.setText("Usuario");
        jmiUsuarioReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioReporteActionPerformed(evt);
            }
        });
        jmReporte.add(jmiUsuarioReporte);

        jMenuBar1.add(jmReporte);

        jmUtilidades.setText("Utilidades");

        jmiCalculadora.setText("Calculadora");
        jmiCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCalculadoraActionPerformed(evt);
            }
        });
        jmUtilidades.add(jmiCalculadora);

        jmiBlockdeNotas.setText("Block de Notas");
        jmiBlockdeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBlockdeNotasActionPerformed(evt);
            }
        });
        jmUtilidades.add(jmiBlockdeNotas);

        jmiWord.setText("Word");
        jmiWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiWordActionPerformed(evt);
            }
        });
        jmUtilidades.add(jmiWord);

        jmiExel.setText("Exel");
        jmiExel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExelActionPerformed(evt);
            }
        });
        jmUtilidades.add(jmiExel);

        jmiPaint.setText("Paint");
        jmiPaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPaintActionPerformed(evt);
            }
        });
        jmUtilidades.add(jmiPaint);

        jMenuBar1.add(jmUtilidades);

        lblCodEmp.setText("lblCodEmp");
        jMenuBar1.add(lblCodEmp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?", "Saliendo del Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opcion == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
       int opcion = JOptionPane.showConfirmDialog(null, "¿Estas seguro que desea salir?", "Saliendo del Sistema", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            frmIngreso formulario=new frmIngreso();
          formulario.setVisible(true);
          this.setVisible(false);
        }
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiProveedorMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedorMantenimientoActionPerformed
         frmProveedor formulario=new frmProveedor();
         formulario.lblCodEmp.setText(lblCodEmp.getText());
         formulario.lblUsuario.setText(lblUsuario.getText());
          formulario.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_jmiProveedorMantenimientoActionPerformed

    private void jmiDistritoMantemientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDistritoMantemientoActionPerformed
        frmDistritoo formulario=new frmDistritoo();
          formulario.lblCodEmp.setText(lblCodEmp.getText());
          formulario.lblUsuario.setText(lblUsuario.getText());
          formulario.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_jmiDistritoMantemientoActionPerformed

    private void jmiBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarUsuarioActionPerformed
        frmBuscarUsuario formulario=new frmBuscarUsuario();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiBuscarUsuarioActionPerformed

    private void jmiCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriaActionPerformed
      frmCategoria formulario=new frmCategoria();
       formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiCategoriaActionPerformed

    private void jmiClienteMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteMantenimientoActionPerformed
          frmCliente formulario=new frmCliente();
           formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiClienteMantenimientoActionPerformed

    private void jmiDetallesdeContratoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetallesdeContratoMActionPerformed
         frmDetallesdeProducto formulario=new frmDetallesdeProducto();
          formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiDetallesdeContratoMActionPerformed

    private void jmiPerfilMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPerfilMantenimientoActionPerformed
        frmPerfil formulario=new frmPerfil();
         formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiPerfilMantenimientoActionPerformed

    private void jmiUsuarioMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioMantenimientoActionPerformed
         frmUsuario formulario=new frmUsuario();
          formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiUsuarioMantenimientoActionPerformed

    private void jmiDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDistritoActionPerformed
      frmBusquedaDistrito formulario=new frmBusquedaDistrito();
       formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jmiDistritoActionPerformed

    private void jmiEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpleadoActionPerformed
        frmBuscarEmpleado formulario=new frmBuscarEmpleado();
         formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiEmpleadoActionPerformed

    private void jmiPerfilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPerfilBActionPerformed
       frmPerfil formulario=new frmPerfil();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiPerfilBActionPerformed

    private void jmiUsuarioReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioReporteActionPerformed
      /*try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="I:\\EmpresaCopia\\Constructora Elvlis\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptUsuario.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
}
        */
        JasperPrint jasperPrintWindow=null;
        try{
            jasperPrintWindow=JasperFillManager.fillReport(raiz +"F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptUsuario.jasper", null,objConexion.Conectar());
        }catch(JRException ex){
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null ,ex);
        }
        JasperViewer jasperViewer=new JasperViewer(jasperPrintWindow);
        
        jasperViewer.setVisible(true);
    }//GEN-LAST:event_jmiUsuarioReporteActionPerformed

    private void jmiCategoriaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriaBusquedaActionPerformed
         frmBuscarCategoria formulario=new frmBuscarCategoria();
          formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiCategoriaBusquedaActionPerformed

    private void jmiClienteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteBActionPerformed
         frmBusquedaCliente formulario=new frmBusquedaCliente();
          formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiClienteBActionPerformed

    private void jmiProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProveedorBusquedaActionPerformed
            frmBusquedaProveedor formulario=new frmBusquedaProveedor();
             formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiProveedorBusquedaActionPerformed

    private void jmiDetallesdeCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetallesdeCompraActionPerformed
       frmDetallesdeProducto formulario=new frmDetallesdeProducto();
        formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
       formulario.setVisible(true);
       this.setVisible(false);
       
                              
    }//GEN-LAST:event_jmiDetallesdeCompraActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
          frmBusquedaProducto formulario=new frmBusquedaProducto();
           formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiClienteReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteReporteActionPerformed
        try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptCliente.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiClienteReporteActionPerformed

    private void jmiComprasMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComprasMantenimientoActionPerformed
        frmCompras formulario=new frmCompras();
         formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
        formulario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiComprasMantenimientoActionPerformed

    private void jmiAreaReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAreaReporteActionPerformed
     
        try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptCategoria.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
          
        
    }//GEN-LAST:event_jmiAreaReporteActionPerformed

    private void jmiContratoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContratoReporteActionPerformed
        try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptProveedor.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiContratoReporteActionPerformed

    private void jmiDetallesdeProductoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetallesdeProductoReporteActionPerformed
         try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptDetalleProducto.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiDetallesdeProductoReporteActionPerformed

    private void jmiComprasReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComprasReportesActionPerformed
       try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptCompras.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiComprasReportesActionPerformed

    private void jmiDistritoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDistritoReporteActionPerformed
       try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptDistrito.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiDistritoReporteActionPerformed

    private void jmiProductoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoReporteActionPerformed
         try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptProducto.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiProductoReporteActionPerformed

    private void jmiEmpleadoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpleadoReporteActionPerformed
      try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptEmpleado.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiEmpleadoReporteActionPerformed

    private void jmiPerfilReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPerfilReporteActionPerformed
        try {
            clsConexion objConexion=new clsConexion();
            Connection conn=objConexion.Conectar();
            JasperReport reporte=null;
            String path="F:\\EmpresaOriginal\\Constructora Elvlis(original)\\Aplicacion\\SistemaEditorial\\src\\reportes\\rptPerfil.jasper";
            
            reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint=JasperFillManager.fillReport(path, null, conn);
            JasperViewer view=new JasperViewer(jprint,false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
        } catch (JRException ex) {
            
            Logger.getLogger(frmMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmiPerfilReporteActionPerformed

    private void jmiCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCalculadoraActionPerformed
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("calc");
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmiCalculadoraActionPerformed

    private void jmiBlockdeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBlockdeNotasActionPerformed
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("notepad");
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmiBlockdeNotasActionPerformed

    private void jmiWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiWordActionPerformed
      try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("cmd /c start winword.exe");
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmiWordActionPerformed

    private void jmiExelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExelActionPerformed
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("cmd /c start excel.exe");
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmiExelActionPerformed

    private void jmiPaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPaintActionPerformed
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("mspaint");
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmiPaintActionPerformed

    private void jmiEmpleadoMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEmpleadoMantenimientoActionPerformed
      frmEmpleado formulario=new frmEmpleado();
       formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jmiEmpleadoMantenimientoActionPerformed

    private void jmiProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoBusquedaActionPerformed
        frmProducto formulario=new frmProducto();
       formulario.lblCodEmp.setText(lblCodEmp.getText());
        formulario.lblUsuario.setText(lblUsuario.getText());
      formulario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jmiProductoBusquedaActionPerformed

    private void jmiComprasBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComprasBusquedaActionPerformed
    frmCompras formulario=new frmCompras();
    formulario.lblCodEmp.setText(lblCodEmp.getText());
    formulario.lblUsuario.setText(lblUsuario.getText());
    formulario.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jmiComprasBusquedaActionPerformed

    private void jmiGenerarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGenerarBoletoActionPerformed
         frmBoleto formulario=new frmBoleto();
    formulario.lblCodigo.setText(lblCodEmp.getText());
    formulario.lblCodUsu.setText(lblUsuario.getText());
    formulario.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jmiGenerarBoletoActionPerformed

    private void jmiListarBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListarBoletoActionPerformed
          frmListarBoleto formulario=new frmListarBoleto();
    formulario.lblCodEmp.setText(lblCodEmp.getText());
    formulario.lblUsuario.setText(lblUsuario.getText());
    formulario.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jmiListarBoletoActionPerformed
    
    private void PonerIcono() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/logoem.jpg"));
        setIconImage(icon);
    }

    //creamos el procedimiento para asignarle la imagen al Jpane
    private void PonerFondo() {
        jPFondo.add(objimagen);
        jPFondo.repaint();
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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    private static class NewJFrame {

        public NewJFrame() {
        }
    }

    public class JPanelFondo extends javax.swing.JPanel {

        public JPanelFondo(int x, int y) {
            this.setSize(x, y);
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension d = getSize();
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/logoem.jpg"));
            grafico.drawImage(Img.getImage(), 0, 0, d.width, d.height, null);
            setOpaque(false);
            super.paintComponent(grafico);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPFondo;
    public javax.swing.JMenu jmMatenimiento;
    private javax.swing.JMenu jmProceso;
    public javax.swing.JMenu jmReporte;
    public javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmUtilidades;
    public javax.swing.JMenu jmiAreaBusqueda;
    private javax.swing.JMenuItem jmiAreaReporte;
    private javax.swing.JMenuItem jmiBlockdeNotas;
    private javax.swing.JMenuItem jmiBuscarUsuario;
    private javax.swing.JMenuItem jmiCalculadora;
    private javax.swing.JMenuItem jmiCategoria;
    private javax.swing.JMenuItem jmiCategoriaBusqueda;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiClienteB;
    private javax.swing.JMenuItem jmiClienteMantenimiento;
    private javax.swing.JMenuItem jmiClienteReporte;
    private javax.swing.JMenuItem jmiComprasBusqueda;
    private javax.swing.JMenuItem jmiComprasMantenimiento;
    private javax.swing.JMenuItem jmiComprasReportes;
    private javax.swing.JMenuItem jmiContratoReporte;
    private javax.swing.JMenuItem jmiDetallesdeCompra;
    private javax.swing.JMenuItem jmiDetallesdeContratoM;
    private javax.swing.JMenuItem jmiDetallesdeProductoReporte;
    private javax.swing.JMenuItem jmiDistrito;
    private javax.swing.JMenuItem jmiDistritoMantemiento;
    private javax.swing.JMenuItem jmiDistritoReporte;
    private javax.swing.JMenuItem jmiEmpleado;
    private javax.swing.JMenuItem jmiEmpleadoMantenimiento;
    private javax.swing.JMenuItem jmiEmpleadoReporte;
    private javax.swing.JMenuItem jmiExel;
    private javax.swing.JMenuItem jmiGenerarBoleto;
    private javax.swing.JMenuItem jmiListarBoleto;
    private javax.swing.JMenuItem jmiPaint;
    private javax.swing.JMenuItem jmiPerfilB;
    private javax.swing.JMenuItem jmiPerfilMantenimiento;
    private javax.swing.JMenuItem jmiPerfilReporte;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenuItem jmiProductoBusqueda;
    private javax.swing.JMenuItem jmiProductoReporte;
    private javax.swing.JMenuItem jmiProveedorBusqueda;
    private javax.swing.JMenuItem jmiProveedorMantenimiento;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiUsuarioMantenimiento;
    private javax.swing.JMenuItem jmiUsuarioReporte;
    private javax.swing.JMenuItem jmiWord;
    public javax.swing.JMenu lblCodEmp;
    public javax.swing.JMenu lblUsuario;
    // End of variables declaration//GEN-END:variables
}
