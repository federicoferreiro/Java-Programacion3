package PacMan;

public enum Decoracion {
	IZQUIERDA ('>'),
	DERECHA ('<'),
	ARRIBA ('v'),
	ABAJO ('^'),
	VIVO ('*'),
	COMIDO (' ');
	
	private Character decorar;
	private Decoracion(Character decoracion){
		this.decorar=decoracion;
		
	}
	public Character getDecoracion() {
		return decorar;
	}
	public void setDecoracion(Character decoracion) {
		this.decorar = decoracion;
	}
}
