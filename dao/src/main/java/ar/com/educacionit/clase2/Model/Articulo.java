package ar.com.educacionit.clase2.Model;

public class Articulo {
	
	protected String titulo;
	protected float precio;
	protected String autor;
	
	public Articulo () {
		
		this.autor = "J. K. Rowling";
		this.precio = 1500;
		this.titulo = "Harry Potter";
		
	}

	public Articulo(String titulo, float precio, String autor) {
		this.titulo = titulo;
		this.precio = precio;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
