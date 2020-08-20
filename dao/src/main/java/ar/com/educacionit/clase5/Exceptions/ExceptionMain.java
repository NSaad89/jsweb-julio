package ar.com.educacionit.clase5.Exceptions;

import ar.com.educacionit.clase2.Buscador.BuscadorBase;
import ar.com.educacionit.clase2.Buscador.BuscadorGeneral;
import ar.com.educacionit.clase2.Buscador.BuscadorLibro;
import ar.com.educacionit.clase2.Buscador.BusquedaException;
import ar.com.educacionit.clase2.Model.Articulo;

public class ExceptionMain {

	public static void main(String[] args) {
		
		BuscadorBase b = new BuscadorLibro("java eduit");
		
		try {
			
			Articulo[] articulos = b.buscar();
			
		}catch (NullPointerException e) {
			
			System.out.println(e);
			
			b = new BuscadorGeneral("clave");
			
			System.out.println("Recuperado!!");
			
		} catch (BusquedaException be) {
			
			be.printStackTrace();
			
			System.out.println(be.getMessage());
		}

	}

}
