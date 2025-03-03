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
public class GenerarReportes {
    
    private List<String> reportes;

    public GenerarReportes() {
        this.reportes = new ArrayList<>();
    }

    // Método para agregar un reporte
    public void agregarReporte(String reporte) {
        reportes.add(reporte);
        System.out.println("Reporte agregado exitosamente.");
    }

    // Método para mostrar todos los reportes generados
    public void mostrarReportes() {
        System.out.println("\n--- Reportes de parqueadero ---");
        if (reportes.isEmpty()) {
            System.out.println("No hay reportes disponibles.");
        } else {
            for (String reporte : reportes) {
                System.out.println("-" + reporte);
            }
        }
    }
}
