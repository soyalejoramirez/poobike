package co.poobike.dominio;

public class BicicletaDeRuta extends BicicletaConCambios {
	@Override
	public void acelerar(double incremento) {
		System.out.println("Acelerando una de ruta...");
		super.acelerar(incremento * 2);
	}
}
