package Magatzem;
import java.util.Scanner;

public class Gestor {
	static Article productos[] = new Article[10];
	static int contador;
	
	public static void modificacion(int x, int i)
	{	if (i==1) 
		{
		System.out.println(productos[x].getDescripcio());
		System.out.println("Introduce el nuevo nombre");
		String inutil = Article.sc.nextLine();
		String nombre = Article.sc.nextLine();
		productos[x].setDescripcio(nombre);
		System.out.println("El nuevo nombre es " + productos[x].getDescripcio());
		}
	
		if (i==2) {
			System.out.println(productos[x].getPreuDeCompra());
			System.out.println("Introduce el nuevo precio de compra");
			double pc= Article.sc.nextDouble();
			productos[x].setPreuDeCompra(pc);
			System.out.println("El nuevo precio de compra es " + productos[x].getPreuDeCompra());
		}
		
		if (i==3) {
			System.out.println(productos[x].getPreuDevenda());
			System.out.println("Introduce el nuevo precio de compra");
			double pv= Article.sc.nextDouble();
			productos[x].setPreuDevenda(pv);
			System.out.println("El nuevo precio de venta es " + productos[x].getPreuDevenda());
		}
	;}
	
	public static void sumarstock(int x) {
		System.out.println(productos[x].getStock()+ "productos en total");
		System.out.println("Suma el stock que entra");
		int sumastock = Article.sc.nextInt();
		productos[x].setStock  (productos[x].getStock() + sumastock);
		System.out.println(productos[x].getStock());
		}
	
	public static void restarstock(int x) {
		System.out.println("Resta el stock que entra");
		System.out.println(productos[x].getStock() + "productos en total");
		int restarstock = Article.sc.nextInt();
		if (restarstock<productos[x].getStock()) {
		productos[x].setStock  (productos[x].getStock() - restarstock);
		System.out.println(productos[x].getStock()+ "productos en total");}
		else {System.out.println("No hay tanta mercaderia");}
		}
	public static void baja(int x)
	{productos[x] = null;}
	
	public static void mostrararray()
	{for (int e = 0; e < productos.length; e++)
	{System.out.println(productos[e]);};}
	
	
public static void main(String[] args) {

System.out.println("¿Que quieres hacer?");
         System.out.println("1. Llistat " +
                 "\n2. Alta " +
                 "\n3. Baixa " +
                 "\n4. Modificació " +
                 "\n5. Entrada de mercaderia " +
                 "\n6. Sortida de mercaderia " +
                 "\n7. Salir");
Scanner sc = new Scanner(System.in);
int menu = Article.sc.nextInt();

while (menu != 7){
switch (menu){
        case 1:
        	mostrararray();
            break;
            
        case 2:
        	 System.out.println("Vamos ha hacer un alta");
             System.out.println("Escribe el codi");
             String codi = sc.nextLine();
             System.out.println("Describe el objeto");
             String descripcio = sc.nextLine();
             System.out.println("Preu de compra");
             Double pc = sc.nextDouble();
             System.out.println("Preu de venda");
             Double pv =  sc.nextDouble();
             System.out.println("Escribe cuantos hay");
             int stock = sc.nextInt();
             Article NuevoObjeto= new Article(codi, descripcio, pc, pv, stock);
             productos[contador]= NuevoObjeto;
             contador++;
             System.out.println(NuevoObjeto.toString());
        break;
       
        case 3:
        	 System.out.println("Vamos ha hacer una baja");
        	 System.out.println("---------Array con el objeto---------");
        	 mostrararray();
        	 System.out.println("Escribe la posicion del objeto");
        	 int elegir= sc.nextInt();
        	 baja(elegir);
        	 System.out.println("---------Array sin el objeto---------");
        	 mostrararray();
            break;

        case 4:
        	mostrararray();
        	System.out.println("Elige el objeto que quieras ");
        	int cambiar= sc.nextInt();
        	System.out.println("1. Modificar descripcion " +
                    "\n2. Modificar precio de compra  " +
        			"\n3. Modificar precio de venta"
                    );
        	int i= sc.nextInt();
        	modificacion(cambiar, i);
        break;
       
        case 5:
        	System.out.println("Elige el objeto que quieras");
        	int anadirstock= sc.nextInt();
        	sumarstock(anadirstock);
            break;

        case 6:
        	System.out.println("Elige el objeto que quieras");
        	int restarstock= sc.nextInt();
        	restarstock(restarstock);
            break;
}
System.out.println("¿Que quieres hacer ahora?");
menu = sc.nextInt();
}
System.out.println("Hasta la proxima :D");
}
}
