package ar.com.educacionit.clase5;

public class Main {
	
	public static void main (String[] args) {
		
		int a = -3;
		int b = 4;
		
		Calculadora c = new Calculadora();
		
		try {
			
			System.out.println("La suma de a y b es = " + c.sumar(a, b));
			
		} catch (CalculadoraException e) {
			
			e.printStackTrace();
			
		}
		
		try {
			
			System.out.println("La resta de a y b es = " + c.restar(a, b));
			
		} catch (CalculadoraException e) {

			e.printStackTrace();
			
		}
		
	}

}
