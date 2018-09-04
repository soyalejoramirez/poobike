package co.poobike.dominio;

public class Bicicleta {
	private String color;
	private String serial;	
	private double velocidad;	
	private int nroCambio;
	private double cadencia;
	
	public Bicicleta() {
		this("0", "NINGUNO");
	}
	
	public Bicicleta(String serial) {
		this(serial, "NINGUNO");
	}
	
	public Bicicleta(String serial, String color) {
		this.serial = serial;
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
	
	
	
	
	
	
	
	
	
	
	
	
}