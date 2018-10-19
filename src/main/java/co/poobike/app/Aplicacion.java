package co.poobike.app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.poobike.dominio.Bicicleta;
import co.poobike.dominio.BicicletaCross;
import co.poobike.dominio.BicicletaDeMontana;
import co.poobike.dominio.BicicletaDeRuta;
import co.poobike.facturacion.Factura;
import co.poobike.facturacion.FacturaConIva;
import co.poobike.facturacion.FacturaSinIva;

public class Aplicacion {
	public static void main(String[] args) {
		ArrayList<Bicicleta> bicicletasAVender = new ArrayList<>();
		ArrayList<Factura> facturas = new ArrayList<>();
		
		BicicletaDeRuta bici = new BicicletaDeRuta(3000000);
		BicicletaDeMontana mtb = new BicicletaDeMontana("Hidraulica", 1900000);
		BicicletaCross cross = new BicicletaCross(1500000);
//		Bicicleta bici = new BicicletaCross(); // Upcasting
//		BicicletaDeMontana mtb = (BicicletaDeMontana) new Bicicleta(); //Downcasting

		bicicletasAVender.add(bici);
		bicicletasAVender.add(mtb);
		bicicletasAVender.add(cross);
		
		for (Bicicleta bicicleta : bicicletasAVender) {
			if(bicicleta.getValor() > 2000000) {
				facturas.add(new FacturaConIva(bicicleta.getValor(), "online"));
			} else {
				facturas.add(new FacturaSinIva(bicicleta.getValor(), "fisica"));
			}
		}
		
		JOptionPane.showMessageDialog(null, "El valor recaudado en el día es de $" + generarTotal(facturas));
	}
	
	public static double generarTotal(List<Factura> facturas) {
		double total = 0;
		
		for (Factura factura : facturas) {
			total += factura.getTotal();
		}
		
		return total;
	}
}










