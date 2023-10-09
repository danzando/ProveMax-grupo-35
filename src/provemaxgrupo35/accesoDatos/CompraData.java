
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Compra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public void registrarCompra (Compra compra){
        String sql = "INSERT INTO compra (idProveedor, fechaDeCompra)"
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
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }
    
    }
}
