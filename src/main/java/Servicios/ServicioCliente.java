/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Cliente registrado: " + cliente.getNombre() + ", Placa: " + cliente.getPlacaVehiculo());
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
            System.out.println("Vehículo con placa " + placa + " ha salido del parqueadero.");
            return true;
        } else {
            System.out.println("Vehículo con placa " + placa + " no encontrado.");
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
            System.out.println("No hay vehículos en el parqueadero.");
        } else {
            System.out.println("\n--- Vehículos en el parqueadero ---");
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNombre() + " | Placa: " + cliente.getPlacaVehiculo());
            }
        }
    }
}
