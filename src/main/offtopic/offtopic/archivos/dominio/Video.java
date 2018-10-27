package offtopic.archivos.dominio;

public class Video implements Validacion {
	private String descripcion;
	private boolean tieneGemidos;
	
	public Video(String descripcion, boolean tieneGemidos) {
		this.descripcion = descripcion;
		this.tieneGemidos = tieneGemidos;
	}

	@Override
	public boolean validar() {
		boolean validado = true;
		
		if(tieneGemidos) {
			validado = false;
		}
		
		return validado;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
