package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase2.Model.Domicilio;
import ar.com.educacionit.clase2.Model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Domicilio domi = new Domicilio("Virrey Arredondo", 3011, "CABA");
		
		Persona persona1 = new Persona();
		persona1.nombre = "Natalia";
		persona1.apellido = "Saad";
		persona1.edad = 31;
		persona1.domicilio = domi;
		persona1.apariencia = "Asquerosa";
		persona1.particularidades = "2 peluzas con panza";
		
		
		
		System.out.println("Me llamo " + persona1.nombre + " " + persona1.apellido + 
				", tengo " + persona1.edad + " años y vivo en " + persona1.domicilio.calle + 
				" " + persona1.domicilio.numero + ", " + persona1.domicilio.localidad +
				". Confieso que soy " + persona1.apariencia + " y soy muy feliz de tener " + 
				persona1.particularidades + " :) !!");
		
	}

}
