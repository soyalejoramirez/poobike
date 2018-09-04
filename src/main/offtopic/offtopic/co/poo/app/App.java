package offtopic.co.poo.app;

import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import offtopic.co.poo.dominio.Calculadora;

public class App {
	public static ImageIcon icono = new ImageIcon(App.class.getResource("/co/poobike/resources/github-logo.png"));
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		boolean ejecutar = true;
		double nro1;
		double nro2;
		
		while(ejecutar) {
			int opcion = JOptionPane.showOptionDialog(null, "Que deseas realizar", "POO", 0, 0, icono, Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir").toArray(), null);
			
			switch (opcion) {
			case 0:
				nro1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
				nro2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
				
				mostrarMensaje("Resultado: " + calculadora.sumar(nro1, nro2));
				break;
			case 1:
				nro1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
				nro2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
				
				mostrarMensaje("Resultado: " + calculadora.restar(nro1, nro2));
				break;
			case 2:
				nro1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
				nro2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
				
				mostrarMensaje("Resultado: " + calculadora.multiplicar(nro1, nro2));
				break;
			case 3:
				nro1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1"));
				nro2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2"));
				
				mostrarMensaje("Resultado: " + calculadora.dividir(nro1, nro2));
				break;
			default:
				ejecutar = false;
				break;
			}
		}
//		JOptionPane.showMessageDialog(null, "Hola Mundo");
//		JOptionPane.showMessageDialog(null, "Hola Mundo", "POO", JOptionPane.PLAIN_MESSAGE, icono);
		
//		String edad = JOptionPane.showInputDialog(null, "Ingrese su edad", "POO", JOptionPane.QUESTION_MESSAGE);		
//		if(edad != null) {	
//			int nonoya = Integer.parseInt(edad);
//			mostrarMensaje("Tienes " + (nonoya + 10) + " años.");
//		} else {
//			mostrarMensaje("NADA");
//		}
		
//		String pueblo = (String) JOptionPane.showInputDialog(null, "¿Donde vives?", "POO", JOptionPane.QUESTION_MESSAGE, null, Arrays.asList("El Retiro", "Rionegro", "El Carmen", "La Ceja").toArray(), "El Carmen");
//		String pueblo = (String) JOptionPane.showInputDialog(null, "¿Donde vives?", "POO", JOptionPane.QUESTION_MESSAGE, null, new String[]{"Guarne", "Peñol", "Amagá"}, null);
//		mostrarMensaje(pueblo);
		
//		int opcionElegida = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?", "POO", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icono);
//		
//		switch (opcionElegida) {
//		case JOptionPane.YES_OPTION:
//			mostrarMensaje("Eligió SI!");
//			break;
//		case JOptionPane.NO_OPTION:
//			mostrarMensaje("Eligió no...");
//			break;
//		case JOptionPane.CANCEL_OPTION: 
//			mostrarMensaje("CANCELÓ");
//			break;
//		case JOptionPane.CLOSED_OPTION: 
//			mostrarMensaje("Cerró la ventana");
//			break;
//		default:
//			mostrarMensaje("No se que eligió :( " + opcionElegida);
//			break;
//		}
	}
	
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "POO", JOptionPane.PLAIN_MESSAGE, icono);
	}
}
