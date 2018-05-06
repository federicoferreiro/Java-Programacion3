package Listas;

import java.util.LinkedList;

public class ListaProductos {

	private LinkedList<Producto> productos;
	
	
	

	public ListaProductos(LinkedList<Producto> productos) {
		
		this.setProductos(new LinkedList<Producto>());
	}
	
	public void agregarProducto(Producto producto) throws ProdNullException{
		if (producto == null)
			throw new ProdNullException();
		this.getProductos().add(producto);
	}
	
	public String toString(){
		String representacion="";
		for (Producto producto : this.getProductos())
			representacion += producto.toString();
		return representacion;
	}

	public void Imprimir(){
		System.out.println(this);
	}
	
	public void imprimirK(int K){
		if (K < 0 || K >= this.getProductos().size())
			System.out.println(" ");
		else
			System.out.println(this.getProductos().get(K));
	}
	
	
	
	
	
	public LinkedList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(LinkedList<Producto> productos) {
		this.productos = productos;
	}
	
	
}
