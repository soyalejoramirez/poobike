package offtopic.archivos.dominio;

public class DocumentoDocx extends Documento implements Validacion {
	private int version;

	public DocumentoDocx(String titulo, int version) {
		super(titulo);
		this.version = version;
	}

	@Override
	public boolean validar() {
		boolean validado = true;
		
		if(super.getTitulo().contains("virus")) {
			validado = false;
		} else if (version < 10) {
			validado = false;
		}
		
		return validado;
	}

}
