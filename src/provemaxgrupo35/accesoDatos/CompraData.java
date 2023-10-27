package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraData {

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }

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

    public Compra buscarCompra(int idCompra) {

        String sql = "SELECT idProveedor, fechaDeCompra  FROM Compra WHERE idCompra=? ";
        ProveedorData pb = new ProveedorData();
        Compra com = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                com = new Compra();
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

    //Todas las compras a un Proveedor P
    public List<Compra> ComprasPorProveedor(Proveedor proveedor) {
        ArrayList<Compra> compras = new ArrayList<>();

        String sql = "select * from compra where IdProveedor=? ";
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, proveedor.getIdProveedor());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
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

    //Todos los productos de una compra en una fecha específica
    public List<Producto> listarProductosCompradosPorFecha(LocalDate fechaDeCompra) {

        List<Producto> productosComprados = new ArrayList<>();

        String sql = "SELECT p.idProducto, p.nombreDelProducto, p.descripcion, p.precio "
                + "FROM producto p, detalledecompra dc, compra c "
                + "WHERE p.idProducto = dc.idProducto "
                + "AND c.fechaDeCompra = ? "
                + "AND dc.idCompra = c.idCompra ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            Date sqlDate = Date.valueOf(fechaDeCompra);
            ps.setDate(1, sqlDate);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombreDelProducto(rs.getString("nombreDelProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getDouble("precio"));

                productosComprados.add(producto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalledecompra");
        }

        return productosComprados;

    }

    //Todos los productos de una compra en particular
    public List<Producto> ProductosDeCompraParticular(Compra compra) {
        List<Producto> productos = new ArrayList<>();

        try {
            String sql = "SELECT P.idProducto, P.nombreDelProducto, P.descripcion, P.precio, P.stock , P.estado "
                    + "FROM Producto P "
                    + "JOIN DetalleDeCompra D ON P.idProducto = D.idProducto "
                    + "WHERE D.idCompra = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, compra.getIdCompra());
            ResultSet rs = ps.executeQuery();
            Producto prod = null;
            while (rs.next()) {
                prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));

                prod.setNombreDelProducto(rs.getString("nombreDelProducto"));

                prod.setDescripcion(rs.getString("descripcion"));

                prod.setPrecio(rs.getDouble("precio"));

                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);

                productos.add(prod);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla producto");
        }

        return productos;
    }

    //Aquellos productos que sean los más comprados entre fechas
    public List<Producto> MasCompradosEntreFechas(LocalDate fechaDeCompra1, LocalDate fechaDeCompra2) {

        List<Producto> pmc = new ArrayList<>();

        String sql = " SELECT p.idProducto, p.nombreDelProducto, p.descripcion, SUM(dc.cantidad) AS cantidadComprada "
                + " FROM DetalleDeCompra dc "
                + " JOIN Compra c ON dc.idCompra = c.idCompra "
                + " JOIN Producto p ON dc.idProducto = p.idProducto "
                + " WHERE c.fechaDeCompra BETWEEN ? AND ? "
                + " GROUP BY p.idProducto, p.nombreDelProducto "
                + " ORDER BY cantidadComprada DESC "
                + " LIMIT 5 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, java.sql.Date.valueOf(fechaDeCompra1));
            ps.setDate(2, java.sql.Date.valueOf(fechaDeCompra2));

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto a = new Producto();

                a.setIdProducto(rs.getInt("idProducto"));
                a.setNombreDelProducto(rs.getString("nombreDelProducto"));
                a.setDescripcion(rs.getString("descripcion"));
                a.setPrecio(rs.getDouble("precio"));
                a.setStock(rs.getInt("stock"));

                pmc.add(a);

            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a tabla producto");
        }

        return pmc;
    }

}
