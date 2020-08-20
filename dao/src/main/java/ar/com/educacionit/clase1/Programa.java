package ar.com.educacionit.clase1;

public class Programa {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10, 25.5f);
		calc.setOperacion ("+");
		
		float res = calc.calcular();
		
		System.out.println("Resultado de " + calc.valor1 + " + " + calc.valor2 + " es = " + res);
	}

}
