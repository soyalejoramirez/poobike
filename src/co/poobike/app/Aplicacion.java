package co.poobike.app;

import co.poobike.dominio.Bicicleta;

public class Aplicacion {
	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta("1324Geg6", "NEGRA");

		bici.color = "NEGRA";
		bici.serial = "1324Geg6";

		System.out.println(bici.color);
		System.out.println(bici.serial);

		bici.modificarCadencia(80);
		bici.modificarCambio(5);
		bici.acelerar(20);
		bici.frenar(5);

		System.out.println(bici.verCambio());
		System.out.println(bici.verCadencia());
		System.out.println(bici.verVelocidad());
	}
}
