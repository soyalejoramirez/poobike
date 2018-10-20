package co.poobike.facturacion;

public class FacturaConIva extends Factura {

	public FacturaConIva(int valor) {
		super(valor);
	}

	@Override
	public double getTotal() {
		return this.getValor() * 1.19;
	}

	@Override
	public double getTotal(Descuento d) {
		return (this.getValor() - d.calcularDescuento(this)) * 1.19;
	}

}
