package pru03.E02;

public class PRU03E02Cotxe_2_Ethan_Crockett extends PRU03E02Cotxe_Ethan_Crockett{

	public PRU03E02Cotxe_2_Ethan_Crockett(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
	}

	
	String mensajeError="Este metodo no es para la marcha que tiene este coche";
	CanviManual canvimanual = CanviManual.N;
 	CanviAutomatic canviautomatic = CanviAutomatic.N;
	
	public CanviAutomatic ComprobarCambio() {
		return canviautomatic;
	}
	
	
	public void CanviarMarxaAutomatic( String x) throws Exception{
		if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
			if (x.equals("+")){
				SubirMarchaAutomatic();}
			
			else if(x.equals("-")){
				BajarMarchaAutomatic();
			}
			
			else {
				System.out.println("No hasa seleccionado ni subir ni bajar");}
		}
		else{
			throw new Exception(mensajeError);}	
}
	
	public  void 	SubirMarchaAutomatic(){
		if  (canviautomatic.equals(CanviAutomatic.R))
		{canviautomatic=CanviAutomatic.N;}
		else if  (canviautomatic.equals(CanviAutomatic.N))
		{canviautomatic=CanviAutomatic.F;}
		else {System.out.println("No puedes subir mas marchas");}
	}

	public void BajarMarchaAutomatic() {
		if  (canviautomatic.equals(CanviAutomatic.F))
		{canviautomatic=CanviAutomatic.N;}
		else if  (canviautomatic.equals(CanviAutomatic.N))
		{canviautomatic=CanviAutomatic.R;}
		else {System.out.println("No puedes subir mas marchas");}
	}
}

