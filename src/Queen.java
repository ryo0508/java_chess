import java.util.ArrayList;


public class Queen extends Piece {
	public Queen(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}
	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();
		
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(i, 0));	
		}
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(-i, 0));	
		}
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(0, i));	
		}
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(0, -i));	
		}
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(i, i));	
		}
		
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(-i, i));	
		}
		
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(i, -i));	
		}
		
		for(int i = 0; i < 8; i++) {
			moveList.add(new Location(-i, -i));	
		}
		return moveList;
	}
}
