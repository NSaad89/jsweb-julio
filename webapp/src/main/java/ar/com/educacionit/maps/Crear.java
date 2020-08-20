package ar.com.educacionit.maps;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exceptions.ServiceException;

public class Crear extends AccionBase implements Ejecutable {

	@Override
	public void ejecutar(Producto p) {
		
		try {
			
			ps.crearProducto(p);
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
			
		}

	}

}
