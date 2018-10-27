package offtopic.celulares.dominio;

public abstract class Celular implements Activador {
	protected long imei;
	private   boolean encendido;
	protected String marca;
	protected Usuario propietario;
	
	public Celular(long imei, String marca, Usuario propietario) {
		this.imei = imei;
		this.marca = marca;
		this.propietario = propietario;
	}
	
	@Override
	public void on() {
		this.encendido = true;
	}
	
	@Override
	public void off() {
		this.encendido = false;
	}
	
	public boolean isEncendido() {
		return encendido;
	}
}
