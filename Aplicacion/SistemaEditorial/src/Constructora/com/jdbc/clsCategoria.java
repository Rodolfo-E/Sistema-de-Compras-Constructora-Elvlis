package Constructora.com.jdbc;

import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsCategoria {

    private int codigo;
    private String nombre;
    private int codigoproducto;
    private boolean estado;
    private String producto;

    //objetos
    //objeto de la clase clsConexion-->para conectase con la BD
    clsConexion objconexion = new clsConexion();
    //variables
    private Connection xcon;
    //statement -->sirve para poder utilizar sentencial SQL
    private Statement st;
    //ResultSet--> sirve para almacenar el resultado de una consulta
    private ResultSet rs;
    //DefaultTableModel-->modelo de la tabla
    private DefaultTableModel modelo;
    //declarasmos una variable entera para los resultados
    int res = 0;

    public clsCategoria() {
    }

    public clsCategoria(int codigo, String nombre, int codigoproducto, boolean estado,String producto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoproducto = codigoproducto;
        this.estado = estado;
        this.producto=producto;
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

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void MostrarCategoria(JTable tabla) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Producto", "Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select *from t_Categoria where estcat=1;";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[4];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("codcat");
                fila[1] = rs.getString("nomcat");
                fila[2] = rs.getString("codpro");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estcat")) {
                    fila[3] = "Habilitado";
                } else {
                    fila[3] = "Deshabilitado";
                }

                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public boolean RegistrarCategoria(clsCategoria c) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();

            Object[] fila = new Object[4];
            String columna[] = {"Codigo", "Nombre", "Producto","Estado"};
            modelo = new DefaultTableModel(null, columna);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_categoria(nomcat,codpro,estcat) values ('" + nombre + "'," + codigoproducto + "," + estado + ")";

            while (rs.next()) {
                fila[0] = rs.getInt("codcat");
                fila[1] = rs.getString("nomcat");
                fila[2] = rs.getInt("codpro");
                if (rs.getBoolean("estcat")) {
                    fila[3] = "Habilitado";
                } else {
                    fila[3] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
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
    public void ConsultarProducto(JComboBox cbo_producto){
         java.sql.Connection conectar=null;
        String sql=("select nompro from t_Producto ");
        try{
             xcon = objconexion.Conectar();
            PreparedStatement pst=(PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            cbo_producto.addItem("Seleccione una opcion");
            while(rs.next()){
                cbo_producto.addItem(rs.getString("nompro"));
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
    
     public boolean ActualizarCategoria(clsCategoria c){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_Categoria set nomcat='"+nombre+"',codpro="+codigoproducto+",estcat="+estado+" where codcat="+codigo;
              st=xcon.createStatement();
             res=st.executeUpdate(sql);
             if(res==1){
                 return true;
                 
             }else{
                 return false;
             }
         
        }catch(Exception ex){
            System.err.println(ex.toString());
           return false;
            
        }
    }
      public boolean EliminarCategoria(clsCategoria c){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_categoria set estcat=0 where codcat="+codigo;
              st=xcon.createStatement();
             res=st.executeUpdate(sql);
             if(res==1){
                 return true;
                 
             }else{
                 return false;
             }
         
        }catch(Exception ex){
            System.err.println(ex.toString());
           return false;
            
        }
    }

    public void MostrarCategoriaTodo(JTable jtbCategoria) {
        Object[] fila = new Object[4];
        String columna[] = {"Codigo", "Nombre", "Producto", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select a.codcat,a.nomcat,p.nompro,a.estcat "
                    + " from t_Categoria a inner join t_Producto p "
                    + " on a.codpro=p.codpro; ");
            while (rs.next()) {
                fila[0] = rs.getInt("codcat");
                fila[1] = rs.getString("nomcat");
                fila[2] = rs.getString("nompro");
                if (rs.getBoolean("estcat")) {
                    fila[3] = "Habilitado";
                } else {
                    fila[3] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbCategoria.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
        
    }
    
    public void BuscarCategoria(JTable jtbCategoria, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbCategoria.getRowCount(); i++) {
            modelo.removeRow(i);
            i-= 1;
        }
        jtbCategoria.setModel(modelo);
        Object[] fila = new Object[4];
        String columna[] = {"Codigo", "Nombre", "Producto","Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codper") ) {
                rs = st.executeQuery("select a.codcat,a.nomcat,p.nompro,a.estcat "
                    + " from t_Categoria a inner join t_Producto p "
                    + " on a.codpro=p.codpro where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select a.codcat,a.nomcat,p.nompro,a.estcat "
                    + " from t_Categoria a inner join t_Producto p "
                    + " on a.codpro=p.codpro where  " + categoriabusqueda + " like '%" + parametro + "%'");

            }
         
            while (rs.next()) {
                fila[0] = rs.getInt("codcat");
                fila[1] = rs.getString("nomcat");
                fila[2] = rs.getString("nompro");
                if (rs.getBoolean("estcat")) {
                    fila[3] = "Habilitado";
                } else {
                    fila[3] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbCategoria.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }
}
