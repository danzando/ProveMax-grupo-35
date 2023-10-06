
package provemax.grupo.pkg35;

import ProvemaxEntidades.Producto;
import provemaxgrupo35.accesoDatos.ProductoData;


public class ProvemaxGrupo35 {

  
    public static void main(String[] args) {
       
        ProductoData proDa = new ProductoData();
        
        // REGISTRAR PRODUCTO:
        //Producto p = new Producto("Batidora", "Liliana", 30000, 15, true);
         //proDa.registrarProducto(p);
         
         
          //BUSCAR PRODUCTO
         //proDa.buscarProducto(11);
             // System.out.println(proDa.buscarProducto(11));
              
              
         //MODIFICAR PRODUCTO
        Producto p = new Producto(11,"Ventilador", "Liliana", 30000, 15, true);
         proDa.modificarProducto(p); 
         System.out.println(p);

         
         
        //LISTAR PRODUCTOS
        //  proDa.listarProductos();   
        //  for (Producto producto: proDa.listarProductos()) {
        //      System.out.println(producto);
        // }
        
        
        // ELIMINAR PRODUCTO
        
        //proDa.eliminarProducto(11);
        
         
         
    }
    
}
