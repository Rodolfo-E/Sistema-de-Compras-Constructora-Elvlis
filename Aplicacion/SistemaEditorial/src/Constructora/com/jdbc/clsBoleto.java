

package Constructora.com.jdbc;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;


public class clsBoleto {

    private int numero;
    private int codempleado;
    private int codcliente;
    private Date fecha;
    private boolean estado;

   private Connection xcon = null;
    Statement st = null;
    ResultSet rs = null;

    DefaultTableModel modelo = null;
    
    clsConexion objconexion = new clsConexion();

    public clsBoleto() {
    }

    public clsBoleto(int numero, int codempleado, int codcliente, Date fecha, boolean estado) {
        this.numero = numero;
        this.codempleado = codempleado;
        this.codcliente = codcliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodempleado() {
        return codempleado;
    }

    public void setCodempleado(int codempleado) {
        this.codempleado = codempleado;
    }

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int codcliente) {
        this.codcliente = codcliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int GenerarCodigo() {
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("SHOW TABLE STATUS LIKE 'T_Boleto'");
            while (rs.next()) {
                numero = rs.getInt(11);
            }
            return numero;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public boolean AgregarBoleto(clsBoleto b) {
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            int res = st.executeUpdate("INSERT INTO T_BOLETO(FECBOL,codprove,CODEMP,ESTBOL) VALUES(NOW()," + codcliente + "," + codempleado + "," + estado + ")");
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

    public void MostrarBoleto(JTable jtbBoleto) {
        Object[] fila = new Object[7];
        String columna[] = {"Numero", "Fecha", "Nom. Proveedor", "Nom. Empleado", "Ape. Empleado", "Subtotal", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery(" SELECT B.NRO,B.FECBOL,C.nomprove,E.nomemp,E.apeemp, SUM(DT.CANBOL * EV.prepro) SUBTOTAL,B.ESTBOL FROM  "
                    + " T_BOLETO B INNER JOIN t_Proveedor C ON B.codprove=C.codprove INNER JOIN T_EMPLEADO E ON B.codemp=E.codemp "
                    + " INNER JOIN T_DETALLEBOLETO DT ON B.NRO=DT.NRO INNER JOIN t_Producto EV ON DT.codpro=EV.codpro "
                    + " WHERE B.ESTBOL = 1 GROUP BY NRO");
            while (rs.next()) {
                fila[0] = rs.getInt("nro");
                fila[1] = rs.getString("fecbol");
                fila[2] = rs.getString("nomprove");
                fila[3] = rs.getString("nomemp");
                fila[4] = rs.getString("apeemp");
                fila[5] = rs.getString("subtotal");
                if (rs.getBoolean("estbol")) {
                    fila[6] = "Habilitado";
                } else {
                    fila[6] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbBoleto.setModel(modelo);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

    }

    public boolean EliminarBoleto(clsBoleto b) {
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            int res = st.executeUpdate("UPDATE T_BOLETO SET ESTBOL=" + estado + " WHERE NRO=" + numero);
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

    public String CargarEmpleado(int cod) {
        String nombrecompleto = "";
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select nomemp,apeemp from t_Empleado where codusu=" + cod);
            while (rs.next()) {
                nombrecompleto = rs.getString("nomemp") + " " + rs.getString("apeemp");
            }
            return nombrecompleto;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return "";
        }
    }
    
    public int CodigoEmpleado(int cod) {
        int codigo = 0;
        try {
            xcon = xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select codemp from t_Empleado where codusu=" + cod);
            while (rs.next()) {
                codigo = rs.getInt("codemp");
            }
            return codigo;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return 0;
        }
    }

}
