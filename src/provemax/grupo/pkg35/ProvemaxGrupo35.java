package provemax.grupo.pkg35;

import ProvemaxEntidades.Compra;
import ProvemaxEntidades.Producto;
import ProvemaxEntidades.Proveedor;
import java.time.LocalDate;
import provemaxgrupo35.accesoDatos.CompraData;
import provemaxgrupo35.accesoDatos.ProductoData;
import provemaxgrupo35.accesoDatos.ProveedorData;

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
//        Producto p = new Producto(11,"Ventilador", "Liliana", 30000, 15, true);
//         proDa.modificarProducto(p); 
//         System.out.println(p);
        //LISTAR PRODUCTOS
        //  proDa.listarProductos();   
        //  for (Producto producto: proDa.listarProductos()) {
        //      System.out.println(producto);
        // }
        // ELIMINAR PRODUCTO
        //proDa.eliminarProducto(11);
        //REGISTRAR PROVEEDOR
        ProveedorData pd = new ProveedorData();
//        Proveedor pro= new Proveedor("Maxiconsumo","Ruta 7 K30","2664444444","maxiconsumo@gmail.com");
//       pd.registrarProveedor(pro);

        //BUSCAR PROVEEDOR
        //System.out.println(pd.buscarProveedor(1));
        //MODIFICAR PROVEEDOR
//         Proveedor prob= new Proveedor(8,"Maxiconsumo","Ruta 7","2664444444","maxiconsumo@gmail.com");
//         pd.modificarProveedor(prob);
//         System.out.println(prob);
        //LISTAR PROVEEDOR
        //for (Proveedor proveedor: pd.listarProveedores()) {
//             System.out.println(proveedor);
        //REGISTRAR COMPRA
//    Proveedor pro=pd.buscarProveedor(1);
        CompraData cd = new CompraData();
//          LocalDate fecha = LocalDate.of(2023, 04, 01);
//          Compra com= new Compra(pro,fecha);
//          cd.registrarCompra(com);

        //BUSCAR COMPRA
//        System.out.println(cd.buscarCompra(5));
//
//        //LISTAR COMPRAS
//     
//        for (Compra compras : cd.ListarCompras()) {
//            System.out.println(compras);
//        }
        //COMPRAS POR PROVEEDOR
//        Proveedor pro = pd.buscarProveedor(10);
//        for (Compra xproveedor : cd.ComprasPorProveedor(pro)) {
//            System.out.println(xproveedor);
//        }

        //TODOS LOS PRODUCTOS DE UNA COMPRA EN UNA FECHA ESPECIFICA
//        for (Producto productosComprados : proDa.listarProductosCompradosPorFecha(LocalDate.of(2023, 10, 9))) {
//            System.out.println(productosComprados);
//        }

        //MOSTRAR QUE PROVEEDORES, PROVEEN EL PRODUCTO 
//        Producto prob = proDa.buscarProducto(2);

//        for (Proveedor proveedores : pd.obtenerProveedoresDelProducto(prob)) {
//            System.out.println(proveedores);

//        }
        //TODOS LOS PRODUCTOS DE UNA COMPRA EN PARTICULAR
                  
//        for (Producto productos : proDa.ProductosDeCompraParticular(cd.buscarCompra(6))) {
//            System.out.println(productos);
//        }
        
        //PRODUCTOS MAS COMPRADOS ENTRE FECHAS
for(Producto productosMasC:proDa.masCompradosEntreFechas( LocalDate.of(2023,04,01),LocalDate.of(2023,04,02))){
    System.out.println(productosMasC);
}
    }
}
