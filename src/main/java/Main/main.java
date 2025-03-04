/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.ControladorCliente;
import Controlador.ControladorFactura;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Servicios.ServicioCliente;
import Servicios.ServicioFactura;
import Vista.ConsultarTarifas;
import Vista.GenerarReportes;
import Vista.MostrarHistorial;
import Vista.MostrarVehiculos;
import Vista.RegistrarIngresoVehiculo;
import Vista.RegistrarSalida;
import Vista.ReservaEspacio;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ServicioFactura servicioFactura = new ServicioFactura();
    private static final ServicioCliente servicioCliente = new ServicioCliente(servicioFactura);
    private static final ControladorCliente controladorCliente = new ControladorCliente(servicioCliente);
    private static final ControladorFactura controladorFactura = new ControladorFactura(servicioFactura );
    private static final RegistrarSalida registrarSalida = new RegistrarSalida(servicioCliente);
    private static final ConsultarTarifas moto = new ConsultarTarifas("Moto", 2.0, 15.0);
    private static final ConsultarTarifas carro = new ConsultarTarifas("Carro", 5.0, 35.0);
    private static final ReservaEspacio reserva = new ReservaEspacio();
    private static final RegistrarIngresoVehiculo registrarIngreso = new RegistrarIngresoVehiculo(controladorCliente);
    private static final GenerarReportes generarReportes = new GenerarReportes ();
    private static final MostrarHistorial mostrarHistorial = new MostrarHistorial ();

   public static void main(String[] args) {
        boolean ejecutando = true;
        
        while (ejecutando) {
            String opcionStr = JOptionPane.showInputDialog(null,
                    "--- Sistema de Parqueadero ---\n" +
                    "1. Registrar ingreso de vehículo\n" +
                    "2. Registrar salida de vehículo\n" +
                    "3. Mostrar vehículos en el parqueadero\n" +
                    "4. Consultar tarifas\n" +
                    "5. Generar factura\n" +
                    "6. Reservar espacio\n" +
                    "7. Generar reportes\n" +
                    "8. Mostrar historial de vehículos\n" +
                    "9. Configuración de administración\n" +
                    "10. Configuración general\n" +
                    "11. Salir\n" +
                    "Seleccione una opción:", "Menú Principal", JOptionPane.QUESTION_MESSAGE);
            
            if (opcionStr == null) {
                continue;
            }
            
            try {
                int opcion = Integer.parseInt(opcionStr);
                
                switch (opcion) {
                    case 1:
                        registrarIngreso.registrar();
                        break;
                    case 2:
                        registrarSalida.registrarSalida();
                        break;
                    case 3:
                        MostrarVehiculos.mostrar(controladorCliente);
                        break;
                    case 4:
                   ConsultarTarifas.consultarTarifas(moto, carro);
                        break;
                    case 5:
                        controladorFactura.generarFactura();
                        break;
                    case 6:
                        reserva.reservar();
                        break;
                    case 7:
                        generarReportes.mostrarReportes();
                        break;
                    case 8:
                        mostrarHistorial.mostrarHistorial();
                        break;
                    case 9:
                       configuracionAdministracion();
                        break;
                    case 10:
                         clienteMensualidad ();
                        break;
                    case 11:
                        ejecutando = false;
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...", "Salida", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    
}