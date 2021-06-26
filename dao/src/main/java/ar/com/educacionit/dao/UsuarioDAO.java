package ar.com.educacionit.dao;

import ar.com.educacionit.clase5.Exceptions.InvalidUserException;
import ar.com.educacionit.domain.Usuario;

public interface UsuarioDAO {
	
	public Usuario getByUsernameAndPassword (String username, String password) throws InvalidUserException, Exception;

}
