/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelos.Cliente;
import Servicios.ServicioCliente;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ControladorCliente {
    private ServicioCliente servicioCliente;
    private Scanner scanner;

    public ControladorCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
        this.scanner = new Scanner(System.in);
    }

    public void registrarClienteDesdeConsola() {
        System.out.println("\n--- Registro de Cliente ---");
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese la placa del vehículo: ");
        String placaVehiculo = scanner.nextLine();
        
        Cliente nuevoCliente = new Cliente(nombre, apellido, cedula, telefono, placaVehiculo);
        servicioCliente.registrarCliente(nuevoCliente);
        System.out.println("Registro completado con éxito.");
    }
}
