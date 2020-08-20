package ar.com.educacionit.dao.comparadores;

import java.util.Comparator;

import ar.com.educacionit.domain.Producto;

public class PrecioAscendente implements Comparator<Producto>{
	
	/**
	 * Comparador de precio ascendente
	 */
	
	public int compare(Producto o1, Producto o2) {
		
		return o2.getPrecio().compareTo(o1.getPrecio());
	}

}
