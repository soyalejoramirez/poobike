package co.poobike.dominio;

public class Bicicleta {
	private static final String MARCA_ESTANDAR = "GW";
	private static final String COLOR_ESTANDAR = "BLANCA";
	private static int contadorDeBicis = 0;
	private String serial;
	private String marca;
	private String color;
	private double velocidad;	
	private int nroCambio;
	private double cadencia;
	
	public Bicicleta() {
		this(MARCA_ESTANDAR, COLOR_ESTANDAR);
	}
	
	public Bicicleta(String marca) {
		this(marca, COLOR_ESTANDAR);
	}
	
	public Bicicleta(String marca, String color) {		
		Bicicleta.contadorDeBicis++;
		
		this.serial = "POO" + Bicicleta.contadorDeBicis;
		this.marca = marca;
		this.color = color;
	}
	
	public void acelerar(double incremento) {
		if(incremento < 1) {
			System.out.println("El incremento no puede ser menor que 1");
		} else {			
			this.velocidad += incremento;
		}
	}

	public void frenar(double decremento) {
		if(decremento > this.velocidad) {
			System.out.println("No puede frenar más de la velocidad a la que va");
		} else {			
			this.velocidad -= decremento;
		}
	}
	
	public int getNroCambio() {
		return nroCambio;
	}

	public void setNroCambio(int nroCambio) {
		this.nroCambio = nroCambio;
	}

	public double getCadencia() {
		return cadencia;
	}

	public void setCadencia(double cadencia) {
		this.cadencia = cadencia;
	}

	public String getColor() {
		return color;
	}

	public String getSerial() {
		return serial;
	}

	public double getVelocidad() {
		return velocidad;
	}
	
	public String getMarca() {
		return marca;
	}
}