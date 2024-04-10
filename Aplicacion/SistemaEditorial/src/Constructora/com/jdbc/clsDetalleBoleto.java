

package Constructora.com.jdbc;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class clsDetalleBoleto {

    private int numero;
    private int codevento;
    private int cantidad;

    Connection xcon = null;
    Statement st = null;
    ResultSet rs = null;

    DefaultTableModel modelo = null;

    clsConexion objconexion = new clsConexion();

    public clsDetalleBoleto() {
        numero = 0;
        codevento = 0;
        cantidad = 0;
    }

    public clsDetalleBoleto(int numero, int codevento, int cantidad) {
        this.numero = numero;
        this.codevento = codevento;
        this.cantidad = cantidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodevento() {
        return codevento;
    }

    public void setCodevento(int codevento) {
        this.codevento = codevento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean AgregarDetalle(clsDetalleBoleto dt) {
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            int res = st.executeUpdate("INSERT INTO T_DETALLEBOLETO(NRO,codpro,CANBOL) VALUES(" + numero + "," + codevento + "," + cantidad + ")");
            if (res == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }

    public boolean ActualizarDetalle(clsDetalleBoleto dt) {
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            int res = st.executeUpdate("UPDATE t_Producto SET canpro=canpro-" + cantidad + " WHERE codpro=" + codevento);
            if (res == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }

    public boolean DevolverDetalle(clsDetalleBoleto dt) {
        try {

            boolean est = false;
            Statement st1 = null;
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select * from t_detalleboleto where nro=" + numero);
            while (rs.next()) {
                cantidad = rs.getInt("canbol");
                codevento = rs.getInt("codpro");
                st1 = xcon.createStatement();
                int res = st1.executeUpdate("UPDATE t_Producto SET canpro=canpro+" + cantidad + " WHERE codpro=" + codevento);
                if (res == 1) {
                    est = true;
                } else {
                    est = false;
                }
            }
            return est;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }

    }

}
