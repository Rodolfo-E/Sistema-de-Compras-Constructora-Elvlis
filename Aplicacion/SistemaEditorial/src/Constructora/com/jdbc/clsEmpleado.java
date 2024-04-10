package Constructora.com.jdbc;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsEmpleado {

    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private int dni;
    private Date fecha;
    private int telefono;
    private int celular;
    private String correo;
    private String sexo;
    private String sueldo;
    private boolean estado;
    private int  nomdistrito;
    private int nomusuario;
    private byte[] foto;
    private clsUsuario usuario;
    private clsDistrito distrito;

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

    //metodo constructor
    public clsEmpleado() {
    }

    public clsEmpleado(int codigo, String nombre, String apellido, String direccion, int dni, Date fecha, int telefono, int celular, String correo, String sexo, String sueldo, boolean estado, int nomdistrito, int nomusuario,byte[] foto, clsUsuario usuario, clsDistrito distrito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.fecha = fecha;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.estado = estado;
        this.nomdistrito = nomdistrito;
        this.nomusuario = nomusuario;
        this.foto=foto;
        this.usuario = usuario;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNomdistrito() {
        return nomdistrito;
    }

    public void setNomdistrito(int nomdistrito) {
        this.nomdistrito = nomdistrito;
    }

    public int getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(int nomusuario) {
        this.nomusuario = nomusuario;
    }
    
    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public clsUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(clsUsuario usuario) {
        this.usuario = usuario;
    }

    public clsDistrito getDistrito() {
        return distrito;
    }

    public void setDistrito(clsDistrito distrito) {
        this.distrito = distrito;
    }

    

    public void MostrarEmpleado(JTable tabla) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Apellido", "Correo", "Direccion", "Genero", "Fecha", "Telefono", "Sueldo", "Distito", "Usuario", "Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select *from t_empleado where estemp=1";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[12];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("codemp");
                fila[1] = rs.getString("nomemp");
                fila[2] = rs.getString("apeemp");
                fila[3] = rs.getString("coremp");
                fila[4] = rs.getString("diremp");
                fila[5] = rs.getString("genemp");
                fila[6] = rs.getString("fecemp");
                fila[7] = rs.getInt("telemp");
                fila[8] = rs.getString("sueemp");
                fila[9] = rs.getInt("coddis");
                fila[10] = rs.getInt("codusu");
                // agregando habilitado/deshabilitado
                if (rs.getBoolean("estemp")) {
                    fila[11] = "Habilitado";
                } else {
                    fila[11] = "Deshabilitado";
                }

                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
  public void CargarImagen2(JLabel lblImg, clsEmpleado e) {

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
      public void ConsultarDistrito(JComboBox cbo_distrito){
         java.sql.Connection conectar=null;
        String sql=("select nomdis from t_Distrito ");
        try{
             xcon = objconexion.Conectar();
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
      
        public void ConsultarUsuario(JComboBox cbo_usuario){
         java.sql.Connection conectar=null;
        String sql=("select nomusu from t_usuario ");
        try{
             xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
            cbo_usuario.addItem("Seleccione una opcion");
            while(rs.next()){
                cbo_usuario.addItem(rs.getString("nomusu"));
            }
        }catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }
        
        public String CargarEmpleado(){
        String nombrecompleto ="";
        try{
            xcon=objconexion.Conectar();
            st=xcon.createStatement();
            rs=st.executeQuery("select *from t_empleado where codemp="+codigo);
       while(rs.next()){
           nombrecompleto=rs.getString("nomemp")+" "+rs.getString("apeemp");
           
       } 
       return nombrecompleto;
        }catch(SQLException ex){
            System.err.println(ex.toString());
            return "";
        }
        
    }
    public boolean RegistrarEmpleado(clsEmpleado p) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_empleado(nomemp,apeemp,coremp,diremp,genemp,fecemp,telemp,sueemp,fotemp,coddis,codusu,estemp) values"
                    + " ('" + nombre + "','" + apellido + "','" + correo + "','" + direccion + "','" + sexo + "','" + fecha + "','" + telefono + "','" + sueldo + "','"+foto+"'," + nomdistrito + "," + nomusuario + "," + estado + ")";
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
    public boolean EliminarEmpleado(clsEmpleado e){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_empleado set estemp=0 where codemp="+codigo;
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
      public boolean ActualizarEmpleado(clsEmpleado e){
        try{
             xcon =objconexion.Conectar();
             String sql="update t_empleado set nomemp='"+nombre+"',apeemp='"+apellido+"',coremp='"+correo+"',diremp='"+direccion+"',genemp='"+sexo+"',fecemp='"+fecha+"',telemp='"+telefono+"',sueemp='"+sueldo+"',fotemp='"+foto+"',coddis='"+nomdistrito+"',codusu='"+nomusuario+"',estemp="+estado+" where codemp="+codigo;
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

    public void MostrarEmpleadoTodo(JTable jtbEmpleado) {
        Object[] fila = new Object[12];
        String columna[] = {"Codigo", "Nombre", "Apellido", "Correo", "Direccion", "Genero", "Fecha", "Telefono", "Sueldo", "Distito", "Usuario", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery(" select e.codemp,e.nomemp,e.apeemp,e.coremp,e.diremp,e.genemp,e.fecemp,e.telemp,e.sueemp,d.nomdis,u.nomusu,e.estemp "
                    + " from t_empleado e inner join t_distrito d on e.coddis=d.coddis "
                    + " inner join t_usuario u on u.codusu=e.codusu; ");
            while (rs.next()) {
                fila[0] = rs.getInt("codemp");
                fila[1] = rs.getString("nomemp");
                fila[2] = rs.getString("apeemp");
                fila[3] = rs.getString("coremp");
                fila[4] = rs.getString("diremp");
                fila[5] = rs.getString("genemp");
                fila[6] = rs.getString("fecemp");
                fila[7] = rs.getString("telemp");
                fila[8] = rs.getString("sueemp");
                fila[9] = rs.getString("nomdis");
                fila[10] = rs.getString("nomusu");
                if (rs.getBoolean("estemp")) {
                    fila[11] = "Habilitado";
                } else {
                    fila[11] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbEmpleado.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

    public void BuscarEmpleado(JTable jtbEmpleado, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbEmpleado.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        jtbEmpleado.setModel(modelo);

        Object[] fila = new Object[9];
        String columna[] = {"Codigo", "Nombre", "Apellido", "Direccion", "Telefono", "Sueldo", "Distrito", "Usuario"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codemp")) {
                rs = st.executeQuery("select e.codemp,e.nomemp,e.apeemp,e.diremp,e.telemp,e.sueemp,d.nomdis,u.nomusu,e.estemp "
                        + " from t_empleado e inner join t_distrito d on e.coddis=d.coddis "
                        + " inner join t_usuario u on u.codusu=e.codusu  where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select e.codemp,e.nomemp,e.apeemp,e.diremp,e.telemp,e.sueemp,d.nomdis,u.nomusu,e.estemp "
                        + " from t_empleado e inner join t_distrito d on e.coddis=d.coddis "
                        + " inner join t_usuario u on u.codusu=e.codusu where " + categoriabusqueda + " like '%" + parametro + "%'");

            }

            while (rs.next()) {
                fila[0] = rs.getInt("codemp");
                fila[1] = rs.getString("nomemp");
                fila[2] = rs.getString("apeemp");
                fila[3] = rs.getString("diremp");
                fila[4] = rs.getString("telemp");
                fila[5] = rs.getString("sueemp");
                fila[6] = rs.getString("nomdis");
                fila[7] = rs.getString("nomusu");
                if (rs.getBoolean("estemp")) {
                    fila[8] = "Habilitado";
                } else {
                    fila[8] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }

            jtbEmpleado.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
