package ar.com.educacionit.clase4.Cine;

public class Entrada {

	private String tipo;
	private String lugar;
	
	public Entrada() {
		
		this.lugar = "Aleatorio";
		this.tipo = "Común";
		
	}
	
	
	public Entrada(String tipo, String lugar) {
		this.tipo = tipo;
		this.lugar = lugar;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
}
