package ar.com.educacionit.clase4.Cine;

import ar.com.educacionit.clase2.Interface.IEntrada;

public class Alien implements IEntrada {
	
	public String getPlanetaOrigen() {
		 
		return "Marte";
		
	}

	public Entrada getEntrada() {
		
		Entrada entradaAlien = new Entrada("VIP", "Abajo");
		
		return entradaAlien;
		
	}
	
	

}
