package ar.com.educacionit.clase2.Buscador;

import ar.com.educacionit.clase2.Interface.Mostrable;
import ar.com.educacionit.clase2.Interface.Paginable;

//herencia de clase abstracta
public class BuscadorMusica extends BuscadorBase implements Paginable, Mostrable{
	
	public BuscadorMusica(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//polimorfismo con redefinición
	
	/*@Override
	public Articulo[] buscar() {
		//busca solo en tipo libro, osea en tipo = 1
		
		//Libro[] libros = new Libro[3];
		
		Musica musica1 = new Musica("Luis Miguel, La Serie", 915.99f, "Varios Interpretes");
		
		
		return new Musica[] {musica1};
	}
	*/
	//implementamos el método abstracto del padre
	@Override
	public String getSQLHija() {
		
		StringBuffer consulta = new StringBuffer("WHERE TIPO_ARTICULO = 2");
		consulta.append("AND");
		consulta.append("TITULO LIKE %");
		consulta.append(this.clave);
		consulta.append("%");
		
		
		return consulta.toString();
	}

	public void paginar() {
		System.out.println("Paginando... BuscadorMúsica");
		
	}

	public String mostrar() {
		
		return "Mostrando... BuscadorMúsica";
		
	}
	
}
