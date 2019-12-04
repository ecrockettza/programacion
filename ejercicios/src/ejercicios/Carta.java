package ejercicios;

public class Carta {

	String coll;
	String numb;
	
	public Carta (String coll, String numb)
		{this.coll = coll;
			this.numb = numb;}
	
	public String getNumb() 
		{return numb;}
	
	public String getColl() 
	{return coll;}
	
	public void setColl(String x)
	{
		this.coll = x;
	}
	
	public void setNumb(String x)
	{
		this.numb = x;
	}
	
}
