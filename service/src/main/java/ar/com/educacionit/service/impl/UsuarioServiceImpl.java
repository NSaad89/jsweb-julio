package ar.com.educacionit.service.impl;

import ar.com.educacionit.clase5.Exceptions.InvalidUserException;
import ar.com.educacionit.dao.UsuarioDAO;
import ar.com.educacionit.dao.impl.UsuarioDAOJDBCImpl;
import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.service.UsuarioService;
import ar.com.educacionit.service.exceptions.ServiceException;

public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioDAO usuarioDao;

	public UsuarioServiceImpl() {
		
		this.usuarioDao = new UsuarioDAOJDBCImpl();
		
	}

	@Override
	public Usuario Login(String username, String password) throws ServiceException {
		
		try {
			return this.usuarioDao.getByUsernameAndPassword(username, password);
			
		} catch (Exception e) {
			
			throw new ServiceException("Error", e);
			
		}
	}

}
