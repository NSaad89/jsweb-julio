package ar.com.educacionit.clase5.Exceptions.Checked;

public class CredencialesInvalidasException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String mensajePersonalizado;

	public CredencialesInvalidasException(String message) {
		super(message);
		this.mensajePersonalizado = message;
	}

	public String getMensajePersonalizado() {
		
		StringBuffer str = new StringBuffer("Las credenciales no son válidas. ").append(this.mensajePersonalizado);
		
		return str.toString();
	}

	public void setMensajePersonalizado(String mensajePersonalizado) {
		this.mensajePersonalizado = mensajePersonalizado;
	}
	
}
