package ar.com.educacionit.clase2.Buscador;

//herencia de clase abstracta
public class BuscadorLibro extends BuscadorBase{
	
	private Integer cantTotRes;
	
	public BuscadorLibro(String claveBuscada) {
		//primero el hijo llama al constructor del padre
		super(claveBuscada);
	}
	
	//polimorfismo con redefinición
	
//	@Override
//	public Articulo[] buscar() {
//		//busca solo en tipo libro, osea en tipo = 1
//		
//		//Libro[] libros = new Libro[3];
//		
//		Libro libro1 = new Libro("Harry Potter y el Caliz de Fuego", 1219f, "J. K. Rowling", false);
//		Libro libro2 = new Libro("Harry Potter y las Reliquias de la Muerte", 2229f, "J. K. Rowling", false);
//		Libro libro3 = new Libro("Harry Potter y el Legado Maldito", 2390f, "J. K. Rowling", false);
//		
//		Articulo [] resultados = new Articulo[] {libro1, libro2, libro3};
//		
//		this.cantTotRes = resultados.length;
//		
//		return resultados;			
//		
//	}

	public Integer getCantTotRes() {
		return cantTotRes;
	}
	
	//implementamos el método abstracto del padre
	@Override
	public String getSQLHija() {
		
		StringBuffer consulta = new StringBuffer("WHERE TIPO_ARTICULO = 1");
		consulta.append("AND");
		consulta.append("TITULO LIKE %");
		consulta.append(this.clave);
		consulta.append("%");
		
		
		return consulta.toString();
	}
	
}
