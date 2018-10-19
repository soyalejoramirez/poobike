package co.poobike.facturacion;

public abstract class Factura {
	private static int consecutivo;
	private int numero;
	private int valor;
	private String tipoCompra; // Empleados, Tienda Online o Tienda Física
	
	static {
		consecutivo = 0;
	}
	
	public Factura(int valor, String tipoCompra) {
		consecutivo++;
		this.numero = consecutivo;
		this.valor = valor;
		this.tipoCompra = tipoCompra;
	}
	
	public abstract double getTotal();
	
	public double calcularDescuento() {
		double descuento = 0;
		
		if("fisica".equalsIgnoreCase(this.tipoCompra)) {
			if(this.valor < 1000000) {
				descuento = this.valor * 0.05; // 5%
			} else {
				descuento = this.valor * 0.10; // 10%
			}
		} else if("online".equalsIgnoreCase(this.tipoCompra)) {
			if(this.valor < 1000000) {
				descuento = this.valor * 0.10; // 10%
			} else {
				descuento = this.valor * 0.18; // 18%
			}
		} else {
			if(this.valor < 2000000) {
				descuento = this.valor * 0.15; // 15%
			} else {
				descuento = this.valor * 0.20; // 20%
			}
		}
		
		return descuento;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getTipoCompra() {
		return tipoCompra;
	}
}