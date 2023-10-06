
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class CompraData {
    

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }
    
    // realizar compra: producto solicitado, la cantidad y la fecha del pedido 
    // listar productos comprados en determinada fecha  / ultima compra
    // listar compras a proveedor x
    //
    
    public void registrarCompra (Compra compra){
        String sql = "INSERT INTO compra (idProveedor, fechaDeCompra)"
                + "VALUES (?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            
        }
    
    }
}
