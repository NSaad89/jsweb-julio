package ar.com.educacionit.clase2.Main;

import ar.com.educacionit.clase2.Model.Auto;
import ar.com.educacionit.clase2.Model.Moto;
import ar.com.educacionit.clase2.Model.Vehiculo;

public class VehiculoTestMain {

	public static void main(String[] args) {

		Auto clio = new Auto ();
		System.out.println(clio.getColor());
		
		Auto astra = new Auto ();
		System.out.println(astra.getColor());
		
		Moto zanella = new Moto ();
		System.out.println(zanella.getColor());
		
		Moto honda = new Moto ();
		System.out.println(honda.getColor());
		
		Auto [] autos = {clio, astra};
		Moto [] motos = {zanella, honda};
		
		Vehiculo [] vehiculos = new Vehiculo [autos.length + motos.length];
		
		vehiculos[0] = clio;
		vehiculos[1] = astra;
		vehiculos[2] = zanella;
		vehiculos[3] = honda;

		
		for (Auto auto : autos) {
			System.out.println(auto.getColor());
			
		}
		
		for (Moto moto : motos) {
			System.out.println(moto.getColor());
			
		}
		
		//todos los vehículos
				for(Vehiculo vehiculo : vehiculos) {
					System.err.println(vehiculo.getColor());
				}
	}

}
