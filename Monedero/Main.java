package Monedero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monedero n1 = new Monedero(500);
		
		n1.sacarDinero(300);
		n1.agregarDinero(5);
		System.out.println(n1.mostrarDineroEnMonedero());
		
	}

}
