package offtopic.figuras;

import java.util.ArrayList;
import java.util.List;

public class AppFiguras {

	public static void main(String[] args) {
		List<FiguraGeometrica> figuras = new ArrayList<>();
		
		Circulo circulo = new Circulo(34);
		TrianguloEquilatero triangulo = new TrianguloEquilatero(21, 23);
		Cuadrilatero cuadrilatero = new Cuadrilatero(50, 43);
		FiguraGeometrica fig = new Circulo(316);
		
		figuras.add(circulo);
		figuras.add(triangulo);
		figuras.add(cuadrilatero);
		figuras.add(fig);
		
		for (FiguraGeometrica figura : figuras) {
			if(figura instanceof Circulo) {
				System.out.println("\n Circulo");
			} else if(figura instanceof TrianguloEquilatero) {
				System.out.println("\n Triangulo");
			} else if(figura instanceof Cuadrilatero) {
				System.out.println("\n Cuadrilatero");
			}
			
			System.out.println("Area: " + figura.calcularArea());
			System.out.println("Perimetro: " + figura.calcularPerimetro());
		}
	}

}
