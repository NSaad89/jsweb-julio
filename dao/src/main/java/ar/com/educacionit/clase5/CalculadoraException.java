package ar.com.educacionit.clase5;

public class CalculadoraException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String descripcion;

	public CalculadoraException(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String getMessage() {
		return this.descripcion;
	}
	
}
