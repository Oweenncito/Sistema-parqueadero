/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Servicios.ServicioCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ConfiguracionAdministracion {
    public static void configuracionAdministracion(ServicioCliente servicioCliente) {
    String[] opciones = {"Gestionar Empleados", "Carros ingresados hoy", "Salir"};
    
    boolean continuar = true;
    while (continuar) {
        String opcionStr = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Configuración de Administración",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (opcionStr == null || opcionStr.equals("Salir")) {
            continuar = false;
            continue;
        }

        switch (opcionStr) {
            case "Gestionar Empleados":
                gestionarEmpleados();
                break;
            case "Carros ingresados hoy":
                mostrarCarrosIngresadosHoy(servicioCliente);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private static void gestionarEmpleados() {
    JOptionPane.showMessageDialog(null, "Aquí puedes agregar o eliminar empleados.", "Gestión de Empleados", JOptionPane.INFORMATION_MESSAGE);
}

private static void mostrarCarrosIngresadosHoy(ServicioCliente servicioCliente) {
    int cantidadCarros = servicioCliente.obtenerCarrosIngresadosHoy();
    JOptionPane.showMessageDialog(null, "Cantidad de carros ingresados hoy: " + cantidadCarros, "Registro de Ingresos", JOptionPane.INFORMATION_MESSAGE);
}
}
