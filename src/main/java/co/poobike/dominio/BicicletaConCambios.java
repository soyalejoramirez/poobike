package co.poobike.dominio;

public class BicicletaConCambios extends Bicicleta {
	
	public BicicletaConCambios(int valor) {
		super(valor);
	}

	private int nroCambio;
	
	public int getNroCambio() {
		return nroCambio;
	}
	
	public void setNroCambio(int nroCambio) {
		this.nroCambio = nroCambio;
	}
}
