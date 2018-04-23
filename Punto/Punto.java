package Punto;

public class Punto {

	private Double x;
	private Double y;
	
	
	
	public Punto(Double x, Double y) {
		this.setX(x);
		this.setY(y);
	}
	
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		
		//metodos estaticos del objeto
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		
		//metodos estaticos del objeto
		this.y = y;
	}
	

	public Double calcularDistanciaDesde(Punto parametros) {
		double cateto1 = x - parametros.getX();
		double cateto2 = y - parametros.getY();
		double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		return hipotenusa;
 
	}

	
}




