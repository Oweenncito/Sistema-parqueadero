/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Views;

import Controller.ControladorCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RegistrarIngresoVehiculo {
    private ControladorCliente controladorCliente;

    public RegistrarIngresoVehiculo(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }

    public void registrar() {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea registrar un nuevo cliente?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            controladorCliente.registrarClienteDesdeConsola();
        } else {
            JOptionPane.showMessageDialog(null, "Registro cancelado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
