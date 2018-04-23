package Pila;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila p1 = new Pila();
		p1.Poner(1);
		p1.Poner(2);
		p1.Poner(3);
		System.out.println(p1);
		p1.Sacar();
		System.out.println(p1);
		p1.Poner(1);
		System.out.println(p1);
		System.out.println(p1.toString2());
		
	}

}
