package Jueves_150318.Practicando;

public class MyString {

	String target;
	String a;
	
	public String getTarget() {
		return target;
	}

	public void setTarget(String a) {
		this.target = a;
	}
	
	public int getLength(){
		return getTarget().length();
	}
	
	public String firstToLast(String desde, String hasta){
		int i = getTarget().indexOf(desde)+desde.length();
		int b = getTarget().indexOf(hasta)+hasta.length();
		return getTarget().substring(i, b);

	}
	public String firstToEnd(String cadena){
		int i = getTarget().indexOf(cadena)+cadena.length();
		return getTarget().substring(i);

	}
	public String lasToEnd(String cadena){
		int i = getTarget().lastIndexOf(cadena)+cadena.length();
		return getTarget().substring(i);
	}
	
	public String StartToFirst(String cadena){
		
		
		return;
	}
	//StartToEnd
	
}
