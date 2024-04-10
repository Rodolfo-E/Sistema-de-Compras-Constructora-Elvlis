package Constructora.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsCliente {

    private int codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String ruc;
    private int codigodistrito;
    private int codigoproducto;
    private boolean estado;
    private clsDistrito distrito;
    private clsProducto producto;

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

    public clsCliente() {
        codigo = 0;
        nombre = "";
        apellido = "";
        dni = "";
        telefono = "";
        ruc = "";
        codigodistrito = 0;
        codigoproducto = 0;
        estado = false;
    }

    public clsCliente(int codigo, String nombre, String apellido, String dni, String telefono, String ruc, int codigodistrito, int codigoproducto, boolean estado, clsDistrito distrito, clsProducto producto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.ruc = ruc;
        this.codigodistrito = codigodistrito;
        this.codigoproducto = codigoproducto;
        this.estado = estado;
        this.distrito = distrito;
        this.producto = producto;

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getCodigodistrito() {
        return codigodistrito;
    }

    public void setCodigodistrito(int codigodistrito) {
        this.codigodistrito = codigodistrito;
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

    public clsDistrito getDistrito() {
        return distrito;
    }

    public void setDistrito(clsDistrito distrito) {
        this.distrito = distrito;
    }

    public clsProducto getProducto() {
        return producto;
    }

    public void setProducto(clsProducto producto) {
        this.producto = producto;
    }

    public void MostrarCliente(JTable tabla) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //creamos un arreglo con los titulos de la columna
            String titulo[] = {"Codigo", "Nombre", "Apellido", "Dni", "Distrito", "Producto", "Telefono", "Estado"};
            //agregamos los titulos al modelo
            modelo = new DefaultTableModel(null, titulo);
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "select *from t_clientes  where estcli=1";
            //asignamos el Statement la consulta SQL
            st = xcon.createStatement();
            //executeQuery -->ejecutar la consulta SQL
            rs = st.executeQuery(sql);
            //creamos un arreglo de objetos de tamaño 3-->cantidad de columnas
            Object fila[] = new Object[8];
            //bucle para recorrer el ResultSet
            //.next()-->funcionar mientras que en el ResultSet no sea nulo
            while (rs.next()) {
                fila[0] = rs.getInt("codcli");
                fila[1] = rs.getString("nomcli");
                fila[2] = rs.getString("apecli");
                fila[3] = rs.getString("dnicli");
                fila[4] = rs.getInt("coddis");
                fila[5] = rs.getInt("codpro");
                fila[6] = rs.getString("telcli");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estcli")) {
                    fila[7] = "Habilitado";
                } else {
                    fila[7] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void ConsultarDistrito(JComboBox cbo_distrito) {
        java.sql.Connection conectar = null;
        String sql = ("select nomdis from t_distrito ");
        try {
            xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            cbo_distrito.addItem("Seleccione una opcion");
            while (rs.next()) {
                cbo_distrito.addItem(rs.getString("nomdis"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public void ConsultarProducto(JComboBox cbo_producto) {
        java.sql.Connection conectar = null;
        String sql = ("select nompro from t_producto ");
        try {
            xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            cbo_producto.addItem("Seleccione una opcion");
            while (rs.next()) {
                cbo_producto.addItem(rs.getString("nompro"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    
    public String CargarCliente(){
        String nombrecompleto ="";
        try{
            xcon=objconexion.Conectar();
            st=xcon.createStatement();
            rs=st.executeQuery("select *from t_clientes where codcli="+codigo);
       while(rs.next()){
           nombrecompleto=rs.getString("nomcli")+" "+rs.getString("apecli");
           
       } 
       return nombrecompleto;
        }catch(SQLException ex){
            System.err.println(ex.toString());
            return "";
        }
        
    }

    public boolean RegistrarCliente(clsCliente c) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_clientes (nomcli,apecli,dnicli,coddis,codpro,telcli,estcli) values ('" + nombre + "','" + apellido + "','" + dni + "'," + codigodistrito + "," + codigoproducto + ",'" + telefono + "'," + estado + ")";
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

    public boolean ActualizarCliente(clsCliente c) {
        try {
            xcon = objconexion.Conectar();
            
            String sql = "update t_clientes set nomcli='" + nombre + "',apecli='" + apellido + "',dnicli='" + dni + "',coddis=" + codigodistrito + ",codpro=" + codigoproducto + ",telcli='" + telefono + "' ,estcli=" + estado + " where codcli=" + codigo;
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

    public boolean EliminarCliente(clsCliente c) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_clientes set estcli=0 where codcli=" + codigo;
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

    public void MostrarClienteTodo(JTable jtbCliente) {
        Object[] fila = new Object[8];
        String columna[] = {"Codigo", "Nombre", "Apellido", "Dni", "Distrito", "Producto", "Telefono", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select c.codcli,c.nomcli,c.apecli,c.dnicli,d.nomdis,p.nompro,c.telcli,c.estcli "
                    + " from t_clientes c inner join t_distrito d on c.coddis=d.coddis inner join t_producto p "
                    + " on c.codpro=p.codpro where estcli=1 ");
            while (rs.next()) {
                fila[0] = rs.getInt("codcli");
                fila[1] = rs.getString("nomcli");
                fila[2] = rs.getString("apecli");
                fila[3] = rs.getString("dnicli");
                fila[4] = rs.getString("nomdis");
                fila[5] = rs.getString("nompro");
                fila[6] = rs.getString("telcli");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estcli")) {
                    fila[7] = "Habilitado";
                } else {
                    fila[7] = "Deshabilitadod";
                }

                modelo.addRow(fila);
            }
            jtbCliente.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void MostrarClienteTododetodo(JTable jtbCliente) {
        Object[] fila = new Object[8];
        String columna[] = {"Codigo", "Nombre", "Apellido", "Dni", "Distrito", "Producto", "Telefono", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery(" select c.codcli,c.nomcli,c.apecli,c.dnicli,d.nomdis,p.nompro,c.telcli,c.estcli "
                    + " from t_clientes c inner join t_distrito d on c.coddis=d.coddis inner join t_producto p "
                    + " on c.codpro=p.codpro ");
            while (rs.next()) {
                fila[0] = rs.getInt("codcli");
                fila[1] = rs.getString("nomcli");
                fila[2] = rs.getString("apecli");
                fila[3] = rs.getString("dnicli");
                fila[4] = rs.getString("nomdis");
                fila[5] = rs.getString("nompro");
                fila[6] = rs.getString("telcli");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estcli")) {
                    fila[7] = "Habilitado";
                } else {
                    fila[7] = "Deshabilitadod";
                }
                modelo.addRow(fila);
            }
            jtbCliente.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());
        }

    }

    public void BuscarCliente(JTable jtbCliente, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbCliente.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        jtbCliente.setModel(modelo);
        Object[] fila = new Object[8];
        String columna[] = {"Codigo", "Nombre", "Apellido", "Dni", "Distrito", "Producto", "Telefono", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codcli")) {
                rs = st.executeQuery(" select c.codcli,c.nomcli,c.apecli,c.dnicli,d.nomdis,p.nompro,c.telcli,c.estcli "
                        + " from t_clientes c inner join t_distrito d on c.coddis=d.coddis inner join t_producto p "
                        + " on c.codpro=p.codpro where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select c.codcli,c.nomcli,c.apecli,c.dnicli,d.nomdis,p.nompro,c.telcli,c.estcli "
                        + " from t_clientes c inner join t_distrito d on c.coddis=d.coddis inner join t_producto p "
                        + " on c.codpro=p.codpro where " + categoriabusqueda + " like '%" + parametro + "%'");
            }
            while (rs.next()) {
                fila[0] = rs.getInt("codcli");
                fila[1] = rs.getString("nomcli");
                fila[2] = rs.getString("apecli");
                fila[3] = rs.getString("dnicli");
                fila[4] = rs.getString("nomdis");
                fila[5] = rs.getString("nompro");
                fila[6] = rs.getString("telcli");
                //agregando habilitado/deshabilitado
                if (rs.getBoolean("estcli")) {
                    fila[7] = "Habilitado";
                } else {
                    fila[7] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbCliente.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
