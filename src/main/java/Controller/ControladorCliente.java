/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Cliente;
import Services.ServicioCliente;

import javax.swing.JOptionPane;

public class ControladorCliente {
    private ServicioCliente servicioCliente;

    public ControladorCliente(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }
    
    public void mostrarVehiculosDesdeConsola() {
        servicioCliente.mostrarVehiculos(); // Llamar al método correcto
    }

    public void registrarClienteDesdeConsola() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");

        if (nombre != null && apellido != null && cedula != null && telefono != null && placaVehiculo != null) {
            Cliente nuevoCliente = new Cliente(nombre, apellido, cedula, telefono, placaVehiculo);
            servicioCliente.registrarCliente(nuevoCliente);
            JOptionPane.showMessageDialog(null, "Registro completado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Registro cancelado o datos inválidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}