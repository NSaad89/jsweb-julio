package ar.com.educacionit.clase2.Model;

public class Pelicula extends Articulo {
	
	private String genero;

	public Pelicula(String titulo, float precio, String autor) {
		super(titulo, precio, autor);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
