/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controller.EspacioController;
import java.awt.Color;

import dto.LoginResponseDTO;
import models.EspacioParqueadero;
import models.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class SlotsView extends javax.swing.JFrame implements ActionListener {

    private JButton[][] botones;
    private EspacioController controlador;
    private LoginResponseDTO usuario;
    private List<EspacioParqueadero> espacios;
    public SlotsView(LoginResponseDTO usuario) {
        initComponents();
        setLocationRelativeTo(null);
        this.botones = new JButton[4][4];
        controlador = new EspacioController();
        dibujarBotones();
        this.usuario = usuario;
        this.espacios = controlador.obtenerTodos(usuario);
        pintarBotones(espacios);
    }

    public void pintarBotones(List<EspacioParqueadero> espacios) {
        for (EspacioParqueadero espacio : espacios) {
            int id = espacio.getNumero() - 1;
            int fila = id / 4;
            int columna = id % 4;

            if (fila < botones.length && columna < botones[0].length) {
                JButton boton = botones[fila][columna];
                if (!espacio.isDisponible()) {
                    boton.setBackground(Color.RED);
                } else {
                    boton.setBackground(Color.GREEN);
                }
            }
        }
    }

    private void dibujarBotones() {
        int separado = 20;
        int ancho = 100;
        int alto = 80;
        int c = 1;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();

                if (j == 0) {
                    botones[i][j].setBounds(
                            ancho * j + separado,
                            alto * i + separado,
                            ancho, alto);
                }
                if (j != 0 && j != botones.length - 1) {
                    botones[i][j].setBounds(
                            ancho * j + (separado * 2),
                            alto * i + separado,
                            ancho, alto);
                }
                if (j == botones.length - 1) {
                    botones[i][j].setBounds(
                            ancho * j + (separado * 3),
                            alto * i + separado,
                            ancho, alto);
                }
                botones[i][j].addActionListener(this);
                botones[i][j].setText(String.valueOf(c));
                slotsPanel.add(botones[i][j]);
                c++;
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
        Menu mn = new Menu(usuario);
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private EspacioParqueadero getEspacio(int numero) {
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getNumero() == numero) {
                return espacio;
            }
        }
        return null;
    }

@Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                    EspacioParqueadero espacio = getEspacio(Integer.parseInt(botones[i][j].getText())); ;
                    if (!espacio.isDisponible() ) {
                        InformacionVehiculoView infov = new InformacionVehiculoView(espacio, espacio.getVehiculo(), usuario);
                        infov.setVisible(true);
                        this.dispose();
                        return;
                    }
                    CrearVehiculoView vc = new CrearVehiculoView(espacio, usuario);
                    vc.setVisible(true);
                    this.dispose();
                    return;
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
