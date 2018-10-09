package co.poobike.dominio;

public class Bicicleta {
	private static final String MARCA_DEFAULT = "GW";
	private static final String COLOR_DEFAULT = "BLANCA";
	private static int contadorDeBicis = 0;
	
	private String 	serial;
	private String 	marca;
	private String 	color;
	private String 	materialDelMarco;
	private double	talla;
	private int valor;
	
	public Bicicleta(int valor) {
		this(MARCA_DEFAULT, COLOR_DEFAULT, valor);
	}
	
	public Bicicleta(String marca, int valor) {
		this(marca, COLOR_DEFAULT, valor);
	}
	
	public Bicicleta(String marca, String color, int valor) {		
		Bicicleta.contadorDeBicis++;
		
		this.serial = "POO" + Bicicleta.contadorDeBicis;
		this.marca = marca;
		this.color = color;
		this.valor = valor;
	}

	public String getColor() {
		return color;
	}

	public String getSerial() {
		return serial;
	}

	public String getMarca() {
		return marca;
	}
	
	public String getMaterialDelMarco() {
		return materialDelMarco;
	}
	
	public void setMaterialDelMarco(String materialDelMarco) {
		this.materialDelMarco = materialDelMarco;
	}
	
	public void setTalla(double talla) {
		this.talla = talla;
	}
	
	public double getTalla() {
		return talla;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}