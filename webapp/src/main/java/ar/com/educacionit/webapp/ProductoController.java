package ar.com.educacionit.webapp;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class ProductoController {
	
	public static void main (String [] args) {
	
	ProductoService ps = new ProductoServiceImpl();
	
	try {
		Producto producto = ps.obtenerProductoPorId(2L);
		
		System.out.println(producto);
		
	} catch (ServiceException e) {
		
		System.err.println(e);
	}
	
	}

}
