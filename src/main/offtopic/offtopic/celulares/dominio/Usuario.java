package offtopic.celulares.dominio;

public class Usuario {
	private String nombre;
	private int codigo;
	private String patron;
	private String rostro;
	private String huella;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPatron() {
		return patron;
	}
	public void setPatron(String patron) {
		this.patron = patron;
	}
	public String getRostro() {
		return rostro;
	}
	public void setRostro(String rostro) {
		this.rostro = rostro;
	}
	public String getHuella() {
		return huella;
	}
	public void setHuella(String huella) {
		this.huella = huella;
	}
}
