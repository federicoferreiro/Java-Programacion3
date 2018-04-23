package Punto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto(7.0, 5.0);
		Punto p2 = new Punto(4.0, 1.0);
		Punto p3 = new Punto(4.0, 8.0);
		//System.out.println(p1.getX());
		//p1.setX(199.0);
		//System.out.println(p1.getX());
		
		////calcular distancia entre dos puntos.. metodo en punto que calcule la distanca
		////main invocar la distancia y mostrar resultao
		/// para la istacia es necesario calcular la hipotenusa ---- raiz cuadrada de la suma de los cuadrados de los catetos
		
		//calculo de la distancia entre dos puntos
		Double distancia = p1.calcularDistanciaDesde(p2);
		System.out.println("La distancia de p1 a p2 es: "+ distancia);
		}
	
	
	

}

