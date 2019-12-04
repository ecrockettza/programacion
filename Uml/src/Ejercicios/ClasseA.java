package Ejercicios;

public class ClasseA {

	private int valorPrimari;
	private int valorSecundari;
	
	public int getPrimari() 
	{return valorPrimari;}
	
	public int getSecundari() 
	{return valorSecundari;}
	
	public ClasseA() 
	{	valorPrimari=5;
		valorSecundari=10;}
	
	public ClasseA(int vp) 
	{this.valorPrimari=vp;
	this.valorSecundari=10;}
	
	public ClasseA(int vp, int vs)
	{this.valorPrimari=vp;
	this.valorSecundari=vs;}


public static void main(String[] arg) {
	
	ClasseA n = new ClasseA();
	System.out.println("");
	System.out.println(n.getPrimari());
	System.out.println(n.getSecundari());
	
	ClasseA p = new ClasseA(26);
	System.out.println(p.getPrimari());
	System.out.println(p.getSecundari());
	
	ClasseA h = new ClasseA(30,40);
	System.out.println(h.getPrimari());
	System.out.println(h.getSecundari());
}
}