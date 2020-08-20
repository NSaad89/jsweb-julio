package ar.com.educacionit.clase4.Cine;

import ar.com.educacionit.clase2.Interface.IEntrada;

public class CineMain {

	public static void main(String[] args) {
		
		//lista de personas
		Object [] alguienConEntrada = new Object [4];
		
		Cliente c1 = new Cliente("Lucas");
		IEntrada p1 = new Cliente ("Javier");
		Colado col1 = new Colado ("Sol");
		Alien a = new Alien ();
		
		alguienConEntrada [0] = c1;
		alguienConEntrada [1] = p1;
		alguienConEntrada [2] = col1;
		alguienConEntrada [3] = a;
		
		for(Object alguien : alguienConEntrada) {
			
			//si la persona cumple el contrato
			//si implementa la interfaz
			
			if(alguien instanceof IEntrada) {
				
				Entrada entrada = ((IEntrada)alguien).getEntrada();
				
//				if(alguien instanceof Personap) {
//				
//				System.out.println("Entrando al cine: " + ((Personap)alguien).getNombre());
//				
//				}else if(alguien instanceof Alien){
//				
//				System.out.println("Entrando al cine alien del planeta " + ((Alien)alguien).getPlanetaOrigen());
//				
//				}else {
//				
//				System.out.println("Entrando al cine porque tiene entrada y punto!");
//				
//				}
				
				System.out.println("Entrada: " + entrada.getLugar() + " - " + entrada.getTipo());
				
			}else {
					
				System.out.println("NO entra al cine porque NO tiene entrada");
				
			}
			
		}
		
	}
		
}
