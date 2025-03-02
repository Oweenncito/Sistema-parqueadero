/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ServicioCliente {
    
    private List<Cliente> clientes;
    
    public ServicioCliente(){
        this.clientes = new ArrayList<>();
    }
    
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente registrado: " + cliente.getNombre());
    }
}
