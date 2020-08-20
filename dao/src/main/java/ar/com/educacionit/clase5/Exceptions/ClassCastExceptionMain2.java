package ar.com.educacionit.clase5.Exceptions;

import ar.com.educacionit.clase2.Buscador.BuscadorBase;
import ar.com.educacionit.clase2.Buscador.BuscadorLibro;
import ar.com.educacionit.clase2.Buscador.BuscadorPelicula;

public class ClassCastExceptionMain2 {

	public static void main(String[] args) {
		
		// PADRE P = NEW HIJO ();
		// DINAMIC BINDING
		
		BuscadorBase b = new BuscadorLibro("Mouse");
		
		//downcasting
		BuscadorLibro bl = (BuscadorLibro)b;
		
		if(b instanceof BuscadorPelicula) {
		
			BuscadorPelicula bp = (BuscadorPelicula)b;
			
		}
		
		if(BuscadorPelicula.class.isAssignableFrom(b.getClass())) {
			
			BuscadorPelicula bp = (BuscadorPelicula)b;
			
		}

	}
	

}
