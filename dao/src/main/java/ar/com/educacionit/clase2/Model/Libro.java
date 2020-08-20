package ar.com.educacionit.clase2.Model;

public class Libro extends Articulo {
	
	private boolean texto;
	
	public Libro (String titulo, float precio, String autor, boolean isTexto) {
		super(titulo, precio, autor);
		this.texto = isTexto;
	}

	public boolean isTexto() {
		return texto;
	}

	public void setTexto(boolean texto) {
		this.texto = texto;
	}
	
	

}
