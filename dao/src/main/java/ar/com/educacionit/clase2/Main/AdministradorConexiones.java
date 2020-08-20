package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase5.Exceptions.Checked.CredencialesInvalidasException;

public class AdministradorConexiones {

	private String userName;
	private String password;
	
	public AdministradorConexiones(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		
	}

	public void setPassword(String password) {
		this.password = password;
		
	}

	public Conexion obtenerConexion() throws CredencialesInvalidasException{
		
		if(!this.userName.equals("eduit") && !this.password.equals("eduit")) {
			
			//lanzar manualmente una CredencialesInvalidadException
			
			throw new CredencialesInvalidasException("Usuario/Password Inválidos");			
			
		}
		
		return new Conexion();
	}

} 