package ejercicios;

public class Ejemplo {

	public static void main(String[] args) {
		Persona p1= new Persona();
		Persona p2=new Persona(21,"Pepe",true);
		String n=p1.getNombre();
		System.out.println(n);
		String n1=p2.getNombre();
		System.out.println(n1);
		p2.setNombre("Ana");
		String n2=p2.getNombre();
		System.out.println(n2);
	}

}
