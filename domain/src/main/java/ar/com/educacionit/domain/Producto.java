package ar.com.educacionit.domain;

/**
 * Representa la tabla PRODUCTO
 * 
 * @author Zure
 *
 */

public class Producto implements Comparable<Producto>{
	
	private Long id;
	private String descripcion;
	private Float precio;
	private String codigo;
	
	public Producto(String descripcion, Float precio, String codigo) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Producto(Long id, String descripcion, Float precio, String codigo) {
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
	}

	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", codigo=" + codigo
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Producto otroProducto) {
		
//		long id1 = this.getId();
//		long id2 = otroProducto.getId();
//		return (int)(id1 - id2);
		
		return (this.getPrecio()).compareTo(otroProducto.getPrecio());
		
	}
	
	
	
//	@Override
//	public boolean equals(Object otroProducto) {
//		
//		if(otroProducto == null) {
//			
//			return false;
//			
//		}
//		
//		if(!otroProducto.getClass().isAssignableFrom(Producto.class)) {
//			
//			return false;
//			
//		}
//		
//		//definir cuando es igual
//		
//		Producto producto1 = this;
//		
//		Producto producto2 = (Producto) otroProducto;
//		
//		return producto1.getId() == producto2.getId();
//		
//	}
	
}
