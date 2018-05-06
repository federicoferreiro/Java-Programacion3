package PacMan;

public enum MazeDecorator {
	IZQUIERDA ('>'),
	DERECHA ('<'),
	ARRIBA ('v'),
	ABAJO ('^'),
	VIVO ('*'),
	COMIDO (' ');
	
	private Character decorar;
	private MazeDecorator(Character decoracion){
		this.decorar=decoracion;
		
	}
	public Character getDecoracion() {
		return decorar;
	}
	public void setDecoracion(Character decoracion) {
		this.decorar = decoracion;
	}
}
