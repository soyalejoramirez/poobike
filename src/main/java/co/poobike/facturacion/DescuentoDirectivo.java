package co.poobike.facturacion;

public class DescuentoDirectivo implements Descuento {

	@Override
	public double calcularDescuento(Factura f) {
		return f.getValor() * 0.5; // 50%
	}	
}
