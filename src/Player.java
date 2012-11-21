import java.util.ArrayList;

public class Player {

	private boolean playerB;
	private ArrayList<Piece> pieces;

	Player(boolean player) {
		playerB = player;
		pieces = new ArrayList<Piece>();
	}

	public boolean isB() {
		return playerB;
	}

	public ArrayList<Piece> returnPieces() {
		return pieces;
	}

	public void setPiecesInPlace() {
		if (playerB) {
			// Create pawns
			for (int i = 1; i <= 8; i++) {
				pieces.add(new Pawn(new Location(7, i), true));
			}
			pieces.add(new Rook(new Location(8, 1), true));
			pieces.add(new Knight(new Location(8, 2), true));
			pieces.add(new Bishop(new Location(8, 3), true));
			pieces.add(new Queen(new Location(8, 4), true));
			pieces.add(new King(new Location(8, 5), true));
			pieces.add(new Bishop(new Location(8, 6), true));
			pieces.add(new Knight(new Location(8, 7), true));
			pieces.add(new Rook(new Location(8, 8), true));
		} else {
			// Create pawns
			for (int i = 1; i <= 8; i++) {
				pieces.add(new Pawn(new Location(2, i), false));
			}
			pieces.add(new Rook(new Location(1, 1), false));
			pieces.add(new Knight(new Location(1, 2), false));
			pieces.add(new Bishop(new Location(1, 3), false));
			pieces.add(new Queen(new Location(1, 4), false));
			pieces.add(new King(new Location(1, 5), false));
			pieces.add(new Bishop(new Location(1, 6), false));
			pieces.add(new Knight(new Location(1, 7), false));
			pieces.add(new Rook(new Location(1, 8), false));

		}

	}

}
