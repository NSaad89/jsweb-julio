package ar.com.educacionit.clase3;

public class Vehiculo {
	
	protected int ancho;
	protected int alto;
	protected int largo;
	
	public Vehiculo(int ancho, int alto, int largo) {
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}
	
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	
}
