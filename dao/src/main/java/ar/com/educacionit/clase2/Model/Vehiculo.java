package ar.com.educacionit.clase2.Model;

/*
 * Clase base de los vehículos
 */

public class Vehiculo {
	
	//atributos
		protected String color;
		protected boolean encendido;
		protected float velocidadMaxima;
		protected double velocidadTuningMaxima;
		protected int anio;
		protected char letra;
		protected long cantidadNafta;
		private String marca;
		private String  modelo;
		
		public Vehiculo() {
			this.anio = 2020;
			this.velocidadMaxima = 110;
			this.color = "rojo";
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
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

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

}
