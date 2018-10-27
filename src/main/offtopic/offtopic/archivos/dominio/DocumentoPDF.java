package offtopic.archivos.dominio;

public class DocumentoPDF extends Documento implements Validacion {
	private boolean protegido;

	public DocumentoPDF(String titulo, boolean protegido) {
		super(titulo);
		this.protegido = protegido;
	}

	@Override
	public boolean validar() {
		boolean validado = true;
		
		if(super.getTitulo().contains("virus")) {
			validado = false;
		} else if (!protegido) {
			validado = false;
		}
		
		return validado;
	}
	

}
