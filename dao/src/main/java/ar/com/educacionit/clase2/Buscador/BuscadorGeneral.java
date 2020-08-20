package ar.com.educacionit.clase2.Buscador;

public class BuscadorGeneral extends BuscadorBase {

	public BuscadorGeneral(String clave) {
		super(clave);
	}

	@Override
	public String getSQLHija() {
		
		//busca en todos los articulos
		
		StringBuffer consulta = new StringBuffer("WHERE TIPO_ARTICULO IN (1, 2, 3, 4)");
		consulta.append("AND");
		consulta.append("TITULO LIKE %");
		consulta.append(this.clave);
		consulta.append("%");
		
		
		return consulta.toString();
	}
	
	/*
	 System.out.println("Buscando " + this.clave);
	 
	
	Libro l = new Libro("Harry Potter y las Reliquias de la Muerte", 2229f, "J. K. Rowling", false);
	Musica m = new Musica("Luis Miguel, La Serie", 915.99f, "Varios Interpretes");
	Pelicula p = new Pelicula("Harry Potter y el Prisionero de Askaban", 490.99f, "J. K. Rowling");
	
	Articulo[] articulos = {l, m, p};
	
	System.out.println("Se encontraron " + articulos.length + " resultados");
	
	return articulos;
	
	*/
	
	@Override
	public String getOrden() {
		return "ORDER BY TÍTULO DESC";
	}

}