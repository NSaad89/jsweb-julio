package ar.com.educacionit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import ar.com.educacionit.clase5.Exceptions.DAOException;
import ar.com.educacionit.clase5.Exceptions.ProductoNoExisteException;
import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.jdbc.AdministradorDeConexiones;

public class ProductoDAOJDBCImpl implements ProductoDAO {

	@Override
	public Producto create(Producto productoACrear) throws Exception {
		
		System.out.println("Creando producto... " + productoACrear.getDescripcion());
		
		Connection con = AdministradorDeConexiones.obtenerConexion();
		
		String sql = "INSERT INTO PRODUCTO (DESCRIPCION, PRECIO, CODIGO) VALUES ('" + productoACrear.getDescripcion() + 
				"', '" + productoACrear.getPrecio() + "', '" + productoACrear.getCodigo() + "')";
		
		Statement st = con.createStatement();
		
		boolean success = st.execute(sql, Statement.RETURN_GENERATED_KEYS);
		
		ResultSet rs = st.getGeneratedKeys();
		
		Long idGenerado = null;
		
		if(rs.next()) {
			
			idGenerado = rs.getLong(1);
			
		}
		
		productoACrear.setId(idGenerado);
		
		return productoACrear;
	}

	@Override
	public Producto getProductoById(Long idProducto) throws Exception {

		Connection con = null;
		
		Statement st = null;
		
		ResultSet res = null;
		
		try {
			
		con = AdministradorDeConexiones.obtenerConexion();
		
		//DB tiene autocommit en TRUE
		
		con.setAutoCommit(false);
		
		String sql = "SELECT * FROM PRODUCTO WHERE ID=" + idProducto;
		
		st = con.createStatement();
		
		res = st.executeQuery(sql);
		
		Producto producto = null;
		
		if (res.next()) {
			
			producto = getProductoFromResultSet(res);
			
			}
		
		//salió todo ok!
		
		con.commit();
		
		return producto;
		
		}
		catch (Exception e) {
			
			con.rollback();
			
			throw e;
			
		}
		
		finally {
			
			if(res != null && !res.isClosed()) {
				
				res.close();
				
			}	
			
			if(st != null && !st.isClosed()) {
				
				st.close();
				
			}
				
			if(con != null && !con.isClosed()) {
				
				con.close();
				
			}		
			
		}
		
	}
	
