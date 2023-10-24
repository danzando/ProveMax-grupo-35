package Vistas;

import ProvemaxEntidades.Producto;
import provemaxgrupo35.accesoDatos.ProductoData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class productoView extends javax.swing.JInternalFrame {

    private ProductoData proDa;
    private Producto productoActual;

    public productoView(ProductoData proDa) {
        initComponents();
        productoActual= null;
        this.proDa = proDa;
    }

    productoView() {
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLProductos = new javax.swing.JLabel();
        jLIdProducto = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLStock = new javax.swing.JLabel();
        jTIdProducto = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextArea();
        jTPrecio = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jBRegistrar = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLEstado = new javax.swing.JLabel();
        jREstado = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLProductos.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLProductos.setText("Productos");
        jLProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdProducto.setText("Id Producto");

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNombre.setText("Nombre");

        jLDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDescripcion.setText("Descripcion");

        jLPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPrecio.setText("Precio");

        jLStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLStock.setText("Stock");

        jTIdProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdProductoActionPerformed(evt);
            }
        });

        jTNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTDescripcion.setColumns(20);
        jTDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTDescripcion.setRows(5);

        jTPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jBRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBRegistrar.setText("Registrar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jBlimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLEstado.setText("Estado");

        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLProductos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLIdProducto)
                                .addGap(18, 18, 18)
                                .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLDescripcion)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLStock)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addGap(36, 36, 36)
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jREstado)
                                .addGap(323, 323, 323))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLProductos)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBRegistrar)
                                    .addComponent(jLIdProducto)
                                    .addComponent(jTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBlimpiar)
                                    .addComponent(jLNombre)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLDescripcion))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jBEliminar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jBBuscar)
                                            .addComponent(jLPrecio)
                                            .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jBSalir))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(73, 73, 73)
                                                .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jREstado))))
                            .addComponent(jLEstado)))
                    .addComponent(jLStock))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdProductoActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed

        try {
            String nombreDelProducto = jTNombre.getText();
            String descripcion = jTDescripcion.getText();
            double precio = Double.parseDouble(jTPrecio.getText());
            Integer stock = Integer.parseInt(jTStock.getText());

            //  validaciones
            if (nombreDelProducto.isEmpty() || descripcion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos los campos deben completarse");
                return;
            }

            // Validación para campo nombre del producto y descripción
            if (!contieneLetras(nombreDelProducto) || !contieneLetras(descripcion)) {
                JOptionPane.showMessageDialog(this, "El nombre del producto y/o la descripción es invalido/a");
                return;
            }

            // Validación para el campo de precio (double)
            try {
               
                precio = Double.parseDouble(jTPrecio.getText());
                // Validar que precio sea mayor o igual a cero 
                if (precio < 0) {
                    JOptionPane.showMessageDialog(this, "El precio debe ser un número mayor o igual a cero.");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
                return;
            }

            // Validación para el campo de stock (int)
            try {
               //Integer stock = Integer.parseInt(jTStock.getText());
                // Validar que stock sea mayor o igual a cero si es necesario
                if (stock < 0) {
                    JOptionPane.showMessageDialog(this, "El stock debe ser un número entero");
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El stock debe ser un número entero válido.");
                return;
            }

            // Crear o modificar el producto
           
            Boolean estado = jREstado.isSelected();

            if (productoActual == null) {

                productoActual = new Producto(nombreDelProducto, descripcion, precio, stock, estado);
                proDa.registrarProducto(productoActual);
            } else {
                productoActual.setNombreDelProducto(nombreDelProducto);
                productoActual.setDescripcion(descripcion);
                productoActual.setPrecio(precio);
                productoActual.setStock(stock);
                proDa.modificarProducto(productoActual);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese numero válido");

        }

    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jREstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jREstadoActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
               if (productoActual != null) {

            proDa.eliminarProducto(productoActual.getIdProducto());
            productoActual = null;
            limpiarCampos();
        } else {

            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try{
            int idProducto = Integer.parseInt(jTIdProducto.getText());
            
            productoActual=proDa.buscarProducto(idProducto);
            
            if (productoActual != null) {

               
                jTNombre.setText(productoActual.getNombreDelProducto());
                jTDescripcion.setText(productoActual.getDescripcion());
                jTPrecio.setText(String.valueOf(productoActual.getPrecio())); //convertir los valores numéricos en cadenas
                jTStock.setText(String.valueOf(productoActual.getStock()));
                jREstado.setSelected(productoActual.isEstado());
                
                

            }

        
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros válidos");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private boolean contieneLetras(String texto) {
        return texto.matches(".*[a-zA-Z].*");
        //función matches: verifica si la cadena contiene al menos una letra min o may
        //(".*[a-zA-Z].*") punto y asterisco significa: coincide con cero o más ocurrencias
        // de cualquier caracter de la cadena. Puede estar rodeada de otros caracteres(no importa la posicion ni cuantos la rodean)
        // retorna true si encuentra al menos una letra
        //matches es de la clase java.lang.String

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLIdProducto;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLProductos;
    private javax.swing.JLabel jLStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextArea jTDescripcion;
    private javax.swing.JTextField jTIdProducto;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
      jTIdProducto.setText("");
      jTNombre.setText("");
      jTDescripcion.setText("");
      jTPrecio.setText("");
      jTStock.setText("");
      jREstado.setSelected(true);
    }

}
