package Jueves_150318;

public class MainEmpresa {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director dir = new Director("Jorge","Dex",12,13,14,15);
		Secretaria secre = new Secretaria("Laura","gomez",12,13,14,15);
		
		
		dir.setSecre1(secre);
		secre.setDir1(dir);
		
		
		
		
		
	}
}
