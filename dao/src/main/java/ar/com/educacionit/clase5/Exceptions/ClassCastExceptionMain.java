package ar.com.educacionit.clase5.Exceptions;

public class ClassCastExceptionMain {

	public static void main(String[] args) {
		
		// PADRE P = NEW HIJO ();
		// DINAMIC BINDING
		
		Object saludo = 1;
		
		if(saludo != null) {
			
			String valorStr = (String)saludo;
			
			Integer valor = (Integer)saludo;
			
		}

	}

}
