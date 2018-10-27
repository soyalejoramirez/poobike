package offtopic.celulares.dominio;

public class IPhonePOO extends Iphone8 implements Validador {
	private String faceID;
	
	public IPhonePOO(long imei, String marca, Usuario propietario) {
		super(imei, marca, propietario);
		this.faceID = propietario.getRostro();
	}
	
	@Override
	public boolean validar(Usuario usuario) {
		boolean puedeEntrar = false;
		
		if(usuario.getRostro() != null && this.faceID.equals(usuario.getRostro())) {
			puedeEntrar = true;
		} else {
			puedeEntrar = super.validar(usuario);
		}
		
		return puedeEntrar;
	}
	
	public void setFaceID(String faceID) {
		this.faceID = faceID;
	}
}
