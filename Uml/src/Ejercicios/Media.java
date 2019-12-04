package Ejercicios;

public class Media {

	private String nom;
	private String autor;
	private int duradaSegons;
	
	public String getNom() 
	{return nom;}
	
	public void setNom(String nom) 
	{this.nom = nom;}

	public String getAutor() 
	{return autor;}

	public void setAutor(String autor) 
	{this.autor = autor;}

	public int getDuradaSegons() 
	{return duradaSegons;}

	public void setDuradaSegons(int duradaSegons) 
	{this.duradaSegons = duradaSegons;}
	
	public Media(String nom, String autor, int durada) 
	{this.nom= nom;
	this.autor=autor;
	this.duradaSegons=durada;
	}
	
	public static void main(String[] arg) {
		Media p = new Media("Avatar","Cameron",2000);
		System.out.println(p.getNom());
		System.out.println(p.getAutor());
		System.out.println(p.getDuradaSegons());
	}
	
}
