package Monedero;

import ArbolGenialogico.NoPuedeSerTioException;

public class Monedero {

	private Integer dinero;



	public Monedero(Integer dinero) {

		this.setDinero(dinero);
	}



	public Integer getDinero() {
		return dinero;
	}
	public void setDinero(Integer dinero) {
		this.dinero = dinero;
	}

	public void agregarDinero(Integer mas){
		
		int totalActual= this.getDinero();
		this.setDinero(totalActual+mas);

	}

	public void sacarDinero(Integer menos)throws NoSePuedeSacarMasDinero{
		int totalActual= this.getDinero();
		
		if (totalActual<=0 || totalActual-menos<=0){
			throw new  NoSePuedeSacarMasDinero();
		}
		else{
		this.setDinero(totalActual-menos);
		}
	}
	
	public Integer mostrarDineroEnMonedero(){
		return this.getDinero();
	}

}
