package ContenedoresObjetos;
import java.util.*;

public class Containers {
    public static void main(String[] args) {
        System.out.println("--- LListes1 ---");
        llistes1();
        System.out.println("--- Iterators ---");
        iterators();
        System.out.println("--- Cua ---");
        cues();
        System.out.println("--- Piles ---");
        piles();
        System.out.println("--- Conjunts ---");
        conjunts();
        System.out.println("--- Mapes ---");
        mapes();

    }

    static void llistes1() {
        // Crea llista d'enters anomenada "l1"
        ArrayList <Integer> l1=new ArrayList <Integer>();
    	
        // Afegeix els n�meros 10, 20 i 15
        l1.add(10);
        l1.add(20);
        l1.add(15);
        
        // Imprimeix la llista
        System.out.println(l1);
        
        // Elimina el segon element
        l1.remove(1);
        
        // Imprimeix la llista
        System.out.println(l1);

        // Crea llista d'enters anomenada "l2"
        ArrayList <Integer> l2=new ArrayList <Integer>();
        
        // Afegeix els n�meros 3, 6 i 9
        l2.add(3);
        l2.add(6);
        l2.add(9);
        
        // Afegeix la llista l1 a la llista l2
        l2.add(l1.get(0));
        l2.add(l1.get(1));
        
        // Imprimeix la llista l2
        System.out.println(l2);

        // Elimina tots els valors de l1
        l1.clear();

        // Afegeix els tres primers elements de l2 a l1
        l1.add(l2.get(0));
        l1.add(l2.get(1));
        l1.add(l2.get(2));
        
        // Comprova si dins l1 hi ha el n�mero 6
        l1.contains(6);
        
        // Afegeix el numero 6 un altre cop a l1 al principi de la llista
        l1.add(0,6);

        // Cerca la posicio de l'element que te el numero 9 a la llista l1
        l1.indexOf(9);
        
        // A l1, substitueix l'element a la posici� 1 per el valor 5
        l1.add(1,5);
        
        // A l1, insereix a la posici� 2 l'element 4
        l1.add(2,4);
        
        // Imprimeix la llista l1
        System.out.println(l1);
        
        // Converteix l1 a array i imprimeix-ho

    }

    static void iterators() {
        // Crea llista d'enters anomenada "l1"
    	ArrayList <Integer> l1=new ArrayList <Integer>();
    	
        // Afegeix a l1 els elements 10, 20, 50 i 90
    	l1.add(10);
        l1.add(20);
        l1.add(50);
        l1.add(90);
    	
        // Treu Iterator (it)
        Iterator <Integer> it = l1.iterator();

        // Mentre hi hagi element seg�ent, imprimeix l'element
        while (it.hasNext()){
        	Integer p = it.next();
        	System.out.println(p);
        }

        // Torna a crear l'objecte iterator i has de rec�rrer la llista, per� has d'esborrar l'element "50"
        Iterator <Integer> ite = l1.iterator();
        while (ite.hasNext()){
        	Integer p = ite.next();
        	if (p==50)
        	{int l = l1.indexOf(50); 
        	l1.remove(l);
        	}
        }
        
        // Imprimeix la llista
        System.out.println(l1);
        // Crea un ListIterator de la llista l1 (anomenat "li")
        Iterator <Integer> li = l1.iterator();
        
        // Avan�a l'iterador fins al final de la llista
        while (li.hasNext()){
        	Integer p = li.next();
        }
        
        // Recorre la llista al reves amb l'iterador, imprimint els elements

        // Torna a recorrer la llista amb l'iterador, pero aquest cop imprimeix tambe l'index de l'element
        while (li.hasNext()){
        	Integer p = li.next();
        	System.out.println(p);
        }
        
    }

    static void cues() {
        // Declara una cua (anomenada "cua") com una LinkedList

        // Afegeix els elements 12, 14 i 99 a la cua

        // Mostra el primer element (sense treurer-lo) de la c�a i imprimeix-ho

        // Treu el primer element de la c�a

        // Imprimeix la c�a


        // Declara una c�a de prioritat anomenada "cuaPrioritat"

        // Afegeix els elements 5, 2, -1, 9 i 7

        // Imprimeix la c�a

        // Fes un bucle que vagi traient cada element i l'imprimeixi de la c�a de prioritat, mentre en quedin

    }

    static void piles() {
        // Declara una pila (stack) com una LinkedList

        // Push a la pila dels valors 15, 56, 21 i -5

        // Imprimeix la pila

        // Imprimeix el valor de damunt la pila, sense treurer-lo

        // Treu i imprimeix els valors de la pila

    }

    static void conjunts() {
        // Declara un conjunt d'enters anomenat "set"

        // Afegeix els elements 14, 6 i 3

        // Imprimeix el conjunt

        // Afegeix l'element 6 un altre cop

        // Imprimeix el conjunt


        // Construeix un conjunt de car�cters anomenat set2 (Usa la class Character, no char)
        // i introdueix totes les lletres de la paraula "ESTERNOCLEIDOMASTOIDEO"
        // Despr�s, imprimeix el conjunt


        // Empra un iterador (it) per rec�rrer tot el conjunt de car�cters anterior i imprimeix element a element

    }

    static void mapes() {
        // Construeix un mapa (map) que associi un String amb un altre String

        // Introdueix el parell: "RENAULT" - "CLIO"

        // Introdueix el parell: "VOLKSWAGEN" - "GOLF"

        // Introdueix el parell: "PEUGEOT" - "308"

        // Introdueix el parell: "HONDA" - "CIVIC"

        // Introdueix el parell: "PEUGEOT" - "RCZ"

        // Imprimeix el mapa


        // Treu el conjunt de claus del mapa (variable kset)

        // Imprimeix aquest conjunt

        // Treu el valor de la clau "PEUGEOT" i imprimeix-ho

        // Mitjan�ant un iterador, imprimeix tots els parells clau-valor del mapa


        // Empra un mapa que associi un car�cter a un n�mero enter per dur el compte
        // de quantes vegades surt cada lletra a la paraula "ESTERNOCLEIDOMASTOIDEO"


    }
}