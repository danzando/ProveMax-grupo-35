/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import provemaxgrupo35.accesoDatos.ProductoData;

/**
 *
 * @author usuario
 */
public class MenuView extends javax.swing.JFrame {

    private ProductoData proDa;
    
    public MenuView() {
        initComponents();
        proDa = new ProductoData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMproducto = new javax.swing.JMenu();
        jMenuItemGestionProductos = new javax.swing.JMenuItem();
        jMenuItemProductosXproveedor = new javax.swing.JMenuItem();
        jMStockProductos = new javax.swing.JMenuItem();
        jMproveedores = new javax.swing.JMenu();
        jMenuItemGestionProveedores = new javax.swing.JMenuItem();
        jMcompras = new javax.swing.JMenu();
        jMenuItemRegistroCompras = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemDetalleCompras = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        escritorio.setForeground(new java.awt.Color(102, 102, 0));
        escritorio.setDesktopManager(null);
        escritorio.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        escritorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        escritorio.setInheritsPopupMenu(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, escritorio, org.jdesktop.beansbinding.ELProperty.create("${background}"), escritorio, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1032, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMproducto.setText("PRODUCTOS");
        jMproducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemGestionProductos.setText("Gestion de Productos");
        jMenuItemGestionProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionProductosActionPerformed(evt);
            }
        });
        jMproducto.add(jMenuItemGestionProductos);

        jMenuItemProductosXproveedor.setText("Producto por Proveedor");
        jMenuItemProductosXproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosXproveedorActionPerformed(evt);
            }
        });
        jMproducto.add(jMenuItemProductosXproveedor);

        jMStockProductos.setText("Stock de Productos");
        jMStockProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMStockProductosActionPerformed(evt);
            }
        });
        jMproducto.add(jMStockProductos);

        jMenuBar1.add(jMproducto);

        jMproveedores.setText("PROVEEDORES");
        jMproveedores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemGestionProveedores.setText("Gestion de Proveedores");
        jMenuItemGestionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGestionProveedoresActionPerformed(evt);
            }
        });
        jMproveedores.add(jMenuItemGestionProveedores);

        jMenuBar1.add(jMproveedores);

        jMcompras.setText("COMPRAS");
        jMcompras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemRegistroCompras.setText("Registro de Compras");
        jMenuItemRegistroCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroComprasActionPerformed(evt);
            }
        });
        jMcompras.add(jMenuItemRegistroCompras);
        jMcompras.add(jSeparator2);

        jMenuItemDetalleCompras.setText("Detalle de Compras");
        jMenuItemDetalleCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDetalleComprasActionPerformed(evt);
            }
        });
        jMcompras.add(jMenuItemDetalleCompras);

        jMenuBar1.add(jMcompras);

        jMsalir.setText("SALIR");
        jMsalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMsalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1048, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemGestionProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ProductoView prodView = new ProductoView(proDa);
        prodView.setVisible(true);
        escritorio.add(prodView);
        escritorio.moveToFront(prodView);
    }//GEN-LAST:event_jMenuItemGestionProductosActionPerformed

    private void jMenuItemGestionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGestionProveedoresActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        ProveedorView proveeView = new ProveedorView();
        proveeView.setVisible(true);
        escritorio.add(proveeView);
        escritorio.moveToFront(proveeView);
    }//GEN-LAST:event_jMenuItemGestionProveedoresActionPerformed

    private void jMenuItemDetalleComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDetalleComprasActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        DetallesDeCompraView DcomprasView = new DetallesDeCompraView();
        DcomprasView.setVisible(true);
        escritorio.add(DcomprasView);
        escritorio.moveToFront(DcomprasView);
    }//GEN-LAST:event_jMenuItemDetalleComprasActionPerformed

    private void jMenuItemRegistroComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroComprasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ComprasView comprasView = new ComprasView();
        comprasView.setVisible(true);
        escritorio.add(comprasView);
        escritorio.moveToFront(comprasView);
    }//GEN-LAST:event_jMenuItemRegistroComprasActionPerformed

    private void jMenuItemProductosXproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosXproveedorActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        ProductoProveedorView prodProveView = new ProductoProveedorView();
        prodProveView.setVisible(true);
        escritorio.add(prodProveView);
        escritorio.moveToFront(prodProveView);
    }//GEN-LAST:event_jMenuItemProductosXproveedorActionPerformed

    private void jMsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMsalirMouseClicked
        dispose();
    }//GEN-LAST:event_jMsalirMouseClicked

    private void jMStockProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMStockProductosActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        StockDeProductoView sdp= new StockDeProductoView();
        sdp.setVisible(true);
        escritorio.add(sdp);
        escritorio.moveToFront(sdp);
    }//GEN-LAST:event_jMStockProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMStockProductos;
    private javax.swing.JMenu jMcompras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemDetalleCompras;
    private javax.swing.JMenuItem jMenuItemGestionProductos;
    private javax.swing.JMenuItem jMenuItemGestionProveedores;
    private javax.swing.JMenuItem jMenuItemProductosXproveedor;
    private javax.swing.JMenuItem jMenuItemRegistroCompras;
    private javax.swing.JMenu jMproducto;
    private javax.swing.JMenu jMproveedores;
    private javax.swing.JMenu jMsalir;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
