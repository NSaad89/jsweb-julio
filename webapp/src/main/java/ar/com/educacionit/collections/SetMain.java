package ar.com.educacionit.collections;

import java.util.Collection;
import java.util.HashSet;

import ar.com.educacionit.domain.Producto;

public class SetMain {

	public static void main(String[] args) {
		
		Producto producto = new Producto("mate1", 100f, "001");
		
		Producto producto2 	= new Producto("mate1", 100f, "001");
		
		Collection <Producto> productos = new HashSet<>();
		
		productos.add(producto);
		
		productos.add(producto2);
		
		System.out.println(productos);

	}

}
