package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Compra;
import ProvemaxEntidades.Proveedor;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }

    // realizar compra: producto solicitado, la cantidad y la fecha del pedido 
    // listar productos comprados en determinada fecha  / ultima compra
    // listar compras a proveedor x : public List<Inscripcion> obtenerCompraPorProveedor(int idProveedor)
    //
    public void registrarCompra(Compra compra) {
        String sql = "INSERT INTO compra (idProveedor, fechaDeCompra) "
                + "VALUES (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFechaDeCompra()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                compra.setIdCompra(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Compra registrada");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra" + ex);
        }

    }
//     Buscar Compra

    public Compra buscarCompra(int idCompra) {

        String sql = "SELECT idProveedor, fechaDeCompra  FROM Compra WHERE idCompra=? ";
        ProveedorData pb = new ProveedorData();
        Compra com = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                com = new Compra();  //esta de mas?
                com.setIdCompra(idCompra);
                com.setProveedor(pb.buscarProveedor(rs.getInt("idProveedor")));
                 java.sql.Date fechaSql = rs.getDate("fechaDeCompra");
                LocalDate fecha = fechaSql.toLocalDate();
                com.setFechaDeCompra(fecha);
            } else {

                JOptionPane.showMessageDialog(null, "No existe la compra");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla compra");
        }

        return com;
        //
           }

    public List<Compra> ListarCompras() {
        ArrayList<Compra> compras = new ArrayList<>();

        String sql = "select * from compra ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) { // mientras haya filas en rs  ejecuto el while  
                Compra com = new Compra();
                ProveedorData pd = new ProveedorData();

                com.setIdCompra(rs.getInt("idCompra"));

                Proveedor pro = pd.buscarProveedor(rs.getInt("idProveedor"));
                java.sql.Date fechaSql = rs.getDate("fechaDeCompra");
                LocalDate fecha = fechaSql.toLocalDate();
                com.setProveedor(pro);
                com.setFechaDeCompra(fecha);

                compras.add(com);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion a tabla compras");
        }

        return compras;
    }

//        compra por proveedor
    public List<Compra> ComprasPorProveedor(Proveedor proveedor) {
        ArrayList<Compra> compras = new ArrayList<>();

        String sql = "select * from compra where IdProveedor=? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { // mientras haya filas en rs  ejecuto el while  
                Compra com = new Compra();
                ProveedorData pd = new ProveedorData();

                com.setIdCompra(rs.getInt("idCompra"));

                Proveedor pro = pd.buscarProveedor(proveedor.getIdProveedor());
                java.sql.Date fechaSql = rs.getDate("fechaDeCompra");
                LocalDate fecha = fechaSql.toLocalDate();
                com.setProveedor(pro);
                com.setFechaDeCompra(fecha);

                compras.add(com);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion a tabla compras");
        }

        return compras;
    }

}

