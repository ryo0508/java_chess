import java.util.ArrayList;


public class Knight extends Piece {
	public Knight(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}
	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();
		
		moveList.add(new Location(1, 2));
		moveList.add(new Location(-1, 2));
		moveList.add(new Location(2, 1));
		moveList.add(new Location(-2, 1));
		moveList.add(new Location(1, -2));
		moveList.add(new Location(-1, -2));
		moveList.add(new Location(2, -1));
		moveList.add(new Location(-2, -1));
		
		return moveList;
	}

}
