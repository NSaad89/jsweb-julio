package ar.com.educacionit.servlets.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
	
	public static void main(String[] args) {
		
//		List<Integer> precios = Arrays.asList(100, 200, 300);
//		
////		Stream<Integer> st = precios.stream();
////		
////		Stream<Integer> stFiltrado = st.filter(precio -> precio > 100);
////				
////		List<Integer> filtrados = stFiltrado.collect(Collectors.toList());
//		
//		Double filtrados = precios.stream()
//				.filter(precio -> precio > 100)
//				.map(precioFiltrado -> new Double(precioFiltrado))
//				//.collect(Collectors.toList());
//				.reduce(0D, Double::sum);
//		
//		System.out.println(filtrados);
		
		for(int i=0;i<10;i++){  if (i % 2==0)System.out.println("Hola Java");  }
		
	}

}
