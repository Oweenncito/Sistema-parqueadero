/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author owenf
 */
import java.util.List;
import models.EspacioParqueadero;
import models.Vehiculo;
import service.EspacioService;

public class EspacioController {

    private EspacioService service;

    public EspacioController() {
        service = new EspacioService();
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
        return true;
    }

    public void setVehiculo(Vehiculo vehiculo) {

    }

    public boolean setDisponible() {

        return false;
    }

    public EspacioParqueadero ingresarVehiculo(Vehiculo vehiculo, int idEspacio) {

        return service.ingresarVehiculo(vehiculo, idEspacio);
    }
    
    public List<EspacioParqueadero> obtenerTodos(){
        return service.obtenerTodos();
    }

    public EspacioParqueadero getById(int idEspacio){
        return service.getById(idEspacio);
    }

    public EspacioParqueadero crearEspacio(EspacioParqueadero espacio){
        return service.crear(espacio);
    }
}