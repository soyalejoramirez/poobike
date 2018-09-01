package co.poobike.app;

import co.poobike.dominio.Bicicleta;

public class Aplicacion {
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta("1324Geg6", "NEGRA");

		System.out.println(bici.getColor());
		System.out.println(bici.getSerial());

		bici.setCadencia(80);
		bici.setNroCambio(5);
		bici.acelerar(20);
		bici.frenar(5);

		System.out.println("La bicicleta va en el cambio #" + bici.getNroCambio());
		System.out.println("La bicicleta va a " + bici.getCadencia()  + " pedaleadas por minuto");
		System.out.println("La bicicleta va a " + bici.getVelocidad()  + " km/h");
	}
}
