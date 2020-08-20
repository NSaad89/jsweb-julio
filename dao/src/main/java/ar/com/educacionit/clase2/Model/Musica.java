package ar.com.educacionit.clase2.Model;

public class Musica extends Articulo {
	
	private float duracion;

	public Musica(String titulo, float precio, String autor) {
		super(titulo, precio, autor);
	}

	public float getDuracion() {
		return duracion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	
	

}
