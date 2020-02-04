package pru03.E02;

public class PRU03E03TestCotxe_Ethan_Crockett {
	    

	public static void main(String[] args) {
		//Instanciamos para comprobar el funcionamiento
		PRU03E03Cotxe_Ethan_Crockett coche1 = new PRU03E03Cotxe_Ethan_Crockett("opel", "astra", TipusCanvi.CanviManual);
		PRU03E03Cotxe_Ethan_Crockett coche2 = new PRU03E03Cotxe_Ethan_Crockett("ferrari", "fiuuuhmmmm", TipusCanvi.CanviAutomatic);
				
		//Comprobación de la utilización de los metodos para el coche manual. Subo marcha y la bajo hasta que me salga el mensaje de error
		try {
			System.out.println("-----------------Coche1-----------------");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			coche1.ComprobarCambio();
			coche1.CanviarMarxa("+");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try
		{coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		coche1.ComprobarCambio();
		coche1.CanviarMarxa("-");
		}
		catch(Exception e) {System.out.println(e.getMessage());}
		
		try
		{//Ahora voy a comprobar el funcionamiento de los metodos en el tipo manual
			System.out.println("-----------------Coche2-----------------");
			coche2.ComprobarCambio();
			coche2.CanviarMarxa("+");
			coche2.ComprobarCambio();
			coche2.CanviarMarxa("+");}
		catch(Exception e) {System.out.println(e.getMessage());}
		
		try
		{coche2.ComprobarCambio();
		coche2.CanviarMarxa("-");
		coche2.ComprobarCambio();
		coche2.CanviarMarxa("-");
		coche2.ComprobarCambio();
		coche2.CanviarMarxa("-");}
		catch(Exception e) {System.out.println(e.getMessage());}
		
		
	}
}
