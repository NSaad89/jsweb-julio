package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase2.Buscador.BuscadorBase;
import ar.com.educacionit.clase2.Buscador.BuscadorLibro;
import ar.com.educacionit.clase2.Buscador.BuscadorMusica;
import ar.com.educacionit.clase2.Buscador.BuscadorPelicula;
import ar.com.educacionit.clase2.Buscador.BusquedaException;
import ar.com.educacionit.clase2.Interface.Mostrable;
import ar.com.educacionit.clase2.Interface.Ordenable;
import ar.com.educacionit.clase2.Interface.Paginable;
import ar.com.educacionit.clase2.Model.Articulo;

public class SelectorDeBuscadoresConException {

	public static void main(String[] args) {
		
		// libro -> 1
		// musica -> 2
		
		Integer [] tiposBuscadores = {1, 2};
		String claveBuscada = "Gladiador";
		
		BuscadorBase [] buscadores = new BuscadorBase[tiposBuscadores.length];
		
		for(int i = 0; i < tiposBuscadores.length; i++) {
			
			switch (tiposBuscadores[i]) {
			case 1:
				buscadores[i] = new BuscadorLibro(claveBuscada);
				break;
			case 2:
				buscadores[i] = new BuscadorMusica(claveBuscada);
				break;
			case 3:
				buscadores[i] = new BuscadorPelicula(claveBuscada);
				break;
			default:
				break;
			}
			 
		}
		
		//ejecutar la búsqueda y obtener los Articulos
		
		Articulo [] articulos = new Articulo[5];
		int idxArticulo = 0;
		
		for(BuscadorBase buscador : buscadores) {
			
			try {
				
				Articulo [] resultados = buscador.buscar();
				
				for (Articulo resultado : resultados) {
					
					articulos [idxArticulo] = resultado;
					idxArticulo++;
					
				}
				
				}catch(Exception e){
					
					System.out.println(e.getMessage());
					
				}
			
		}
			
			
		//muestro los resultados
		
		for (Articulo articulo : articulos) {
			
			if (articulo !=null) {
			System.out.println(articulo.getAutor());
			System.out.println(articulo.getPrecio());
			System.out.println(articulo.getTitulo());
			
			}
		}

		//upcasting & downcasting con objetos
		
		for(BuscadorBase buscador : buscadores) {
			
			if(buscador instanceof Paginable) {
				
			}
			
			if(buscador instanceof Mostrable) {
				
			}
			
			if(buscador instanceof Ordenable) {
				
			}
			
			if(buscador instanceof BuscadorLibro) {
				//downcasting c/ variable auxiliar
				BuscadorLibro bl = (BuscadorLibro)buscador;
				System.out.println(bl.getCantTotRes());
				
				//downcasting s/ variable auxiliar
				//((BuscadorLibro)buscador).getCantTotRes();
				
				//upcasting
				String claveEnPadreString = ((BuscadorBase)bl).getClave();
			}
		}
		
	}

}
