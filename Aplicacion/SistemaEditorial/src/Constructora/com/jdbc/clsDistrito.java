
package Constructora.com.jdbc;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsDistrito {
    //atributos
    private int codigo;
    private String nombre;
    private boolean estado;
    
    //objetos
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

    public clsDistrito() {
        codigo=0;
        nombre="";
        estado=false;
    }

    public clsDistrito(int codigo, String nombre, boolean estado) {
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
    
    //Procedimiento para mostrar distrito
    public  void MostrarDistrito (JTable tabla){
        try{
            //llamamos a la funcion Conectar
            xcon =objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[]={"Codigo","Nombre","Estado"};
            //agregamos los titulos al modelo
            modelo=new DefaultTableModel(null,titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="select*from t_distrito where estdis=1;";
            //asignamos el Statement la consulta SQL
            st=xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs=st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[]=new Object[3];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()){
                fila[0]=rs.getInt("coddis");
                fila[1]=rs.getString("nomdis");
                //agregando habilitado/deshabilitado
                if(rs.getBoolean("estdis")){
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
    public  boolean RegistrarDistrito (clsDistrito d){
        try{
            //llamamos a la funcion Conectar
            xcon =objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql="insert into t_distrito(nomdis,estdis) values ('"+nombre+"',"+estado+")";
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
    
    
    public boolean ActualizarDistrito(clsDistrito d){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_distrito set nomdis='"+nombre+"',estdis="+estado+" where coddis="+codigo;
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
    
       public boolean EliminarDistrito(clsDistrito d){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_distrito set estdis=0 where coddis="+codigo;
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
        public void BuscarDistrito(JTable jtbPerfil, String categoriabusqueda, String parametro) {
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
            if (categoriabusqueda.equals("coddis") ) {
                rs = st.executeQuery("select coddis,nomdis,estdis from t_distrito where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select coddis,nomdis,estdis from t_distrito where " + categoriabusqueda + " like '%" + parametro + "%'");

            }
         
            while (rs.next()) {
                fila[0] = rs.getInt("coddis");
                fila[1] = rs.getString("nomdis");
        
                if (rs.getBoolean("estdis")) {
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
