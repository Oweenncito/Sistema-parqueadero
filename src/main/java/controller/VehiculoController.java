package controller;

import dto.LoginResponseDTO;
import models.Vehiculo;
import service.VehiculoService;

import java.util.List;

public class VehiculoController {
    VehiculoService vehiculoService;

    public VehiculoController(){
        this.vehiculoService = new VehiculoService();
    }

    public List<Vehiculo> getVehiculos(LoginResponseDTO loginResponseDTO){
        return vehiculoService.getVehiculos(loginResponseDTO);
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculoService.add(vehiculo);
    }

    public void removeVehiculo(Integer id){
        vehiculoService.remove(id);
    }
}
