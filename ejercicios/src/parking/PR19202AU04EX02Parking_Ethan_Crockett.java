package parking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class PR19202AU04EX02Parking_Ethan_Crockett {

	private int places_discapacitats;
	private int places_no_discapacitats;
	String discapacitats[];
	String no_discapacitats[];
	static Random ran = new Random();
	
	public PR19202AU04EX02Parking_Ethan_Crockett(int places_no_discapacitats, int places_discapacitats )
	{	this.places_discapacitats=places_discapacitats;
		this.places_no_discapacitats=places_no_discapacitats;
		discapacitats = new String[places_discapacitats];
		no_discapacitats = new String[places_no_discapacitats];
		for ( int i=0; i<no_discapacitats.length; i++){
			no_discapacitats[i]="";
			}
		for ( int i=0; i<discapacitats.length; i++){
			discapacitats[i]="";
			}
	}
	
	
	public void llegirMatricules(String path) throws Exception
	{
		try {
			FileReader archivo = new FileReader(path);
			BufferedReader archivoBuffer = new BufferedReader(archivo);
			String vacio = "";
			while (vacio!=null) {
				vacio = archivoBuffer.readLine();
				entraCotxe(vacio);
			}
			for ( int i=0; i<no_discapacitats.length; i++){
			System.out.println(no_discapacitats[i]);
			}
			archivoBuffer.close();
		}
		catch(FileNotFoundException e)
		{System.out.println("ALERTA =====> Fitxer incorrecte o inexistent.");}
	}
	
	
	
	public int entraCotxe(String matricula) throws Exception{
		int plazaslibres;
		boolean validar= true;
		int plaza=-1;
		try {
			comprobacionMatricula(matricula);
			for ( int i=0; i<no_discapacitats.length; i++){
				
				if(no_discapacitats[i].equals("") && validar==true)
				{
					validar= false;
					no_discapacitats[i]=matricula;
					plaza=i;
				}
			}
			try 
			{
			plazaslibres=getPlacesLliures(TipusPlacesParking.No_Discapacitat);
			estadoPlazasNoDiscapacitados(plazaslibres);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				}
			return plaza;
		}
	
		catch(Exception e)
		{System.out.println(e.getMessage());}
		return -1;
	}
	
	
	private void capullin() {
		
	}
	
	private boolean comprobacionMatricula (String matricula) throws Exception{
	    if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
	        System.out.println("Matrícula válida");
	        return true;
	    }
	    else{
	    	throw new Exception("ALERTA =====> Matrícula incorrecte.");
	    }      
	}
	
	
	private void estadoPlazasNoDiscapacitados(int ocupacion) throws Exception
	{		
			if (ocupacion==0||ocupacion==-1)
			{
				throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
			}
			
		ocupacion= places_no_discapacitats - ocupacion;
		int comparador= places_no_discapacitats * 85 /100;
		
			if (ocupacion!=comparador&&ocupacion<comparador)
			{System.out.println("Aun hay bastante sitio");}
			else
			{
				throw new Exception("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
			}
	}
	
	
	
	
	public int entraCotxeDiscapacitat(String matricula) throws Exception
	{
		int plazaslibresdiscapacitats=0;
		for ( int i=0; i<discapacitats.length; i++){
			if(discapacitats[i].equals(""))
			{
				plazaslibresdiscapacitats++;
			}
		}
		return plazaslibresdiscapacitats;
	}
	
	
	
	public void surtCotxe(String matricula) throws Exception
	{System.out.println("alo");}
	
	
	
	public void surtCotxeDiscapacitats(String matricula) throws Exception
	{System.out.println("alo");}
	
	
	
	public int getPlacesLliures( TipusPlacesParking tipus) {
	int plazaslibres=0;	
		if (tipus.equals(TipusPlacesParking.No_Discapacitat)){
			for ( int i=0; i<no_discapacitats.length; i++){
				if(no_discapacitats[i].equals("")){
				plazaslibres++;
				}
			}
				return plazaslibres;
		}
			else 
				return places_discapacitats;
			}
		
	public int getPlacesOcupades( TipusPlacesParking tipus){
			if (tipus.equals(TipusPlacesParking.Discapacitat))
				{return places_discapacitats;}
			else 
				return places_no_discapacitats;
		}
	
	
	public void guardarMatricules(String path) throws Exception
	{System.out.println("alo");}
	
}