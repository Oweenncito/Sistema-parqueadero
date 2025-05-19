/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author owenf
 */
import models.EspacioParqueadero;
import models.Vehiculo;
import service.EspacioService;

public class EspacioController {
    private EspacioService service;

    public EspacioController(EspacioParqueadero espacioParqueadero) {
        service = new EspacioService(espacioParqueadero);
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
        return service.registrarVehiculo(vehiculo);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        service.setVehiculo(vehiculo);
    }
}