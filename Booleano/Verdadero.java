package Booleano;

public class Verdadero extends Booleano{
	
	
	@Override
	public Booleano not() {
		
		return FALSE;
	}

	@Override
	public Booleano or(Booleano v) {
		// TODO Auto-generated method stub

		v = VERDADERO;
		return VERDADERO;
	}

	@Override
	public Booleano and(Booleano and) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booleano xor(Booleano xor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booleano equals(Booleano equals) {
		// TODO Auto-generated method stub
		return null;
	}

	
}