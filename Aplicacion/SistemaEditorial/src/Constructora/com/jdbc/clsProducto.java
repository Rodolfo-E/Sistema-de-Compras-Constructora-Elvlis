package Constructora.com.jdbc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsProducto {

    private int codigo;
    private String nombre;
    private int cantidad;
    private int codiprovedor;
    private double precio;
    private boolean estado;
    private byte[] foto;

    //objetos
    //objeto de la clase clsConexion-->para conectase con la BD
    clsConexion objconexion = new clsConexion();
    //variables
    private Connection xcon;
    //statement -->sirve para poder utilizar sentencial SQL
    private Statement st;
    private PreparedStatement pst;

    //ResultSet--> sirve para almacenar el resultado de una consulta
    private ResultSet rs;
    //DefaultTableModel-->modelo de la tabla
    private DefaultTableModel modelo;
    //declarasmos una variable entera para los resultados
    int res = 0;

    public clsProducto() {
        codigo = 0;
        nombre = "";
        cantidad = 0;
        codiprovedor = 0;
        precio = 0;
        estado = false;
        foto = null;

    }

    public clsProducto(int codigo, String nombre, int cantidad, int codiprovedor, double precio, boolean estado, byte[] foto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codiprovedor = codiprovedor;
        this.precio = precio;
        this.estado = estado;
        this.foto = foto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodiprovedor() {
        return codiprovedor;
    }

    public void setCodiprovedor(int codiprovedor) {
        this.codiprovedor = codiprovedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void MostrarProducto(JTable tabla) {
        try {
             JLabel lblImg=new JLabel();
                ImageIcon imgi;
            
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Cantidad", "Proveedor", "Precio", "Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select*from t_producto where estpro=1;";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[6];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("codpro");
                fila[1] = rs.getString("nompro");
                fila[2] = rs.getString("canpro");
                fila[3] = rs.getInt("codprove");
                fila[4] = rs.getDouble("prepro");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estpro")) {
                    fila[5] = "Habilitado";
                } else {
                    fila[5] = "Deshabilitado";
                }

                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public boolean RegistrarProducto(clsProducto p) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_Producto(nompro,canpro,fotpro,prepro,codprove,estpro) values ('" + nombre + "','" + cantidad + "','" + foto + "','" + precio + "'," + codiprovedor + "," + estado + ")";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeUpdate -->cuando se inserta ,actualiza o se elimina
            //executeUpdate -->
            res = st.executeUpdate(sql);
            if (res == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return false;
        }
    }

    public void ConsultarProveedor(JComboBox cbo_proveedor) {
        java.sql.Connection conectar = null;
        String sql = ("select nomprove from t_Proveedor ");
        try {
            xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            cbo_proveedor.addItem("Seleccione una opcion");
            while (rs.next()) {
                cbo_proveedor.addItem(rs.getString("nomprove"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void CargarImagen2(JLabel lblImg, clsProducto p) {

        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select *from t_clientes where codcli=" + codigo);
            while (rs.next()) {
                if (rs.getBytes("fotpro") == null) {
                    lblImg.setIcon(null);
                    lblImg.setText("No hay imagen cargada");
                } else {
                    byte[] bi = rs.getBytes("fotpro");
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(170, 178, 0));
                    lblImg.setText("");
                    lblImg.setIcon(imgi);
                }

            }
        } catch (IOException | SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public boolean ActualizarProducto(clsProducto p) {
        try {
            xcon = objconexion.Conectar();

            if (foto == null) {
                /* String sql = "update t_Producto set nompro='" + nombre + "',canpro="+cantidad+",codprove="+codiprovedor+",prepro='"+precio+"',estpro=" + estado + " where codpro=" + codigo;
                 st = xcon.createStatement();
                 res = st.executeUpdate(sql);
                 if (res == 1) {
                 return true;

                 } else {
                 return false;
                 }
                 }else{
                 
                 String sql = "update t_Producto set nompro='" + nombre + "',canpro="+cantidad+",codprove="+codiprovedor+",fotpro="+foto+",prepro='"+precio+"',estpro=" + estado + " where codpro=" + codigo;
                 st = xcon.createStatement();
            
                 res = st.executeUpdate(sql);
                 if (res == 1) {
                 return true;

                 } else {
                 return false;
                 }
                
                 }*/
                pst = xcon.prepareStatement("update t_Producto set nompro=? ,canpro=?,codprove=?,prepro=?,estpro=?  where codpro=?");
                pst.setString(1, nombre);
                pst.setInt(2, cantidad);
                pst.setInt(3, codiprovedor);
                pst.setDouble(4, precio);
                pst.setBoolean(1, estado);
                pst.setInt(1, codigo);
                res = pst.executeUpdate();
                if (res == 1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                  pst = xcon.prepareStatement("update t_Producto set nompro=? ,canpro=?,codprove=?,fotpro=?,prepro=?,estpro=?  where codpro=?");
                pst.setString(1, nombre);
                pst.setInt(2, cantidad);
                pst.setInt(3, codiprovedor);
                pst.setBytes(4, foto);
                pst.setDouble(5, precio);
 
                pst.setBoolean(6, estado);
                pst.setInt(7, codigo);
                res = pst.executeUpdate();
                if (res == 1) {
                    return true;

                } else {
                    return false;
                }

            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
            return false;

        }
    }

    public boolean EliminarProducto(clsProducto p) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_producto set estpro=0 where codpro=" + codigo;
            st = xcon.createStatement();
            res = st.executeUpdate(sql);
            if (res == 1) {
                return true;

            } else {
                return false;
            }

        } catch (Exception ex) {
            System.err.println(ex.toString());
            return false;
        }

    }

    public void MostrarProductoTodo(JTable jtbProducto) {
        Object[] fila = new Object[6];
        String columna[] = {"Codigo", "Nombre", "Cantidad", "Proveedor", "Precio", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select p.codpro,p.nompro,p.canpro,pr.nomprove,p.prepro,p.estpro "
                    + "from t_producto p inner join t_proveedor pr "
                    + "on p.codprove=pr.codprove where estpro=1;  ");
            while (rs.next()) {
                fila[0] = rs.getInt("codpro");
                fila[1] = rs.getString("nompro");
                fila[2] = rs.getString("canpro");
                fila[3] = rs.getString("nomprove");
                fila[4] = rs.getString("prepro");
                if (rs.getBoolean("estpro")) {
                    fila[5] = "Habilitado";
                } else {
                    fila[5] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void MostrarProductoTododeTodo(JTable jtbProducto) {
         JLabel lblImg=new JLabel();
        ImageIcon imgi;
        Object[] fila = new Object[6];
        String columna[] = {"Codigo", "Nombre", "Precio","Cantidad", "Proveedor", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select p.codpro,p.nompro,p.prepro,p.canpro,pr.nomprove,p.estpro "
                    + "from t_producto p inner join t_proveedor pr "
                    + "on p.codprove=pr.codprove ");
            while (rs.next()) {
                fila[0] = rs.getInt("codpro");
                fila[1] = rs.getString("nompro");
                fila[2] = rs.getString("prepro");
                fila[3] = rs.getString("canpro");
                fila[4] = rs.getString("nomprove");
                if (rs.getBoolean("estpro")) {
                    fila[5] = "Habilitado";
                } else {
                    fila[5] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void BuscarProducto(JTable jtbProducto, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbProducto.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        jtbProducto.setModel(modelo);
        Object[] fila = new Object[5];
        String columna[] = {"Codigo", "Nombre", "Cantidad", "Proveedor", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codpro")) {
                rs = st.executeQuery("select p.codpro,p.nompro,p.canpro,pr.nomprove,p.estpro "
                        + " from t_producto p inner join t_proveedor pr "
                        + " on p.codprove=pr.codprove where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select p.codpro,p.nompro,p.canpro,pr.nomprove,p.estpro "
                        + " from t_producto p inner join t_proveedor pr "
                        + " on p.codprove=pr.codprove where " + categoriabusqueda + " like '%" + parametro + "%'");

            }

            while (rs.next()) {
                fila[0] = rs.getInt("codpro");
                fila[1] = rs.getString("nompro");
                fila[2] = rs.getString("canpro");
                fila[3] = rs.getString("nomprove");
                if (rs.getBoolean("estpro")) {
                    fila[4] = "Habilitado";
                } else {
                    fila[4] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
