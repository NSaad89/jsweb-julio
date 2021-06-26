package ar.com.educacionit.servlets.parser;

import java.util.HashMap;
import java.util.Map;

public class FileParserFactory {

	private static Map<FileTypeEnum, FileParser> mapFileParsers;
	
	//BLOQUE ESTÁTICO QUE, CUANDO SE CONSTRUYE EL OBJETO, SE EJECUTA ANTES DEL CONSTRUCTOR
	
	static {
		
		mapFileParsers = new HashMap<FileTypeEnum, FileParser>();
		
		mapFileParsers.put(FileTypeEnum.CSV, new CSVFileParser());
		
		mapFileParsers.put(FileTypeEnum.XLS, new XLSFileParser());
		
	}
	
	public static FileParser getFileParserByEnum (FileTypeEnum typeEnum) {
		
		FileParser fileParser = null;
		
		fileParser = mapFileParsers.get(typeEnum);
		
		return fileParser;
		
	}
	
}
