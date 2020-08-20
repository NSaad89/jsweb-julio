package ar.com.educacionit.maps;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;

public class Eliminar extends AccionBase implements Ejecutable {

	public Eliminar() {
		
	}

	@Override
	public void ejecutar(Producto p) {
		
		try {
			
			Producto productoEliminado = this.ps.eliminar (p.getId());
			
		} catch (ServiceException e) {
			
			e.printStackTrace();
			
		}

	}

}
