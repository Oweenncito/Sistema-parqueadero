/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author judav
 */
public class Factura {
    
    private String placaVehiculo;
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private double totalPagar;

    public Factura(String placaVehiculo, LocalDateTime horaIngreso, LocalDateTime horaSalida, double totalPagar) {
        this.placaVehiculo = placaVehiculo;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.totalPagar = totalPagar;
    }

    public void mostrarFactura() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\n--- FACTURA DE PARQUEADERO ---");
        System.out.println("Placa del vehiculo: " + placaVehiculo);
        System.out.println("Hora de ingreso: " + horaIngreso.format(formatter));
        System.out.println("Hora de salida: " + horaSalida.format(formatter));
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("--------------------------");
    }
}
