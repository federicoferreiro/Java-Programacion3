package PacMan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			
			Pacman maze = new Pacman();
			maze.imprimir();

			
			maze.pacmanArriba();
			maze.comiendo();
			maze.imprimir();
			maze.pacmanIzquierda();
			maze.comiendo();
			maze.imprimir();
			maze.pacmanAbajo();
			maze.comiendo();
			maze.imprimir();
			maze.comiendo();
			maze.imprimir();
			maze.pacmanAbajo();
			maze.pacmanIzquierda();
			maze.comiendo();
			maze.imprimir();
	}

}
