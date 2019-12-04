package ejercicios;

public class Pruebanombre {

	public static void main(String[] args) {
		Nombre n1= new Nombre(200);
		int numero = n1.getNumero();
		System.out.println(numero);
		System.out.println(n1.hexNumero());
		System.out.println(n1.binNumero());
	
	}

}
