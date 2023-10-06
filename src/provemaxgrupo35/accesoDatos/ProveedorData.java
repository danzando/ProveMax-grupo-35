/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo35.accesoDatos;

import ProvemaxEntidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {

        con = Conexion.getConexion();

    }

    public void registrarProveedor(Proveedor proveedor) {
        String sql = "INSERT INTO proveedor (razonSocial, domicilio, telefono, mail)"
                + " VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setString(4, proveedor.getMail());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proveedor registrado");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla proveedor");

        }

    }

    public void modificarProveedor(Proveedor pro) {

        String sql = "UPDATE proveedor SET razonSocial=?, domicilio=?, telefono=?, mail=? "
                + "WHERE idProveedor= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, pro.getRazonSocial());
            ps.setString(2, pro.getDomicilio());
            ps.setString(3, pro.getTelefono());
            ps.setString(4, pro.getMail());
            ps.setInt(5, pro.getIdProveedor());

            ps.executeUpdate();

            int modif = ps.executeUpdate();
            if (modif == 1) {
                JOptionPane.showMessageDialog(null, "Datos de proveedor actualizados");

            } else {
                JOptionPane.showMessageDialog(null, "Proveedor inexistente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla proveedor");
        }

    }
    
    
    
    public Proveedor buscarProveedor(int idProveedor) {

        String sql = "SELECT razonSocial, domicilio, telefono, mail FROM Proveedor WHERE idProveedor=?";

        Proveedor prov = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                prov = new Proveedor();
                int idProducto = 0;

                prov.setIdProveedor(idProveedor);
                prov.setRazonSocial(rs.getString("razonSocial"));
                prov.setDomicilio(rs.getString("domicilio"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setMail(rs.getString("mail"));
                
            } else {

                JOptionPane.showMessageDialog(null, "Proveedor inexistente");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla proveedor");
        }

        return prov;

    }

    
    public List<Proveedor> listarProveedores() {

        List<Proveedor> proveedores = new ArrayList<>();

        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono, mail FROM proveedor";

        Proveedor p = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                p = new Proveedor();

                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getString("telefono"));
                p.setMail(rs.getString("mail"));

                proveedores.add(p);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla proveedor");
        }

        return proveedores;

    }
}


