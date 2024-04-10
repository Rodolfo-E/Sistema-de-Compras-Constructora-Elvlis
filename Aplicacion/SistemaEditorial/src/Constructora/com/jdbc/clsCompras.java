package Constructora.com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class clsCompras {

    private int codigo;
    private int nombreproveedor;
    private boolean estado;
    private clsProveedor proveedor;

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

    public clsCompras() {
    }

    public clsCompras(int codigo, int nombreproveedor, boolean estado, clsProveedor proveedor) {
        this.codigo = codigo;
        this.nombreproveedor = nombreproveedor;
        this.estado = estado;
        this.proveedor = proveedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(int nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public clsProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(clsProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean RegistrarCompra(clsCompras c) {
        try {
            //llamamos a la funcion Conectar
            xcon = objconexion.Conectar();
            //generamos una consulta SQL para mostrar los datos de la tabla
            String sql = "insert into t_compra(codprove,estcom) values ('" + nombreproveedor + "'," + estado + ")";
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

    public void ConsultarProveedor(JComboBox cbo_proveedor) {
        java.sql.Connection conectar = null;
        String sql = ("select nomprove from t_proveedor ");
        try {
            xcon = objconexion.Conectar();
            com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) xcon.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            cbo_proveedor.addItem("Seleccione una opcion");
            while (rs.next()) {
                cbo_proveedor.addItem(rs.getString("nomprove"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public boolean ActualizarCompra(clsCompras c) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_compra set codprove='" + nombreproveedor + "',estcom=" + estado + " where codcom=" + codigo;
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

    public boolean EliminarCompra(clsCompras c) {
        try {
            xcon = objconexion.Conectar();
            String sql = "update t_distrito set estcom=0 where codcom=" + codigo;
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

    public void MostrarCompraTodo(JTable jtbProducto) {
        Object[] fila = new Object[3];
        String columna[] = {"Codigo", "Proveedor", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select c.codcom,pr.nomprove,estcom "
                    + "from t_compra c inner join t_proveedor pr "
                    + "on c.codprove=pr.codprove where estcom=1  ");
            while (rs.next()) {
                fila[0] = rs.getInt("codcom");
                fila[1] = rs.getString("nomprove");

                if (rs.getBoolean("estcom")) {
                    fila[2] = "Habilitado";
                } else {
                    fila[2] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void MostrarCompraTododeTodo(JTable jtbProducto) {
        Object[] fila = new Object[3];
        String columna[] = {"Codigo", "Proveedor", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            rs = st.executeQuery("select c.codcom,pr.nomprove,estcom "
                    + " from t_compra c inner join t_proveedor pr "
                    + " on c.codprove=pr.codprove  ");
            while (rs.next()) {
                fila[0] = rs.getInt("codcom");
                fila[1] = rs.getString("nomprove");

                if (rs.getBoolean("estcom")) {
                    fila[2] = "Habilitado";
                } else {
                    fila[2] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }

    }

    public void BuscarCompra(JTable jtbProducto, String categoriabusqueda, String parametro) {
        for (int i = 0; i < jtbProducto.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
        jtbProducto.setModel(modelo);
        Object[] fila = new Object[3];
        String columna[] = {"Codigo", "Proveedor", "Estado"};
        modelo = new DefaultTableModel(null, columna);
        try {
            xcon = objconexion.Conectar();
            st = xcon.createStatement();
            if (categoriabusqueda.equals("codcom")) {
                rs = st.executeQuery("select c.codcom,pr.nomprove,estcom "
                        + " from t_compra c inner join t_proveedor pr "
                        + " on c.codprove=pr.codprove where " + categoriabusqueda + "=" + parametro);
            } else {
                rs = st.executeQuery("select c.codcom,pr.nomprove,estcom "
                        + " from t_compra c inner join t_proveedor pr "
                        + " on c.codprove=pr.codprove where " + categoriabusqueda + " like '%" + parametro + "%'");

            }

            while (rs.next()) {
                fila[0] = rs.getInt("codcom");
                fila[1] = rs.getString("nomprove");

                if (rs.getBoolean("estcom")) {
                    fila[2] = "Habilitado";
                } else {
                    fila[2] = "Deshabilitado";
                }
                modelo.addRow(fila);
            }
            jtbProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e.toString());

        }
    }

}
