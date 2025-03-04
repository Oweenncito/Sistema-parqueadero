/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Servicios.ServicioCliente;
import javax.swing.JOptionPane;

public class RegistrarSalida {
    private ServicioCliente servicioCliente;

    public RegistrarSalida(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public void registrarSalida() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo que desea salir:");
        
        if (placa != null && !placa.trim().isEmpty()) {
            if (servicioCliente.registrarSalida(placa)) {
                JOptionPane.showMessageDialog(null, "Salida registrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la salida. Verifique la placa.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada o placa inválida.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}

