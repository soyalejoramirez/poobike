package offtopic.biblioteca.dominio;

public class Persona {
	private String nombre;
	private int edad;
	private long nroCelular;
	private String direccion;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public long getNroCelular() {
		return nroCelular;
	}

	public void setNroCelular(long nroCelular) {
		this.nroCelular = nroCelular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
}
