package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase5.Exceptions.Checked.CredencialesInvalidasException;

public class ConexionDBMain {

	public static void main(String[] args) {
		
		//conectar a db
		AdministradorConexiones ac = new AdministradorConexiones("Inválido", "Inválido");
		
		Conexion con;
		
		try {
		
			con = ac.obtenerConexion();
		
		}catch (CredencialesInvalidasException cie) {
			
			System.out.println("No se ha podido conectar a la DB: " + cie.getMensajePersonalizado());
			
			ac.setUserName("eduit");
			ac.setPassword("eduit");
	
		}
	}

}
