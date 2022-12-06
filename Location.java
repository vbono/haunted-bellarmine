package g1s1Package;
import java.util.Scanner;

public class Location {
Scanner s = new Scanner(System.in);

// calls the Constants interface for location printouts
ConstantInterface c = new Constants();
	
	public LocationNames currentLocation;
	
	//constructor, initializes current location to start
	public Location() {
		currentLocation = LocationNames.START;
	}
	
	//returns player's current location
	public LocationNames currentLocation() {
		return currentLocation;
	}
	
	//main move method, uses methods for each location to change current location
	public void move(Commands command) {
		
		switch (currentLocation) {
			case START:
				startMove(command);
				break;
			case MANSION:
				mansionMove(command);
				break;
			case FOREST:
				forestMove(command);
				break;
			case ZEN_GARDEN:
				zenGMove(command);
				break;
			case STUDY:
				studyMove(command);
				break;
			case GREAT_HALL:
				greatHMove(command);
				break;
			case PRESIDENTS_HALL:
				presidentsHMove(command);
				break;
			case ART_MUSEUM:
				museumMove(command);
				break;
			case ART_MUSEUM2:
				museumMove2(command);
				break;
			case STORAGE:
				storageMove(command);
				break;
			case DUNGEON:
				dungeonMove(command);
				break;
			default:
				c.Default();
		}
	}
	
	private void startMove(Commands command) {
		
		switch (command) {
			case NORTH:
				c.Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case EAST:
				c.Forest();
				currentLocation = LocationNames.FOREST;
				break;
			case SOUTH:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	//each location move method uses the command from the player to move and update the current location
	
	private void mansionMove(Commands command) {
		
		switch (command) {
			case EAST:
				c.presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case NORTH:
				c.greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case WEST:
				c.Study();
				currentLocation = LocationNames.STUDY;
				break;
			case SOUTH:
				c.Start();
				currentLocation = LocationNames.START;
				break;
			default:
				c.Default();
		}
		
	}
	
	private void forestMove(Commands command) {
		switch (command) {
			case STAIRS:
				c.zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			case WEST:
				c.Start();
				currentLocation = LocationNames.START;
				break;
			case SOUTH:
			case NORTH:
			case EAST:
				c.nothing();
				break;
			default:
				c.Default();
		}

	}

	private void zenGMove(Commands command) {
		switch (command) {
			case STAIRS:
				c.Forest();
				currentLocation = LocationNames.FOREST;
				break;
			case NAMASTE:
				c.greatHall();
				currentLocation = LocationNames.GREAT_HALL;
			case NORTH:
			case SOUTH:
			case EAST:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}

	
	private void studyMove(Commands command) {
		switch (command) {
			case NORTH:
				c.greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case EAST:
				c.presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case SOUTH:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	private void greatHMove(Commands command) { 
		switch (command) {
			case SOUTH:
				c.Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case NAMASTE:
				c.zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			case NORTH:
			case EAST:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	private void presidentsHMove(Commands command) {
		switch (command) {
			case NORTH:
				c.greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case WEST:
				c.Study();
				currentLocation = LocationNames.STUDY;
				break;
			case STAIRS:
			case DOWNSTAIRS:
				c.artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case SOUTH:
			case EAST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	private void museumMove(Commands command) {
		switch (command) {
			case WEST:
				c.Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case NORTH:
				c.artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case STAIRS:
			case UPSTAIRS:
				c.presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case SOUTH:
			case EAST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	private void museumMove2(Commands command) {
		switch(command) {
			case SOUTH:
				c.artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case WEST:
				c.storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			case NORTH:
			case EAST:
				c.nothing();
				break;
			default:
				c.Default();
		}
	}
	
	private void storageMove(Commands command) {
		switch (command) {
			case EAST:
				c.artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case SOUTH:
				c.Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case NORTH:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
		
	}
	
	private void dungeonMove(Commands command) {
		switch (command) {
			case EAST:
				c.artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case NORTH:
				c.storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			case SOUTH:
			case WEST:
				c.nothing();
				break;
			default:
				c.Default();
		}
		
	}
	
}
