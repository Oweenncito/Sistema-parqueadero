package models;

public class Usuario {
	private Integer id;
	private String correo;
	private String nombre;
	private String contraseña;

	public Usuario() {

	}

	public Usuario(String correo, String nombre, String contraseña) {


		this.correo = correo;
		this.nombre = nombre;
		this.contraseña = contraseña;

	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

