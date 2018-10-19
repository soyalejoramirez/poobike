package co.poobike.facturacion;

public class FacturaConIva extends Factura {

	public FacturaConIva(int valor, String tipoCompra) {
		super(valor, tipoCompra);
	}

	@Override
	public double getTotal() {
		System.out.println("Para la bici de " + this.getValor() + " el posible descuento es de " + this.calcularDescuento());
		return this.getValor() * 1.19;
	}

}
