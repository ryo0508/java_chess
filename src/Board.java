import java.util.ArrayList;

public class Board {

	private ArrayList<Piece> boardStatus;

	public Board() {
		boardStatus = new ArrayList<Piece>();
	}

	public void addPiece(Piece p) {
		boardStatus.add(p);
	}

	public void addPiece(ArrayList<Piece> p_list) {
		for (Piece p : p_list) {
			boardStatus.add(p);
		}
	}

	public Piece checkLocation(int row, int column) {
		for (Piece p : boardStatus) {
			Location curLoc = p.getCurrentLocation();
			if (curLoc.getRow() == row && curLoc.getColumn() == column) {
				return p;
			}
		}
		return null;
	}

	public void removePiece(Piece p) {
		int targetPiece = boardStatus.indexOf(p);
		boardStatus.remove(targetPiece);
	}

	public void renderBoard() {
		System.out.println("    1   2   3   4   5   6   7   8  ");
		System.out.println("  =================================");
		// System.out.println(" =================");
		for (int i = 1; i <= 8; i++) {
			int row = i;
			System.out.print(i + " |");
			for (int j = 1; j <= 8; j++) {
				int column = j;
				Piece p = checkLocation(row, column);
				if (p == null) {
					System.out.print("   ");
				} else {
					System.out.print(" " + p.displayChar() + " ");
				}

				if (j == 8) {
					System.out.println("| " + row);
				} else {
					System.out.print("|");
				}
			}
			System.out.println("  =================================");
		}
		System.out.println("    1   2   3   4   5   6   7   8  ");
	}

	public void renderPossibleMoves(Piece targetPiece) {
		
		ArrayList<Location> possibleMoves = targetPiece.possibleMoves();
		
		System.out.println("    1   2   3   4   5   6   7   8  ");
		System.out.println("  =================================");
		// System.out.println(" =================");
		int possibleLocation = 0;
		for (int i = 1; i <= 8; i++) {
			int row = i;
			System.out.print(i + " |");
			for (int j = 1; j <= 8; j++) {
				int column = j;
				Piece p = checkLocation(row, column);
				
				boolean exist = false;
				for(Location l : possibleMoves) {
					if(row == l.getRow() && column == l.getColumn()){
						if(possibleLocation > 9) {
							System.out.print(" " + possibleLocation);	
						} else {
							System.out.print(" " + possibleLocation + " ");	
						}
						possibleLocation++;
						exist = true;
					}
				}
				
				if(!exist) {
					if (p == null) {
						System.out.print("   ");
					} else {
						System.out.print(" " + p.displayChar() + " ");
					}
				}

				if (j == 8) {
					System.out.println("| " + row);
				} else {
					System.out.print("|");
				}
			}
			System.out.println("  =================================");
		}
		System.out.println("    1   2   3   4   5   6   7   8  ");
	}

}