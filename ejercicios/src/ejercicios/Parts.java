package ejercicios;

public class Parts {

	public static int x = 7; 
	public int y = 3;
	

	public static void main(String[] args) {
		Parts a = new Parts(); 
		Parts b = new Parts();
		a.y = 5;
		b.y = 6;
		a.x = 1;
		b.x = 2;
		System.out.println(a.y);
		System.out.println(b.y);
		System.out.println(a.x);
		System.out.println(b.x);

	}

}
