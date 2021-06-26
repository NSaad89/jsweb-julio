package ar.com.educacionit.servlets.parser;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.domain.Producto;

public class TestEnum {

	public static void main(String[] args) throws IOException {
		
		String tipoArchivo = "doc";
		
		FileTypeEnum type = FileTypeEnum.getEnumByTipoArchivo(tipoArchivo);
		
		if(type != null) {
			
			FileParser parser = FileParserFactory.getFileParserByEnum(type);
			
			if(parser != null) {
			
			// List<Producto> productos = parser.parseArchivo();
			
			}
			
		}

	}

}
