package ar.com.educacionit.clase3;

import ar.com.educacionit.vehiculos.entidades.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Auto a1 = new Auto(19, 20, 23, "Chery", "C40", "Celeste");
		
		System.out.println(a1);
		
		Vendedor v1 = new Vendedor();
		
		System.out.println(v1);
		
		Comprador c1 = new Comprador("Rodrigo", "Larreteguy", "34.292.706", 500000.00);
		
		System.out.println(c1);
		
	}

}
