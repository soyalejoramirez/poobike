package offtopic.archivos.dominio;

public abstract class Documento {
	private String titulo;
	
	public Documento(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
