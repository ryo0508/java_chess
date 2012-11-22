import java.util.ArrayList;


public class Bishop extends Piece {
	public Bishop(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}
	
	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();
		
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(i, i));	
		}
		
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(-i, i));	
		}
		
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(i, -i));	
		}
		
		for(int i = 1; i < 8; i++) {
			moveList.add(new Location(-i, -i));	
		}
		
		return moveList;
	}
	public String displayChar() {
		return (isB() ? "B" : "b");
	}
}
