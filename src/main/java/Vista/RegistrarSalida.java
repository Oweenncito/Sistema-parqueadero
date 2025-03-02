/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Servicios.ServicioCliente;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class RegistrarSalida {
    private ServicioCliente servicioCliente;
    private Scanner scanner;

    public RegistrarSalida(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
        this.scanner = new Scanner(System.in);
    }

    public void registrarSalida() {
        System.out.println("\n--- Registrar Salida de Vehículo ---");
        System.out.print("Ingrese la placa del vehículo: ");
        String placaVehiculo = scanner.nextLine();

        servicioCliente.registrarSalidaCliente(placaVehiculo);
    }
}