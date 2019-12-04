package ejercicios;

 class Persona {
	 private int edad;
	 private String nombre;
	 private boolean activo;

	 public Persona() {}
	 public Persona(int e,String n,boolean a) {
		 edad=e;
		 nombre=n;
		 activo=a;
	 }
	 
	 public String getNombre() {
		 return nombre;
	 }
	 public void setNombre(String n)
	 { nombre=n;}
	 
	 
}
