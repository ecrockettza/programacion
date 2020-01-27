package pru03.E02;

public class PRU03E02TestCotxe_Ethan_Crockett {
	
	private static void arrancaMotor(PRU03E02Cotxe_Ethan_Crockett x) {
		try {
			x.arrancarMotor();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void aturarMotor(PRU03E02Cotxe_Ethan_Crockett x) {
		try {
			x.aturarMotor();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		//Instanciamos para comprobar el funcionamiento
		PRU03E02Cotxe_Ethan_Crockett coche1 = new PRU03E02Cotxe_Ethan_Crockett("opel", "astra", TipusCanvi.CanviAutomatic);
		System.out.println(coche1.getRevolucions());
		arrancaMotor(coche1);
		System.out.println(coche1.getRevolucions());
		arrancaMotor(coche1);
		System.out.println(coche1.getRevolucions());
		aturarMotor(coche1);
		aturarMotor(coche1);
		System.out.println(coche1.getRevolucions());
		
	}
}
