package ar.com.educacionit.service;

import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.service.exceptions.ServiceException;

public interface UsuarioService {
	
	public Usuario Login(String username, String password) throws ServiceException;

}
