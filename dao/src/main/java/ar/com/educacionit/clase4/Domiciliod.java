package ar.com.educacionit.clase4;

public class Domiciliod {
	
	private int id;
	private String calle;
	private String localidad;
	private int numero;
	
	public Domiciliod() {
		
	}

	public Domiciliod(int id, String calle, String localidad, int numero) {
		this.id = id;
		this.calle = calle;
		this.localidad = localidad;
		this.numero = numero;
	}

	public String toString() {
		return "id=" + id + ", calle=" + calle + ", localidad=" + localidad + ", numero=" + numero;
	}
	
}
