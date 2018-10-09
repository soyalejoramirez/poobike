package offtopic.figuras;

public class Cuadrilatero extends FiguraGeometrica {
	private double lado1;
	private double lado2;
	
	public Cuadrilatero(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public double calcularArea() {
		return this.lado1 * this.lado2;
	}
	
	@Override
	public double calcularPerimetro() {
		return (2 * this.lado1) + (2 * this.lado2);
	}
}
