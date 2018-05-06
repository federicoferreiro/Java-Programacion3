package Listas;

public class MainListaProductos {

	public static void main(String[] args) throws ProdNullException {
		// TODO Auto-generated method stub
		ListaProductos compras = new ListaProductos(null);
		Producto prod = new Producto(1, "leche", 500, 5);
		Producto prod2 = new Producto(2, "leche", 500, 5);
		compras.agregarProducto(prod);
		compras.agregarProducto(prod2);
		
		System.out.println(compras);
		
	}

}
