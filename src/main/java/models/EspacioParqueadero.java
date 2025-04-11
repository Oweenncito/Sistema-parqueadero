package models;

public class EspacioParqueadero {
    private Vehiculo vehiculo;

    public EspacioParqueadero() {
        vehiculo = null;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean disponible(){
        return vehiculo == null;
    }
}
