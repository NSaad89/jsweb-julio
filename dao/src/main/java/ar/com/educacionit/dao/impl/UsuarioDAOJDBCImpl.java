package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ar.com.educacionit.clase5.Exceptions.InvalidUserException;
import ar.com.educacionit.dao.UsuarioDAO;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.Usuario;
import ar.com.educacionit.jdbc.AdministradorDeConexiones;

public class UsuarioDAOJDBCImpl implements UsuarioDAO {

	@Override
	public Usuario getByUsernameAndPassword(String username, String password) throws InvalidUserException, Exception {
		
		Connection con = null;
		
		PreparedStatement pst = null;
		
		ResultSet res = null;
		
		try {
			
			con = AdministradorDeConexiones.obtenerConexion();
			
			String sql = "SELECT * FROM USUARIOS WHERE USERNAME= ? AND PASSWORD= ?";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, username);
			
			pst.setString(2, password);
			
			res = pst.executeQuery();
			
			Usuario u = null;
			
			if (res.next()) {
				
				u = new Usuario(res.getLong(1), res.getString(2), res.getString(3));
				
			}
			
			return u;
			
		}
		catch (Exception e) {
			
			throw new InvalidUserException("Usuario / Password inválidos", e);
			
		}
		
		finally {
			
			if(res != null && !res.isClosed()) {
				
				res.close();
				
			}	
			
			if(pst != null && !pst.isClosed()) {
				
				pst.close();
				
			}
			
			if(con != null && !con.isClosed()) {
				
				con.close();
				
			}		
			
		}
		
	}
	
}
