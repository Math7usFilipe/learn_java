package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	//constructor
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	//get set
	protected Board getBoard() {
		return board;
	}
	
	
}
