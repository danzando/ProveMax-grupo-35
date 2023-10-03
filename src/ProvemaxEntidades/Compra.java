/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvemaxEntidades;

import java.time.LocalDate;

/**
 *
 * @author Hp
 */
public class Compra {

   private int idCompra;
   
   private Proveedor proveedor;
    
   private LocalDate fechaDeCompra;

    public Compra() {
    }

    public Compra(Proveedor proveedor, LocalDate fecha) {
        this.proveedor = proveedor;
        this.fechaDeCompra = fecha;
    }

    public Compra(int idCompra, Proveedor proveedor, LocalDate fecha) {
        this.idCompra = idCompra;
        this.proveedor = proveedor;
        this.fechaDeCompra = fecha;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDate fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", proveedor=" + proveedor + ", fecha=" + fechaDeCompra + '}';
    }

}
