package pru03.E02;
import java.util.Random;

public class PRU03E02Cotxe_Ethan_Crockett extends CotxeAbstracte implements InterfaceCotxe{
	
	EstatsMotorCotxe estado =EstatsMotorCotxe.Aturat;
	int n;
	
	//Se hereda el constructor de la clase abstracata
	public PRU03E02Cotxe_Ethan_Crockett(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
	}

	
	//Sobreescribo el metodo arrancarMotor para ponerlo en marcha con un enum
	@Override
	public void arrancarMotor()  {
		this.estado= EstatsMotorCotxe.EnMarxa;
		Random r1 = new Random();
		n = r1.nextInt(6500);
		System.out.println(estado);
	}

	@Override
	public EstatsMotorCotxe comprovaMotor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRevolucions() {
		// Hace un return de las revoluciones que tiene el motor
		return this.n;
	}

	@Override
	public void aturarMotor()  {
		// TODO Auto-generated method stub
		this.estado= EstatsMotorCotxe.Aturat;
		n = 0;
		System.out.println(estado);
		
	}

}
