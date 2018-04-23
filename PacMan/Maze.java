package PacMan;



public class Maze {
	private static final Integer DEFAULT_ROWS = 5;
	private static final Integer DEFAULT_COLUMNS = 5;
	
	
	
	private Integer rows;
	private Integer columns;
	private Character[][] matrix;
	private Integer rowActual;
	private Integer columnActual;
	
	public Maze (){
		this(DEFAULT_ROWS, DEFAULT_COLUMNS);
	}
	
	public Maze(Integer rows, Integer columns) {
		this.setRows(rows);
		this.setColumns(columns);
		this.setMatrix(new Character[this.getRows()][this.getColumns()]);
		for (Integer i = 0; i < this.getRows(); i++)
			for (Integer j = 0; j < this.getColumns(); j++)
				this.getMatrix()[i][j] = MazeDecorator.ALIVE.getDecoration();
		this.setRowActual(this.getRows() / 2);
		this.setColumnActual(this.getColumns() / 2);
		this.getMatrix()[this.getRowActual()][this.getColumnActual()] = MazeDecorator.UP.getDecoration();
	}
	
	public Integer getRows() {
		return this.rows;
	}
	
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Integer getColumns() {
		return this.columns;
	}
	
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public Character[][] getMatrix() {
		return this.matrix;
	}
	
	public void setMatrix(Character[][] matrix) {
		this.matrix = matrix;
	}
	
	public Integer getRowActual() {
		return this.rowActual;
	}
	
	public void setRowActual(Integer rowActual) {
		this.rowActual = rowActual;
	}
	
	public Integer getColumnActual() {
		return this.columnActual;
	}
	
	public void setColumnActual(Integer columnActual) {
		this.columnActual = columnActual;
	}
	
	public Boolean isPacmanAt(Integer row, Integer column) {
		return this.getRowActual().equals(row) && this.getColumnActual().equals(column);
	}
	
	public Boolean isPacmanLookingDown() {
		return this.isPacmanLooking(MazeDecorator.DOWN.getDecoration());
	}
	
	public Boolean isPacmanLookingUp() {
		return this.isPacmanLooking(MazeDecorator.UP.getDecoration());
	}
	
	public Boolean isPacmanLookingLeft() {
		return this.isPacmanLooking(MazeDecorator.LEFT.getDecoration());
	}
	
	public Boolean isPacmanLookingRight() {
		return this.isPacmanLooking(MazeDecorator.RIGHT.getDecoration());
	}
	
	private Boolean isPacmanLooking(Character looking) {
		return this.getMatrix()[this.getRowActual()][this.getColumnActual()].equals(looking);
	}
	
	public Boolean isEmptyAt(Integer row, Integer column) {
		return this.getMatrix()[row][column].equals(MazeDecorator.EAT.getDecoration());
	}
	
	public void pacmanDown() {
		this.pacman(MazeDecorator.DOWN.getDecoration());
	}
	
	public void pacmanUp() {
		this.pacman(MazeDecorator.UP.getDecoration());
	}
	
	public void pacmanLeft() {
		this.pacman(MazeDecorator.LEFT.getDecoration());
	}
	
	public void pacmanRight() {
		this.pacman(MazeDecorator.RIGHT.getDecoration());
	}
	
	private void pacman(Character looking) {
		this.getMatrix()[this.getRowActual()][this.getColumnActual()] = looking;
	}
	
	public void tick() {
		Integer rowOld = this.getRowActual();
		Integer columnOld = this.getColumnActual();
		if (this.isPacmanLookingUp())
			this.setRowActual((this.isLimit(this.getRowActual(), 0)) ? this.getRows() - 1 : this
				.getRowActual() - 1);
		if (this.isPacmanLookingDown())
			this.setRowActual((this.isLimit(this.getRowActual(), this.getRows() - 1)) ? 0 : this
				.getRowActual() + 1);
		if (this.isPacmanLookingLeft())
			this.setColumnActual((this.isLimit(this.getColumnActual(), 0)) ? this.getColumns() - 1 : this
				.getColumnActual() - 1);
		if (this.isPacmanLookingRight())
			this.setColumnActual((this.isLimit(this.getColumnActual(), this.getColumns() - 1)) ? 0 : this
				.getColumnActual() + 1);
		this.getMatrix()[this.getRowActual()][this.getColumnActual()] = this.getMatrix()[rowOld][columnOld];
		this.getMatrix()[rowOld][columnOld] = MazeDecorator.EAT.getDecoration();
	}
	
	private Boolean isLimit(Integer actual, Integer limit) {
		return actual.equals(limit);
	}
	
	public void print() {
		for (Integer i = 0; i < this.getRows(); i++) {
			for (Integer j = 0; j < this.getColumns(); j++)
				System.out.print(this.getMatrix()[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {

		
		Maze maze = new Maze();
		maze.print();

		
		maze.pacmanUp();
		maze.tick();
		maze.print();
		maze.pacmanLeft();
		maze.tick();
		maze.print();
	
	}
	
}
