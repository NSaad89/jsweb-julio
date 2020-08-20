package ar.com.educacionit.clase4;

public class StringUtils {
	
	public static String wordtoCamelCase (String palabra) {
		String primeraLetra = palabra.substring(0, 1).toUpperCase();
		String restoLetras = palabra.substring(1).toLowerCase();
		return primeraLetra+restoLetras;
	}

}
