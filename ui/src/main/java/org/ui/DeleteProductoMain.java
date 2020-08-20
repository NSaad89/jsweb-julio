package org.ui;

import ar.com.educacionit.clase5.Exceptions.DAOException;
import ar.com.educacionit.clase5.Exceptions.ProductoNoExisteException;
import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class DeleteProductoMain {

	public static void main(String[] args){

		ProductoDAO pdao = new ProductoDAOJDBCImpl();
		
		Producto prod;
		
		try {
			
			prod = pdao.deleteProducto(1L);
			
			System.out.println("Producto eliminado: " + prod);
			
		} catch (DAOException e) {
			
			e.printStackTrace();
			
		} catch (ProductoNoExisteException e) {

			e.printStackTrace();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}

}
