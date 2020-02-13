package streams;

import java.io.*;
import java.util.ArrayList;

public class Ejemplo_Escribir_y_Leer {

	public static void main(String[] args) {
		Leer_y_Escribir archivo = new Leer_y_Escribir();
		archivo.leer();
		}
		
}
	
class Leer_y_Escribir{
	  ArrayList <String> l1=new ArrayList <String>();
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
	
	public void leer() {
		try {
			FileReader archivo= new FileReader("C:/Users/ecrockett/Desktop/texto.txt");
			BufferedReader archivoBuffer = new BufferedReader(archivo);
			String vacio="";
			
			while (vacio!=null) {
				vacio = archivoBuffer.readLine();
				char[] vaciochar = vacio.toCharArray();
				int i, j;
				char aux;
				for (i = 1; i <vaciochar.length; i ++) {
					for (j = 0; j <vaciochar.length - i - 1; j ++) {
						if(vaciochar [j + 1] <vaciochar [j]) {
							aux = vaciochar [j + 1];
							vaciochar [j + 1] = vaciochar [j];
							vaciochar [j] = aux;
				            }
						}
					}

 				if (vacio!=null) 
				{
					System.out.println(vaciochar);
				}
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
			// Error si hay un fallo en la lectura
		}
	}
}

