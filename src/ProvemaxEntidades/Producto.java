/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvemaxEntidades;

/**
 *
 * @author Hp
 */
public class Producto {

 private int idProducto;
 
 private String nombreDelProducto;
 
 private String descripcion;
 
 private double precio;

 private int stock;
 
 private boolean estado;

    public Producto() {
    }

    public Producto(String nombreDelProducto, String descripcion, double precio, int stock, boolean estado) {
        this.nombreDelProducto = nombreDelProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombreDelProducto, String descripcion, double precio, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombreDelProducto = nombreDelProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

   

   
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "Codigo: " + idProducto + ", " + nombreDelProducto+ " "  + descripcion + ", precio:" + precio + ", stock: " + stock;
    }

    public void setNombreProd(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  

}
