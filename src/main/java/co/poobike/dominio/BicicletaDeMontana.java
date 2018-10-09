package co.poobike.dominio;

public class BicicletaDeMontana extends BicicletaConCambios {
	public BicicletaDeMontana(String tipoSuspencion, int valor) {
		super(valor);
		this.tipoSuspension = tipoSuspencion;
	}

	private String tipoSuspension;
	
	public String getTipoSuspension() {
		return tipoSuspension;
	}
	
	public void setTipoSuspension(String tipoSuspension) {
		this.tipoSuspension = tipoSuspension;
	}
}
