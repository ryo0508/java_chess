import java.util.ArrayList;


public class Bishop extends Piece {
	public Bishop(Location givenLocation, boolean player) {
		super(givenLocation, player);
	}
	public ArrayList<Location> possibleMoves(){
		
		ArrayList<Location> possibleMoves = new ArrayList<Location>();
		possibleMoves.add(new Location(1,2));
		return possibleMoves;
	}
	
	public ArrayList<Location> moveList() {
		ArrayList<Location> moveList = new ArrayList<Location>();
		
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
