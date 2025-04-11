package service;

import models.EspacioParqueadero;
import models.Vehiculo;

public class EspacioService {
    private EspacioParqueadero espacio;

    public EspacioService(EspacioParqueadero espacio) {
        this.espacio = espacio;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.espacio.setVehiculo(vehiculo);
    }
}
