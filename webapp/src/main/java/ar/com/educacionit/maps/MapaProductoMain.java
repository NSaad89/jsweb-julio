package ar.com.educacionit.maps;

import java.sql.PseudoColumnUsage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

public class MapaProductoMain {
	
	private static ProductoService ps = new ProductoServiceImpl();

	public static void main(String[] args) throws ServiceException {
		
		// creación del mapa
		
		Map<Long, Producto> mapaProductos = new HashMap<>();
		
		Map<Long, Producto> mapaProductosPares = new HashMap<>();
		
		// agregar elementos al mapa
		
		//vacio
		
		boolean isMapaVacio = mapaProductos.isEmpty();
		
		//clave
		
		Long clave = 1L;
		
		Long clave2 = 2L;
		
		//valor
		
		Producto valor = new Producto("Mate Listo", 1500f, "a200");
		
		Producto valor2 = new Producto(2L, "Mate Listo 2", 2500f, "a300");
		
		mapaProductos.put(clave, valor);
		
		System.out.println(mapaProductos.toString());
		
		mapaProductos.put(clave2, valor2);
		
		// agrego al segundo mapa todos los valores del primero
		
		mapaProductosPares.putAll(mapaProductos);
		
		//mostrar
		
		System.out.println(mapaProductos.toString());
		
		//obtener las claves
		
		Set<Long> claves = mapaProductos.keySet();
		
//		Iterator<Long> itClaves = claves.iterator();
//		
//		while (itClaves.hasNext()) {
//			
//			Long claveAux = itClaves.next();
//			
//			System.out.println(claveAux);
//			
//		}
		
		// determinar si existe una clave ya cargada
		
//		boolean contieneClave = mapaProductos.containsKey(3L);
//		
//		System.out.println("El mapa " + (contieneClave ? "SI" : "NO") + " contiene la clave " + 3L);
		
		// obtener los valores de un mapa
		
//		Collection<Producto> valores = mapaProductos.values();
//		
//		for (Producto valorAux : valores) {
//			
//			System.out.println(valorAux);
//			
//		}
		
		// ahora voy a intentar obtener clave y valor en un mismo bloque de código
		
//		for (Long key : claves) {
//			
//			System.out.println(key);
//			
//			Producto value = mapaProductos.get(key);
//			
//			System.out.println(value);
//			
//		}
		
		// ahora voy a actualizar un producto mediante su clave
		
		for (Long key : claves) {
			
			Producto value = mapaProductos.get(key);
			
			if(key.equals(2L)) {
				
				Float nuevoPrecio = value.getPrecio() * 1.1F;
				
				value.setPrecio(nuevoPrecio);
				
				//actualizar producto en la DB
				
				ps.actualizarProducto(value);
				
			}
			
			System.out.println(value);
			
		}
		
		// map.entry()
		
		// Set<Entry<Long, Producto>> entrySet = mapaProductos.entrySet();
		
		// con el iterator recorro el entrySet
		
		Iterator<Entry<Long, Producto>> itEntrySet = mapaProductos.entrySet().iterator();
		
		while (itEntrySet.hasNext()) {
			
			Entry<Long, Producto> entry = itEntrySet.next();
			
			Long key = entry.getKey();
			
			Producto value = entry.getValue();
			
			System.out.println(key + " - " + value);
			
		}
		
		// obtener un valor dado su clave
		
//		Producto nombre = mapaProductos.get(1L);
		
		//System.out.println(nombre);
		
		//eliminar valor de un mapa
		
//		Producto pe = mapaProductos.remove(1L);
//		
//		System.out.println(mapaProductos);
//		
//		System.out.println(pe);
		
	}

}
