package controller;

import models.Vehiculo;
import service.VehiculoService;

import java.util.List;

public class VehiculoController {
    VehiculoService vehiculoService;

    public VehiculoController(){
        this.vehiculoService = new VehiculoService();
    }

    public List<Vehiculo> getVehiculos(){
        return vehiculoService.getVehiculos();
    }
}
