package pru03.E02;

public class PRU03E02TestCotxe_Ethan_Crockett {
	
	//Creo dos metodos para utilizar try y catch y lanzar la exception en caso de error
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
		PRU03E02Cotxe_2_Ethan_Crockett coche1 = new PRU03E02Cotxe_2_Ethan_Crockett("opel", "astra", TipusCanvi.CanviAutomatic);
		
		//Hago un un print de las revoluciones que deberian ser 0
		System.out.println(coche1.getRevolucions());
		
		//Enciendo el motor y me da revoluciones
		arrancaMotor(coche1);
		
		//Vuelvo hacer un print de las revoluciones, esta vez me tiene que dar revoluciones entre 0 y 6000
		System.out.println(coche1.getRevolucions());
		
		//Intento arrancar el motor de nuevo para que me salga el mensaje de error
		arrancaMotor(coche1);
		
		//Hago de nuevo un print de las revoluciones para comprobar que funciona el random
		System.out.println(coche1.getRevolucions());
		
		//Ahora para el motor
		aturarMotor(coche1);
		
		//Intento parar el motor para que me salte el mensaje de error
		aturarMotor(coche1);
		
		//Compruebo las revoluciones que deberian ser 0
		System.out.println(coche1.getRevolucions());
		
		//Compruebo el funcionameinto el metodo comprovaMotor
		System.out.println(coche1.comprovaMotor());
		
		System.out.println(coche1.ComprobarCambio());
		try {
			coche1.CanviarMarxaAutomatic("+");
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(coche1.ComprobarCambio());
		try {
			coche1.CanviarMarxaAutomatic("+");
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(coche1.ComprobarCambio());
		
	}
}
