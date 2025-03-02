/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Controlador.ControladorCliente;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class RegistrarIngresoVehiculo {
    private ControladorCliente controladorCliente;
    private Scanner scanner;

    public RegistrarIngresoVehiculo(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
        this.scanner = new Scanner(System.in);
    }

    public void registrar() {
        controladorCliente.registrarClienteDesdeConsola();
    }
}

