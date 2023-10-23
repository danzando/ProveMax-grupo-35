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
public class Proveedor {

 private int idProveedor;
 
 private String razonSocial;

 private String domicilio;

 private String telefono;

 private String mail;

    public Proveedor() {
    }

    public Proveedor(String razonSocial, String domicilio, String telefono, String mail) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }

    public Proveedor(int idProveedor, String razonSocial, String domicilio, String telefono, String mail) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Proveedor{"  + idProveedor + ", " + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + ", mail=" + mail + '}';
    }

    




}
