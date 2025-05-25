/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.EspacioController;
import java.awt.Color;
import models.EspacioParqueadero;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SlotsView extends javax.swing.JFrame implements ActionListener {

    private JButton[][] botones;
    private EspacioController controlador;
    public SlotsView() {
        initComponents();
        setLocationRelativeTo(null);
        this.botones = new JButton[4][4];
        controlador = new EspacioController();
        dibujarBotones();
        pintarBotones(controlador.obtenerTodos());
    }

public void pintarBotones(List<EspacioParqueadero> espacios) {
    if (espacios == null || espacios.isEmpty()) {
        // Pintar todo como libre
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j].setBackground(Color.GRAY);
                botones[i][j].setForeground(Color.BLACK);
            }
        }
        return;
    }

    // Pintar según el estado de cada espacio
    for (EspacioParqueadero espacio : espacios) {
        int id = espacio.getNumero();
        int fila = id / 4;
        int columna = id % 4;

        if (fila < botones.length && columna < botones[0].length) {
            JButton boton = botones[fila][columna];
            if (espacio.isDisponible()) {
                boton.setBackground(Color.BLUE);
                boton.setForeground(Color.WHITE);
            } else {
                boton.setBackground(Color.GRAY);
                boton.setForeground(Color.BLACK);
            }
        }
    }
}
    private void dibujarBotones() {
        int separado = 20;
        int ancho = 100;
        int alto = 80;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();

                if (j == 0){
                    botones[i][j].setBounds(
                            ancho * j + separado,
                            alto * i + separado,
                            ancho, alto);
                }
                if (j != 0 && j != botones.length -1){
                    botones[i][j].setBounds(
                            ancho * j + (separado*2),
                            alto * i + separado,
                            ancho, alto);
                }
                if (j == botones.length -1){
                    botones[i][j].setBounds(
                            ancho * j + (separado *3),
                            alto * i + separado,
                            ancho, alto);
                }
                botones[i][j].addActionListener(this);
                slotsPanel.add(botones[i][j]);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slotsPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout slotsPanelLayout = new javax.swing.GroupLayout(slotsPanel);
        slotsPanel.setLayout(slotsPanelLayout);
        slotsPanelLayout.setHorizontalGroup(
            slotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slotsPanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        slotsPanelLayout.setVerticalGroup(
            slotsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slotsPanelLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slotsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(slotsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource().equals(botones[i][j])) {
//                    EspacioParqueadero espacio = controlador.getEspacio(i, j);
//                    CrearVehiculoView vc = new CrearVehiculoView(espacio);
//                    vc.setVisible(true);
//                    this.dispose();
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel slotsPanel;
    // End of variables declaration//GEN-END:variables

}
