package Jueves_150318;

public abstract class Personal extends Persona{
	
	Integer legajo;
	Integer interno;
	Integer sueldo;
	
	public Personal(String nombre, String apellido, Integer dni, Integer legajo, Integer interno, Integer sueldo) {
		super(nombre, apellido, dni);
		this.setLegajo(legajo);
		this.setInterno(interno);
		this.setSueldo(sueldo);
	}
	
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public Integer getInterno() {
		return interno;
	}
	public void setInterno(Integer interno) {
		this.interno = interno;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}
	
	
}