package Ejercicios;

import java.util.Scanner;

public class Menu {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


Tickets platea = new Tickets(1000);
Tickets anfiteatro = new Tickets(200);
Tickets vip = new Tickets(25);
Tickets totale = new Tickets(1225);


int menu;
do  {



System.out.println("1. Mostrar numero de entradas disponibles");
System.out.println("2. Comprar entradas");
System.out.println("3. Salir");

menu = sc.nextInt();

switch (menu) {
case 1:

System.out.println("Entradas disponibles:");
System.out.println(totale.getentradesPerVendre());
break;

case 2:


System.out.println("Para que zona quieres la entradas?");
System.out.println("1. Platea");
System.out.println("2. Anfiteatro");
System.out.println("3. VIP");
System.out.println(" ");

int opcion = sc.nextInt();

switch(opcion) {
case 1:

System.out.println("Cuantas entradas desea?");
int n = sc.nextInt();
platea.vendre(n);
System.out.println(" ");
break;

case 2:

System.out.println("Cuantas entradas desea?");
int y = sc.nextInt();
anfiteatro.vendre(y);
System.out.println(" ");
break;

case 3:

System.out.println("Cuantas entradas desea?");
int x = sc.nextInt();
vip.vendre(x);
System.out.println(" ");
break;
}

break;

case 3:

break;
}

} while (menu != 3);

}
}
