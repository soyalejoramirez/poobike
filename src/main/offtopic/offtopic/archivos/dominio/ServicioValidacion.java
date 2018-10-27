package offtopic.archivos.dominio;

import java.util.ArrayList;
import java.util.List;

public class ServicioValidacion {
	private List<Validacion> archivos = new ArrayList<>();
	
	public void add(Validacion d) {
		this.archivos.add(d);
	}
	
	public void escanearVulnerabilidades() {
		for (Validacion archivo : archivos) {
			String nombre = null;
			
			if(archivo instanceof Documento) {
				nombre = ((Documento) archivo).getTitulo();
			} else if(archivo instanceof Video) {
				nombre = ((Video) archivo).getDescripcion();
			}
				
			System.out.println(nombre + " - " + archivo.validar());
		}
	}

}
