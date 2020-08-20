package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.clase3.Persona;

public class Vendedor extends Persona {
	
	private int cantAutosVendidos = 10;

	public Vendedor() {
		super();
	}

	public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos) {
		super(nombre, apellido, numeroDocumento);
		this.cantAutosVendidos = cantAutosVendidos;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", N° Documento: " + 
				getApellido() + ", Cantidad de Autos Vendidos: " + cantAutosVendidos;
	}

	public int getCantAutosVendidos() {
		return cantAutosVendidos;
	}

	public void setCantAutosVendidos(int cantAutosVendidos) {
		this.cantAutosVendidos = cantAutosVendidos;
	}
	
	

}
