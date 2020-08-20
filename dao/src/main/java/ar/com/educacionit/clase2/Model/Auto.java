package ar.com.educacionit.clase2.Model;

public class Auto extends Vehiculo{
	
	//atributos
	private String color;
	private boolean encendido;
	private float velocidadMaxima;
	private double velocidadTuningMaxima;
	private int anio;
	private char letra;
	private long cantidadNafta;
	

	
	//constructores
	// por defecto
	public Auto() {
		color = "gris";
		anio = 2020;
		velocidadMaxima = 200.1f;
		velocidadTuningMaxima = 200.1d;
		
	}
	
	//constructor parametrizado
	public Auto (int anio, String color) {
		this.anio = anio;
		this.color = color;
	}
	
	//GET/SET
	public String getColor () {
		return this.color;
	}
	
	public void setColor(String nuevoColor) {
		this.color = nuevoColor;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadTuningMaxima() {
		return velocidadTuningMaxima;
	}

	public void setVelocidadTuningMaxima(double velocidadTuningMaxima) {
		this.velocidadTuningMaxima = velocidadTuningMaxima;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public long getCantidadNafta() {
		return cantidadNafta;
	}

	public void setCantidadNafta(long cantidadNafta) {
		this.cantidadNafta = cantidadNafta;
	}
	

	}



