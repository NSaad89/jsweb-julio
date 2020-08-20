package ar.com.educacionit.clase2.Buscador;

import ar.com.educacionit.clase2.Interface.Mostrable;
import ar.com.educacionit.clase2.Interface.Paginable;

//herencia de clase abstracta
public final class BuscadorPelicula extends BuscadorBase implements Paginable, Mostrable{
	
	public BuscadorPelicula(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//polimorfismo con redefinición
	/*
	@Override
	public Articulo[] buscar() {
		//busca solo en tipo libro, osea en tipo = 1
		
		//Libro[] libros = new Libro[3];
		
		Articulo pelicula1 = new Articulo("Harry Potter y el Prisionero de Askaban", 490.99f, "J. K. Rowling");
		
		
		return new Articulo[] {pelicula1};
	}
	*/
	//implementamos el método abstracto del padre
	@Override
	public String getSQLHija() {
		
		StringBuffer consulta = new StringBuffer("WHERE TIPO_ARTICULO = 3");
		consulta.append("AND");
		consulta.append("TITULO LIKE %");
		consulta.append(this.clave);
		consulta.append("%");
		
		
		return consulta.toString();
		
	}
	
	public void paginar() {
		System.out.println("Paginando... BuscadorPelícula");
		
	}

	public String mostrar() {
		
		return "Mostrando... BuscadorPelícula";
		
	}

}
