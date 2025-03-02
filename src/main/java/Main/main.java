/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ControladorCliente;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Servicios.ServicioCliente;
import Vista.RegistrarIngresoVehiculo;
import Vista.RegistrarSalida;
/**
 *
 * @author PC
 */
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ServicioCliente servicioCliente = new ServicioCliente();
    private static final ControladorCliente controladorCliente = new ControladorCliente(servicioCliente);
    private static final RegistrarIngresoVehiculo registrarIngreso = new RegistrarIngresoVehiculo(controladorCliente);
    private static final RegistrarSalida registrarSalida = new RegistrarSalida(servicioCliente);

    public static void main(String[] args) {
        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n--- Sistema de Parqueadero ---");
            System.out.println("1. Registrar ingreso de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Mostrar vehículos en el parqueadero");
            System.out.println("4. Consultar tarifas");
            System.out.println("5. Generar factura");
            System.out.println("6. Reservar espacio");
            System.out.println("7. Generar reportes");
            System.out.println("8. Mostrar historial de vehículos");
            System.out.println("9. Configuración de administración");
            System.out.println("10. Configuración general");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer


            switch (opcion) {
                case 1:
                      registrarIngreso.registrar();
                    break;
                case 2:
           registrarSalida.registrarSalida();
                    break;
                case 3:
               
                    break;
                case 4:
                  
                    break;
                case 5:
             
                    break;
                case 6:
                 
                    break;
                case 7:
                 
                    break;
                case 8:
                   
                    break;
                case 9:
                    
                    break;
                case 10:
               
                    break;
                case 11:
                    ejecutando = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
