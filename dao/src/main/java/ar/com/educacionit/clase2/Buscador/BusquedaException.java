package ar.com.educacionit.clase2.Buscador;

import ar.com.educacionit.clase5.Exceptions.Checked.CredencialesInvalidasException;

public class BusquedaException extends Exception {

	public BusquedaException(String mensaje, CredencialesInvalidasException eo) {
		
		super(mensaje, eo);
		
	}

	
	
}
