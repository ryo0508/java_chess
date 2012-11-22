import java.util.ArrayList;

public class King extends Piece {
	public King(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}

	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();

		moveList.add(new Location(1, 1));
		moveList.add(new Location(-1, 1));
		moveList.add(new Location(0, 1));
		moveList.add(new Location(1, 0));
		moveList.add(new Location(-1, 0));
		moveList.add(new Location(1, -1));
		moveList.add(new Location(-1, -1));
		moveList.add(new Location(0, -1));
		
		return moveList;
	}
	
	public String displayChar() {
		return (isB() ? "O" : "o");
	}
}
