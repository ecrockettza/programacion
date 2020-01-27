package pru03.E02;
import java.util.Random;

public class PRU03E02Cotxe_Ethan_Crockett extends CotxeAbstracte implements InterfaceCotxe{
	//Creo un estado del coche, también creo las revoluciones con valor 0 y estancio un random.
	EstatsMotorCotxe estado =EstatsMotorCotxe.Aturat;
	int revoluciones;
	Random numerorandom = new Random();
	
	//Se hereda el constructor de la clase abstracata
	public PRU03E02Cotxe_Ethan_Crockett(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
	}

	
	//Sobreescribo el metodo arrancarMotor para ponerlo en marcha con un enum
	@Override
	public void arrancarMotor() throws Exception {
		/**Utilizo una exception para que salga un mensaje de error personalizado y hago un random para conseguir las revoluciones
		 * Compruebo si el coche esta en marcha si no lo esta lo pongo en marcha y si lo esta hago un throw de la exception
		 */
		if (estado.equals(EstatsMotorCotxe.Aturat)){
			this.estado= EstatsMotorCotxe.EnMarxa;
			revoluciones = numerorandom.nextInt(6500);
			System.out.println("El coche se ha puesto " + estado);
		}
		else{
			revoluciones = numerorandom.nextInt(6500);
			throw new Exception("El motor ya esta encendido");}
	}

	//Devuelvo el estado del motor
	@Override
	public EstatsMotorCotxe comprovaMotor() {
		return estado;
	}

	@Override
	public int getRevolucions() {
		/* Hago un return de las revoluciones que tiene el motor si el motor esta en marcha hago un random de las revoluciones y me las
		 * devuelve. Si no esta en marcha me hace un return de 0.
		 */
		if (estado.equals(EstatsMotorCotxe.EnMarxa)) {
			revoluciones = numerorandom.nextInt(6500);
			return this.revoluciones;}
		
		else {
			return 0;}
		}

	@Override
	public void aturarMotor() throws Exception {
		// Sobreescribimos el metodo y utilizamos el enum para parar el motor 
		if (estado.equals(EstatsMotorCotxe.EnMarxa)){
			this.estado= EstatsMotorCotxe.Aturat;
			revoluciones=0;
			System.out.println(estado);
		}
		else{
			revoluciones = numerorandom.nextInt(6500);
			throw new Exception("El motor ya estaba apagado");}
		
	}

}
