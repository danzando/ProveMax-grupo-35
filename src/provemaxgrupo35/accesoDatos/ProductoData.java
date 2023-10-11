
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Producto;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoData {

    private Connection con = null;

    public ProductoData() {

        con = Conexion.getConexion();

    }

    public void registrarProducto(Producto producto){

        String sql = "INSERT INTO producto (nombreDelProducto, descripcion,precio, stock, estado)"
                + " VALUES ( ?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombreDelProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                producto.setIdProducto(rs.getInt(1));

                JOptionPane.showMessageDialog(null, " Producto registrado");
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla producto");
        }

    }

    public void modificarProducto(Producto producto) {

        String sql = "UPDATE producto SET nombreDelProducto=?, descripcion=?, precio=?, stock=?, estado=? "
                + "WHERE idProducto= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setString(1, producto.getNombreDelProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());
            ps.executeUpdate();            //devuelve int con cant filas afectadas. lo guardo en variable:
            
            int modif = ps.executeUpdate();
            if (modif == 1) {
                JOptionPane.showMessageDialog(null, "Datos de producto actualizados");

            } else {
                JOptionPane.showMessageDialog(null, "Producto inexistente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla producto");
        }

    }

    
    public Producto buscarProducto(int idProducto) {

        String sql = "SELECT nombreDelProducto, descripcion, precio, stock, estado FROM producto WHERE idProducto=? AND estado=1";

        Producto pro = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                pro = new Producto();  
                pro.setIdProducto(idProducto);
                pro.setNombreDelProducto(rs.getString("nombreDelProducto"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setStock(rs.getInt("stock"));
                pro.setEstado(true);

            } else {

                JOptionPane.showMessageDialog(null, "Producto inexistente");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla producto");
        }

        return pro;

    }

    public List<Producto> listarProductos() {

        List<Producto> productos = new ArrayList();

        String sql = "SELECT nombreDelProducto, descripcion, precio, stock FROM Producto WHERE estado = 1"; // agregar nombre columnas en vez de *

        Producto prod = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
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
    
    public void eliminarProducto(int idProducto) {
        String sql = "UPDATE producto SET estado=0 WHERE idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto); //1 xq es el unico parametro
            int elim = ps.executeUpdate();
            if (elim == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");

            }
            ps.close();

        } catch (SQLException ex) {

        }

    }
    
       public List<Producto> listarProductosCompradosPorFecha(LocalDate fechaDeCompra) {

        List<Producto> productosComprados = new ArrayList<>();

        String sql = "SELECT p.nombreDelProducto, p.descripcion, p.precio" 
                + "FROM producto p"
                + "JOIN detalledecompra dc ON p.idProducto = dc.idProducto"
                + "JOIN compra c ON dc.idCompra = c.idCompra"
                + "WHERE c.fechaDeCompra = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            Date sqlDate = Date.valueOf(fechaDeCompra);
            ps.setDate(1,sqlDate);
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


}
