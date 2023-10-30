/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import provemaxgrupo35.accesoDatos.*;
import ProvemaxEntidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ProductoProveedorView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private List<Proveedor> listaProV;
    private ArrayList<Producto> listaProductos;
    private ProveedorData proveedorData;
    private ProductoData productoData;
    

    public ProductoProveedorView() {
        initComponents();

        //modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) jTProveedores.getModel();
        proveedorData = new ProveedorData();
        productoData = new ProductoData();

        listaProductos = (ArrayList<Producto>) productoData.listarProductos();

        cargarProductos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLProductosProveedores = new javax.swing.JLabel();
        jCProductos = new javax.swing.JComboBox();
        jLProductoDeseado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProveedores = new javax.swing.JTable();
        jLProveedorProducto = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLProductosProveedores.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLProductosProveedores.setText("Productos/ Proveedores");

        jCProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCProductosActionPerformed(evt);
            }
        });

        jLProductoDeseado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLProductoDeseado.setText("Seleccione el producto deseado:");

        jTProveedores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id ", "Razon social", "Domicilio", "Telefono", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTProveedores);
        if (jTProveedores.getColumnModel().getColumnCount() > 0) {
            jTProveedores.getColumnModel().getColumn(0).setMinWidth(26);
            jTProveedores.getColumnModel().getColumn(0).setMaxWidth(26);
        }

        jLProveedorProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLProveedorProducto.setText("Proveedor del producto seleccionado:");

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLProductosProveedores)
                .addGap(252, 255, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLProductoDeseado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLProveedorProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLProductosProveedores)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLProductoDeseado))
                .addGap(40, 40, 40)
                .addComponent(jLProveedorProducto)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jBSalir)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jCProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCProductosActionPerformed
        cargarProveedores();
    }//GEN-LAST:event_jCProductosActionPerformed

    private void cargarProductos() {
        List<Producto> listaProductos = productoData.listarProductos(); // Debes descomentar esta línea o asegurarte de que 'listaProductos' esté inicializada adecuadamente.

        for (Producto producto : listaProductos) { // Debes iterar sobre 'listaProductos'.
            jCProductos.addItem(producto);
        }
    }

    private void borrarFilasTabla() {

        int indice = modelo.getRowCount() - 1; //cuenta las filas desde la ultima
        for (int i = indice; i >= 0; i--) {  //itera desde indice, recorre descendente
            modelo.removeRow(i);            //borra filas que tengan ese indice
        }
    }

    private void cargarProveedores() {

        borrarFilasTabla();
        Producto pr = (Producto) jCProductos.getSelectedItem(); //castea a AAAProducto
        listaProV = (ArrayList<Proveedor>) proveedorData.obtenerProveedoresDelProducto(pr); //  se castea a ArrayList
        for (Proveedor p : listaProV) {
            modelo.addRow(new Object[]{p.getIdProveedor(), p.getRazonSocial(), p.getDomicilio(), p.getTelefono(), p.getMail()});

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox jCProductos;
    private javax.swing.JLabel jLProductoDeseado;
    private javax.swing.JLabel jLProductosProveedores;
    private javax.swing.JLabel jLProveedorProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProveedores;
    // End of variables declaration//GEN-END:variables
}
