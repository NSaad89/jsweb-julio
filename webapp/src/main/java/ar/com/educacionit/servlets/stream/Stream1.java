package ar.com.educacionit.servlets.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream1 {
	
	public static void main(String[] args) {
		
		List<Integer> precios = Arrays.asList(100, 200, 300);
		
		List<Integer> filtrados = new ArrayList<>();
		
		//filtrados
		for (Integer precio : precios) {
			
			if(precio > 100) {
				
				filtrados.add(precio);
				
			}
			
		}
		
		System.out.println(precios);
		
		System.out.println(filtrados);
		
		List<String> textoFiltrado = new ArrayList<String>();
		
		//convertidos
		for (Integer filtrado : filtrados) {
			
			textoFiltrado.add("Valor: " + filtrado);
			
		}
		
		System.out.println(textoFiltrado);
		
		//reducción a un valor
		Long sumados = 0L;
		
		for (Integer precio : precios) {
			
			sumados += precio;
			
		}
		
		System.out.println(sumados);
		
		
		
	}

}
