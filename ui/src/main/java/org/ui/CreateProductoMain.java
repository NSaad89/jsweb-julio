package org.ui;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;

public class CreateProductoMain 
{
    public static void main( String[] args )
    {
        //interfaz i = new claseImpl
    	
    	ProductoDAO pdao = new ProductoDAOJDBCImpl();
    	
    	//invocar uno de los métodos de la interfaz
    	//creo localmente un nuevo producto, NO aún en la DB
    	
    	Producto productoACrear = new Producto("Mate Listo", 2550f, "a0200");
    	
    	//invoco a la clase para crear el registro en la DB
    	
    	try {
    		
			Producto productoCreado = pdao.create(productoACrear);
			
			System.out.println("Se ha creado exitosamente el producto " + productoCreado.getDescripcion() +
					" con id: " + productoACrear.getId());
			
		} catch (Exception e) {
			
				System.err.println(e);
		}
    }
}
