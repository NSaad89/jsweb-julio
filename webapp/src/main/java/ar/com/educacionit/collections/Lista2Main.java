package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ar.com.educacionit.domain.Producto;

public class Lista2Main {

	public static void main(String[] args) {
		
		Producto producto = new Producto(1L, "", 100F, "");
		
		Collection <Producto> productos = new ArrayList<Producto>();
		
		productos.add(producto);
		
		Producto producto2 = new Producto(2L, "LG K10", 1000F, "LGK10");
		
		productos.add(producto2);
		
		Producto producto3 = new Producto(3L, "LG K10", 1000F, "LGK10");
		
		productos.add(producto3);
		
		//iterator
		
		//Iterator <Producto> itProducto = productos.iterator();
		
		//recorro (y modifico)
		
//		while(itProducto.hasNext()) {
//			
//			Producto aux = itProducto.next();
//			
//			aux.setDescripcion("Nueva Descripción");
//			
//		}
		
		for (Producto aux : productos) {
			
			//comienza la eliminación de los productos
			
			productos.remove(aux);
			
			//System.out.println(aux);
			
		}
		
		System.out.println(productos.isEmpty());
		System.out.println(productos.size() == 0);

	}

}
