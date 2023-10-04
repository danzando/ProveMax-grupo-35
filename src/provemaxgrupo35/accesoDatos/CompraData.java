
package provemaxgrupo35.accesoDatos;

import java.sql.Connection;


public class CompraData {
    

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }
    
    // realizar compra: producto solicitado, la cantidad y la fecha del pedido 
    // listar productos comprados en determinada fecha  / ultima compra
    // listar compras a proveedor x
    //
}
