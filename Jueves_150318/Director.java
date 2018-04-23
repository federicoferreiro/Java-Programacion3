package Jueves_150318;

public final class Director extends Personal{

	Secretaria secre1;

	public Secretaria getSecre1() {
		return secre1;
	}

	public void setSecre1(Secretaria secre1) {
		this.secre1 = secre1;
	}

	public Director(String nombre, String apellido, Integer dni, Integer legajo, Integer interno, Integer sueldo) {
		super(nombre, apellido, dni, legajo, interno, sueldo);
		
	}

	
}