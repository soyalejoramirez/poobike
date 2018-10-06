package co.poobike.dominio;

public class BicicletaConCambios extends Bicicleta {
	private int nroCambio;
	
	public void frenar(double decremento) {
		if(decremento > super.velocidad) {
			System.out.println("No puede frenar más de la velocidad a la que va");
		} else {			
			this.velocidad -= decremento;
		}
	}
	
	@Override
	public void acelerar(double incremento) {
		if(this instanceof BicicletaDeRuta) {			
			System.out.println("No hago nada porque es de Ruta");
			super.acelerar(incremento);
		} else {
			System.out.println("Acelerando con Cambios");
			super.acelerar(incremento * 1.5);
		}
	}
	
	public int getNroCambio() {
		return nroCambio;
	}
	
	public void setNroCambio(int nroCambio) {
		this.nroCambio = nroCambio;
	}
}
