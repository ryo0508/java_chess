import java.util.ArrayList;

public abstract class Piece {

	private Location curLocation;
	private boolean playerB = false;

	public Piece(Location location, boolean player) {
		playerB = player;
		curLocation = location;
	}

	public Location getCurrentLocation() {
		return curLocation;
	}

	public void setCurrentLocation(Location newLocation) {
		curLocation = newLocation;
	}

	public boolean isB() {
		return playerB;
	}
	public boolean canMove(Location to) {
		// check if it can move or not
		return true;
	}

	public ArrayList<Location> possibleMoves() {

		ArrayList<Location> possibleMoves = new ArrayList<Location>();

		for (Location p : moveList()) {
			Location pp = playerB ? getCurrentLocation().minusLocation(p)
					: getCurrentLocation().addLocation(p);
			if (!(pp.getColumn() < 0 || pp.getColumn() > 7 || pp.getRow() < 0 || pp
					.getRow() > 7)) {
				possibleMoves.add(pp);
			}
		}
		return possibleMoves;
	}

	public ArrayList<Location> moveList() {
		return new ArrayList<Location>();
	};
}
