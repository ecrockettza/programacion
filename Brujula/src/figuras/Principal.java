package figuras;
import java.util.*;

public class Principal {

public static void main(String[] args) {
		Figura paralelogramo = new Paralelogramo();
		Figura triangulo = new Triangulo(); 
		Figura cuadrado = new Cuadrado();
		Figura rombo= new Rombo();
		
		ArrayList <Figura> listafiguras=new ArrayList<>();
		listafiguras.add(triangulo);
		listafiguras.add(cuadrado);
		listafiguras.add(triangulo);
		listafiguras.add(cuadrado);
		listafiguras.add(rombo);
		
		Iterator <Figura> it = listafiguras.iterator();
		 while (it.hasNext()){
	        	Figura p = it.next();
	        	if (p==triangulo)
	        	p.Pintar();;
	        	}
	        }
	}


