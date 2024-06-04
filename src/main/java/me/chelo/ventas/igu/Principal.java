/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.chelo.ventas.igu;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import me.chelo.ventas.logica.Controladora;
import me.chelo.ventas.logica.Vendedor;

/**
 *
 * @author chelo
 */
public class Principal extends javax.swing.JFrame {
    
    private Controladora control = new Controladora();

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Soloist Halftone 2", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("VENTAS KIOSCO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        btnIngresar.setFont(new java.awt.Font("Usuzi Condensed", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 153, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Developed by Santiago Toara - 2024");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String entrada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        
        Vendedor vendedor = control.traerVendedor(nombre, apellido);
        
        if(txtNombre.getText().length() > 0 || txtApellido.getText().length() > 0){
            if(control.checkCajaAbierta()){
                if(vendedor != null && vendedor.isCajaAbierta()){
                    //reanudar su caja abierta
                    System.out.println("abrimos tu caja de nuevo");
                    mostrarMensaje("Bienvenido de nuevo "+nombre+" :)\n Reanudamos tu caja abierta!", "Ventas - Kiosco", "INFO");
                    ListaVentas lv = new ListaVentas(vendedor);
                    lv.setVisible(true);
                    lv.setResizable(false);
                    lv.setLocationRelativeTo(null);
                    dispose();
                }else{
                    //dar aviso de que entre con la cuenta que tiene la caja abierta
                    for(Vendedor v : control.traerVendedores()){
                        if(v.isCajaAbierta()){
                            vendedor = v;
                        }
                    }
                    mostrarMensaje("Ya hay una caja abierta.\n Por favor ingrese con el usuario:\n ["+vendedor.getNombre()+" "+vendedor.getApellido()+"]", "Ventas - Kiosco", "ERROR");
                }
            }else{
                if(vendedor == null){
                    //crear nuevo vendedor y abrir su caja
                    System.out.println("eres nuevo, bienvenido!");
                    control.crearVendedor(nombre, apellido, entrada, true);
                    vendedor = control.traerVendedor(nombre, apellido);
                    mostrarMensaje("Bienvenido "+nombre+" :)\nQue tengas buenas ventas!", "Ventas - Kiosco", "INFO");
                    ListaVentas lv = new ListaVentas(vendedor);
                    lv.setVisible(true);
                    lv.setResizable(false);
                    lv.setLocationRelativeTo(null);
                    dispose();
                }else{
                    //dar bienvenida y que tenga buenas ventas, abrir caja
                    System.out.println("bienvenido de nuevo, tengas buenas ventas");
                    mostrarMensaje("Bienvenido de nuevo "+nombre+" :)\nQue tengas buenas ventas!", "Ventas - Kiosco", "INFO");
                    vendedor.setEntrada(entrada);
                    vendedor.setCajaAbierta(true);
                    control.editarVendedor(vendedor);
                    ListaVentas lv = new ListaVentas(vendedor);
                    lv.setVisible(true);
                    lv.setResizable(false);
                    lv.setLocationRelativeTo(null);
                    dispose();
                }
            }
        }else{
            mostrarMensaje("Por favor complete los datos!", "Ventas - Kiosco", "ERROR");
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void mostrarMensaje(String msg, String titulo, String tipo){
        JOptionPane jp = new JOptionPane(msg);
        if(tipo.equalsIgnoreCase("info")){
            jp.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equalsIgnoreCase("error")){
            jp.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog d = jp.createDialog(titulo);
        d.setAlwaysOnTop(true);
        d.setVisible(true);
    }

}
