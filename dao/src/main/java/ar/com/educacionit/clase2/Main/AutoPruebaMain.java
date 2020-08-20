package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase2.Model.Auto;

public class AutoPruebaMain {

	public static void main(String[] args) {
		
		// instanciar un objeto de la clase Auto
		System.out.println("Creando un auto");
		Auto clio = new Auto ();
		
		//mostrar el color del auto
		String colorDelAuto = clio.getColor();
		
		System.out.println("El color es: " + colorDelAuto);
		

	}

}
