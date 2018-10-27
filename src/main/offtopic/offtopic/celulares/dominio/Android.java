package offtopic.celulares.dominio;

public class Android extends Celular implements Validador {
	private int codigo;
	private String patron;

	public Android(long imei, String marca, Usuario propietario) {
		super(imei, marca, propietario);
		this.codigo = propietario.getCodigo();
		this.patron = propietario.getPatron();
	}

	@Override
	public boolean validar(Usuario usuario) {
		boolean puedeEntrar = false;
		
		if(usuario.getCodigo() > 0 && usuario.getCodigo() == this.codigo) {
			puedeEntrar = true;
		} else if (usuario.getPatron() != null && 
				this.patron.equals(usuario.getPatron())) {
			puedeEntrar = true;
		}
		
		return puedeEntrar;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}
}
