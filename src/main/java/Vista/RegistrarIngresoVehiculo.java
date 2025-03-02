/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Controlador.ControladorCliente;

/**
 *
 * @author PC
 */
public class RegistrarIngresoVehiculo {
    private ControladorCliente controladorCliente;

    public RegistrarIngresoVehiculo(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }

    public void registrarIngreso() {
        System.out.println("\n=== Registro de Ingreso de Vehículo ===");
        controladorCliente.registrarClienteDesdeConsola();
        System.out.println("El vehículo ha sido registrado exitosamente en el parqueadero.");
    }
}

