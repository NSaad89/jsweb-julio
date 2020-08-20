package org.ui;

import java.util.Scanner;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class UpdateProductoMain {

	public static void main(String[] args) throws Exception {
		
		ProductoDAO pdao = new ProductoDAOJDBCImpl();
		
		Scanner teclado = new Scanner(System.in);
		
		//producto a actualizar
		Producto p = pdao.getProductoById(2L);
		
		System.out.println("Actualizando " + p);
		
		System.out.println("Inserte nueva descripción a continuación...");
		
		String nuevaDescripcion = teclado.nextLine();
		
		System.out.println("Inserte nuevo precio a continuación...");
		
		Float nuevoPrecio = teclado.nextFloat();
		
		p.setDescripcion(nuevaDescripcion);
		
		p.setPrecio(nuevoPrecio);
		
		Producto pActualizado = pdao.updateProducto(p);
		
		System.out.println("Actualización exitosa: " + pActualizado);
		
		teclado.close();
		
		

	}

}
