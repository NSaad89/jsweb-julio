package ar.com.educacionit.clase4.Cine;

import ar.com.educacionit.clase2.Interface.IEntrada;

public class Cliente extends Personap implements IEntrada {

	public Cliente(String nombre) {
		super(nombre);
	}

	public Entrada getEntrada() {
		
		return new Entrada();
	}

}
