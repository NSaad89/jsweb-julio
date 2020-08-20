package ar.com.educacionit.clase3;

public class Auto extends Vehiculo {
	
	String marca;
	String modelo;
	String color;
	
	public Auto(int ancho, int alto, int largo, String marca, String modelo, String color) {
		super(ancho, alto, largo);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String toString() {
		
		return "Ancho: " + ancho + ", Alto: " + alto + ", Largo: " + largo + 
				", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color;
	}

}
