package ar.com.educacionit.service;

import java.util.Collection;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.exceptions.ServiceException;

public interface ProductoService {

	public Producto obtenerProductoPorId(Long id) throws ServiceException;
	
	public Collection<Producto> obtenerTodosProductos() throws ServiceException;
	
	public Producto actualizarProducto(Producto producto) throws ServiceException;
	
	public Producto crearProducto (Producto producto) throws ServiceException;

	public Producto eliminar(Long id) throws ServiceException;

	public Producto obtenerProductoPorCodigo(String codigo) throws ServiceException;
	
}
