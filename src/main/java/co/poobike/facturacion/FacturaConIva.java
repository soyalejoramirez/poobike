package co.poobike.facturacion;

public class FacturaConIva extends Factura {

	public FacturaConIva(int valor) {
		super(valor);
	}

	@Override
	public double getTotal() {
		return this.getValor() * 1.19;
	}

}
