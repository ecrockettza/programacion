package ejercicios;

public class Nombre {
	private int numero;
	private String romano;
	private String numhexa;
	private String binario;
	
	public int getNumero() 
	{return numero;}
	
	public void setNumero(int numero) 
	{this.numero = numero;}
	
	public String getRomano() 
	{return romano;}
	
	public void setRomano(String romano) 
	{this.romano = romano;}
	
	// Constructor
	public Nombre(int n) 
 	{this.numero=n;}
	public Nombre(String r)
	{this.romano = r;}
	
	
	public String hexNumero() // Transforma el numero en hexadecimal
	{String numhexa = Integer.toHexString(numero);
		return numhexa;}
	
	public String binNumero() // Transforma el numero en binario 
	{String binario = Integer.toBinaryString(numero);
		return binario;}
	
}
