package Booleano;

public abstract class Booleano {
	
	
	public static final Booleano VERDADERO  = new Verdadero();     
	public static final Booleano FALSE  = new Falso();
	
	public abstract Booleano not();
	public abstract Booleano or(Booleano or);
	public abstract Booleano and(Booleano and);
	public abstract Booleano xor(Booleano xor);
	public abstract Booleano equals(Booleano equals);
	
	
}