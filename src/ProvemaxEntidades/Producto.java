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

 private String stock;

    public Producto() {
    }

    public Producto(String nombreDelProducto, String descripcion, String stock) {
        this.nombreDelProducto = nombreDelProducto;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Producto(int idProducto, String nombreDelProducto, String descripcion, String stock) {
        this.idProducto = idProducto;
        this.nombreDelProducto = nombreDelProducto;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreDelProducto=" + nombreDelProducto + ", descripcion=" + descripcion + ", stock=" + stock + '}';
    }


}
