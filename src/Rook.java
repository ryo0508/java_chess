import java.util.ArrayList;


public class Rook extends Piece {
	public Rook(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}
	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();
		
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(i, 0));	
		}
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(-i, 0));	
		}
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(0, i));	
		}
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(0, -i));	
		}
		return moveList;
	}
	public String displayChar() {
		return (isB() ? "R" : "r");
	}
}
