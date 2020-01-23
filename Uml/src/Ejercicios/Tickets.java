package Ejercicios;

public class Tickets {

	 int entradesPerVendre;
	 int cont;

	public Tickets(int n) {
	entradesPerVendre = n;
	cont = cont+n;
	}

	public int getentradesPerVendre() {
	return cont;
	}

	public void vendre(int n) {
	if (this.entradesPerVendre <= 0) {
	System.out.println("Las entradas para esta zona se han acabado");

	}

	if (this.entradesPerVendre < n) {
	System.out.println("No hay entradas suficientes");
	}

	else {
	entradesPerVendre = entradesPerVendre-n;
	System.out.println("Aqui tienes sus "+n+" entradas.");
	}

	}

	}
