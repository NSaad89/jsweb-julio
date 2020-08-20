package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase2.Buscador.BuscadorBase;
import ar.com.educacionit.clase2.Buscador.BuscadorPelicula;
import ar.com.educacionit.clase2.Buscador.BusquedaException;
import ar.com.educacionit.clase2.Model.Articulo;

public class BuscadorMain {

	public static void main(String[] args) {
		
		String claveBuscadaEnLaPantalla = "Harry Potter";
		
		BuscadorBase buscador = new BuscadorPelicula(claveBuscadaEnLaPantalla);

		Articulo[] resultados;
		
		try {
			
			resultados = buscador.buscar();
			
			for (Articulo articulo : resultados) {
				
				System.out.println(articulo.getAutor());
				System.out.println(articulo.getPrecio());
				System.out.println(articulo.getTitulo());
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Mostrando... ");
		
		
	}

}
