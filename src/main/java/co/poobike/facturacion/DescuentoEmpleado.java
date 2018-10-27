package co.poobike.facturacion;

public class DescuentoEmpleado implements Descuento {
	@Override
	public double calcularDescuento(Factura f) {
		double descuento = 0;
		
		if(f.getValor() < 1000000) {
			descuento = f.getValor() * 0.15; // 15%
		} else {
			descuento = f.getValor() * 0.20; // 20%
		}
		
		return descuento;
	}
}
