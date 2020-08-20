package ar.com.educacionit.clase4;

public class Producto {
	
	private int id;
	private double precio;
	private String descripcion;
	
	public Producto() {
		
	}

	public Producto(int id, double precio, String descripcion) {
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public String toString() {
		return "Producto [id=" + id + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}

}
