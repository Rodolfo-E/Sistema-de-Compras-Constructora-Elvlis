

package Constructora.com.jdbc;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class clsEvento {
    private int codigo;
    private String nombre;
    private Date Fecha;
    private Double precio;
    private int cantidad;
    private byte[] foto;
    private int estado;

     private Connection xcon = null;
    Statement st = null;
    ResultSet rs = null;

    DefaultTableModel modelo = null;
    
    clsConexion objconexion = new clsConexion();
    public clsEvento() {
    }

    public clsEvento(int codigo, String nombre, Date Fecha, Double precio, int cantidad, byte[] foto, int estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Fecha = Fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.foto = foto;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    


    

    public void MostrarEvento(JTable jtbEvento) {
        Object[] fila = new Object[6];
        String columna[] = {"Codigo","Nombre", "Fecha", "Precio", "Cantidad", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select *from t_producto WHERE estpro = 1 ");
                    
            while (rs.next()) {
                fila[0] = rs.getInt("codpro");
                fila[1] = rs.getString("nompro");
                fila[2] = rs.getString("fecpro");
                fila[3] = rs.getString("prepo");
                fila[4] = rs.getString("canpro");

                if (rs.getBoolean("estpro")) {
                    fila[5] = "Habilitado";
                } else {
                    fila[5] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbEvento.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }

   
    
 
    
    
}
