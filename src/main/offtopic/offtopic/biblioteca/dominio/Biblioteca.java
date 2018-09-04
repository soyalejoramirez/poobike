package offtopic.biblioteca.dominio;

import java.util.ArrayList;

public class Biblioteca {
	private String nombre;
	private String ubicacion;
	private ArrayList<Libro> libros;
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<>();
	}
	
	public void agregarLibro(Libro libroAAgregar) {
		this.libros.add(libroAAgregar);
	}
	
	public Libro buscarLibro(String nombre) {
		Libro libroBuscado = null;
		
		for (Libro libro : libros) {
			if(libro.getNombre().equalsIgnoreCase(nombre)) {
				libroBuscado = libro;
				break;
			}
		}
		
		return libroBuscado;
	}
	
	public String prestarLibro(String nombre, Persona persona) {
		String mensajeRespuesta;
		Libro libroBuscado = this.buscarLibro(nombre);
		
		if(libroBuscado != null) {
			libroBuscado.setPrestado(true);
			mensajeRespuesta = "El libro fue prestado";
		} else {
			mensajeRespuesta = "El libro no existe";
		}
		
		return mensajeRespuesta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
}
