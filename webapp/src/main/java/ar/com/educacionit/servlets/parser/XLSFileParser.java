package ar.com.educacionit.servlets.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class XLSFileParser extends FileParser<Producto> {

	public XLSFileParser(String filePath) {
		super(filePath);
		
	}

	public XLSFileParser() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Producto parseArchivo() throws IOException{
		
		//Abrir archivo
		
		File file = new File(this.path);
		
		FileReader fileReader = new FileReader(file);
		
		//Chequear si no está vacío
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		//Leer y procesar
		
		String lineaLeida = null;
		
		List<Producto> listado = new ArrayList<>();
		
		boolean primerLinea = true;
		
		while ((lineaLeida = bufferedReader.readLine()) != null) {
			
			if(!primerLinea) {
				
				String[] array = lineaLeida.split(";");
				
				String codigo = array[0];
				
				String descripcion = array[1];
				
				String precio = array[2];
				
				Producto producto = new Producto(descripcion, Float.parseFloat(precio), codigo);
				
				listado.add(producto);
				
			}else {
				
				primerLinea = false;
				
			}
		
		}
		
		//Cerrar archivo
		
		bufferedReader.close();
		
		return listado.get(0);
		
	}

}
