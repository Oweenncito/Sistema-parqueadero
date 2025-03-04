/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicios.ServicioFactura;
import javax.swing.JOptionPane;

public class ControladorFactura {
    private ServicioFactura servicioFactura;

    public ControladorFactura(ServicioFactura servicioFactura) {
        this.servicioFactura = servicioFactura;
    }

    public void generarFactura() {
        String placaFactura = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");

        if (placaFactura != null && !placaFactura.trim().isEmpty()) {
            servicioFactura.generarFactura(placaFactura);
        } else {
            JOptionPane.showMessageDialog(null, "Placa inválida o operación cancelada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}