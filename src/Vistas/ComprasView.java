/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ProvemaxEntidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import provemaxgrupo35.accesoDatos.*;
public class ComprasView extends javax.swing.JInternalFrame {

    Compra compra = null;
    CompraData cd = new CompraData();
    ProveedorData pd= new ProveedorData();
     private DefaultTableModel modelo;
    private List<Compra> compras;
    
    public ComprasView() {
        initComponents();
         initComponents();
         modelo = (DefaultTableModel) jTabla.getModel();
        compras= cd.ListarCompras();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLCompras = new javax.swing.JLabel();
        jLIdCompra = new javax.swing.JLabel();
        jLIdProveedor = new javax.swing.JLabel();
        jTIdProveedor = new javax.swing.JTextField();
        jTIdCompra = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBNueva = new javax.swing.JButton();
        jBListarCompras = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jDFecha = new com.toedter.calendar.JDateChooser();
        jLFechaDeCompra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLCompras.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLCompras.setText("Compras");
        jPanel1.add(jLCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLIdCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdCompra.setText("Id Compra");
        jPanel1.add(jLIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 94, 141, -1));

        jLIdProveedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdProveedor.setText("Id Proveedor");
        jPanel1.add(jLIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 151, 141, -1));
        jPanel1.add(jTIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 179, -1));

        jTIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdCompraActionPerformed(evt);
            }
        });
        jPanel1.add(jTIdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 179, -1));

        jBGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBGuardar.setText("Registrar/Actualizar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 160, -1));

        jBNueva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBNueva.setText("Nueva");
        jBNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(jBNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 160, -1));

        jBListarCompras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBListarCompras.setText("Listar Compras");
        jBListarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarComprasActionPerformed(evt);
            }
        });
        jPanel1.add(jBListarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 160, -1));

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 100, -1));

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 160, -1));

        jDFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jDFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 179, -1));

        jLFechaDeCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLFechaDeCompra.setText("Fecha de compra");
        jPanel1.add(jLFechaDeCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 214, 132, -1));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id ", "Proveedor", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabla);
        if (jTabla.getColumnModel().getColumnCount() > 0) {
            jTabla.getColumnModel().getColumn(0).setMinWidth(26);
            jTabla.getColumnModel().getColumn(0).setMaxWidth(26);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 690, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdCompraActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
     try {
        Integer idProveedor = Integer.parseInt(jTIdProveedor.getText());
        java.util.Date sfecha = jDFecha.getDate();
        LocalDate fecha = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (idProveedor == null || fecha == null) {
            JOptionPane.showMessageDialog(this, "Debe completar los campos");
            return;
        } else {
            // Obtén la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Compara la fecha ingresada con la fecha actual
            if (fecha.isAfter(fechaActual)) {
                JOptionPane.showMessageDialog(this, "La fecha no puede estar en el futuro.");
                return;
            }

            Proveedor proveedor = pd.buscarProveedor(idProveedor);

            if (proveedor != null) {
                compra = new Compra(proveedor, fecha);
                cd.registrarCompra(compra);
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Se ha ingresado un dato incorrecto, intente nuevamente");
    }

    
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaActionPerformed
      limpiarCampos();
        
    }//GEN-LAST:event_jBNuevaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
     dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBListarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarComprasActionPerformed
     DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();      


    // Limpia la tabla eliminando todas las filas existentes
    while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
    }

    // Itera sobre la lista de compras y agrega filas a la tabla
    for (Compra todas : compras) {
        modelo.addRow(new Object[]{todas.getIdCompra(), todas.getProveedor(), todas.getFechaDeCompra()});
    }
    }//GEN-LAST:event_jBListarComprasActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
   String input = jTIdCompra.getText();

        if (input.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un valor en el campo Id de Compra.");
        } else {
            try {
                int idCompra = Integer.parseInt(jTIdCompra.getText());
                compra = cd.buscarCompra(idCompra);

                if (compra != null) {
                    jTIdProveedor.setText(String.valueOf(compra.getProveedor().getIdProveedor()));
                    LocalDate lc = compra.getFechaDeCompra();
                    java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                                  
                    jDFecha.setDate(date);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Se ha ingresado un dato incorrecto, intente nuevamente");
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_jBBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBListarCompras;
    private javax.swing.JButton jBNueva;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDFecha;
    private javax.swing.JLabel jLCompras;
    private javax.swing.JLabel jLFechaDeCompra;
    private javax.swing.JLabel jLIdCompra;
    private javax.swing.JLabel jLIdProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIdCompra;
    private javax.swing.JTextField jTIdProveedor;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos() {
        jTIdCompra.setText("");
        jTIdProveedor.setText("");
        jDFecha.setDate(null);
        compra = null;
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
    while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);}
    } 

}
