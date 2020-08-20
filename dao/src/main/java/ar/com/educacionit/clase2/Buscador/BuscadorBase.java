package ar.com.educacionit.clase2.Buscador;

import ar.com.educacionit.clase2.Interface.Ordenable;
import ar.com.educacionit.clase2.Main.AdministradorConexiones;
import ar.com.educacionit.clase2.Main.Conexion;
import ar.com.educacionit.clase2.Main.ConexionDBMain;
import ar.com.educacionit.clase2.Model.Articulo;
import ar.com.educacionit.clase2.Model.Libro;
import ar.com.educacionit.clase5.Exceptions.Checked.CredencialesInvalidasException;

public abstract class BuscadorBase implements Ordenable{
	
	protected String clave;

	public BuscadorBase(String clave) {
		this.clave = clave;
	}
	
	//se deja que las clases hijas definan la "query" (consulta)
	public abstract String getSQLHija();
	
	public final Articulo [] buscar() throws BusquedaException {

		String consultaBase = "SELECT * FROM ARTICULO";
		
		//delega en el hijo
		String sqlHija = getSQLHija();
		
		String consultaFinal = consultaBase + sqlHija;
		
		//ejecutar consultaFinal
		
		Articulo [] resultados = ejecutarConsulta(consultaFinal);
				
		return resultados;
		
	}
	
	public Articulo[] ejecutarConsulta(String sql) throws BusquedaException {
		//base de datos...
		
		AdministradorConexiones adc = new AdministradorConexiones("Inválido", "Inválido");
		
		try {
			
			Conexion c = adc.obtenerConexion();
			
			Libro libro1 = new Libro("Harry Potter y el Caliz de Fuego", 1219f, "J. K. Rowling", false);
			Libro libro2 = new Libro("Harry Potter y las Reliquias de la Muerte", 2229f, "J. K. Rowling", false);
			Libro libro3 = new Libro("Harry Potter y el Legado Maldito", 2390f, "J. K. Rowling", false);
			
			return new Articulo[] {libro1, libro2, libro3};
			
		} catch (CredencialesInvalidasException e) {
			
			throw new BusquedaException("No se pudo ejecutar la consulta " + sql, e);
			
		}
		
	}

	public String getClave() {
		return clave;
	}
	
	public String getOrden() {
		return "ORDER BY 1";
	}
	
}
