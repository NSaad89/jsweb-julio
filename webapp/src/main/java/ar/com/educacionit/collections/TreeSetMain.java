package ar.com.educacionit.collections;

import java.util.Collection;
import java.util.TreeSet;

import ar.com.educacionit.domain.Producto;

public class TreeSetMain {

	public static void main(String[] args) {
		
		Producto producto = new Producto(1L, "mate1", 100F, "001");
		
		Producto producto2 	= new Producto(2L, "mate1", 100F, "001");
		
		Producto producto3 	= new Producto(3L, "mate1", 100F, "001");
		
		Collection <Producto> productos = new TreeSet<>();
		
		productos.add(producto3);
		
		productos.add(producto);
		
		productos.add(producto2);
		
		System.out.println(productos);

	}

}
