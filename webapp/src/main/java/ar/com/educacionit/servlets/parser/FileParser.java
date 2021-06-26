package ar.com.educacionit.servlets.parser;

import java.io.IOException;

public abstract class FileParser<T>{

	protected String path;
	
	public FileParser() {
	
	}

	public FileParser(String filePath) {
		
		this.path = filePath;
		
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public abstract T parseArchivo() throws IOException;
	
}
