/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Factura;
import Vista.MostrarFactura;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author judav
 */
public class ServicioFactura {
    
    private static final double TARIFA_POR_HORA = 5.0;
    private Map<String, LocalDateTime> registroVehiculos;
    
    public ServicioFactura() {
        this.registroVehiculos = new HashMap<>();
    }

    public Factura generarFactura(String placa) {
        JOptionPane.showMessageDialog(null, "Intentando generar factura para la placa: " + placa, "Generación de Factura", JOptionPane.INFORMATION_MESSAGE);
        
        if (!registroVehiculos.containsKey(placa)) {
            JOptionPane.showMessageDialog(null, "Error: No hay registro de ingreso para la placa " + placa, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        LocalDateTime horaIngreso = registroVehiculos.get(placa);
        LocalDateTime horaSalida = LocalDateTime.now();
        long horasEstacionado = Duration.between(horaIngreso, horaSalida).toHours();
        if (horasEstacionado == 0) {
            horasEstacionado = 1; // Cobro mínimo de una hora
        }
        double totalPagar = horasEstacionado * TARIFA_POR_HORA;

        Factura factura = new Factura(placa, horaIngreso, horaSalida, totalPagar);
        new MostrarFactura().mostrarFactura(factura);
        
        registroVehiculos.remove(placa);
        
        return factura;
    }

    public void registrarIngreso(String placa) {
        registroVehiculos.put(placa, LocalDateTime.now());
        JOptionPane.showMessageDialog(null, "Vehículo con placa " + placa + " registrado exitosamente.", "Registro de Ingreso", JOptionPane.INFORMATION_MESSAGE);
    }
}
