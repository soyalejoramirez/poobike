package co.poobike.facturacion;

public abstract class Factura {
	private static int consecutivo;
	private int numero;
	private int valor;
	
	static {
		consecutivo = 0;
	}
	
	public Factura(int valor) {
		consecutivo++;
		this.numero = consecutivo;
		this.valor = valor;
	}
	
	public abstract double getTotal();
	
	public int getNumero() {
		return numero;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
