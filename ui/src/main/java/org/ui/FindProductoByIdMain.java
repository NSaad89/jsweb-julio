package org.ui;

import ar.com.educacionit.domain.Producto;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.comparadores.PrecioAscendente;
import ar.com.educacionit.dao.comparadores.Descendente;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;

public class FindProductoByIdMain {

	public static void main(String[] args) throws Exception {
		
		ProductoDAO pdao = new ProductoDAOJDBCImpl();
		
//		pdao.create(new Producto("Mouse", 1000f, "Mouse"));
		
		//buscar por ID de producto
		
		//Producto[] productos = pdao.findAll();
		
		Collection <Producto> productos = pdao.findAll();
		
//		El problema con este bloque de código es que no estoy segura de que el elemento que vaya a venir
//		del findAll() sea de tipo List, por lo tanto no puedo castearlo tan tranquilamente
//		
//		if(!productos.isEmpty()) {
//			
//			Long idProducto = ((List<Producto>) productos).get(0).getId();
//			
//			System.out.println("Consultando todos los registros de la tabla Producto con ID = " + idProducto + "...");
//			
//			Producto prod = pdao.getProductoById(idProducto);
//			
//			System.out.println(prod);
//			
//		}
		
		//Update del precio en 10%
		
		/* 
		 
		for (Producto aux : productos) {
			
			Float nuevoPrecio = aux.getPrecio();
			
			nuevoPrecio *= 1.1f;
			
			aux.setPrecio(nuevoPrecio);
			
		}
		
		Iterator <Producto> it = productos.iterator();
		
		while(it.hasNext()) {
			
			Producto producto = pdao.updateProducto(it.next());
			
			System.out.println(producto);
			
		}
		
		*/
		
		//Ordeno los productos
		
		//productos = new TreeSet<Producto>(productos);
		
		//Armo una nueva collection de tipo TreeSet con un Comparator de tipo Ascendente
		
		Collection <Producto> productosAscendente = new TreeSet<Producto>(new PrecioAscendente());
		
		productosAscendente.addAll(productos);
		
		System.out.println(productosAscendente);
		
		
//		Iterator <Producto> it = productos.iterator();
//		
//		while(it.hasNext()) {
//			
//			Long idProducto = it.next().getId();
//			
//			Producto prod = pdao.getProductoById(idProducto);
//			
//			System.out.println(prod);
//			
//		}
	}

}
