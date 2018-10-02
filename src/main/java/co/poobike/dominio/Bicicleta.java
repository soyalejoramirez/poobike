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
	protected double 	velocidad;
	private double 	cadencia;
	
	public Bicicleta() {
		this(MARCA_DEFAULT, COLOR_DEFAULT);
	}
	
	public Bicicleta(String marca) {
		this(marca, COLOR_DEFAULT);
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

//	public void frenar(double decremento) {
//		if(decremento > this.velocidad) {
//			System.out.println("No puede frenar más de la velocidad a la que va");
//		} else {			
//			this.velocidad -= decremento;
//		}
//	}

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
}