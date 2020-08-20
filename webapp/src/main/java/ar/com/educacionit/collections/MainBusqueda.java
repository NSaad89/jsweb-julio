package ar.com.educacionit.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import ar.com.educacionit.dao.comparadores.PrecioAscendente;
import ar.com.educacionit.dao.comparadores.Descendente;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class MainBusqueda {

	public static void main(String[] args) throws ServiceException {
		
		// Combo de ordenamiento
		
		Set <String> orden = new HashSet<String>();
		
		orden.add("A");
		orden.add("D");
		
		Collection <Producto> pds = new ProductoServiceImpl().obtenerTodosProductos();
		
		String ordenSeleccionado = "D";
		
		Collection <Producto> ordenados = null;
		
		if(orden.contains(ordenSeleccionado)) {
			
			if(ordenSeleccionado.equals("A")) {
				
				ordenados = new TreeSet<Producto>(new PrecioAscendente());
				
			} else {
				
				ordenados = new TreeSet<Producto>(new Descendente());
				
			}
			
			ordenados.addAll(pds);
			
		}
		
		System.out.println(ordenados);

	}

}
