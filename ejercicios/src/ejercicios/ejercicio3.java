package ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
		int cont=1;
		int espar=0;
		int esimpar=0;
		
	while (cont<=100)
	{
		if (cont % 2==0){
			espar= cont + espar;
			}
		else {
			esimpar= cont + esimpar;
			}
	System.out.println(cont);	
	cont++;
	}
	System.out.println(espar);
	System.out.println(esimpar);
	}

}
