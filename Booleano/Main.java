package Booleano;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Booleano b2 = Booleano.FALSO;
		Booleano b3 = Booleano.VERDADERO;
		
		Booleano.VERDADERO.not();
		Booleano.VERDADERO.or(b2);
		Booleano.VERDADERO.equals(b2);
		Booleano.VERDADERO.and(b2);
		System.out.println("..............");
		Booleano.VERDADERO.not();
		Booleano.VERDADERO.or(b3);
		Booleano.VERDADERO.equals(b3);
		Booleano.VERDADERO.and(b3);
		System.out.println("................");
		Booleano.FALSO.not();
		Booleano.FALSO.or(b2);
		Booleano.FALSO.equals(b2);
		Booleano.FALSO.and(b2);
		System.out.println("..............");
		Booleano.FALSO.not();
		Booleano.FALSO.or(b3);
		Booleano.FALSO.equals(b3);
		Booleano.FALSO.and(b3);
		
		
	}

}
