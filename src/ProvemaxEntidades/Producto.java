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
 
 private boolean estado;

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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
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
        return "Producto{" + "idProducto=" + idProducto + ", nombreDelProducto=" + nombreDelProducto + ", descripcion=" + descripcion + ", stock=" + stock + '}';
    }


}
