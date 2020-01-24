package figuras;

public class Triangulo extends Figura{

	protected String nombre="Triangulo";
	protected final boolean VALOR=true;
	
	@Override 
	public void Pintar()
	{System.out.println ( "El nombre de la figura es " + nombre);}
}
