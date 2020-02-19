package parking;

import java.util.Scanner;

public class PR19202AU04EX02ParkingTest_Ethan_Crockett {

	public static void main(String[] args) throws Exception {
		PR19202AU04EX02Parking_Ethan_Crockett parking = new PR19202AU04EX02Parking_Ethan_Crockett(20,5);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Omplir parking a partir de fitxer");
		System.out.println("2.Entrar Cotxe");
		System.out.println("3.Entrar Cotxe Discapacitat");
		System.out.println("4.Surtir Cotxe");
		System.out.println("5.Surtir Cotxe Discapacitat");
		System.out.println("6.Guardar llistat de matricules en fitxer");
		System.out.println("7.Sortir");
		int menu = sc.nextInt();
		while (menu != 7){
			switch (menu){
			        case 1:
			        	parking.llegirMatricules("C:/Users/ecrockett/Desktop/matriculas.txt");
			        break;
			           
			        case 2:
			        	System.out.println("Escribe la matricula");
			        	String coche = sc.nextLine();
			        	coche = sc.nextLine();
			        	parking.entraCotxe(coche);
		
			        break;
			       
			        case 3:
			      
			        break;

			        case 4:
			        	 System.out.println(parking.getPlacesLliures( TipusPlacesParking.No_Discapacitat));
			        break;
			       
			        case 5:
			  
			        break;

			        case 6:
			      
			        break;
			}
			
			System.out.println("¿Que quieres hacer ahora?");
			menu = sc.nextInt();
		}
			
		System.out.println("No vemooos :D");
	}
}