package Constructora.com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsUsuario {

    private int codigo;
    private String nombre;
    private String clave;
    private boolean estado;
    private int nombreperfil;
    private clsPerfil perfil;

    clsConexion objConexion = new clsConexion();
    private Connection xcon;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private DefaultTableModel modelo;
    int res = 0;

    public clsUsuario() {
    }

    public clsUsuario(int codigo, String nombre, String clave, boolean estado,int nombreperfil, clsPerfil perfil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.clave = clave;
        this.estado = estado;
        this.nombreperfil=nombreperfil;
        this.perfil = perfil;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     public int getNombreperfil() {
        return nombreperfil;
    }

    public void setNombreperfil(int nombreperfil) {
        this.nombreperfil = nombreperfil;
    }

    public clsPerfil getPerfil() {
        return perfil;
    }

    public void setPerfil(clsPerfil perfil) {
        this.perfil = perfil;
    }

     public  void MostrarUsuario (JTable tabla){
        try{
            //llamamos a la funcion Conectar
            xcon =objConexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[]={"Codigo","Nombre","Clave","Perfil","Estado"};
            //agregamos los titulos al modelo
            modelo=new DefaultTableModel(null,titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="select*from t_usuario where estusu=1;";
            //asignamos el Statement la consulta SQL
            st=xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs=st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[]=new Object[5];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
           while (rs.next()) {
                fila[0] = rs.getInt("codusu");
                fila[1] = rs.getString("nomusu");
                fila[2] = rs.getString("clausu");
                fila[3] = rs.getString("codper");
                if (rs.getBoolean("estusu")) {
                    fila[4] = "Habilitado";
                } else {
                    fila[4] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch (SQLException ex){
            System.err.println(ex.toString());
        }
    }
    
    
     public void ConsultarPerfil(JComboBox cbo_perfil){
         java.sql.Connection conectar=null;
        String sql=("select nomper from t_perfil ");
        try{
             xcon = objConexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            cbo_perfil.addItem("Seleccione una opcion");
            while(rs.next()){
                cbo_perfil.addItem(rs.getString("nomper"));
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
    
    public  boolean RegistrarUsuario (clsUsuario u ){
        try{
            //llamamos a la funcion Conectar
            xcon =objConexion.Conectar();
                    Object[] fila = new Object[5];
             String columna[] = {"Codigo", "Nombre", "Clave", "Perfil", "Estado"};
              modelo = new DefaultTableModel(null, columna);
            //generamos una consulta SQL para mostrar los datos de la tabla
              
            String sql="insert into t_usuario(nomusu,clausu,codper,estusu) values ('"+nombre+"',"+clave+","+nombreperfil+","+estado+")";
                   
                while (rs.next()) {
                fila[0] = rs.getInt("codusu");
                fila[1] = rs.getString("nomusu");
                fila[2] = rs.getString("clausu");
                fila[3] = rs.getString("codper");
                if (rs.getBoolean("estusu")) {
                    fila[4] = "Habilitado";
                } else {
                    fila[4] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
           
                  
           //asignamos el Statement la consulta SQL
            st=xcon.createStatement();
            //executeUpdate -->cuando se inserta ,actualiza o se elimina
            //executeUpdate -->
            res=st.executeUpdate(sql);
            if(res==1){
                return true;
            }else{
                return false;
            }
            
            
        }catch (SQLException ex){
            System.err.println(ex.toString());
            return false;
        }
    }
   

     public boolean ActualizarUsuario(clsUsuario u){
        try{
             xcon =objConexion.Conectar();
            String sql="update t_usuario set nomusu='"+nombre+"',clausu="+clave+",codper="+nombreperfil+",estusu="+estado+" where codusu="+codigo;
        
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
      public boolean EliminarUsuario(clsUsuario u){
        try{
             xcon =objConexion.Conectar();
             String sql="update t_usuario set estusu=0 where codusu="+codigo;
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
    public boolean ValidarUsuario(clsUsuario u) {

        try {

            // realizamos la conexion a la bd
            xcon = objConexion.Conectar();
            // creamos el Statment para agregar la sentencia SQL
            st = xcon.createStatement();
            // ejecutamos la consulta y guardamos los datos en el Resulset
            rs = st.executeQuery("select *from t_usuario where nomusu='" + nombre + "' and clausu='" + clave + "'");
            // evaluamos para ver si devuelve datos 
            if (rs.first()) {
                return true;

            } else {
                return false;

            }
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }

    }

    public boolean EstadoUsuario(clsUsuario u) {

        try {

            // realizamos la conexion a la bd
            xcon = objConexion.Conectar();
            // creamos el Statment para agregar la sentencia SQL
            st = xcon.createStatement();
            // ejecutamos la consulta y guardamos los datos en el Resulset
            rs = st.executeQuery("select estusu from t_usuario where nomusu='" + nombre + "'and clausu='" + clave + "'");
            // evaluamos para ver si devuelve datos 
            if (rs.first()) {
                estado = rs.getBoolean("estusu");

            } else {
                estado = rs.getBoolean("estusu");

            }
            return estado;
        } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }

    }

    public List<String> ObtenerUsuario(clsUsuario u) {
        List<String> datos = new ArrayList<String>();

        try {

            // realizamos la conexion a la bd
            xcon = objConexion.Conectar();
            // creamos el Statment para agregar la sentencia SQL
            st = xcon.createStatement();
            // ejecutamos la consulta y guardamos los datos en el Resulset
            rs = st.executeQuery("select e.codemp,e.nomemp,e.apeemp,e.estemp,u.nomusu,p.nomper "
                    + "from t_empleado e inner join t_distrito d on e.coddis=d.coddis inner join t_usuario u "
                    + "on e.codusu=u.codusu inner join t_perfil p on u.codper=p.codper "
                    + "where nomusu='" + nombre + "' and clausu='" + clave + "'");

            // evaluamos para ver si devuelve datos 
            while (rs.next()) {
                datos.add(rs.getString("codemp"));
                datos.add(rs.getString("nomemp"));
                datos.add(rs.getString("apeemp"));
                datos.add(rs.getString("estemp"));
                datos.add(rs.getString("nomusu"));
                datos.add(rs.getString("nomper"));
            }
            return datos;

        } catch (SQLException e) {
            System.err.println(e.toString());
            return null;
        }

    }

    public void MostrarUsuarioTodo(JTable jtbUsuario) {
        Object[] fila = new Object[5];
        String columna[] = {"Codigo", "Nombre", "Clave", "Perfil", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objConexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select u.codusu,u.nomusu,u.clausu,p.nomper,u.estusu"
                    + " from t_usuario u inner join t_perfil p "
                    + " on u.codper=p.codper where estusu=1 ;");
            while (rs.next()) {
                fila[0] = rs.getInt("codusu");
                fila[1] = rs.getString("nomusu");
                fila[2] = rs.getString("clausu");
                fila[3] = rs.getString("nomper");
                if (rs.getBoolean("estusu")) {
                    fila[4] = "Habilitado";
                } else {
                    fila[4] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbUsuario.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void BuscarUsuario(JTable jtbUsuario, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbUsuario.getRowCount(); i++) {
            modelo.removeRow(i);
            i-= 1;
        }
        jtbUsuario.setModel(modelo);
        Object[] fila = new Object[5];
        String columna[] = {"Codigo", "Nombre", "Clave", "Perfil", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objConexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codusu") ) {
                rs = st.executeQuery("select u.codusu,u.nomusu,u.clausu,p.nomper,u.estusu "
                        + " from t_usuario u inner join t_perfil p "
                        + " on u.codper=p.codper where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select u.codusu,u.nomusu,u.clausu,p.nomper,u.estusu "
                        + " from t_usuario u inner join t_perfil p "
                        + " on u.codper=p.codper where " + categoriabusqueda + " like '%" + parametro + "%'");

            }
         
            while (rs.next()) {
                fila[0] = rs.getInt("codusu");
                fila[1] = rs.getString("nomusu");
                fila[2] = rs.getString("clausu");
                fila[3] = rs.getString("nomper");
                if (rs.getBoolean("estusu")) {
                    fila[4] = "Habilitado";
                } else {
                    fila[4] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbUsuario.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
