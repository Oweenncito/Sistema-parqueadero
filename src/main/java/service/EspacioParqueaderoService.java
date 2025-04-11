package service;

import models.EspacioParqueadero;

public class EspacioParqueaderoService {

    private EspacioParqueadero[][] espacios;

    public EspacioParqueaderoService() {
        espacios = new EspacioParqueadero[4][4];
    }

    public EspacioParqueadero getEspacio(int fila, int columna) {
        return espacios[fila][columna];
    }

    public boolean disponible(int fila, int columna) {
        return getEspacio(fila, columna).disponible();
    }
}
