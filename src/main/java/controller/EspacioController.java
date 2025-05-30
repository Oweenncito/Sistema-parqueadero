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

import dto.LoginResponseDTO;
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

    public EspacioParqueadero ingresarVehiculo(Vehiculo vehiculo, Integer idEspacio, LoginResponseDTO dto) {
        return service.ingresarVehiculo(vehiculo, idEspacio, dto);
    }
    
    public List<EspacioParqueadero> obtenerTodos(LoginResponseDTO dto){
        return service.obtenerTodos(dto);
    }

    public EspacioParqueadero getById(int idEspacio){
        return service.getById(idEspacio);
    }

    public EspacioParqueadero crearEspacio(EspacioParqueadero espacio){
        return service.crear(espacio);
    }
    
    public EspacioParqueadero desocuparEspacio(int idEspacio, LoginResponseDTO dto){
        
        return service.liberarEspacio(idEspacio, dto);
    }
}