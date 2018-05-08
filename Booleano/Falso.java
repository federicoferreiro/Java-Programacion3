package Booleano;

public class Falso extends Booleano {

	@Override
	public Booleano not() {
		// TODO Auto-generated method stub
		return VERDADERO;
	}

	@Override
	public Booleano or(Booleano or) {
		// TODO Auto-generated method stub
		or = FALSE;
		return FALSE;
	}

	@Override
	public Booleano and(Booleano and) {
		// TODO Auto-generated method stub
		return this;
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