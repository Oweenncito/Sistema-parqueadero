/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author judav
 */
public class ReservaEspacio {
    
     private Map<String, Boolean> espacios;
    private Scanner scanner;

    public ReservaEspacio() {
        this.espacios = new HashMap<>();
        this.scanner = new Scanner(System.in);
        inicializarEspacios();
    }

    private void inicializarEspacios() {
        for (int i = 1; i <= 20; i++) {
            espacios.put("Espacio-" + i, false); // false indica que el espacio está libre
        }
    }

    public void reservar() {
        System.out.println("\n--- Reservar Espacio de Parqueadero ---");
        mostrarEspaciosDisponibles();
        System.out.print("Ingrese el número del espacio a reservar: ");
        String espacio = "Espacio-" + scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        
        if (espacios.containsKey(espacio) && !espacios.get(espacio)) {
            espacios.put(espacio, true);
            System.out.println("Espacio " + espacio + " reservado con éxito.");
        } else {
            System.out.println("Error: Espacio no disponible o ya reservado.");
        }
    }

    private void mostrarEspaciosDisponibles() {
        System.out.println("Espacios disponibles:");
        for (Map.Entry<String, Boolean> entry : espacios.entrySet()) {
            if (!entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }
}
