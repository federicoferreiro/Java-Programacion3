package Booleano;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Booleano b2 = Booleano.FALSO;
		
		Booleano.FALSO.or(b2);
		Booleano.VERDADERO.and(b2);
		b2.not();
		Booleano.FALSO.equals(b2);
	}

}
