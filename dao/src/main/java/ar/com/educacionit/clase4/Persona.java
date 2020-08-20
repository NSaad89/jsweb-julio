package ar.com.educacionit.clase4;

public abstract class Persona {
	
	protected int id;
	protected String nombre;
	protected String apellido;
	protected Telefono telefono;
	protected Domiciliod domicilio;
	
	public Persona() {
		
	}
	
	public Persona(int id, String nombre, String apellido, Telefono telefono, Domiciliod domicilio) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", domicilio=" + domicilio + "]";
	}
	
	public String getNombreCompleto() {
		return StringUtils.wordtoCamelCase(apellido) + ", " + StringUtils.wordtoCamelCase(nombre);
	}
	
}
