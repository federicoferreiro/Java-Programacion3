package Listas;

import java.util.LinkedList;

public class MainManual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Producto>lista = new LinkedList<Producto>();
		
		Producto producto = new Producto(1, "carne", 500, 500);
		Producto producto2 = new Producto(2, "pescado", 600, 500);
		Producto producto3 = new Producto(3, "leche", 18, 500);
		Producto producto4 = new Producto(4, "leche", 18, 500);
		Producto producto5 = new Producto(5, "leche", 18, 500);
		Producto producto6 = new Producto(6, "leche", 18, 500);
		Producto producto7 = new Producto(7, "leche", 18, 500);
		Producto producto8 = new Producto(8, "leche", 18, 500);
		Producto producto9 = new Producto(9, "leche", 18, 500);
		
		
		
		lista.add(producto);
		lista.add(producto2);
		lista.add(producto3);
		lista.add(producto4);
		lista.add(producto5);
		lista.add(producto6);
		lista.add(producto7);
		lista.add(producto8);
		lista.add(producto9);
		
		
		System.out.println(lista);
		
		System.out.println(lista.get(5));
	}

}
