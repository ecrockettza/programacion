package figuras;

public class Cuadrado extends Paralelogramo {
	private String nombre = "Cuadrado";
		
	@Override
	 public void Pintar() {
	 System.out.println ( "El nombre de la figura es " + nombre);
	 }	
	
	@Override
	public  boolean getParalelogramo() {
		 return this.VALOR;
		 }
}
