package ArbolGenialogico;

import Cola.ColaVacioException;

public class Persona {

	private Persona padre;
	private Persona madre;
	private Persona tios;
	private Persona hijos [];
	private Persona hijas [];

	
	

	public Persona(Persona padre, Persona madre){
		this.setPadre(padre);
		this.setMadre(madre);

	}
	
	public Persona(){
		this(null,null);
	}
	
	public Persona getPadre() {
		return padre;
	}
	public void setPadre(Persona padre) {
		this.padre = padre;
		
	}
	public Persona getMadre() {
		return madre;
	}
	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public Persona[] getHijos() {
		return hijos;
	}

	public void setHijos(Persona[] hijos) {
		this.hijos = hijos;
	}

	public Persona[] getHijas() {
		return hijas;
	}

	public void setHijas(Persona[] hijas) {
		this.hijas = hijas;
	}

	public Persona getTios() {
		return tios;
	}
	public void setTios(Persona tio) {
		this.tios = tio;
	}
	
	
	
	public void serTio(Persona tio) throws NoPuedeSerTioException{
		
		if (this.getPadre().getPadre()==tio.getPadre()){
			this.setTios(tio);
		}
		else throw new  NoPuedeSerTioException();
		
	}
	
	
	public Persona traerAbueloPaterno(){
		return this.getPadre().getPadre();
	}
	public Persona traerAbueloMaterno(){
		return this.getMadre().getPadre();
	}
	public Persona traerAbuelaMaterna(){
		return this.getMadre().getMadre();
	}
	public Persona traerAbuelaPaterna(){
		return this.getPadre().getMadre();
	}
	


	
}
