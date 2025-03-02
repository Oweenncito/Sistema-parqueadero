/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author PC
 */

public class ServicioCliente {
    private List<Cliente> clientes;

    public ServicioCliente() {
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre() + " - Vehículo: " + cliente.getPlacaVehiculo());
    }

    public void registrarSalidaCliente(String placaVehiculo) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getPlacaVehiculo().equalsIgnoreCase(placaVehiculo)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            clientes.remove(clienteEncontrado);
            System.out.println("Salida registrada para el vehículo con placa: " + placaVehiculo);
        } else {
            System.out.println("No se encontró un vehículo con la placa ingresada.");
        }
    }
}

