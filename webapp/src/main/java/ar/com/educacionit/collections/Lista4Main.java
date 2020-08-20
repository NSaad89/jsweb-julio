package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Lista4Main {

	public static void main(String[] args) {
		
		Long valor = 100L;
		
		Collection <Long> duplicados = new ArrayList<Long>();
		
		duplicados.add(valor);
		duplicados.add(valor);
		duplicados.add(valor);
		
		System.out.println(duplicados);
		
		//filtro/elimino los duplicados
		
		duplicados = new HashSet<Long>(duplicados);
		
		System.out.println(duplicados);

	}

}
