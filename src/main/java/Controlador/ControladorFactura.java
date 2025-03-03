/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author PC
 */
import Servicios.ServicioFactura;
import java.util.Scanner;

public class ControladorFactura {
    private ServicioFactura servicioFactura;
    private Scanner scanner;

    public ControladorFactura(ServicioFactura servicioFactura, Scanner scanner) {
        this.servicioFactura = servicioFactura;
        this.scanner = scanner;
    }

    public void generarFactura() {
        System.out.print("Ingrese la placa del vehículo: ");
        String placaFactura = scanner.nextLine(); // Capturar la placa
        servicioFactura.generarFactura(placaFactura); // Llamada correcta al método en ServicioFactura
    }
}