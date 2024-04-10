

package Constructora.com.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

 public class clsPerfil {
     private int codigo;
     private String nombre;
     private boolean estado;
     
     
    clsConexion objconexion =new clsConexion();
    //variables
    private Connection xcon;
    //statement -->sirve para poder utilizar sentencial SQL
    private Statement st;
    //ResultSet--> sirve para almacenar el resultado de una consulta
    private ResultSet rs;
    private PreparedStatement pst;
    //DefaultTableModel-->modelo de la tabla
    private DefaultTableModel modelo;
    //declarasmos una variable entera para los resultados
    int res=0;


    public clsPerfil() {
    }

    public clsPerfil(int codigo, String nombre, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public  void MostrarPerfil (JTable tabla){
        try{
            //llamamos a la funcion Conectar
            xcon =objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[]={"Codigo","Nombre","Estado"};
            //agregamos los titulos al modelo
            modelo=new DefaultTableModel(null,titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="select*from t_perfil where estper=1 ";
            //asignamos el Statement la consulta SQL
            st=xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs=st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[]=new Object[3];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()){
                fila[0]=rs.getInt("codper");
                fila[1]=rs.getString("nomper");
                //agregando habilitado/deshabilitado
                if(rs.getBoolean("estper")){
                    fila[2]="Habilitado";
                }else{
                    fila[2]="Deshabilitado";
                }
                
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch (SQLException ex){
            System.err.println(ex.toString());
        }
    }
     public  void MostrarPerfilTodo (JTable tabla){
        try{
            //llamamos a la funcion Conectar
            xcon =objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[]={"Codigo","Nombre","Estado"};
            //agregamos los titulos al modelo
            modelo=new DefaultTableModel(null,titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="select*from t_perfil  ";
            //asignamos el Statement la consulta SQL
            st=xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs=st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[]=new Object[3];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()){
                fila[0]=rs.getInt("codper");
                fila[1]=rs.getString("nomper");
                //agregando habilitado/deshabilitado
                if(rs.getBoolean("estper")){
                    fila[2]="Habilitado";
                }else{
                    fila[2]="Deshabilitado";
                }
                
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch (SQLException ex){
            System.err.println(ex.toString());
        }
    }
    
    public  boolean RegistrarPerfil (clsPerfil p){
        try{
            //llamamos a la funcion Conectar
            xcon =objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="insert into t_perfil(nomper,estper) values ('"+nombre+"',"+estado+")";
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
    
    
    public boolean ActualizarPerfil(clsPerfil p){
       xcon= objconexion.Conectar();
        try{
         
             xcon =objconexion.Conectar();
             String sql="update t_perfil set nomper='"+nombre+"',estper="+estado+" where codper="+codigo;
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
    
       public boolean EliminarPerfil(clsPerfil p){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_perfil set estper=0 where codper="+codigo;
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
        public void BuscarPerfil(JTable jtbPerfil, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbPerfil.getRowCount(); i++) {
            modelo.removeRow(i);
            i-= 1;
        }
        jtbPerfil.setModel(modelo);
        Object[] fila = new Object[3];
        String columna[] = {"Codigo", "Nombre", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codper") ) {
                rs = st.executeQuery("select codper,nomper,estper from t_perfil where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select codper,nomper,estper from t_perfil where " + categoriabusqueda + " like '%" + parametro + "%'");

            }
         
            while (rs.next()) {
                fila[0] = rs.getInt("codper");
                fila[1] = rs.getString("nomper");
        
                if (rs.getBoolean("estper")) {
                    fila[2] = "Habilitado";
                } else {
                    fila[2] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbPerfil.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }
       
       
       
 }
    

