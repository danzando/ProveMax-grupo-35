/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ProvemaxEntidades.Compra;
import ProvemaxEntidades.DetalleDeCompra;
import ProvemaxEntidades.Producto;
import javax.swing.JOptionPane;
import provemaxgrupo35.accesoDatos.CompraData;
import provemaxgrupo35.accesoDatos.DetalleDeCompraData;
import provemaxgrupo35.accesoDatos.ProductoData;

/**
 *
 * @author Hp
 */
public class DetallesDeCompraView extends javax.swing.JInternalFrame {
   DetalleDeCompraData deta = new DetalleDeCompraData();
   ProductoData pd = new ProductoData();
   CompraData cd = new CompraData();
   DetalleDeCompra d = new DetalleDeCompra();
   Compra c = new Compra();
   Producto p = new Producto();
 

    /**
     * Creates new form DetallesDeCompraView
     */
    public DetallesDeCompraView() {
        initComponents();
        
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
        jLIdDetalleDeCompra = new javax.swing.JLabel();
        jLCantidad = new javax.swing.JLabel();
        jLPrecioDeCosto = new javax.swing.JLabel();
        jLIdDeCompra = new javax.swing.JLabel();
        jLIdDelProducto = new javax.swing.JLabel();
        jTIdDetalleCompra = new javax.swing.JTextField();
        jTCantidad = new javax.swing.JTextField();
        jTIdCompra = new javax.swing.JTextField();
        jBModificar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBLimpiarCampos = new javax.swing.JButton();
        jBEliminarDetalle = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jTIdProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTPrecioDeCosto = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLIdDetalleDeCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdDetalleDeCompra.setText("Id Detalle de compra");

        jLCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCantidad.setText("Cantidad");

        jLPrecioDeCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPrecioDeCosto.setText("Precio de costo");

        jLIdDeCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdDeCompra.setText("Id de compra");

        jLIdDelProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdDelProducto.setText("Id del producto");

        jTIdDetalleCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTIdCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jBModificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBLimpiarCampos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBLimpiarCampos.setText("Limpiar campos");
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jBEliminarDetalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEliminarDetalle.setText("Eliminar detalle");
        jBEliminarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDetalleActionPerformed(evt);
            }
        });

        jBRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRegistrar.setText("Registrar ");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jTIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Detalles de compra");

        jTPrecioDeCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLPrecioDeCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(348, 348, 348)
                                .addComponent(jTPrecioDeCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLIdDetalleDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLIdDelProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLIdDeCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(297, 297, 297))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(303, 303, 303)))
                                        .addGap(45, 45, 45))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBEliminarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(94, 94, 94)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(94, 94, 94)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTIdProducto)
                                    .addComponent(jTCantidad)
                                    .addComponent(jTIdCompra)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdDetalleDeCompra)
                            .addComponent(jTIdDetalleCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCantidad)
                            .addComponent(jTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLPrecioDeCosto))
                    .addComponent(jTPrecioDeCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLIdDeCompra)
                    .addComponent(jTIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLIdDelProducto)
                    .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBModificar)
                    .addComponent(jBRegistrar)
                    .addComponent(jBBuscar))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiarCampos)
                    .addComponent(jBEliminarDetalle)
                    .addComponent(jBSalir))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        
 
        try {

            int cantidad = Integer.parseInt(jTCantidad.getText());
            double precioDeCosto = Double.parseDouble(jTPrecioDeCosto.getText());
            c = cd.buscarCompra(Integer.parseInt(jTIdCompra.getText()));
            p = pd.buscarProducto(Integer.parseInt(jTIdProducto.getText()));

            if (cantidad < 0 || precioDeCosto < 0.0 || c == null || p == null ) {

                JOptionPane.showMessageDialog(this, "no puede haber campos vacíos");

                return;
            }

            cantidad = Integer.parseInt(jTCantidad.getText());
            // Validar que cant sea mayor o igual a cero 
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "Sólo ingrese números enteros");
                return;
            }

            if (precioDeCosto < 0.0) {
                JOptionPane.showMessageDialog(this, "Sólo ingrese números enteros");
                return;
            }
            
           
              
              if(d != null){
               d= new DetalleDeCompra(cantidad, precioDeCosto, c, p);
              deta.registrarDetalleDeCompra(cantidad, precioDeCosto, c, p);
              }
             

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Se ha ingresado un dato incorrecto o hay campos vacios, intente nuevamente");
        }
     
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
     
       String input = jTIdDetalleCompra.getText();
        if (input.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un valor en el campo Id Detalle de Compra.");
        } else {
            try {
                int IdDetalleCompra = Integer.parseInt(jTIdDetalleCompra.getText());

                d = deta.buscarDetalleDeCompra(Integer.parseInt(jTIdDetalleCompra.getText()));
                if (d != null) {

                    jTCantidad.setText(d.getCantidad() + "");
                    jTPrecioDeCosto.setText(d.getPrecioDeCosto() + "");
                    c = d.getCompra();
                    jTIdCompra.setText(c.getIdCompra() + "");
                    p = d.getProducto();
                    jTIdProducto.setText(p.getIdProducto() + "");

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El Id Detalle de Compra solo debe contener números");
                borrarJText();
            }

        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
      if (jTIdDetalleCompra.getText() != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea modificar los datos?");
            if (confirmacion == JOptionPane.YES_OPTION) {
            int a = Integer.parseInt(jTIdDetalleCompra.getText());
            int e = Integer.parseInt(jTCantidad.getText());
            double i = Double.parseDouble(jTPrecioDeCosto.getText());
            int o = Integer.parseInt(jTIdCompra.getText());
            int u = Integer.parseInt(jTIdProducto.getText());
            deta.modificarDetalleDeCompra(a, e, i, o, u);
          
            borrarJText();
            }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDetalleActionPerformed
             if (d != null) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
        
        
        
   int a = Integer.parseInt(jTIdDetalleCompra.getText());
   deta.borrarDetalleDeCompra(a);
   borrarJText ();
      } else {
                // El usuario canceló la eliminación
                // No se realiza ninguna acción adicional
            }
        } else {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un detalle de compra");

        }
   
   
   
    }//GEN-LAST:event_jBEliminarDetalleActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed
     borrarJText();   // TODO add your handling code here:
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminarDetalle;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLIdDeCompra;
    private javax.swing.JLabel jLIdDelProducto;
    private javax.swing.JLabel jLIdDetalleDeCompra;
    private javax.swing.JLabel jLPrecioDeCosto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTCantidad;
    private javax.swing.JTextField jTIdCompra;
    private javax.swing.JTextField jTIdDetalleCompra;
    private javax.swing.JTextField jTIdProducto;
    private javax.swing.JTextField jTPrecioDeCosto;
    // End of variables declaration//GEN-END:variables
private void borrarJText (){
    
    jTIdDetalleCompra.setText("");
    jTCantidad.setText("");
    jTPrecioDeCosto.setText("");
    jTIdCompra.setText("");
    jTIdProducto.setText("");
    
}




}
