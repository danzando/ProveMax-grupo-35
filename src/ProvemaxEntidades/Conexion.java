package ProvemaxEntidades;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "provemax-grupo35";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");

                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(null, " Error al cargar Drivers");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB");
            }

        }

        return connection;

    }
}
