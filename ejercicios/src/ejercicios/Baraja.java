package ejercicios;

public class Baraja {

	static String baraja[] = new String[48];
	static String coll[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	static String numb[] = {"oros", "bastos", "espadas", "copas"};
	static int nu=0;
	static int col=0;
	
	public static void main(String[] args) {
	
	
		for (int e = 0; e < baraja.length; e++)
		{
			if(col==12)
			{
				col=0;
			}
			
			if (e==12)
			{
				nu = nu +1;
			}
			if (e==24)
			{
				nu = nu +1;
			}
			if (e==36)
			{
				nu = nu +1;
			}
			
			baraja[e] = numb[nu] +" "+coll[col];
			col= col +1;
		}
	
		
		
		for (int e = 0; e < baraja.length; e++)
		{
			System.out.println(baraja[e]);
		}
	}
}
