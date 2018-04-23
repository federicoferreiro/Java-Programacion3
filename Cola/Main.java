package Cola;

public class Main {
	public static void main(String[] args) {
		Cola c1 = new Cola();
		c1.Poner(3);
		c1.Poner(2);
		System.out.println(c1);
		c1.Sacar();
		System.out.println(c1.Ver());
		c1.getSali();
	}
}