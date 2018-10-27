package offtopic.celulares.dominio;

public class Iphone extends Celular implements Validador {

	private int codigo;
	
	public Iphone(long imei, String marca, Usuario propietario) {
		super(imei, marca, propietario);
		this.codigo = propietario.getCodigo();
	}
	
	@Override
	public boolean validar(Usuario usuario) {
		boolean puedeEntrar = false;
		
		if(usuario.getCodigo() > 0 && usuario.getCodigo() == this.codigo) {
			puedeEntrar = true;
		}
		
		return puedeEntrar;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
