package Jueves_150318;

public final class Secretaria extends Personal {

	private Director dir1;
	
	public Secretaria(String nombre, String apellido, Integer dni, Integer legajo, Integer interno, Integer sueldo) {
		super(nombre, apellido, dni, legajo, interno, sueldo);
		// TODO Auto-generated constructor stub
	}

	public Director getDir1() {
		return dir1;
	}

	public void setDir1(Director dir1) {
		this.dir1 = dir1;
	}


	
	

	
}