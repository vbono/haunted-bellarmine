package g1s1Package;
import java.util.Scanner;

public class Location {
	Scanner s = new Scanner(System.in);
	
	public String currentLocation;
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
	private static final String STORAGE = "storage room";
	private static final String DUNGEON = "dungeon";
	private static final String EAST = "east";
	private static final String WEST = "west";
	private static final String NORTH = "north";	
	private static final String SOUTH = "south";
	private static final String STAIRS = "stairs";
	private static final String BACK = "back";
	private static final String UPSTAIRS = "upstairs";
	
	
	
	public Location() {
		currentLocation = START;
	}
	
	public String currentLocation() {
		return currentLocation;
		
	}
	
	public void move(String direction) {
		
		switch (currentLocation) {
			case START:
				startMove(direction);
				break;
			case MANSION:
				mansionMove(direction);
				break;
			case FOREST:
				forestMove(direction);
				break;
			case ZEN_GARDEN:
				zenGMove(direction);
				break;
			case STUDY:
				studyMove(direction);
				break;
			case GREAT_HALL:
				greatHMove(direction);
				break;
			case PRESIDENTS_HALL:
				presidentsHMove(direction);
				break;
			case ART_MUSEUM:
				museumMove(direction);
				break;
			case STORAGE:
				storageMove(direction);
				break;
			case DUNGEON:
				dungeonMove(direction);
				break;
			default:
				System.out.println("Did you type your word correctly?");
		}
	}
	
	private void startMove(String direction) {
		//Start();
		
		switch (direction) {
			case MANSION:
				Mansion();
				currentLocation = MANSION;
				break;
			case FOREST:
				Forest();
				currentLocation = FOREST;
				break;
		}
	}
	
	private void mansionMove(String direction) {
		
		switch (direction) {
			case EAST:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case ROOM:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case NORTH:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case GREAT_HALL:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case WEST:
				Study();
				currentLocation = STUDY;
				break;
			case STUDY:
				Study();
				currentLocation = STUDY;
				break;
				/*
			case BACK:
				currentLocation = START;
				break;
				*/
			default:
				System.out.println("???");
		}
		
	}
	
	private void forestMove(String direction) {
		switch (direction) {
			case STAIRS:
				zenGarden();
				currentLocation = ZEN_GARDEN;
				break;
			case BACK:
				Start();
				currentLocation = START;
				break;
			case START:
				Start();
				currentLocation = START;
				break;
		default:
			System.out.println("???");
		}

	}

	private void zenGMove(String direction) {
		switch (direction) {
		case BACK:
			Forest();
			currentLocation = FOREST;
			break;
		case FOREST:
			Forest();
			currentLocation = FOREST;
			break;
		default:
			System.out.println("???");
		}
	}

	
	private void studyMove(String direction) {
		switch (direction) {
			case GREAT_HALL:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case NORTH:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case ROOM:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case EAST:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			/*
			case BACK:
				currentLocation = MANSION;
				break;
				*/
			default:
				System.out.println("???");
		}
	}
	
	private void greatHMove(String direction) { 
		switch (direction) {
			case ROOM:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case SOUTH:
				Mansion();
				currentLocation = MANSION;
				break;
			case STUDY:
				Study();
				currentLocation = STUDY;
				break;
			default:
				System.out.println("???");
		}
	}
	
	private void presidentsHMove(String direction) {
		switch (direction) {
			case NORTH:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case GREAT_HALL:
				greatHall();
				currentLocation = GREAT_HALL;
				break;
			case EAST:
				Study();
				currentLocation = STUDY;
				break;
			case STUDY:
				Study();
				currentLocation = STUDY;
				break;
			case STAIRS:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case DOWNSTAIRS:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case ART_MUSEUM:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			default:
				System.out.println("???");	
		}
	}
	
	private void museumMove(String direction) {
		switch (direction) {
			case WEST:
				Dungeon();
				currentLocation = DUNGEON;
				break;
			case DUNGEON:
				Dungeon();
				currentLocation = DUNGEON;
				break;
			case NORTH:
				storageRoom();
				currentLocation = STORAGE;
				break;
			case STORAGE:
				storageRoom();
				currentLocation = STORAGE;
				break;
				/*
			case BACK:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
				*/
			case STAIRS:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			case UPSTAIRS:
				presidentsHall();
				currentLocation = PRESIDENTS_HALL;
				break;
			default:
				System.out.println("???");
		}
	}
	
	private void storageMove(String direction) {
		switch (direction) {
			case EAST:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case ART_MUSEUM:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case SOUTH:
				Dungeon();
				currentLocation = DUNGEON;
				break;
			case DUNGEON:
				Dungeon();
				currentLocation = DUNGEON;
				break;
			default:
				System.out.println("???");
		}
		
	}
	
	private void dungeonMove(String direction) {
		switch (direction) {
			case EAST:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case ART_MUSEUM:
				artMuseum();
				currentLocation = ART_MUSEUM;
				break;
			case NORTH:
				storageRoom();
				currentLocation = STORAGE;
				break;
			case STORAGE:
				storageRoom();
				currentLocation = STORAGE;
				break;
			default:
				System.out.println("???");
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
						+ "There is a gentle stream flowing. And a bench. And a wand\n"
						+ "laying on the bench. Have a rest.");
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
		System.out.println("You have entered the Art Museum. To your west "
				+ "there are two rooms.");
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
