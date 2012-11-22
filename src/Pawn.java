import java.util.ArrayList;

public class Pawn extends Piece {

	public Pawn(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}

	public ArrayList<Location> moveList() {
		ArrayList<Location> possiblePositions = new ArrayList<Location>();
		possiblePositions.add(new Location(1, 0));
		if (getCurrentLocation().getRow() == 2 && !isB()) {
			possiblePositions.add(new Location(2, 0));
		} else if (getCurrentLocation().getRow() == 7 && isB()) {
			possiblePositions.add(new Location(2, 0));
		}
		return possiblePositions;
	}
	
	public String displayChar() {
		return (isB() ? "P" : "p");
	}

}