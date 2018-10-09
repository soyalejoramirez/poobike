package co.poobike.facturacion;

public class FacturaSinIva extends Factura {

	public FacturaSinIva(int valor) {
		super(valor);
	}

	@Override
	public double getTotal() {
		return this.getValor();
	}

}
