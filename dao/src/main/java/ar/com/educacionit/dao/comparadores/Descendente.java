package ar.com.educacionit.dao.comparadores;

import java.util.Comparator;

import ar.com.educacionit.domain.Producto;

public class Descendente implements Comparator<Producto>{
	
	/**
	 * Comparador de precio descendente
	 */
	
	public int compare(Producto o1, Producto o2) {
		
		return o1.getPrecio().compareTo(o2.getPrecio());
	}

}
