package streams;

import java.io.*;

public class Ejemplo_Escribir_y_Leer {

	public static void main(String[] args) {
		Leer_y_Escribir archivo = new Leer_y_Escribir();
		archivo.leer();
		archivo.imprimir();
		}
		
}
	
class Leer_y_Escribir{

	public void escribir() {
		try {
			FileWriter archivo = new FileWriter("C:/Users/ecrockett/Desktop/texto.txt", true);
			BufferedWriter archivoBuffer = new BufferedWriter(archivo);
			String frase = "Escribimos\n";
			archivoBuffer.write(frase);
			archivoBuffer.close();
			} 
		catch (IOException e) {
			System.out.println("Se ha producido un error");
				}
	}
	
		
	String palabras[] = new String[200];
	char[] vaciochar;
	
	public void leer() {
		try {
			FileReader archivo= new FileReader("C:/Users/ecrockett/Desktop/texto.txt");
			BufferedReader archivoBuffer = new BufferedReader(archivo);
			String vacio="";
			
			int x=0;
			
			while (vacio!=null) {
				vacio = archivoBuffer.readLine();
				palabras[x] = vacio;
				vaciochar = palabras[x].toCharArray();
				x++;
			}
			archivoBuffer.close();
		} 
		
		catch (FileNotFoundException e) { 
		// Exception por si no encuentra el archivo
		System.out.println("No es troba el fitxer");
		} 
		
		catch (IOException e) { 
		// Error si hay un fallo en la lectura
		System.out.println("No es pot llegir el fitxer");
		}
		
		catch (NullPointerException e) { 
			// Salta cuando encuentra un nulo
		}
	}
	static boolean booleano;
	static int comprovador = 0;
	static int contadorDeArray;
	public static boolean ArrayOrder(char[] String1, char[] String2) { //metodo para hacer comparaciones
		
		
		do {
		if (String1[contadorDeArray] > String2[contadorDeArray]) { //metemos el array con su contador y miramos si es mayor el 1 que el 2
		comprovador = 2; // si lo es pasa al comprovador
		booleano = true;} // y el boolean es true
		if (String1[contadorDeArray] < String2[contadorDeArray]) {
		comprovador = 1; // si lo es pasa al comprovador
		booleano = false;} // y el boolean es false
		if (String1[contadorDeArray] == String2[contadorDeArray]) {  //si son iguales sale de do while y devuelve el booleano
		comprovador = 0;}

		contadorDeArray++;

		}while(comprovador == 0);
		contadorDeArray = 0;
		return booleano;
		}
	
	public void imprimir(){ 
		int i, j;
		int y= 0;
		String aux;
		
		for (i = 0; i <vaciochar.length-1; i ++) {
			for (j = 0; j <vaciochar.length - i - 1; j ++) {
					aux = palabras [j + 1];
					palabras [j + 1] = palabras [j];
					palabras [j] = aux;
				}
			}
		
		
		while(y!=5){
			System.out.println(palabras[y]);
			y++;
			}
		}
}

