package ar.com.educacionit.clase5.Exceptions;

import ar.com.educacionit.clase2.Buscador.BuscadorBase;
import ar.com.educacionit.clase2.Buscador.BusquedaException;

public class NullPointerExceptionMain {
	
	public static void main (String [] args) {
	
	BuscadorBase buscador = null; 
	
	try {
		
		buscador.buscar();
		
	} catch (BusquedaException e) {
		
		e.printStackTrace();
		
	}
	
	System.out.println("Fin");
	

	}
	
}
