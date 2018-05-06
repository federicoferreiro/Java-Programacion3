package Listas;

public class Producto {

	private Integer codigo;
	private String descripcion;
	private Integer importe;
	private Integer stock;
	
	
	
	
	public Producto(Integer codigo, String descripcion, Integer importe, Integer stock) {
		
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setImporte(importe);
		this.setStock(stock);
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getImporte() {
		return importe;
	}
	public void setImporte(Integer importe) {
		this.importe = importe;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
	public String toString(){
		return ("Codigo: "+ this.getCodigo().toString()) + ", Descripcion: " + (this.getDescripcion().toString() + ", Importe: " + (this.getImporte().toString()) + ", Stock: " + (this.getStock().toString()));
				
	}
	
}
