/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelos.Factura;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import Modelos.Cliente;
/**
 *
 * @author judav
 */
public class MostrarFactura {
    
    public void mostrarFactura(Factura factura) {
        if (factura == null) {
            System.out.println("Error: No se pudo generar la factura.");
            return;
        }
        
        // Formatear las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("\n--- FACTURA DE PARQUEADERO ---");
        System.out.println("Placa del vehículo: " + factura.getPlacaVehiculo());
        System.out.println("Hora de ingreso: " + factura.getHoraIngreso().format(formatter));
        System.out.println("Hora de salida: " + factura.getHoraSalida().format(formatter));
        System.out.println("Total a pagar: $" + factura.getTotalPagar());
        System.out.println("---------------------------------");
    }
}
