package co.poobike.app;

import java.util.ArrayList;

import co.poobike.dominio.Bicicleta;
import co.poobike.dominio.BicicletaCross;
import co.poobike.dominio.BicicletaDeMontana;
import co.poobike.dominio.BicicletaDeRuta;

public class Aplicacion {
	public static void main(String[] args) {
		ArrayList<Bicicleta> bicicletas = new ArrayList<>();
		
		BicicletaDeRuta bici = new BicicletaDeRuta();
		BicicletaDeMontana mtb = new BicicletaDeMontana();
		BicicletaCross cross = new BicicletaCross();
//		Bicicleta bici = new BicicletaCross(); // Upcasting
//		BicicletaDeMontana mtb = (BicicletaDeMontana) new Bicicleta(); //Downcasting

		bicicletas.add(bici);
		bicicletas.add(mtb);
		bicicletas.add(cross);
		
		for (Bicicleta bicicleta : bicicletas) {
			if(bicicleta instanceof Bicicleta) {
				System.out.println(bicicleta.toString());
			}
		}
		
		bici.setCadencia(80);
		bici.acelerar(20);
		
//		if(bici instanceof BicicletaConCambios) {
//			((BicicletaConCambios) bici).setNroCambio(5);
//			((BicicletaConCambios) bici).frenar(5);
//			
//			System.out.println("La bicicleta va en el cambio #" + (((BicicletaConCambios) bici).getNroCambio()));
//		}

		System.out.println("La bicicleta va a " + bici.getCadencia()  + " pedaleadas por minuto");
		System.out.println("La bicicleta va a " + bici.getVelocidad()  + " km/h");
		System.out.println("El serial de la bicicleta es " + bici.getSerial());
	}
}
