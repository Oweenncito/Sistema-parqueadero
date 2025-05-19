package models;

public class EspacioParqueadero {
    
    private Vehiculo vehiculo;
    private boolean disponible;

    public EspacioParqueadero() {
        vehiculo = null;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

  
}
