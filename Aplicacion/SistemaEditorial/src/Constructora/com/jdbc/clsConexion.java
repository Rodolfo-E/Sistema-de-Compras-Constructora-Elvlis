

package Constructora.com.jdbc;

import java.sql.*;
public class clsConexion {
    //crear la cadena conexion-->dirigirse a la base de datos que quieres trabajar
    private String cadena="jdbc:mysql://localhost/bdconstructora";
    //agregando el usuario a la bd
    private String usuario="root";
    //agregando la clave a la bd
    private String clave="";
    //crea un  objeto de tipo connection-->para la conexion
    private Connection xcon;
    
    public Connection Conectar(){
        //llamamos al driver para poder trabajar
        String driver="com.mysql.jdbc.Driver";
        try{
            //instanciamos el driver
            Class.forName(driver);
            System.out.println("Se cargo el driver de forma correcta");
            //realizamos la conexion a la BD con el metodo getConnection()
            xcon=DriverManager.getConnection(cadena,usuario,clave);
        }catch (ClassNotFoundException | SQLException ex){
            System.err.println(ex.toString());
        }
        return xcon;
    }
}
