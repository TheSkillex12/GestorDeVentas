package me.chelo.ventas.igu;

import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import me.chelo.ventas.logica.Controladora;

/**
 *
 * @author chelo
 */
public class AgregarProducto extends javax.swing.JFrame {

    private Controladora control = new Controladora();
    
    /**
     * Creates new form AgregarProducto
     */
    public AgregarProducto() {
        initComponents();
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
                }
            }
        });
        
        // Establecer el foco en el panel principal para que pueda recibir eventos de teclado
        setFocusable(true);
        requestFocusInWindow();
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
                }
            }
        });
        
        // Establecer el foco en el panel principal para que pueda recibir eventos de teclado
        txtCantidad.setFocusable(true);
        txtCantidad.requestFocusInWindow();
        txtMetodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
                }
            }
        });
        
        // Establecer el foco en el panel principal para que pueda recibir eventos de teclado
        txtMetodo.setFocusable(true);
        txtMetodo.requestFocusInWindow();
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
                }
            }
        });
        
        // Establecer el foco en el panel principal para que pueda recibir eventos de teclado
        txtPrecio.setFocusable(true);
        txtPrecio.requestFocusInWindow();
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
                }
            }
        });
        
        // Establecer el foco en el panel principal para que pueda recibir eventos de teclado
        txtProducto.setFocusable(true);
        txtProducto.requestFocusInWindow();
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
        jPanel2 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtMetodo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        jLabel2.setText("Producto");

        jLabel3.setText("Metodo Pago");

        jLabel4.setText("Precio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMetodo)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("AGREGAR PRODUCTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(txtProducto.getText().length() > 0 && txtPrecio.getText().length() > 0){
            control.crearProducto(txtCantidad.getText(), txtProducto.getText(), txtMetodo.getText(), Double.parseDouble(txtPrecio.getText()));
            getContentPane().setVisible(false);
        }else{
            JOptionPane jp = new JOptionPane("El campo PRODUCTO y/o PRECIO estan vacios!\nIngrese datos validos.");
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog d = jp.createDialog("Ventas - Kisoco");
            d.setAlwaysOnTop(true);
            d.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        System.out.println("hola");
    }//GEN-LAST:event_jButton1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println("hola");

    }//GEN-LAST:event_formKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("hola");
        }
    }//GEN-LAST:event_jPanel1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMetodo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
