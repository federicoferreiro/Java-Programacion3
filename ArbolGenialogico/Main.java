package ArbolGenialogico;

public class Main {
	public static void main(String[] args) {
		Persona abuelo  =  new Persona();
		Persona abuela  =  new Persona();
		Persona madre  =  new Persona();
		Persona padre  =  new Persona(abuelo, abuela);
		Persona hijo = new Persona(padre, madre);
		Persona hijo2 = new Persona(padre, madre);
		Persona padre2 = new Persona(abuelo, abuela);
		
		hijo.serTio(padre2);
		
		System.out.println(hijo.getTios());
		

		
	}
}