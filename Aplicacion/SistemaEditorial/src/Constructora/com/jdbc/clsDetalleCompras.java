

package Constructora.com.jdbc;
import java.sql.*;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class clsDetalleCompras {
    private int codigo;
    private String detalleproducto;
    private String importe;
    private String cantidad;
    private Date fechapedido;
    private int compra;
    private boolean estado;
    
    //objeto de la clase clsConexion-->para conectase con la BD
      clsConexion objconexion =new clsConexion();
    //variables
    private Connection xcon;
    //statement -->sirve para poder utilizar sentencial SQL
    private Statement st;
    //ResultSet--> sirve para almacenar el resultado de una consulta
    private ResultSet rs;
    //DefaultTableModel-->modelo de la tabla
    private DefaultTableModel modelo;
    //declarasmos una variable entera para los resultados
    int res=0;
    public clsDetalleCompras() {
    }

    public clsDetalleCompras(int codigo, String detalleproducto, String importe, String cantidad, Date fechapedido, int compra, boolean estado) {
        this.codigo = codigo;
        this.detalleproducto = detalleproducto;
        this.importe = importe;
        this.cantidad = cantidad;
        this.fechapedido = fechapedido;
        this.compra = compra;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDetalleproducto() {
        return detalleproducto;
    }

    public void setDetalleproducto(String detalleproducto) {
        this.detalleproducto = detalleproducto;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(Date fechapedido) {
        this.fechapedido = fechapedido;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 public void MostrarDetalledeCompras(JTable tabla) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Importe", "Cantidad", "Fecha Pedido","Compra","Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select*from t_Detalles_de_producto where estdet=1;";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[7];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("coddet");
                fila[1] = rs.getString("prodet");
                fila[2] = rs.getString("impodet");
                fila[3] = rs.getString("candet");
                fila[4] = rs.getDate("fecdet");
                fila[5] = rs.getInt("codcom");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estdet")) {
                    fila[6] = "Habilitado";
                } else {
                    fila[6] = "Deshabilitado";
                }

                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

     
       public void ConsultarCompra(JComboBox cbo_compra){
         java.sql.Connection conectar=null;
        String sql=("select codcom from t_compra ");
        try{
             xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            cbo_compra.addItem("Seleccione una opcion");
            while(rs.next()){
                cbo_compra.addItem(rs.getInt("codcom"));
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
    public boolean RegistrarDetalledeComprars(clsDetalleCompras d) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_Detalles_de_producto(prodet,impodet,candet,fecdet,codcom,estdet) values ('" + detalleproducto + "','" + importe + "','" + cantidad+ "','" + fechapedido + "',"+compra+"," + estado + ")";
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

    public boolean ActualizarDetalledeCompras(clsDetalleCompras d) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_Detalles_de_producto set prodet='" + detalleproducto + "',impodet='"+importe+"',candet='"+cantidad+"',fecdet='"+fechapedido+"',codcom="+compra+",estdet=" + estado + " where coddet=" + codigo;
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

    public boolean EliminarDetallesdeCompras(clsDetalleCompras d) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_Detalles_de_producto set estdet=0 where coddet=" + codigo;
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
    
     public void BuscarDetalleDeCompras(JTable jtbDetallesDeCompras, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbDetallesDeCompras.getRowCount(); i++) {
            modelo.removeRow(i);
            i-= 1;
        }
        jtbDetallesDeCompras.setModel(modelo);
        Object[] fila = new Object[6];
        String columna[] = {"Codigo", "Nombre","Importe","Cantidad" ,"Fecha","Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("coddet") ) {
                rs = st.executeQuery("select coddet,prodet,impodet,candet,fecdet,estdet from t_Detalles_de_producto where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select coddet,prodet,impodet,candet,fecdet,estdet from t_Detalles_de_producto where " + categoriabusqueda + " like '%" + parametro + "%'");

            }
         
            while (rs.next()) {
                fila[0] = rs.getInt("coddet");
                fila[1] = rs.getString("prodet");
                fila[2] = rs.getString("impodet");
                fila[3] = rs.getString("candet");
                fila[4] = rs.getDate("fecdet");
                if (rs.getBoolean("estdet")) {
                    fila[5] = "Habilitado";
                } else {
                    fila[5] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbDetallesDeCompras.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }
    
    
   
    
    
}
    
    
            
    

