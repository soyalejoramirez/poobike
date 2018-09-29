package offtopic.co.poo.app;

import offtopic.biblioteca.dominio.Libro;

public class AppCasting {
	public static void main(String[] args) {
		// Primitivos
		
		int a = 129;
		byte b = (byte) a;
		
		// No es capaz de convertir porque en un byte 
		// cabe hasta el 127, por eso se reinicia la variable.
		System.out.println(b);
		
		// Objetos
		
		// UpCasting
		Object objeto = new Libro("123", "AAA", "BBB", 435);
		System.out.println(objeto);
		
		// DownCasting
		Object otroObjeto = new Object();
		
		if(otroObjeto instanceof Libro) {
			System.out.println("otroObjeto si se puede convertir a Libro");
			
			Libro libro = (Libro) otroObjeto;
			System.out.println(libro.getAutor());
		} else if(objeto instanceof Libro) {
			System.out.println("objeto si se puede convertir a Libro");
			
			Libro libro = (Libro) objeto;
			System.out.println(libro.getAutor());
		} else {
			System.out.println("No se puede convertir");			
		}
	}
}