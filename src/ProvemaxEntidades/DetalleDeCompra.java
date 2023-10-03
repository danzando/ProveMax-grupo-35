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
public class DetalleDeCompra {

 private int idDetalle;
 
 private int cantidad;
 
 private double precioDeCosto;
 
 Compra compra;
 
 Producto producto;

    public DetalleDeCompra() {
    }

    public DetalleDeCompra(int cantidad, double precioDeCosto, Compra compra, Producto producto) {
        this.cantidad = cantidad;
        this.precioDeCosto = precioDeCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public DetalleDeCompra(int idDetalle, int cantidad, double precioDeCosto, Compra compra, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioDeCosto = precioDeCosto;
        this.compra = compra;
        this.producto = producto;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioDeCosto() {
        return precioDeCosto;
    }

    public void setPrecioDeCosto(double precioDeCosto) {
        this.precioDeCosto = precioDeCosto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    

    @Override
    public String toString() {
        return "DetalleDeCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioDeCosto=" + precioDeCosto + ", compra=" + compra + ", producto=" + producto + '}';
    }
 
 
    
    
}
