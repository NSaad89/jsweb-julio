package ar.com.educacionit.clase4;

public class Main {

	public static void main(String[] args) {
		
		Telefono movil = new Telefono(001, "Movil", "15-5852-8548");
		Domiciliod casa = new Domiciliod(001, "Virrey Arredondo", "CABA", 3011);
		Producto pantalonPeppers = new Producto(001, 2490.00, "Pantalón de paltas");
		Cliente yo = new Cliente(001, "Natalia", "Saad", movil, casa, 001);
		
		System.out.println(yo);
		System.out.println(pantalonPeppers);
		
		System.out.println(yo.getNombreCompleto());
	}

}
