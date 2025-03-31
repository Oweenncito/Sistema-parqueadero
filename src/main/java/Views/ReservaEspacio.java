/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author judav
 */
public class ReservaEspacio {
    
    private Map<String, Boolean> espacios;

    public ReservaEspacio() {
        this.espacios = new HashMap<>();
        inicializarEspacios();
    }

    private void inicializarEspacios() {
        for (int i = 1; i <= 20; i++) {
            espacios.put("Espacio-" + i, false); // false indica que el espacio está libre
        }
    }

    public void reservar() {
        String espaciosDisponibles = obtenerEspaciosDisponibles();
        
        if (espaciosDisponibles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay espacios disponibles.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        String espacioSeleccionado = JOptionPane.showInputDialog(null, "Espacios disponibles:\n" + espaciosDisponibles + "\nIngrese el número del espacio a reservar:");
        
        if (espacioSeleccionado == null || espacioSeleccionado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operación cancelada.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String espacio = "Espacio-" + espacioSeleccionado.trim();
        
        if (espacios.containsKey(espacio) && !espacios.get(espacio)) {
            espacios.put(espacio, true);
            JOptionPane.showMessageDialog(null, "Espacio " + espacio + " reservado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Espacio no disponible o ya reservado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String obtenerEspaciosDisponibles() {
        StringBuilder disponibles = new StringBuilder();
        for (Map.Entry<String, Boolean> entry : espacios.entrySet()) {
            if (!entry.getValue()) {
                disponibles.append(entry.getKey().replace("Espacio-", "")).append(", ");
            }
        }
        return disponibles.length() > 0 ? disponibles.substring(0, disponibles.length() - 2) : "";
    }
}

