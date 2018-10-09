package offtopic.figuras;

public class TrianguloEquilatero extends Triangulo {
	private double lado;
	private double altura;
	
	public TrianguloEquilatero(double lado, double altura) {
		super();
		this.lado = lado;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (this.lado * this.altura) / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return (3 * this.lado);
	}
}
