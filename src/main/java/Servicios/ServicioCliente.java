/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ServicioCliente {
    
    private List<Cliente> clientes;
    private ServicioFactura servicioFactura;

    public ServicioCliente(ServicioFactura servicioFactura) {
        this.clientes = new ArrayList<>();
        this.servicioFactura = servicioFactura;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        servicioFactura.registrarIngreso(cliente.getPlacaVehiculo()); // Registrar la placa en ServicioFactura
        JOptionPane.showMessageDialog(null, "Cliente registrado: " + cliente.getNombre() + ", Placa: " + cliente.getPlacaVehiculo(), "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean registrarSalida(String placa) {
        Cliente clienteEncontrado = null;
        
        for (Cliente cliente : clientes) {
            if (cliente.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            JOptionPane.showMessageDialog(null, "Vehículo con placa " + placa + " ha salido del parqueadero.", "Salida Registrada", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Vehículo con placa " + placa + " no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean existeVehiculo(String placa) {
        for (Cliente cliente : clientes) {
            if (cliente.getPlacaVehiculo().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

    public void mostrarVehiculos() {
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos en el parqueadero.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder listaVehiculos = new StringBuilder("--- Vehículos en el parqueadero ---\n");
            for (Cliente cliente : clientes) {
                listaVehiculos.append("Cliente: ").append(cliente.getNombre())
                        .append(" | Placa: ").append(cliente.getPlacaVehiculo()).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaVehiculos.toString(), "Vehículos en el Parqueadero", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}