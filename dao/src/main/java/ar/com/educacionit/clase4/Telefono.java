package ar.com.educacionit.clase4;

public class Telefono {
	
	private int id;
	private String tipo;
	private String numero;
	
	public Telefono() {
		
	}

	public Telefono(int id, String tipo, String numero) {
		this.id = id;
		this.tipo = tipo;
		this.numero = numero;
	}

	public String toString() {
		return "id=" + id + ", tipo=" + tipo + ", numero=" + numero;
	}
	
}
