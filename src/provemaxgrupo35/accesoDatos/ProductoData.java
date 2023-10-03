/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class ProductoData {
   
    private Connection con = null;

    public ProductoData() {
     
    con = Conexion.getConexion();
    
    }
    
    
    public void registrarProducto(Producto producto) throws SQLException{
    
        String sql = " insert into producto (nombreDelProducto, descripcion,precio, stock, estado)"
                
                + " Values ( ?,?,?,?,?)";
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1,producto.getNombreDelProducto());
        ps.setString(2,producto.getDescripcion());
        ps.setDouble(3,producto.getPrecio());
        ps.setInt(4,producto.getStock());
        ps.setBoolean(5,producto.isEstado());
        
    ps.executeUpdate();
    
    ResultSet rs = ps.getGeneratedKeys();
    
    if ( rs.next()){
        
        producto.setIdProducto(rs.getInt(1));
        
        JOptionPane.showMessageDialog(null," Producto registrado")
;    }
    
    
    } catch(SQLException ex ){

JOptionPane.showMessageDialog(null," Error al acceder a la tabla producto" );}
    
}
}
