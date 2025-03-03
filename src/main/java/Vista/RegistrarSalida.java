/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Servicios.ServicioCliente;
import java.util.Scanner;

public class RegistrarSalida {
    private ServicioCliente servicioCliente;
    private Scanner scanner;

    public RegistrarSalida(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
        this.scanner = new Scanner(System.in);
    }

    public void registrarSalida() {
        System.out.print("Ingrese la placa del vehículo que desea salir: ");
        String placa = scanner.nextLine();

        if (servicioCliente.registrarSalida(placa)) {
            System.out.println("Salida registrada exitosamente.");
        } else {
            System.out.println("No se pudo registrar la salida. Verifique la placa.");
        }
    }
}
