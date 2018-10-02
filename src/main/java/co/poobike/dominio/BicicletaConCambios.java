package co.poobike.dominio;

public class BicicletaConCambios extends Bicicleta {
	private int nroCambio;
	
	public void frenar(double decremento) {
		if(decremento > this.velocidad) {
			System.out.println("No puede frenar más de la velocidad a la que va");
		} else {			
			this.velocidad -= decremento;
		}
	}
	
	public int getNroCambio() {
		return nroCambio;
	}
	
	public void setNroCambio(int nroCambio) {
		this.nroCambio = nroCambio;
	}
}
