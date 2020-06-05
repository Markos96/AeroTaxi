import java.util.ArrayList;


public class Usuario {
	private String nombre;
	private String apellido;
	private int DNI;
	private int edad;
	private ArrayList<Vuelo>vuelos;
	
	
	public Usuario(String nombre, String apellido, int dNI, int edad,
			ArrayList<Vuelo> vuelos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
		this.edad = edad;
		this.vuelos = vuelos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getDNI() {
		return DNI;
	}


	public void setDNI(int dNI) {
		DNI = dNI;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}


	public void setVuelos(ArrayList<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido
				+ ", DNI=" + DNI + ", edad=" + edad + ", vuelos=" + vuelos
				+ "]";
	}
	
				
	
	

	
	
}
