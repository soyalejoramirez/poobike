package offtopic.archivos.app;

import offtopic.archivos.dominio.DocumentoDocx;
import offtopic.archivos.dominio.DocumentoPDF;
import offtopic.archivos.dominio.ServicioValidacion;
import offtopic.archivos.dominio.Video;

public class App {
	public static void main(String[] args) {
		ServicioValidacion antivirus = new ServicioValidacion();
		DocumentoPDF pdf = new DocumentoPDF("Este no tiene virus", true);
		DocumentoPDF pdf2 = new DocumentoPDF("Final Resuelto", true);
		DocumentoDocx docx = new DocumentoDocx("Carta de cambio de programa de pregrado", 10);
		Video video = new Video("Messi renuncia a Argentina, mira aquí su declaración", true);
		
		antivirus.add(pdf);
		antivirus.add(pdf2);
		antivirus.add(docx);
		antivirus.add(video);
		
		antivirus.escanearVulnerabilidades();
	}
}
