package Listas;

import java.util.LinkedList;

public class demoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> lista = new LinkedList<Integer>();
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		
		lista.add(3);
		lista.add(5);
		
		
		/*para saber si esta vacia*/
		System.out.println(lista.isEmpty());
		
		System.out.println(lista.get(1));
		
		
		/*agregar en cierta posicion pero no pisa*/
		lista.add(1, 8);
		System.out.println(lista);
		
		
		lista.size();
		System.out.println(lista.contains(5));	
		
		/*vacia la lista*/
		lista.clear();
		System.out.println(lista);
		
		
		/*recibe una lista y saca los parametros contenidos de dicha lista en la lista en cestion*/
		lista.removeAll(lista);
		System.out.println(lista);
		
		

		lista.add(3);
		lista.add(3);
		lista.add(3);
		lista.add(5);
		System.out.println(lista);
		lista.remove(new Integer (3));
		
		
		
		lista2.add(3);
		lista.removeAll(lista2);
		System.out.println(lista);
		
		
		lista.add(3);
		lista.add(5);
		System.out.println(lista);
		
		for (int i = 0; i<lista.size(); i++){
			int a = lista.get(i);
			System.out.println(a);
		}
		
		
		
	}

}
