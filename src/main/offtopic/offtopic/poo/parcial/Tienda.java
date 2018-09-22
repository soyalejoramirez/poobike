package offtopic.poo.parcial;

import java.util.ArrayList;

public class Tienda {
	private String nombre;
	private int capacidadDelStock;
	private int capacidadActual;
	private ArrayList<Celular> celulares;
	
	public Tienda(String nombre, int capacidadDelStock) {
		this.nombre = nombre;
		this.capacidadDelStock = capacidadDelStock;
		this.capacidadActual = this.capacidadDelStock;
		this.celulares = new ArrayList<>();
	}
	
	public boolean agregar(Celular c) {
		boolean puedeAgregar;
		boolean yaExiste = false;
		
		for (Celular celular : celulares) {
			if(celular.getSerial() == c.getSerial()) {
				yaExiste = true;
				break;
			}
		}
		
		if(yaExiste) {
			puedeAgregar = false;
		} else {
			if(capacidadActual > 0) {				
				this.celulares.add(c);
				capacidadActual--;
				puedeAgregar = true;
			} else {
				puedeAgregar = false;
			}
		}
		
		return puedeAgregar;
	}
	
	public Celular buscar(long serial) {
		Celular celularBuscado = null;
		
		for (Celular celular : celulares) {
			if(celular.getSerial() == serial) {
				celularBuscado = celular;
				break;
			}
		}
		
		return celularBuscado;
	}
	
	public ArrayList<Celular> buscar(String marca) {
		ArrayList<Celular> celularesBuscados = new ArrayList<>();
		
		for (Celular celular : celulares) {
			if(celular.getMarca().equalsIgnoreCase(marca)) {
				celularesBuscados.add(celular);
				break;
			}
		}
		
		return celularesBuscados;
	}
	
	public ArrayList<Celular> buscar(boolean soloNuevos) {
		ArrayList<Celular> celularesBuscados = new ArrayList<>();
		
		for (Celular celular : celulares) {
			if(celular.isNuevo() == soloNuevos) {
				celularesBuscados.add(celular);
				break;
			}
		}
		
		return celularesBuscados;
	}
	
	public ArrayList<Celular> buscarQueValgaMenosDe(int precio) {
		ArrayList<Celular> celularesBuscados = new ArrayList<>();
		
		for (Celular celular : celulares) {
			if(celular.getPrecio() <= precio) {
				celularesBuscados.add(celular);
				break;
			}
		}
		
		return celularesBuscados;
	}
	
	public void vender(Celular celularAVender) {
		if(this.buscar(celularAVender.getSerial()) != null) {
			this.celulares.remove(celularAVender);
			this.capacidadActual++;
		}
	}
	
	public int getCapacidadActual() {
//		return this.capacidadDelStock - this.celulares.size();
		return this.capacidadActual;
	}
	
	public String getNombre() {
		return nombre;
	}
}










