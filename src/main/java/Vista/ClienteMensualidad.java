/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author usuario
 */

import Modelos.Cliente;
import Servicios.ServicioCliente;
import javax.swing.JOptionPane;

public class ClienteMensualidad {

    private ServicioCliente servicioCliente;

    public ClienteMensualidad(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    public void gestionarClientesMensualidad() {
        boolean continuar = true;
        
        while (continuar) {
            String opcionStr = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Gestión de Clientes con Mensualidad",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Agregar Cliente", "Ver Clientes", "Salir"},
                "Agregar Cliente"
            );

            if (opcionStr == null || opcionStr.equals("Salir")) {
                continuar = false;
                continue;
            }

            switch (opcionStr) {
                case "Agregar Cliente":
                    agregarClienteMensualidad();
                    break;
                case "Ver Clientes":
                    verClientesMensualidad();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void agregarClienteMensualidad() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        if (nombre == null || nombre.trim().isEmpty()) return;

        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        if (apellido == null || apellido.trim().isEmpty()) return;
        
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente:");
        if (cedula == null || cedula.trim().isEmpty()) return;
        
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono del cliente:");
        if (telefono == null || telefono.trim().isEmpty()) return;
        
        String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        if (placa == null || placa.trim().isEmpty()) return;
        
        Cliente nuevoCliente = new Cliente(nombre, apellido, cedula, telefono, placa);
        servicioCliente.agregarClienteMensualidad(nuevoCliente);  // Método que agregará al cliente a la lista

        JOptionPane.showMessageDialog(null, "Cliente agregado al plan mensual: " + nombre, "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void verClientesMensualidad() {
        String listaClientes = servicioCliente.obtenerClientesMensualidad();
        JOptionPane.showMessageDialog(null, listaClientes, "Clientes con Mensualidad", JOptionPane.INFORMATION_MESSAGE);
    }
}
