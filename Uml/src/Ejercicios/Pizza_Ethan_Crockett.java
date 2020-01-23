package Ejercicios;

public class Pizza_Ethan_Crockett {

	private String tipus;
	private String mida;
	private static int servidos; 
	private static int pedidos=0;
	
	public Pizza_Ethan_Crockett(String t, String m)
	{ this.tipus=t;
	  this.mida=m;
	  this.pedidos= pedidos+1; }
	
	public void Servir()
	{ System.out.println("Esta pizza se ha servido");
	  this.servidos= servidos + 1;}
	
	public static int getServidos() 
	{return servidos;}
	public static int getPedidos() 
	{return pedidos;}
	
	public String getTipus() 
	{return tipus;}
	public void setTipus(String tipus) 
	{this.tipus = tipus;}

	public String getMida() 
	{return mida;}
	public void setMida(String mida) 
	{this.mida = mida;}
	
	
	public static void main(String[] arg) {
		Pizza_Ethan_Crockett p1= new Pizza_Ethan_Crockett("Margarita","Meidana");
		Pizza_Ethan_Crockett p2= new Pizza_Ethan_Crockett("Cuatro quesos","Familiar");
		p1.Servir();
		System.out.println("Pizzas servidas: "+ Pizza_Ethan_Crockett.getServidos());
		System.out.println("Pizzas pedidas: "+ Pizza_Ethan_Crockett.getPedidos());
	}
}
