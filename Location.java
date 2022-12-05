package milestone1package;
import java.util.Scanner;

public class Location {
Scanner s = new Scanner(System.in);
	
	public LocationNames currentLocation;
	
	public Location() {
		currentLocation = LocationNames.START;
	}
	
	public LocationNames currentLocation() {
		return currentLocation;
		
	}
	
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
				Default();
		}
	}
	
	private void startMove(Commands command) {
		
		switch (command) {
			case NORTH:
				Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case EAST:
				Forest();
				currentLocation = LocationNames.FOREST;
				break;
			case SOUTH:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void mansionMove(Commands command) {
		
		switch (command) {
			case EAST:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case WEST:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case SOUTH:
				nothing();
				break;
			default:
				Default();
		}
		
	}
	
	private void forestMove(Commands command) {
		switch (command) {
			case STAIRS:
				zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			case WEST:
				Start();
				currentLocation = LocationNames.START;
				break;
			case SOUTH:
			case NORTH:
			case EAST:
				nothing();
				break;
			default:
				Default();
		}

	}

	private void zenGMove(Commands command) {
		switch (command) {
			case STAIRS:
				Forest();
				currentLocation = LocationNames.FOREST;
				break;
			case NORTH:
			case SOUTH:
			case EAST:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
	}

	
	private void studyMove(Commands command) {
		switch (command) {
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case EAST:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case SOUTH:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void greatHMove(Commands command) { 
		switch (command) {
			case SOUTH:
				Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case NAMASTE:
				zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			case NORTH:
			case EAST:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void presidentsHMove(Commands command) {
		switch (command) {
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case WEST:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case STAIRS:
			case DOWNSTAIRS:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case SOUTH:
			case EAST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void museumMove(Commands command) {
		switch (command) {
			case WEST:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case NORTH:
				artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case STAIRS:
			case UPSTAIRS:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case SOUTH:
			case EAST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void museumMove2(Commands command) {
		switch(command) {
			case SOUTH:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case WEST:
				storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			case NORTH:
			case EAST:
				nothing();
				break;
			default:
				Default();
		}
	}
	
	private void storageMove(Commands command) {
		switch (command) {
			case EAST:
				artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case SOUTH:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case NORTH:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
		
	}
	
	private void dungeonMove(Commands command) {
		switch (command) {
			case EAST:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case NORTH:
				storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			case SOUTH:
			case WEST:
				nothing();
				break;
			default:
				Default();
		}
		
	}
	
	// create new class for printable items, test if user inv has item to determine
	// print output.
	public void Start() {
		System.out.println("You are standing on a brick path. In front of you is a \n"
				+ "large mansion. To the east is a forest.");
	}
	public void Forest() {
		System.out.println("You are in the forest. There is a set of stairs.");
	}
	
	public void zenGarden() {
		System.out.println("Welcome to the Zen Garden!! Calming music is playing.\n"
						+ "There is a gentle stream flowing. And a bench. Have a rest.");
	}
	
	public void Mansion() {
		System.out.println("You have entered Bellarmine Mansion. To the east is a room. To the north \n"
				+ "is the Great Hall. To the west is the President's Study.");
	}
	
	public void Study() {
		System.out.println("You are standing in the President's Study.");	
	}
	
	public void greatHall() {
		System.out.println("You are standing in the Great Hall.");
	}
	
	public void presidentsHall() {
		System.out.println("You are standing in the Hall of President's past. There are\n"
				+ "dimly lit stairs leading to the basement.");
	}
	
	public void artMuseum() {
		System.out.println("You have entered the Art Museum. There's a room to the west, "
				+ "but the museum is pretty big. Try going north.");
	}
	
	public void artMuseum2() {
		System.out.println("You are in the Art Museum. I told you it was a big room. There is a dusty door to the west.");
	}
	
	public void storageRoom() {
		System.out.println("You are standing in the Storage Room.");	
	}
	
	public void Dungeon() {
		System.out.println("YOU HAVE ENTERED THE DUNGEON. BEWARE.");
	}
	
	public void nothing() {
		System.out.println("There's nothing in that direction!");
	}
	
	public void Default() {
		System.out.println("I don't understand this command.");
	}
}