	@Override
	public Producto getProductoByCodigo(String codigo) throws Exception {
		
		System.out.println("Consultando todos los registros de la tabla Producto con código = " + codigo + "...");

		Connection con = null;
		
		PreparedStatement pst = null;
		
		ResultSet res = null;
		
		try {
			
		con = AdministradorDeConexiones.obtenerConexion();
		
		//DB tiene autocommit en TRUE
		
		con.setAutoCommit(false);
		
		String sql = "SELECT * FROM PRODUCTO WHERE CODIGO=?";
		
		pst = con.prepareStatement(sql);
		
		//seteo los datos
		
		pst.setString(1, codigo);
		
		res = pst.executeQuery();
		
		Producto producto = null;
		
		if (res.next()) {
			
			producto = getProductoFromResultSet(res);
			
			}
		
		//salió todo ok!
		
		con.commit();
		
		return producto;
		
		}
		catch (Exception e) {
			
			con.rollback();
			
			throw e;
			
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

	/**
	 * @param res
	 * @throws SQLException
	 */
	private Producto getProductoFromResultSet(ResultSet res) throws SQLException {
		
		Long id = res.getLong(1);
		
		String descripcion = res.getString(2);
		
		Float precio = res.getFloat(3);
		
		String codigo = res.getString(4);
		
		return new Producto(id, descripcion, precio, codigo);
		
	}

	@Override
	public Collection<Producto> findAll() throws Exception {
		
		System.out.println("Consultando todos los registros de la tabla Producto... ");

		Connection con = AdministradorDeConexiones.obtenerConexion();
		
		String sql = "SELECT * FROM PRODUCTO";
		
		Statement st = con.createStatement();
		
		ResultSet res = st.executeQuery(sql);
		
		Collection <Producto> productos = new ArrayList<Producto>();
		
		while (res.next()) {
			
			Producto producto = getProductoFromResultSet(res);
			
			//productos[0] = producto;
			
			productos.add(producto);
			
		}
		
		return productos;
	}

	@Override
	public Producto updateProducto(Producto productoAActualizar) throws Exception {
		
		System.out.println("Actualizando a : " + productoAActualizar + "...");

		Connection con = null;
		
		PreparedStatement pst = null;
		
		ResultSet res = null;
		
		try {
			
		con = AdministradorDeConexiones.obtenerConexion();
		
		//DB tiene autocommit en TRUE
		
		con.setAutoCommit(false);
		
		String sql = "UPDATE PRODUCTO SET DESCRIPCION=?, PRECIO=? WHERE ID=?";
		
		pst = con.prepareStatement(sql);
		
		//seteo los datos
		
		pst.setString(1, productoAActualizar.getDescripcion());
		
		pst.setFloat(2, productoAActualizar.getPrecio());
		
		pst.setLong(3, productoAActualizar.getId());
		
		pst.execute();
		
		//salió todo ok!
		
		con.commit();
		
		return getProductoById(productoAActualizar.getId());
		
		}
		catch (Exception e) {
			
			con.rollback();
			
			throw e;
			
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

	@Override
	public Producto deleteProducto(Long id) throws DAOException, Exception, ProductoNoExisteException{
		
		Producto pAEliminar = getProductoById(id);
		
		if(pAEliminar == null) {
			
			throw new ProductoNoExisteException("No existe el producto con ID: " + id);
			
		}
		
		//Comienza la eliminación
		
		System.out.println("Eliminando los registros con ID= "+ id + "...");
		
		String sql = "DELETE FROM PRODUCTO WHERE ID=" + id;
		
		Connection con = null;
		
		Statement st = null;
		
		try {
			
			con = AdministradorDeConexiones.obtenerConexion();
			
			con.setAutoCommit(false);
			
			st = con.createStatement();
			
			st.execute(sql);
			
			con.commit();
			
		} catch (SQLException e) {
			
			con.rollback();
			
			throw new DAOException("[No se pudo ejecutar la consulta " + sql + "]" + e.getMessage(), e);
			
		} catch (Exception e) {
			
			con.rollback();
			
			throw e;

		} finally {
			
			if(st != null && !st.isClosed()) {
				
				st.close();
				
			}
				
			if(con != null && !con.isClosed()) {
				
				con.close();
				
			}
			
		}
		
		return pAEliminar;
		
	}

	@Override
	public Producto deleteProducto(String codigo) throws Exception {
		
		Producto pAEliminar = getProductoByCodigo(codigo);
		
		if(pAEliminar == null) {
			
			throw new ProductoNoExisteException("No existe el producto con código: " + codigo);
			
		}
		
		//Comienza la eliminación
		
		System.out.println("Eliminando los registros con código= "+ codigo + "...");
		
		String sql = "DELETE FROM PRODUCTO WHERE CODIGO=?";
		
		Connection con = null;
		
		PreparedStatement pst = null;
		
		try {
			
			con = AdministradorDeConexiones.obtenerConexion();
			
			con.setAutoCommit(false);
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, codigo);
			
			pst.execute();
			
			con.commit();
			
		} catch (SQLException e) {
			
			con.rollback();
			
			throw new DAOException("[No se pudo ejecutar la consulta " + sql + "]" + e.getMessage(), e);
			
		} catch (Exception e) {
			
			con.rollback();
			
			throw e;

		} finally {
			
			if(pst != null && !pst.isClosed()) {
				
				pst.close();
				
			}
				
			if(con != null && !con.isClosed()) {
				
				con.close();
				
			}
			
		}
		
		return pAEliminar;
	}

}
