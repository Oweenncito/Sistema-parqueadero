package models;


/**
 * @author judav
 */
public class EspacioParqueadero {
    private Integer id;
    private int numero;
    private boolean disponible;// nombre columna FK en la tabla
    private Vehiculo vehiculo; // eso hara que un vehiculo se guarde en un espacio del parqueadero
    private Usuario usuario;

    public EspacioParqueadero() {

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
