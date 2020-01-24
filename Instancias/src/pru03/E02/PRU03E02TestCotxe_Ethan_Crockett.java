package pru03.E02;

public class PRU03E02TestCotxe_Ethan_Crockett {

	public static void main(String[] args) {
		
		PRU03E02Cotxe_Ethan_Crockett n1 = new PRU03E02Cotxe_Ethan_Crockett("hola", "prueba", null);
		System.out.println(n1.getRevolucions());
		n1.arrancarMotor();
		System.out.println(n1.getRevolucions());
		n1.aturarMotor();
		System.out.println(n1.getRevolucions());
		PRU03E02Cotxe_Ethan_Crockett n2 = new PRU03E02Cotxe_Ethan_Crockett("hola", "prueba", null);
		n2.arrancarMotor();
	}
}
