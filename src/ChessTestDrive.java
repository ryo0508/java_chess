import java.util.ArrayList;

public class ChessTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GameMaster gm = new GameMaster();
		gm.startGame();
		
		while(gm.canGoOn()) {
			gm.movePiece();
		}
		
//		Board board = new Board();
//		board.renderBoard();
		// Location test
//		Location loc = new Location(5, 5);
//		Location loc2 = new Location(7,2);
		
//		Pawn pawn = new Pawn(loc, false);
//		curPosition(pawn);
//		showPossibleMoves(pawn);
//		pawn.move(0);
//		curPosition(pawn);
//		showPossibleMoves(pawn);
//		pawn.move(1);
//		curPosition(pawn);
//		showPossibleMoves(new Pawn(loc, false));
		
//		showPossibleMoves(new Pawn(loc, true));
//		showPossibleMoves(new Pawn(loc2, true));
//		showPossibleMoves(new Knight(loc, false));
//		showPossibleMoves(new King(loc, true));
//		Bishop b = new Bishop(loc, false);
//		curPosition(b);
//		b.moveList();
//		showPossibleMoves(b);
		//showPossibleMoves(new Bishop(loc, false));
//		
//		// Create User
//		Player player1 = new Player(false);
//		Player player2 = new Player(true);
//		
//		player1.setPiecesInPlace();
//		System.out.println("piece size => " + player1.returnPieces().size());
//		
//		player2.setPiecesInPlace();
//		System.out.println("piece size => " + player2.returnPieces().size());
		
//		for(Piece piece : player1.returnPieces()) {
//			System.out.println("something => [" + piece.getCurrentLocation().getRow() + ", " + piece.getCurrentLocation().getColumn() + "]");
//		}
//		
//		for(Piece piece : player2.returnPieces()) {
//			System.out.println("something => [" + piece.getCurrentLocation().getRow() + ", " + piece.getCurrentLocation().getColumn() + "]");
//		}


	}

	private static void curPosition(Piece p) {
		System.out.println("current_position => [" + p.getCurrentLocation().getColumn() + ", " + p.getCurrentLocation().getRow() + "]");
	}
	private static void showPossibleMoves(Piece piece) {
		System.out.println(piece.getClass() + " =============");
		ArrayList<Location> pp = piece.possibleMoves();
		for (Location p : pp) {
			System.out.println("PossibleMoves => [" + p.getColumn() + ", "
					+ p.getRow() + "]");
		}		
	}
}
