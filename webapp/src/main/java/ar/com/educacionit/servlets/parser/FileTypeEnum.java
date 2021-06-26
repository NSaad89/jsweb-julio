package ar.com.educacionit.servlets.parser;

public enum FileTypeEnum {
	
	//tipos que maneja el sistema
	
	CSV("csv"), TXT("txt"), XLS("xls");
	
	private String type;
	
	private FileTypeEnum (String fileType) {
		
		this.type = fileType;
		
	}
	
	public String getType() {
		return type;
	}
	
	//itero sobre todos los types del enum para ver si el type del archivo
	//que viene se encuentra listado dentro de nuestros FileTypeEnum
	
	public static FileTypeEnum getEnumByTipoArchivo (String tipoArchivo) {
		
		FileTypeEnum theType = null;
		
		FileTypeEnum[] types = FileTypeEnum.values();
		
		for (FileTypeEnum type : types) {
			
			if(type.getType().equals(tipoArchivo)) {
				
				theType = type;
				
				break;
				
			}
			
		}		
	
		return theType;
		
	}
	
	

}
