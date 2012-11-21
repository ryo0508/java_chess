public class Location {

	final int minRow = 1;
	final int maxRow = 8;
	final int minColumn = 1;
	final int maxColumn = 8;

	private int row;
	private int column;

	public Location(int givenRow, int givenColumn) {
		row = givenRow;
		column = givenColumn;
	}

	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	public Location addLocation(Location location) {
		Location newLocation = new Location(getRow() + location.getRow(),
				getColumn() + location.getColumn());
		return newLocation;
	}

	public Location minusLocation(Location location) {
		Location newLocation = new Location(getRow() - location.getRow(),
				getColumn() - location.getColumn());
		return newLocation;
	}
}