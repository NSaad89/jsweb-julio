package org.ui;

import java.util.Collection;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class FindAllProductosMain {

	public static void main(String[] args) throws Exception {
		
		ProductoDAO pdao = new ProductoDAOJDBCImpl();
		
		//Producto [] productos = pdao.findAll();
		
		Collection <Producto> productos = pdao.findAll();
		
		for (Producto producto : productos) {
			
			System.out.println("Id: " + producto.getId());
			System.out.println("Descripción: " + producto.getDescripcion());
			System.out.println("Precio: " + producto.getPrecio());
			System.out.println("Código: " + producto.getCodigo());
			
		}

	}

}
