package ar.com.educacionit.clase3;

public class Comprador extends Persona {
	
	private double presupuesto;

	public Comprador(String nombre, String apellido, String numeroDocumento, double presupuesto) {
		super(nombre, apellido, numeroDocumento);
		this.presupuesto = presupuesto;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", N° Documento: " + 
				getNumeroDocumento() + ", Presupuesto: " + presupuesto;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	

}
