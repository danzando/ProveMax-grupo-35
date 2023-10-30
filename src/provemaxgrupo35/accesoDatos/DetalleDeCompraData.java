
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Compra;
import ProvemaxEntidades.DetalleDeCompra;
import ProvemaxEntidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public DetalleDeCompra buscarDetalleDeCompra(int idDetalle) {

        DetalleDeCompra dc = new DetalleDeCompra();
        Compra c = new Compra();
        Producto p = new Producto();
        CompraData cd = new CompraData();
        ProductoData pd = new ProductoData();

        String sql = " SELECT  cantidad, precioDeCosto, idCompra, idProducto FROM detalleDeCompra WHERE idDetalle = ? ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, idDetalle);

            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {

                dc.setIdDetalle(idDetalle);

                dc.setCantidad(rs.getInt("cantidad"));

                dc.setPrecioDeCosto(rs.getDouble("PrecioDeCosto"));

                c = cd.buscarCompra(rs.getInt("idCompra"));

                dc.setCompra(c);

                p = pd.buscarProducto(rs.getInt("idProducto"));

                dc.setProducto(p);

            }else{  JOptionPane.showMessageDialog(null, "No existe la compra");
            
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al conectarce a la tabla detalleDeCompras");
        }

        return dc;
    }
    
    
    public void modificarDetalleDeCompra(int idDetalleDeCompra, int cantidad, double precioDeCosto, int idCompra, int idProducto) {

        String sql = "update detalleDeCompra set cantidad=? , precioDeCosto=? , idCompra=? , idProducto=? "
                + "where idDetalle= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cantidad);

            ps.setDouble(2, precioDeCosto);

            ps.setInt(3, idCompra);

            ps.setInt(4, idProducto);

            ps.setInt(5, idDetalleDeCompra);

            int filas = ps.executeUpdate();

            if (filas > 0) {

                JOptionPane.showMessageDialog(null, "Detalle de compra actualizado");

             } else {
                JOptionPane.showMessageDialog(null, "Detalle de compra inexistente");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle de compra");

        }
    }
    
    public void borrarDetalleDeCompra(int idDetalle) {

        String sql = " DELETE FROM detalledecompra WHERE idDetalle = ? ";

        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, idDetalle);

            JOptionPane.showMessageDialog(null, "Detalle de compra borrado");
            ps.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a tabla detalle de compra");
        }

    }


    
}
