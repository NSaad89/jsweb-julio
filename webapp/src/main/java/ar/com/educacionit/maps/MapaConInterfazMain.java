package ar.com.educacionit.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import ar.com.educacionit.domain.Producto;

public class MapaConInterfazMain {

	public static void main(String[] args) {
		
		//Map<Class, Ejecutable> mapaAcciones = new HashMap<Class, Ejecutable>();
		
		Map<String, Ejecutable> mapaAcciones = new HashMap<String, Ejecutable>();
		
		// ahora cargo mi mapa con las acciones
		
		//mapaAcciones.put(Crear.class, new Crear());
		
		mapaAcciones.put("Crear", new Crear());
		
		//mapaAcciones.put(Eliminar.class, new Eliminar());
		
		mapaAcciones.put("Eliminar", new Eliminar());
		
		//Map<String, Class> mapaAccion = new HashMap<>();
		
		//mapaAccion.put("Crear", Crear.class);
		
		//mapaAccion.put("Eliminar", Eliminar.class);
		
		//String accionSeleccionada = "Crear";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese acción: \n");
		
		String accionSeleccionada = teclado.next();
		
		if(mapaAcciones.containsKey(accionSeleccionada)) {
			
			//Class clase = mapaAccion.get(accionSeleccionada);
			
			//Ejecutable accion = mapaAcciones.get(clase);
			
			Ejecutable accion = mapaAcciones.get(accionSeleccionada);
			
			Producto p = new Producto("Mouse Óptico", 1540F, "mouse01");
			
			accion.ejecutar(p);
			
		}else {
			
			System.out.println("No existe la ación seleccionada");
			
		}
		
		teclado.close();

	}

}
