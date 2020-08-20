package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ar.com.educacionit.domain.Producto;

public class Lista3Main {

	public static void main(String[] args) {
		
		Collection <Producto> productos = new ArrayList<Producto>();
		
		Producto producto = new Producto(1L, "", 100F, "");
		
		productos.add(producto);
		
		Producto producto2 = new Producto(2L, "LG K10", 1000F, "LGK10");
		
		productos.add(producto2);
		
		Producto producto3 = new Producto(3L, "LG K10", 1000F, "LGK10");
		
		productos.add(producto3);
		
		//iterator
		
		Iterator <Producto> itProducto = productos.iterator();
		
		//recorro y elimino
		
		while(itProducto.hasNext()) {

			Producto aux = itProducto.next();
			
			itProducto.remove();
			
		}
		
		System.out.println(productos.isEmpty());
		System.out.println(productos.size() == 0);

	}

}
