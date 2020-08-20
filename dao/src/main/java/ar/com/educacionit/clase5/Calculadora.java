package ar.com.educacionit.clase5;

public class Calculadora {
	
	public Calculadora() {
		
	}
	
	public int sumar (int a, int b) throws CalculadoraException{
		
		if (a < 0 | b < 0 | a > 1000 | b > 1000) {
			
			throw new CalculadoraException("No se puede sumar números MENORES a 0 ó MAYORES a 1000");
			
		} else return (a + b);
		
	}
		
	public int restar (int a, int b) throws CalculadoraException{
			
		if (a < 0 | b < 0 | (a - b < 0)) {
				
			throw new CalculadoraException("No se puede restar números MENORES a 0 ó que den un resultado MENOR a 0");
				
		} else return (a - b);
			
			
		
	}

}
