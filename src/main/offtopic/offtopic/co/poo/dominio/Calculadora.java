package offtopic.co.poo.dominio;

public class Calculadora {
	private static int nroInstancias = 0;
	private String marca;
	
	public Calculadora(String marca) {
		this.marca = marca;
		Calculadora.nroInstancias++;
	}
	
	public static double sumar(double nro1, double nro2) {
		return nro1 + nro2;
	}
	
	public static double sumar(double nro1, double nro2, double nro3) {
		return nro1 + nro2 + nro3;
	}
	
	public static double sumar(double... numeros) {
		double resultado = 0;
		
		for (double num : numeros) {
			resultado += num;
		}
		
		return resultado;
	}
	
	public static double restar(double nro1, double nro2) {
		return nro1 - nro2;
	}
	
	public static double multiplicar(double nro1, double nro2) {
		return nro1 * nro2;
	}
	
	public static double dividir(double nro1, double nro2) {
		return nro1 / nro2;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public static int getNroInstancias() {
		return nroInstancias;
	}
}
