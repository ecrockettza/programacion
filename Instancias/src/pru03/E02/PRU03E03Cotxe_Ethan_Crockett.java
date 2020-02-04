package pru03.E02;

public class PRU03E03Cotxe_Ethan_Crockett extends PRU03E02Cotxe_Ethan_Crockett{

	public PRU03E03Cotxe_Ethan_Crockett(String marca, String model, TipusCanvi tipuscanvi) {
		super(marca, model, tipuscanvi);
	}

	CanviManual canvimanual = CanviManual.N;
 	CanviAutomatic canviautomatic = CanviAutomatic.N;
	
 	//Hago dos metodos con un return del canvi auomatic y otro del canvi manual
	private CanviAutomatic ComprobarCambioAutomatic() {
		return canviautomatic;
	}
	
	private CanviManual ComprobarCambioManual() {
		return canvimanual;
	}
	
	//Metodo para que me devuelva en que cambio se encuentra el coche
	public void ComprobarCambio() {
		if (tipuscanvi.equals(TipusCanvi.CanviAutomatic))
		{
		System.out.println(ComprobarCambioAutomatic());	
		}
		else 
		{System.out.println(ComprobarCambioManual());}
		
	}
	
	
	//Metodo para cambiar marcha, depende de que tipo sea la marcha y si queremos subir o bajar la marcha llama un metodo u otro.
	public void CanviarMarxa( String x) throws Exception{
		if (tipuscanvi.equals(TipusCanvi.CanviAutomatic)){
			if (x.equals("+")){
				SubirMarchaAutomatic();}
			
			else if(x.equals("-")){
				BajarMarchaAutomatic();
			}
			
			else {
				System.out.println("No has seleccionado ni subir ni bajar");}
				}
		else if(tipuscanvi.equals(TipusCanvi.CanviManual)){
			if (x.equals("+")){
				SubirMarchaManual();}
			
			else if(x.equals("-")){
				BajarMarchaManual();
			}
			
			else {
				System.out.println("No has seleccionado ni subir ni bajar");}
				}
		}	

	
//Metodos de bajar y subir marcha de tipo automatico
	private  void 	SubirMarchaAutomatic() throws Exception{
		if  (canviautomatic.equals(CanviAutomatic.R))
			{canviautomatic=CanviAutomatic.N;}
		else if  (canviautomatic.equals(CanviAutomatic.N))
			{canviautomatic=CanviAutomatic.F;}
		else {throw new Exception("No puedes subir mas marchas");}
	}

	private void BajarMarchaAutomatic() throws Exception{
		if  (canviautomatic.equals(CanviAutomatic.F))
			{canviautomatic=CanviAutomatic.N;}
		else if  (canviautomatic.equals(CanviAutomatic.N))
			{canviautomatic=CanviAutomatic.R;}
		else {
			throw new Exception("No puedes bajar mas marchas");}
	}
	

//Metodos de subir y bajar marchas del tipo manual
	private void SubirMarchaManual() throws Exception{
		if  (canvimanual.equals(CanviManual.R))
		{canvimanual=CanviManual.N;}
		else if  (canvimanual.equals(CanviManual.N))
		{canvimanual=CanviManual.m1;}
		else if  (canvimanual.equals(CanviManual.m1))
		{canvimanual=CanviManual.m2;}
		else if  (canvimanual.equals(CanviManual.m2))
		{canvimanual=CanviManual.m3;}
		else if  (canvimanual.equals(CanviManual.m3))
		{canvimanual=CanviManual.m4;}
		else if  (canvimanual.equals(CanviManual.m4))
		{canvimanual=CanviManual.m5;}
		else if  (canvimanual.equals(CanviManual.m5))
		{canvimanual=CanviManual.m6;}
		else {throw new Exception("No puedes subir mas marchas");}
		
	}
	private void BajarMarchaManual() throws Exception{
		if  (canvimanual.equals(CanviManual.m6))
			{canvimanual=CanviManual.m5;}
		else if  (canvimanual.equals(CanviManual.m5))
			{canvimanual=CanviManual.m4;}
		else if  (canvimanual.equals(CanviManual.m4))
		{canvimanual=CanviManual.m3;}
		else if  (canvimanual.equals(CanviManual.m3))
			{canvimanual=CanviManual.m2;}
		else if  (canvimanual.equals(CanviManual.m2))
			{canvimanual=CanviManual.m1;}
		else if  (canvimanual.equals(CanviManual.m1))
			{canvimanual=CanviManual.N;}
		else if  (canvimanual.equals(CanviManual.N))
			{canvimanual=CanviManual.R;}
		else {
			throw new Exception("No puedes bajar mas marchas");
				}
	}
}

