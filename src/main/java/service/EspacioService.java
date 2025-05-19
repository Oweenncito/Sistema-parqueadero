package service;

import models.EspacioParqueadero;
import models.Vehiculo;

public class EspacioService {
    private EspacioParqueadero espacio;

    public EspacioService(EspacioParqueadero espacio) {
        this.espacio = espacio;
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
    if (espacio.isDisponible()) {    // Verifica si está libre
        espacio.setVehiculo(vehiculo);  // Asigna el vehículo
        return true;  // Registro exitoso
    }
    return false;   // No disponible
}

    public void setVehiculo(Vehiculo vehiculo) {
        this.espacio.setVehiculo(vehiculo);
    }
}
