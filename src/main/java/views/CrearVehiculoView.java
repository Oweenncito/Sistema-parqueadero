/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.EspacioController;
import controller.VehiculoController;
import dto.LoginResponseDTO;
import models.EspacioParqueadero;
import models.Usuario;
import models.Vehiculo;

import javax.swing.*;
import java.time.LocalDateTime;

/**
 * @author aleevcx
 */
public class CrearVehiculoView extends javax.swing.JFrame {

    EspacioController espacioController;
    VehiculoController vehiculoController;
    EspacioParqueadero espacio;
    private LoginResponseDTO usuario;

    public CrearVehiculoView(EspacioParqueadero espacioParqueadero, LoginResponseDTO usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        espacioController = new EspacioController();
        vehiculoController = new VehiculoController();
        this.espacio = espacioParqueadero;
        this.usuario = usuario;
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
        registerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        placaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        colorField = new javax.swing.JTextField();
        typeField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        marcaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerButton.setText("Agregar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Registrar salida");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Volver");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        placaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Placa");

        jLabel2.setText("Color");

        colorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorFieldActionPerformed(evt);
            }
        });

        typeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Carro", "Moto"}));

        jLabel3.setText("Tipo");

        jLabel4.setText("Marca");

        jLabel5.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\Images\\aparcamiento.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(marcaField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(colorField, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(typeField, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE))
                                                        .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5))
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(registerButton)
                                        .addComponent(exitButton)
                                        .addComponent(returnButton))
                                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String color = colorField.getText();
        String marca = marcaField.getText();
        String placa = placaField.getText();
        String type = typeField.getSelectedItem().toString();
        Vehiculo vehiculo = new Vehiculo(placa, type, marca, color);
        vehiculo.setUsuario(usuario.getUser());
        espacioController.ingresarVehiculo(vehiculo, espacio.getNumero(), usuario);
        JOptionPane.showMessageDialog(this, "Vehiculo agregado com sucesso!");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        SlotsView slotsView = new SlotsView(usuario);
        slotsView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void placaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaFieldActionPerformed

    private void colorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField colorField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marcaField;
    private javax.swing.JTextField placaField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JComboBox<String> typeField;
    // End of variables declaration//GEN-END:variables
}
