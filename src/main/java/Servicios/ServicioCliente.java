/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ServicioCliente {
    
    private List<Cliente> clientes;
    private List<Cliente> clientesMensualidad;
    private ServicioFactura servicioFactura;
    private Map<String, LocalDate> registroIngresos; // Mapa para almacenar las fechas de ingreso por placa

    public ServicioCliente(ServicioFactura servicioFactura) {
        this.clientes = new ArrayList<>();
        this.clientesMensualidad = new ArrayList<>();
        this.servicioFactura = servicioFactura;
        this.registroIngresos = new HashMap<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        servicioFactura.registrarIngreso(cliente.getPlacaVehiculo()); // Registrar la placa en ServicioFactura
        registroIngresos.put(cliente.getPlacaVehiculo(), LocalDate.now()); // Guardar fecha de ingreso

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
            registroIngresos.remove(placa); // Eliminar la placa del registro de ingresos
            JOptionPane.showMessageDialog(null, "Vehículo con placa " + placa + " ha salido del parqueadero.", "Salida Registrada", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Vehículo con placa " + placa + " no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public int obtenerCarrosIngresadosHoy() {
        LocalDate hoy = LocalDate.now();
        int contador = 0;

        for (LocalDate fechaIngreso : registroIngresos.values()) {
            if (fechaIngreso.equals(hoy)) {
                contador++;
            }
        }
        return contador;
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

    public void agregarClienteMensualidad(Cliente cliente) {
        clientesMensualidad.add(cliente);
    }

    public String obtenerClientesMensualidad() {
        if (clientesMensualidad.isEmpty()) {
            return "No hay clientes registrados con mensualidad.";
        }

        StringBuilder lista = new StringBuilder("--- Clientes con Mensualidad ---\n");
        for (Cliente cliente : clientesMensualidad) {
            lista.append("Nombre: ").append(cliente.getNombre()).append(" | Placa: ").append(cliente.getPlacaVehiculo()).append("\n");
        }
        return lista.toString();
    }
}
