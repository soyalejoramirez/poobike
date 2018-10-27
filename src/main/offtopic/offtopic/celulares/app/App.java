package offtopic.celulares.app;

import offtopic.celulares.dominio.Android;
import offtopic.celulares.dominio.IPhonePOO;
import offtopic.celulares.dominio.Iphone8;
import offtopic.celulares.dominio.Usuario;

public class App {

	public static void main(String[] args) {
		Usuario alejo = new Usuario("Alejo");
		alejo.setCodigo(1234);
		alejo.setHuella("34343sadsd");
		alejo.setRostro("ARH316");
		
		Usuario victor = new Usuario("Victor");
		victor.setHuella("REWQ");
		victor.setPatron("ARRIBA-ABAJO-CENTRO-ADENTRO");
		victor.setCodigo(9876);
		
		Usuario laura = new Usuario("Laura");
		laura.setRostro("AXDF");
		laura.setCodigo(1234);
		laura.setHuella("112233");
		laura.setPatron("DERECHO-ABAJO");
		
		Android android = new Android(1, "Samsung", laura);
		Iphone8 iPhone8 = new Iphone8(2, "Apple", victor);
		IPhonePOO iPhonePOO = new IPhonePOO(3, "Apple - POO", alejo);
		
		System.out.println("Laura desbloquea su celular: " + android.validar(laura));
		System.out.println("Victor desbloquea el celular de Laura: " + android.validar(victor));
		
		System.out.println("Laura desbloquea el celular de Victor: " + iPhone8.validar(laura));
		
		System.out.println("Laura desbloquea el celular de Alejo: " + iPhonePOO.validar(laura));
		System.out.println("Alejo desbloquea su celular: " + iPhonePOO.validar(alejo));
	}
}










