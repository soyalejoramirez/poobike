package offtopic.co.poo.app;

import java.util.Arrays;

import javax.swing.JOptionPane;

import offtopic.biblioteca.dominio.Biblioteca;
import offtopic.biblioteca.dominio.Libro;

public class AppBiblioteca {
	public static void main(String[] args) {
		boolean ejecutar = true;
		Biblioteca biblioteca = new Biblioteca(pedirInformacion("Ingresa el nombre de la biblioteca"));
		
		while(ejecutar) {
			int opcion = JOptionPane.showOptionDialog(null, "Que deseas realizar", "POO", 0, 0, null, Arrays.asList("Agregar Libro", "Prestar Libro", "Buscar Libro").toArray(), null);
			
			switch (opcion) {
			case 0:
				// Agregar
				String isbn = pedirInformacion("Ingrese el ISBN");
				String nombre = pedirInformacion("Ingrese el nombre");
				String autor = pedirInformacion("Ingrese el autor");
				int nroPaginas = Integer.parseInt(pedirInformacion("Ingrese el número de páginas"));
				
				Libro libro = new Libro(isbn, nombre, autor, nroPaginas);
				
				biblioteca.agregarLibro(libro);
				
				break;
			case 1:
				// Prestar
				
				break;
			case 2:
				// Buscar
				String nombreBuscado = JOptionPane.showInputDialog("¿Cómo se llama el libro que estás buscando?");
				
				Libro libroBuscado = biblioteca.buscarLibro(nombreBuscado);
				
				if(libroBuscado != null) {
					mostrarMensaje("Libro encontrado: " + libroBuscado.getIsbn());
				} else {
					mostrarMensaje("NO existe el libro :(");
				}
				
				break;
			default:
				ejecutar = false;
				break;
			}
		}		
		mostrarMensaje(biblioteca.getNombre());
	}
	
	public static String pedirInformacion(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
