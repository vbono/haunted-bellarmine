package g1s1Package;
import java.util.Scanner;

public class Location {
	Scanner s = new Scanner(System.in);
	
	//public String currentLocation;
	public LocationNames currentLocation;
	private static final String START = "start";
	private static final String FOREST = "forest";
	private static final String ZEN_GARDEN = "zen garden";
	private static final String MANSION = "mansion";
	private static final String STUDY = "study";
	private static final String GREAT_HALL = "great hall";
	private static final String ROOM = "room";
	private static final String PRESIDENTS_HALL = "presidents hall";
	private static final String DOWNSTAIRS = "downstairs";
	private static final String ART_MUSEUM = "art museum";
	private static final String ART_MUSEUM2 = "art museum2";
	private static final String STORAGE = "storage room";
	private static final String DUNGEON = "dungeon";
	private static final String EAST = "east";
	private static final String WEST = "west";
	private static final String NORTH = "north";	
	private static final String SOUTH = "south";
	private static final String STAIRS = "stairs";
	private static final String BACK = "back";
	private static final String UPSTAIRS = "upstairs";
	private static final String NAMASTE = "namaste";
	
	
	
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
				System.out.println("Did you type your word correctly?");
		}
	}
	
	private void startMove(Commands command) {
		//Start();
		
		switch (command) {
			case MANSION:
				Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case FOREST:
				Forest();
				currentLocation = LocationNames.FOREST;
				break;
			case NORTH:
				Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case EAST:
				Forest();
				currentLocation = LocationNames.FOREST;
				break;
			default:
				System.out.println("There's nothing in this direction.");
		}
	}
	
	private void mansionMove(Commands command) {
		
		switch (command) {
			case EAST:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case ROOM:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case GREAT_HALL:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case WEST:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case STUDY:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
				/*
			case BACK:
				currentLocation = START;
				break;
				*/
			default:
				System.out.println("There's nothing in this direction.");
		}
		
	}
	
	private void forestMove(Commands command) {
		switch (command) {
			case STAIRS:
				zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			case BACK:
				Start();
				currentLocation = LocationNames.START;
				break;
			case START:
				Start();
				currentLocation = LocationNames.START;
				break;
			case WEST:
				Start();
				currentLocation = LocationNames.START;
				break;
		default:
			System.out.println("There's nothing in this direction.");
		}

	}

	private void zenGMove(Commands command) {
		switch (command) {
		case BACK:
			Forest();
			currentLocation = LocationNames.FOREST;
			break;
		case FOREST:
			Forest();
			currentLocation = LocationNames.FOREST;
			break;
		case NAMASTE:
			greatHall();
			currentLocation = LocationNames.GREAT_HALL;
			break;
		default:
			System.out.println("There's nothing in this direction.");
		}
	}

	
	private void studyMove(Commands command) {
		switch (command) {
			case GREAT_HALL:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case ROOM:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case EAST:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			/*
			case BACK:
				currentLocation = MANSION;
				break;
				*/
			default:
				System.out.println("There's nothing in this direction.");
		}
	}
	
	private void greatHMove(Commands command) { 
		switch (command) {
			case ROOM:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case SOUTH:
				Mansion();
				currentLocation = LocationNames.MANSION;
				break;
			case STUDY:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case NAMASTE:
				zenGarden();
				currentLocation = LocationNames.ZEN_GARDEN;
				break;
			default:
				System.out.println("There's nothing in this direction.");
		}
	}
	
	private void presidentsHMove(Commands command) {
		switch (command) {
			case NORTH:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case GREAT_HALL:
				greatHall();
				currentLocation = LocationNames.GREAT_HALL;
				break;
			case EAST:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case STUDY:
				Study();
				currentLocation = LocationNames.STUDY;
				break;
			case STAIRS:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case DOWNSTAIRS:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case ART_MUSEUM:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			default:
				System.out.println("There's nothing in this direction.");	
		}
	}
	
	private void museumMove(Commands command) {
		switch (command) {
			case WEST:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case DUNGEON:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case NORTH:
				artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
				/*
			case STORAGE:
				storageRoom();
				currentLocation = STORAGE;
				break;
				
			case BACK:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
				*/
			case STAIRS: 
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			case UPSTAIRS:
				presidentsHall();
				currentLocation = LocationNames.PRESIDENTS_HALL;
				break;
			default:
				System.out.println("There's nothing in this direction.");
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
			case STORAGE:
				storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			default:
				System.out.println("There's nothing in this direction.");
		}
	}
	
	private void storageMove(Commands command) {
		switch (command) {
			case EAST:
				artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case ART_MUSEUM:
				artMuseum2();
				currentLocation = LocationNames.ART_MUSEUM2;
				break;
			case SOUTH:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			case DUNGEON:
				Dungeon();
				currentLocation = LocationNames.DUNGEON;
				break;
			default:
				System.out.println("There's nothing in this direction.");
		}
		
	}
	
	private void dungeonMove(Commands command) {
		switch (command) {
			case EAST:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case ART_MUSEUM:
				artMuseum();
				currentLocation = LocationNames.ART_MUSEUM;
				break;
			case NORTH:
				storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			case STORAGE:
				storageRoom();
				currentLocation = LocationNames.STORAGE;
				break;
			default:
				System.out.println("There's nothing in this direction.");
		}
		
	}
	
	
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
		System.out.println("You have entered the Art Museum. There's a room to the west,\n"
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

	public void RetrievedItem() {
		System.out.println("Nice! You have just added this to your inventory.");
	}
	
	

}
