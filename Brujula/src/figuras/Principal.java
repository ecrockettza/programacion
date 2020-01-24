package figuras;
import java.util.*;

public class Principal {

public static void main(String[] args) {
	//Instancio las figuras
		Figura paralelogramo = new Paralelogramo();
		Figura triangulo = new Triangulo(); 
		Figura cuadrado = new Cuadrado();
		Figura rombo= new Rombo();
		
	//Utilizo arraylist y meto las instancias en la lista 
		ArrayList <Figura> listafiguras=new ArrayList<>();
		listafiguras.add(triangulo);
		listafiguras.add(cuadrado);
		listafiguras.add(triangulo);
		listafiguras.add(cuadrado);
		listafiguras.add(rombo);
		
	//Uilizo iterator para recorrer la lista y mostrar por pantala las fuguras que quiero 
		Iterator <Figura> it = listafiguras.iterator();
		 while (it.hasNext()){
	        	Figura p = it.next();
	        	if (p.getParalelogramo.equals(true))
	        	p.Pintar();
	        	}
		 Iterator <Figura> ite = listafiguras.iterator();
		 while (ite.hasNext()){
	        	Figura p = ite.next();
	        	if (p.equals(cuadrado) || p.equals(rombo))
	        	p.Pintar();;
	        	}
	 }
}


