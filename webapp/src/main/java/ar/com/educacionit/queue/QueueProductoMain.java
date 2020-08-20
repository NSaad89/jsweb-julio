package ar.com.educacionit.queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import ar.com.educacionit.dao.comparadores.PrecioAscendente;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class QueueProductoMain {

	public static void main(String[] args) throws ServiceException {
		
		ProductoService ps = new ProductoServiceImpl();
		
		Collection<Producto> productos = ps.obtenerTodosProductos();
		
		//Queue
		
		//Queue <Long> idsProductos = new LinkedList<Long>();
		
		//Queue <Long> idsProductos = new PriorityQueue<Long>();
		
		Queue <Producto> idsProductos = new PriorityQueue<>();
		
		//Queue <Producto> idsProductos = new PriorityQueue<>(new PrecioAscendente());
		
		// Agregando elementos a la cola
		
//		idsProductos.offer(10L);
//		
//		idsProductos.offer(5L);
//		
//		idsProductos.offer(20L);
//		
//		idsProductos.offer(1L);
		
		idsProductos.addAll(productos);
		
		//idsProductos.peek(); -> quien es el siguiente
		//idsProductos.poll(); -> atiendo al siguiente, quito de la cola
		
		//recorro los elementos de la cola
		
		//Iterator<Long> idsIterator = idsProductos.iterator();
		
		Iterator<Producto> idsIterator = idsProductos.iterator();
		
		while (idsIterator.hasNext()) {
			
			System.out.println("El siguiente en la fila es: " + idsProductos.peek());
			
			//Long idAtendido = idsProductos.poll();
			
			Producto idAtendido = idsProductos.poll();
			
			System.out.println("Quedan por atender: " + idsProductos.toString());
			
		}

		//Collections.sort(new ArrayList(productos),new PrecioAscendente());
		
	}

}
