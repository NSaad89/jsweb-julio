package ar.com.educacionit.clase1;

public class Calculadora {
	
	//atributos
	float valor1;
	float valor2;
	String operacion;
	
	
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	
	//constructores
	public Calculadora(float valor1Nuevo, float valor2Nuevo) {
		System.out.println("Creando objeto calculadora");
		valor1 = valor1Nuevo;
		valor2 = valor2Nuevo;
		
	}
	
	//métodos
	float calcular() {
		float res;
		if(operacion.equals("+")) {
			res = valor1 + valor2;
		}else {
			res = valor1 - valor2;
		} return res;
	}

}
