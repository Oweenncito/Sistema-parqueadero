package service;

import models.EspacioParqueadero;

public class EspacioParqueaderoService {

    private EspacioParqueadero[][] espacios;

    public EspacioParqueaderoService() {
        espacios = new EspacioParqueadero[4][4];
        initEspacios();
    }

    private void initEspacios(){
        for (int i = 0; i < espacios.length; i++) {
            for (int j = 0; j < espacios[i].length; j++) {
                espacios[i][j] = new EspacioParqueadero();
            }
        }
    }

    public EspacioParqueadero getEspacio(int fila, int columna) {
        return espacios[fila][columna];
    }

    public boolean disponible(int fila, int columna) {
        return getEspacio(fila, columna).isDisponible();
    }
}
