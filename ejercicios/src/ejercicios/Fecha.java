package ejercicios;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha {
public static void main(String[] arg) {
Scanner data = new Scanner(System.in);
GregorianCalendar fecha_actual = new GregorianCalendar();
int dif=0;
int conti=0;
int conta=0;
System.out.println("Introduce una fecha");
int dia = data.nextInt();
int mes = data.nextInt();
int any = data.nextInt();
int diaa = (fecha_actual.get(GregorianCalendar.DATE));
int mess = (fecha_actual.get(GregorianCalendar.MONTH));
int anyy = (fecha_actual.get(GregorianCalendar.YEAR));
mess = mess + 1;
System.out.println(dia+"/"+mes+"/"+any);
System.out.println("La fecha actua es " + fecha_actual.getTime() +  " o " + diaa+"/"+mess+ "/"+anyy );

if (any%4==0){
	System.out.println("El año es bisiesto");
			 };

for (int i=0; i < any; ++i) {
	if (any%4==0){
		conti = conti + 366;
	}
				 else {
					 conti = conti + 365;
				 }
	}
System.out.println("Estos son los dia que hay en la fecha itroducida " +conti);

for (int i=0; i < anyy; ++i) {
	if (any%4==0){
		conta = conta + 366;
	}
				 else {
					 conta = conta + 365;
				 }
	}
System.out.println("Dias en la fecha actual " +conta);

if (any<anyy)
{
	dif = conta - conti; 
}

else {
	dif = conti - conta; 
}
System.out.println("Diferencia de dias " +dif);

}

}