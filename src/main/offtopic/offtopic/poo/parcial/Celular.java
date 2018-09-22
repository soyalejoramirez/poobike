package offtopic.poo.parcial;

public class Celular {
	private long serial;
	private String marca;
	private String modelo;
	private int precio;
	private boolean nuevo;
	
	public Celular(long serial, String marca, String modelo, int precio, boolean nuevo) {
		this.serial = serial;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.nuevo = nuevo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isNuevo() {
		return nuevo;
	}

	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}

	public long getSerial() {
		return serial;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
}
