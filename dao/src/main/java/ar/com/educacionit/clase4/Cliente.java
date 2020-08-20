package ar.com.educacionit.clase4;

public class Cliente extends Persona {
	
	private int numeroCliente;
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, String apellido, Telefono telefono, Domiciliod domicilio, int numeroCliente) {
		super(id, nombre, apellido, telefono, domicilio);
		this.numeroCliente = numeroCliente;
	}

	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + 
				", domicilio=" + domicilio + ", numeroCliente=" + numeroCliente + "]";
	}

}
