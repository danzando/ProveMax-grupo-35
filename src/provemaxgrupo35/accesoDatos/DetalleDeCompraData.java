
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Compra;
import ProvemaxEntidades.DetalleDeCompra;
import ProvemaxEntidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DetalleDeCompraData {
     private Connection con = null;

    public DetalleDeCompraData() {

        con = Conexion.getConexion();

    }

    public void registrarDetalleDeCompra(int cantidad, double precioDeCosto, Compra compra, Producto producto){
    
       DetalleDeCompra dc = new DetalleDeCompra();
            String sql = "INSERT INTO detalledecompra (cantidad, precioDeCosto, idCompra, idProducto) "
                    + "VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,cantidad);
            ps.setDouble(2, precioDeCosto);
            ps.setInt(3, compra.getIdCompra());
            ps.setInt(4, producto.getIdProducto());
            ps.executeUpdate();
            
             ResultSet rs = ps.getGeneratedKeys();
            
              if (rs.next()) {
                 
                  dc.setIdDetalle(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Detalle de compra registrado");
                ps.close();

            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalledecompra");
        }
    
    
    
    }
    public List<Producto> listarProductosCompradosPorFecha(/*paso DateFecha?*/)  {

        List<Producto> productosComprados = new ArrayList<>();
        
        String sql = "SELECT p.nombreDelProducto, p.descripcion, p.precio" // poner todos los valores
                    + "FROM producto p" 
                    + "JOIN detalledecompra dc ON p.idProducto = dc.idProducto"
                    + "JOIN compra c ON dc.idCompra = c.idCompra"
                    + "WHERE c.fechaDeCompra = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            // COMO RESUELVO FECHA?????? AAAAAAGHHHHHH  parseo?
                //ps.setFechaDeCompra(1,(LocalDate fechaDeCompra.getDate()));
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
