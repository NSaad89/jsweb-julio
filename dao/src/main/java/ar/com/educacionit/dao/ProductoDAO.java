package ar.com.educacionit.dao;

import java.util.Collection;

import ar.com.educacionit.clase5.Exceptions.DAOException;
import ar.com.educacionit.clase5.Exceptions.ProductoNoExisteException;
import ar.com.educacionit.domain.Producto;

/**
 * Métodos CRUD
 * Create, Select (Read), Update, Delete
 * 
 * @author Zure
 *
 */

public interface ProductoDAO {
	
	public Producto create (Producto productoACrear) throws Exception;
	
	public Producto getProductoById (Long id) throws Exception;
	
	public Producto getProductoByCodigo(String codigo) throws Exception;
	
	public Collection<Producto> findAll() throws Exception;
	
	public Producto updateProducto (Producto productoAActualizar) throws Exception;
	
	public Producto deleteProducto (Long id) throws DAOException, Exception, ProductoNoExisteException;
	
	public Producto deleteProducto (String codigo) throws ProductoNoExisteException, DAOException, Exception;

}
