package ar.com.educacionit.service.impl;

import java.util.Collection;

import ar.com.educacionit.dao.ProductoDAO;
import ar.com.educacionit.dao.impl.ProductoDAOJDBCImpl;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.exceptions.ServiceException;

public class ProductoServiceImpl implements ProductoService {
	
	private ProductoDAO productoDao;

	public ProductoServiceImpl() {
		
		this.productoDao = new ProductoDAOJDBCImpl();
		
	}

	@Override
	public Producto obtenerProductoPorId(Long id) throws ServiceException{
		
		try {
			
			return this.productoDao.getProductoById(id);
			
		} catch (Exception e) {
			
			throw new ServiceException ("Error consultando producto con Id: " + id, e);
		}
	}

	@Override
	public Collection<Producto> obtenerTodosProductos() throws ServiceException{
		
		try {
			
			return this.productoDao.findAll();
			
		} catch (Exception e) {
			
			throw new ServiceException("Error obteniendo todos los productos", e);
			
		}
	}

	@Override
	public Producto actualizarProducto(Producto producto) throws ServiceException {
		
		try {
			
			return this.productoDao.updateProducto(producto);
			
		} catch (Exception e) {
			
			throw new ServiceException("Error actualizando el producto " + producto, e);
			
		}
		
	}

	@Override
	public Producto crearProducto(Producto producto) throws ServiceException {
		
		try {
			
			return this.productoDao.create(producto);
			
		} catch (Exception e) {
			
			throw new ServiceException("Error creando el producto " + producto, e);
			
		}
		
	}

	@Override
	public Producto eliminar(Long id) throws ServiceException {
		
		try {
			
			return this.productoDao.deleteProducto(id);
			
		} catch (Exception e) {
			
			throw new ServiceException("Error eliminando el producto con ID: " + id, e);
			
		}
		
	}

}
