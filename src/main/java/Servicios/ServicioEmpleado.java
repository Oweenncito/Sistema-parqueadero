/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Modelos.Empleado;
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Empleado registrado: " + empleado.getnombre());
    }

    public void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("\n--- Lista de Empleados ---");
        for (Empleado emp : listaEmpleados) {
            System.out.println("ID: " + emp.getId() + " | Nombre: " + emp.getnombre() + 
                               " | Turno: " + emp.getTurno() + " | Cargo: " + emp.getCargo());
        }
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
            System.out.println("Empleado eliminado: " + empleado.getnombre());
        } else {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }
}
