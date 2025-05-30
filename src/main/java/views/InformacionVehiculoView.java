/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.EspacioController;

import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import dto.LoginResponseDTO;
import models.EspacioParqueadero;
import models.Usuario;
import models.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;


public class InformacionVehiculoView extends javax.swing.JFrame {

    private EspacioController espacioController;
    private Vehiculo vehiculo;
    private EspacioParqueadero espacio;
    private LoginResponseDTO usuario;

    public InformacionVehiculoView(EspacioParqueadero espacio, Vehiculo vehiculo, LoginResponseDTO usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.espacioController = new EspacioController();
        this.vehiculo = vehiculo;
        this.espacio = espacio;
        this.usuario = usuario;
        mostrarInformacionVehiculo();
    }

    private void mostrarInformacionVehiculo() {
        jLabelTipoVehiculo.setText(espacio.getVehiculo().getTipo());
        jLabelPlaca.setText(espacio.getVehiculo().getPlaca());
        jLabelMarca.setText(espacio.getVehiculo().getMarca());
        jLabelColor.setText(espacio.getVehiculo().getColor());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String horaFormateada = espacio.getVehiculo().getHoraEntrada().format(formatter);
        jLabelHoraEntrada.setText(horaFormateada);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelTipoVehiculo = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelColor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelHoraEntrada = new javax.swing.JLabel();
        botonDesocupar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Regresar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("tipo vehiculo:");

        jLabel2.setText("Placa:");

        jLabelTipoVehiculo.setText("jLabel3");

        jLabelPlaca.setText("jLabel3");

        jLabel4.setText("Marca:");

        jLabelMarca.setText("jLabel5");

        jLabel6.setText("Color:");

        jLabelColor.setText("jLabel7");

        jLabel3.setText("HoraEntrada");

        jLabelHoraEntrada.setText("jLabel5");

        botonDesocupar.setText("desocupar");
        botonDesocupar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesocuparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(166, Short.MAX_VALUE)
                                .addComponent(botonDesocupar)
                                .addGap(59, 59, 59)
                                .addComponent(jToggleButton1)
                                .addGap(15, 15, 15))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabelPlaca)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabelTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabelMarca)
                                                        .addComponent(jLabelColor))
                                                .addGap(38, 38, 38)))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabelHoraEntrada))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTipoVehiculo)
                                        .addComponent(jLabelHoraEntrada))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMarca)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jToggleButton1)
                                        .addComponent(botonDesocupar))
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        SlotsView sv = new SlotsView(usuario);
        sv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void botonDesocuparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesocuparActionPerformed

        if (!espacio.isDisponible() && espacio.getVehiculo() != null) {
            espacioController.desocuparEspacio(espacio.getNumero(), usuario);
            espacio.setDisponible(true);
            espacio.setVehiculo(null);
        }

        JOptionPane.showMessageDialog(this, "El espacio ha sido desocupado con éxito.");
    }//GEN-LAST:event_botonDesocuparActionPerformed


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDesocupar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelHoraEntrada;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelTipoVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
