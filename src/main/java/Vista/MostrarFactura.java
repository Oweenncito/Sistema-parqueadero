/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelos.Factura;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class MostrarFactura {
    
    public void mostrarFactura(Factura factura) {
        if (factura == null) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo generar la factura.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Formatear las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // Construir el mensaje de la factura
        String mensaje = "--- FACTURA DE PARQUEADERO ---\n" +
                         "Placa del vehículo: " + factura.getPlacaVehiculo() + "\n" +
                         "Hora de ingreso: " + factura.getHoraIngreso().format(formatter) + "\n" +
                         "Hora de salida: " + factura.getHoraSalida().format(formatter) + "\n" +
                         "Total a pagar: $" + factura.getTotalPagar() + "\n" +
                         "---------------------------------";
        
        // Mostrar la factura en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Factura", JOptionPane.INFORMATION_MESSAGE); 
    }
}

