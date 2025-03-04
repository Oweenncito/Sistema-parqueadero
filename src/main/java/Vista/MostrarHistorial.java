/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Registro agregado al historial");
    }

    // Método para mostrar el historial de vehículos
    public void mostrarHistorial() {
        System.out.println("\n --- Historial de vehiculos ---");
        if (historialVehiculos.isEmpty()) {
            System.out.println("No hay registros en el historial.");
        } else {
            for (String registro : historialVehiculos) {
                System.out.println("- " + registro);
            }
        }
    }
}
