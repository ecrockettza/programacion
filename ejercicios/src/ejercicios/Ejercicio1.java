package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		int cont=1;
		int mult3=0;
		int entrada=100;
	
		while ( cont <= entrada){
		if (cont % 3==0){
			System.out.println(cont);
			
			mult3++;
			}
		cont++;
	}
	System.out.println("Hay " +mult3+ " multiplos de 3");
	}

}
