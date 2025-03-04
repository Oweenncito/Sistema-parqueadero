/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author judav
 */
public class MostrarHistorial {
    
    private List<String> historialVehiculos;
    public MostrarHistorial() {
        this.historialVehiculos = new ArrayList<>();
    }
    // Método para agregar un vehículo al historial
    public void agregarRegistro(String registro) {
        historialVehiculos.add(registro);
        JOptionPane.showMessageDialog(null, "Registro agregado al historial", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    // Método para mostrar el historial de vehículos
    public void mostrarHistorial() {
        StringBuilder mensaje = new StringBuilder("--- Historial de vehículos ---\n");
        
        if (historialVehiculos.isEmpty()) {
            mensaje.append("No hay registros en el historial.");
        } else {
            for (String registro : historialVehiculos) {
                mensaje.append("- ").append(registro).append("\n");
            }
        }
        
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Historial de Vehículos", JOptionPane.INFORMATION_MESSAGE);
    }
}
