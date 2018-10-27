package offtopic.celulares.dominio;

public class Iphone8 extends Iphone implements Validador {
	private String huella;

	public Iphone8(long imei, String marca, Usuario propietario) {
		super(imei, marca, propietario);
		this.huella = propietario.getHuella();
	}
	
	@Override
	public boolean validar(Usuario usuario) {
		boolean puedeEntrar = false;
		
		if(usuario.getHuella() != null && this.huella.equals(usuario.getHuella())) {
			puedeEntrar = true;
		} else {
			puedeEntrar = super.validar(usuario);
		}
		
		return puedeEntrar;
	}

	public void setHuella(String huella) {
		this.huella = huella;
	}
}
