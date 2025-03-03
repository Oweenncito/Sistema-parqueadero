/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Vista.Factura;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author judav
 */
public class ServicioFactura {
    
    private static final double TARIFA_POR_HORA = 5.0; // Precio por hora en dólares
    private Map<String, LocalDateTime> registroVehiculos;

    public ServicioFactura() {
        this.registroVehiculos = new HashMap<>();
    }

    // Método para registrar la hora de ingreso de un vehículo
    public void registrarIngreso(String placa) {
        registroVehiculos.put(placa, LocalDateTime.now());
        System.out.println("Ingreso registrado para el vehiculo con placa: " + placa);
    }

    // Método para generar la factura al salir un vehículo
    public Factura generarFactura(String placa) {
        LocalDateTime horaIngreso = registroVehiculos.get(placa);
        
        if (horaIngreso == null) {
            System.out.println("Error: No hay registro de ingreso para la placa " + placa);
            return null;
        }

        LocalDateTime horaSalida = LocalDateTime.now();
        long horasEstacionado = Duration.between(horaIngreso, horaSalida).toHours();
        if (horasEstacionado == 0) {
            horasEstacionado = 1; // Cobro mínimo de una hora
        }
        double totalPagar = horasEstacionado * TARIFA_POR_HORA;

        // Crear la factura y mostrarla
        Factura factura = new Factura(placa, horaIngreso, horaSalida, totalPagar);
        factura.mostrarFactura();

        // Remover el vehículo del registro
        registroVehiculos.remove(placa);
        
        return factura;
    }
}
