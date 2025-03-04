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
public class GenerarReportes {
    
     private List<String> reportes;

    public GenerarReportes() {
        this.reportes = new ArrayList<>();
    }

    // Método para agregar un reporte
    public void agregarReporte(String reporte) {
        reportes.add(reporte);
        JOptionPane.showMessageDialog(null, "Reporte agregado exitosamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar todos los reportes generados
    public void mostrarReportes() {
        if (reportes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay reportes disponibles.", "Reportes", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder listaReportes = new StringBuilder("--- Reportes de parqueadero ---\n");
            for (String reporte : reportes) {
                listaReportes.append("- ").append(reporte).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaReportes.toString(), "Reportes", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
