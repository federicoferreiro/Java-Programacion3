package PacMan;



public class Pacman {
	private static final Integer FILAS_DEFAULT = 5;
	private static final Integer COLUMNAS_DEFAULT = 5;
	
	
	
	private Integer filas;
	private Integer columnas;
	private Character[][] matriz;
	private Integer filaActual;
	private Integer columnaActual;
	
	public Pacman (){
		this(FILAS_DEFAULT, COLUMNAS_DEFAULT);
	}
	
	public Pacman(Integer filas, Integer columnas) {
		this.setFilas(filas);
		this.setColumnas(columnas);
		this.setMatriz(new Character[this.getFilas()][this.getColumnas()]);
		for (Integer i = 0; i < this.getFilas(); i++)
			for (Integer j = 0; j < this.getColumnas(); j++)
				this.getMatriz()[i][j] = Decoracion.VIVO.getDecoracion();
		this.setFilaActual(this.getFilas() / 2);
		this.setColumnaActual(this.getColumnas() / 2);
		this.getMatriz()[this.getFilaActual()][this.getColumnaActual()] = Decoracion.ARRIBA.getDecoracion();
	}
	
	public Integer getFilas() {
		return filas;
	}
	
	public void setFilas(Integer filas) {
		this.filas = filas;
	}
	
	public Integer getColumnas() {
		return columnas;
	}
	
	public void setColumnas(Integer columnas) {
		this.columnas = columnas;
	}
	
	public Character[][] getMatriz() {
		return matriz;
	}
	
	public void setMatriz(Character[][] matriz) {
		this.matriz = matriz;
	}
	
	public Integer getFilaActual() {
		return filaActual;
	}
	
	public void setFilaActual(Integer filaActual) {
		this.filaActual = filaActual;
	}
	
	public Integer getColumnaActual() {
		return columnaActual;
	}
	
	public void setColumnaActual(Integer columnaActual) {
		this.columnaActual = columnaActual;
	}
	
	public Boolean dondePacman(Integer fila, Integer columna) {
		return this.getFilaActual().equals(fila) && this.getColumnaActual().equals(columna);
	}
	
	public Boolean estaMirandoAbajo() {
		return this.dondeMira(Decoracion.ABAJO.getDecoracion());
	}
	
	public Boolean estaMirandoArriba() {
		return this.dondeMira(Decoracion.ARRIBA.getDecoracion());
	}
	
	public Boolean estaMirandoIzquierda() {
		return this.dondeMira(Decoracion.IZQUIERDA.getDecoracion());
	}
	
	public Boolean estaMirandoDerecha() {
		return this.dondeMira(Decoracion.DERECHA.getDecoracion());
	}
	
	private Boolean dondeMira(Character mira) {
		return this.getMatriz()[this.getFilaActual()][this.getColumnaActual()].equals(mira);
	}
	
	public Boolean estaVacia(Integer fila, Integer columna) {
		return this.getMatriz()[fila][columna].equals(Decoracion.COMIDO.getDecoracion());
	}
	
	public void pacmanAbajo() {
		this.pacman(Decoracion.ABAJO.getDecoracion());
	}
	
	public void pacmanArriba() {
		this.pacman(Decoracion.ARRIBA.getDecoracion());
	}
	
	public void pacmanIzquierda() {
		this.pacman(Decoracion.IZQUIERDA.getDecoracion());
	}
	
	public void pacmanDerecha() {
		this.pacman(Decoracion.DERECHA.getDecoracion());
	}
	
	private void pacman(Character mira) {
		this.getMatriz()[this.getFilaActual()][this.getColumnaActual()] = mira;
	}
	
	public void comiendo() {
		Integer filaVieja = this.getFilaActual();
		Integer columnaVieja = this.getColumnaActual();
		if (this.estaMirandoArriba())
			this.setFilaActual((this.limite(this.getFilaActual(), 0)) ? this.getFilas() - 1 : this
				.getFilaActual() - 1);
		if (this.estaMirandoAbajo())
			this.setFilaActual((this.limite(this.getFilaActual(), this.getFilas() - 1)) ? 0 : this
				.getFilaActual() + 1);
		if (this.estaMirandoIzquierda())
			this.setColumnaActual((this.limite(this.getColumnaActual(), 0)) ? this.getColumnas() - 1 : this
				.getColumnaActual() - 1);
		if (this.estaMirandoDerecha())
			this.setColumnaActual((this.limite(this.getColumnaActual(), this.getColumnas() - 1)) ? 0 : this
				.getColumnaActual() + 1);
		this.getMatriz()[this.getFilaActual()][this.getColumnaActual()] = this.getMatriz()[filaVieja][columnaVieja];
		this.getMatriz()[filaVieja][columnaVieja] = Decoracion.COMIDO.getDecoracion();
	}
	
	private Boolean limite(Integer actual, Integer limite) {
		return actual.equals(limite);
	}
	
	public void imprimir() {
		for (Integer i = 0; i < this.getFilas(); i++) {
			for (Integer j = 0; j < this.getColumnas(); j++)
				System.out.print(this.getMatriz()[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	
	
	
}
