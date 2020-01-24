package figuras;

public abstract class Figura {

	protected String nombre;
	protected boolean isparalelogramo=true;
	
	public  boolean getParalelogramo()
	{return isparalelogramo;}

	public abstract void Pintar();
	
}
