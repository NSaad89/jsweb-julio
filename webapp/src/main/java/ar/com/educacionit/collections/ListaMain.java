package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.domain.Producto;

public class ListaMain {

	public static void main(String[] args) {
		
		Producto producto = new Producto(1L, "", 100F, "");
		
		Collection <Producto> productos = new ArrayList<Producto>();
		
		//tamaño de la colección
		
		productos.size();
		
		//agregar elementos
		
		productos.add(producto);
		
		//eliminar elementos
		
		productos.remove(producto);
		
		//recorrer sin eliminar
		
		for(Producto aux : productos) {
			
		}

	}

}
