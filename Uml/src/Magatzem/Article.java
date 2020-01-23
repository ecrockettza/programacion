package Magatzem;
import java.util.Scanner;

public class Article {
	private String codi = "Lliure";
	private String descripcio;
	private double preuDeCompra;
	private double preuDevenda;
	private int stock;

	static Scanner sc = new Scanner(System.in);
	
	public Article(String c, String d, double pc, double pv, int s){
		this.codi= c;
		this.descripcio= d;
		this.preuDeCompra=pc;
		this.preuDevenda=pv;
		this.stock=s;
	}
	public String getCodi() 
	{return codi;}
	public void setCodi(String codi) 
	{this.codi = codi;}
	
	public String getDescripcio() 
	{return descripcio;}
	public void setDescripcio(String descripcio) 
	{this.descripcio = descripcio;}
	
	public double getPreuDeCompra() 
	{return preuDeCompra;}
	public void setPreuDeCompra(double preuDeCompra) 
	{this.preuDeCompra = preuDeCompra;}
	
	public double getPreuDevenda() 
	{return preuDevenda;}
	public void setPreuDevenda(double preuDevenda) 
	{this.preuDevenda = preuDevenda;}
	
	public int getStock() 
	{return stock;}
	public void setStock(int stock) 
	{this.stock = stock;} 
	
	 public String toString() {

	        String cadena = "----------------------------------------------";
	        cadena +="\nCodi = " + this.codi;
	        cadena += "\nDescripcio = " + this.descripcio;
	        cadena += "\nPreu de compra = " + this.preuDeCompra;
	        cadena += "\nPreu de venta = " + this.preuDevenda;
	        cadena += "\nStock = " + this.stock + " unitats";
	        cadena += "\n--------------------------------------";
	        return cadena;
	        }
	
}
