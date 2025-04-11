package controller;

import models.EspacioParqueadero;
import service.EspacioParqueaderoService;

public class EspaciosController {

    private EspacioParqueaderoService service;

    public EspaciosController() {
        service = new EspacioParqueaderoService();
    }

    public EspacioParqueadero getEspacio(int fila, int columna) {
        return service.getEspacio(fila, columna);
    }

    public boolean disponible(int fila, int columna) {
        return service.disponible(fila, columna);
    }
}
