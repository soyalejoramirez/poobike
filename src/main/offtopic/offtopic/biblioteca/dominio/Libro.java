package offtopic.biblioteca.dominio;

public class Libro {
	private String isbn;
	private String nombre;
	private String autor;
	private String genero;
	private boolean prestado;
	private int nroPaginas;
	
	public Libro(String isbn, String nombre, String autor, int nroPags) {
		this.isbn = isbn;
		this.nombre = nombre;
		this.autor = autor;
		this.nroPaginas = nroPags;
		this.prestado = false;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public int getNroPaginas() {
		return nroPaginas;
	}
	
	public boolean isPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
}
