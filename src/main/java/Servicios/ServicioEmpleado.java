/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author judav
 */
public class ServicioEmpleado {
    
    private List<Empleado> listaEmpleados;

    public ServicioEmpleado() {
        this.listaEmpleados = new ArrayList<>();
    }

    public void registrarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado registrado: " + empleado.getnombre(), "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        StringBuilder lista = new StringBuilder("--- Lista de Empleados ---\n");
        for (Empleado emp : listaEmpleados) {
            lista.append("ID: ").append(emp.getId())
                 .append(" | Nombre: ").append(emp.getnombre())
                 .append(" | Turno: ").append(emp.getTurno())
                 .append(" | Cargo: ").append(emp.getCargo())
                 .append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Empleados", JOptionPane.INFORMATION_MESSAGE);
    }

    public Empleado buscarEmpleadoPorID(int id) {
        for (Empleado emp : listaEmpleados) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public void eliminarEmpleado(int id) {
        Empleado empleado = buscarEmpleadoPorID(id);
        if (empleado != null) {
            listaEmpleados.remove(empleado);
            JOptionPane.showMessageDialog(null, "Empleado eliminado: " + empleado.getnombre(), "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Empleado con ID " + id + " no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
