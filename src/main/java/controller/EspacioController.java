package controller;

import models.EspacioParqueadero;
import models.Vehiculo;
import service.EspacioService;

public class EspacioController {
    private EspacioService service;

    public EspacioController(EspacioParqueadero espacioParqueadero) {
        service = new EspacioService(espacioParqueadero);
    }

    public void setVehiculo(Vehiculo vehiculo) {
        service.setVehiculo(vehiculo);
    }
}
