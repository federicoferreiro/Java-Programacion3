package PacMan;

public enum MazeDecorator {
	LEFT ('>'),
	RIGHT ('<'),
	UP ('v'),
	DOWN ('^'),
	ALIVE ('*'),
	EAT (' ');
	
	private Character decoration;
	private MazeDecorator(Character decoration){
		this.decoration=decoration;
		
	}
	public Character getDecoration() {
		return decoration;
	}
	public void setDecoration(Character decoration) {
		this.decoration = decoration;
	}
}
