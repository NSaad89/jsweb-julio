package ar.com.educacionit.clase1;

/**
 * Hello world!
 *
 */
public class Laboratorio1 
{

public static void main(String[] args) {
	
	int [] vecNumeros = {11, -22, 33, -44, 55, -66, 77, -88, 99};
	int suma = 0;
	int suma_positivos = 0;
	int suma_negativos = 0;
	
	for (int i = 0; i < vecNumeros.length; i++) {
		
		suma += vecNumeros[i];
		
	}
	
	System.out.println("La suma de los elementos del vector vecNumeros es: " + suma);
	
	for (int i = 0; i < vecNumeros.length; i++) {
		
		if (vecNumeros [i] > 0) {
			
			suma_positivos += vecNumeros [i];
			
		} else {
			
			suma_negativos += vecNumeros [i];
			
		}
		
		
		
	}
	
	System.out.println("La suma de los elementos positivos del vector vecNumeros es: " + suma_positivos);
	System.out.println("La suma de los elementos negativos del vector vecNumeros es: " + suma_negativos);
}
	
}
