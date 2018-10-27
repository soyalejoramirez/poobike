package co.poobike.facturacion;

public class DescuentoOnline implements Descuento {

	@Override
	public double calcularDescuento(Factura f) {
		double descuento = 0;
		
		if(f.getValor() < 1000000) {
			descuento = f.getValor() * 0.10; // 10%
		} else {
			descuento = f.getValor() * 0.18; // 18%
		}
		
		return descuento;
	}

}
