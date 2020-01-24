package figuras;


public class Paralelogramo extends Figura{

	private String nombre = "Paralelogramo";
	protected final boolean VALOR=true;
	
	@Override
	 public void Pintar() {
	 System.out.println ( "El nombre de la figura es " + nombre);
	 }
	
	 public  boolean getParalelogramo() {
	 return this.VALOR;
	 }

}
