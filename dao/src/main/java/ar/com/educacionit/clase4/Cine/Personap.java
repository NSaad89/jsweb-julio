package ar.com.educacionit.clase4.Cine;

public abstract class Personap {
	
	protected String nombre;
	public final Integer cantidadOjos = 2;
	
	public Personap(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
