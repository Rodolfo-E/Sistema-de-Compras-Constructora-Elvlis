package Constructora.com.jdbc;

import Constructora.com.jdbc.clsConexion;
import Constructora.com.jdbc.clsDistrito;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsProveedor {

    private int codigo;
    private String nombre;
    private int telefono;
    private String correo;
    private int codigodistrito;
    private int ruc;
    private boolean estado;
    private clsDistrito distrito;

    clsConexion objConexion = new clsConexion();
    private Connection xcon;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private DefaultTableModel modelo;
    int res = 0;

    public clsProveedor() {
    }

    public clsProveedor(int codigo, String nombre, int telefono, String correo, int codigodistrito, int ruc,boolean estado, clsDistrito distrito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.codigodistrito = codigodistrito;
        this.ruc=ruc;
        this.estado = estado;
        this.distrito = distrito;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCodigodistrito() {
        return codigodistrito;
    }

    public void setCodigodistrito(int codigodistrito) {
        this.codigodistrito = codigodistrito;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int codigodistrito) {
        this.ruc = ruc;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public clsDistrito getDistrito() {
        return distrito;
    }

    public void setDistrito(clsDistrito distrito) {
        this.distrito = distrito;
    }

    public void MostrarProveedor(JTable tabla) {
        try {
            //llamamos a la funcion Conectar
            xcon = objConexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Telefono", "Correo", "Distrito", "Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select * from t_Proveedor where estprove=1";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[6];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("codprove");
                fila[1] = rs.getString("nomprove");
                fila[2] = rs.getInt("telprove");
                fila[3] = rs.getString("corprove");
                fila[4] = rs.getString("coddis");
                fila[5] = rs.getString("rucprove");
                //  agregando habilitado/deshabilitado
                if (rs.getBoolean("estprove")) {
                    fila[6] = "Habilitado";
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

    
     public void ConsultarDistrito(JComboBox cbo_distrito){
         java.sql.Connection conectar=null;
        String sql=("select nomdis from t_Distrito ");
        try{
             xcon = objConexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            cbo_distrito.addItem("Seleccione una opcion");
            while(rs.next()){
                cbo_distrito.addItem(rs.getString("nomdis"));
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
     
      public String CargarProveedor(){
        String nombrecompleto ="";
        try{
            xcon=objConexion.Conectar();
            st=xcon.createStatement();
            rs=st.executeQuery("select *from t_Proveedor where codprove="+codigo);
       while(rs.next()){
           nombrecompleto=rs.getString("nomprove");
           
       } 
       return nombrecompleto;
        }catch(SQLException ex){
            System.err.println(ex.toString());
            return "";
        }
      }
    public boolean RegistrarProveedor(clsProveedor p) {
        try {
            // llamamos a la funcion Conectar
            xcon = objConexion.Conectar();

           // Object[] fila = new Object[6];
           // String columna[] = {"Codigo", "Nombre", "Telefono", "Correo", "Distrito", "Estado"};
           // modelo = new DefaultTableModel(null, columna);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_Proveedor(nomprove,telprove,corprove,coddis,rucprove,estprove) values ('" + nombre + "'," + telefono + ",'" + correo + "'," + codigodistrito + ",'"+ruc+"'," + estado + ")";

            /*  while (rs.next()) {
             fila[0] = rs.getInt("codprove");
             fila[1] = rs.getString("nomprove");
             fila[2] = rs.getString("telprove");
             fila[3] = rs.getString("corprove");
             fila[4] = rs.getString("coddis");
             if (rs.getBoolean("estprove")) {
             fila[5] = "Habilitado";
             } else {
             fila[5] = "Deshabilitado";
             }
             modelo.addRow(fila);
             }*/
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

    public boolean ActualizarProveedor(clsProveedor p) {
        try {
            xcon = objConexion.Conectar();
            String sql = "update t_Proveedor set nomprove='" + nombre + "',telprove=" + telefono + ",corprove='" + correo + "',coddis=" + codigodistrito +"',rucprove="+ruc+"' ,estprove=" + estado + " where codprove=" + codigo;
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

    public boolean EliminarProveedor(clsProveedor p) {
        try {
            xcon = objConexion.Conectar();
            String sql = "update t_Proveedor set estprove=0 where codprove=" + codigo;
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

    public void MostrarProveedorTodo(JTable jtbProveedor) {
        Object[] fila = new Object[7];
        String columna[] = {"Codigo", "Nombre", "Telefono", "Correo", "Distrito","Ruc", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objConexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select pr.codprove,pr.nomprove,pr.telprove,pr.corprove,d.nomdis,pr.rucprove,pr.estprove "
                    + "from t_proveedor pr inner join t_distrito d "
                    + "on pr.coddis=d.coddis where estprove=1;  ");
            while (rs.next()) {
                fila[0] = rs.getInt("codprove");
                fila[1] = rs.getString("nomprove");
                fila[2] = rs.getString("telprove");
                fila[3] = rs.getString("corprove");
                fila[4] = rs.getString("nomdis");
                fila[5] = rs.getString("rucprove");
                if (rs.getBoolean("estprove")) {
                    fila[6] = "Habilitado";
                } else {
                    fila[6] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProveedor.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void BuscarProveedor(JTable jtbProveedor, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbProveedor.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        jtbProveedor.setModel(modelo);
        Object[] fila = new Object[7];
        String columna[] = {"Codigo", "Nombre","Telefono", "Correo", "Distrito","Ruc" ,"Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objConexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codprove")) {
                rs = st.executeQuery("select pr.codprove,pr.nomprove,pr.telprove,pr.corprove,d.nomdis,pr.rucprove,pr.estprove "
                        + "from t_proveedor pr inner join t_distrito d "
                        + "on pr.coddis=d.coddis  where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select pr.codprove,pr.nomprove,pr.telprove,pr.corprove,d.nomdis,pr.rucprove,pr.estprove "
                        + "from t_proveedor pr inner join t_distrito d "
                        + "on pr.coddis=d.coddis where " + categoriabusqueda + " like '%" + parametro + "%'");

            }

            while (rs.next()) {
                fila[0] = rs.getInt("codprove");
                fila[1] = rs.getString("nomprove");
                fila[2] = rs.getString("telprove");
                fila[3] = rs.getString("corprove");
                fila[4] = rs.getString("nomdis");
                fila[5] = rs.getString("rucprove");
                if (rs.getBoolean("estprove")) {
                    fila[6] = "Habilitado";
                } else {
                    fila[6] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProveedor.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
