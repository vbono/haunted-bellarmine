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
			/*
			default:
				System.out.println("Did you type your word correctly?");
			 */
		}
	}
	
	private void mansionMove(String direction) {
		
		switch (direction) {
			case EAST:
				currentLocation = PRESIDENTS_HALL;
				break;
			case ROOM:
				currentLocation = PRESIDENTS_HALL;
			case PRESIDENTS_HALL:
				currentLocation = PRESIDENTS_HALL;
				break;
			case NORTH:
				currentLocation = GREAT_HALL;
				break;
			case GREAT_HALL:
				currentLocation = GREAT_HALL;
				break;
			case WEST:
				currentLocation = STUDY;
				break;
			case STUDY:
				currentLocation = STUDY;
				break;
				/*
			case BACK:
				currentLocation = START;
				break;
				*/
			default:
				System.out.println("You can't get there yet!");
		}
		
	}
	
	private void forestMove(String direction) {
		switch (direction) {
		case STAIRS:
			currentLocation = ZEN_GARDEN;
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

	private void zenGMove(String direction) {
		switch (direction) {
		case BACK:
			currentLocation = FOREST;
			break;
		default:
			System.out.println("???");
		}
	}

	
	private void studyMove(String direction) {
		switch (direction) {
			case GREAT_HALL:
				currentLocation = GREAT_HALL;
				break;
			case NORTH:
				currentLocation = GREAT_HALL;
				break;
			case ROOM:
				currentLocation = PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				currentLocation = PRESIDENTS_HALL;
				break;
			case EAST:
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
				currentLocation = PRESIDENTS_HALL;
				break;
			case PRESIDENTS_HALL:
				currentLocation = PRESIDENTS_HALL;
				break;
			case SOUTH:
				currentLocation = MANSION;
				break;
			case STUDY:
				currentLocation = STUDY;
				break;
			default:
				System.out.println("???");
		}
	}
	
	private void presidentsHMove(String direction) {
		switch (direction) {
			case NORTH:
				currentLocation = GREAT_HALL;
				break;
			case GREAT_HALL:
				currentLocation = GREAT_HALL;
				break;
			case EAST:
				currentLocation = STUDY;
				break;
			case STUDY:
				currentLocation = STUDY;
				break;
			case STAIRS:
				currentLocation = ART_MUSEUM;
				break;
			case DOWNSTAIRS:
				currentLocation = ART_MUSEUM;
				break;
			default:
				System.out.println("???");	
		}
	}
	
	private void museumMove(String direction) {
		switch (direction) {
			case WEST:
				currentLocation = DUNGEON;
				break;
			case NORTH:
				currentLocation = STORAGE;
				break;
			case BACK:
				currentLocation = PRESIDENTS_HALL;
				break;
			case STAIRS:
				currentLocation = PRESIDENTS_HALL;
				break;
			case UPSTAIRS:
				currentLocation = PRESIDENTS_HALL;
				break;
			default:
				System.out.println("???");
		}
	}
	
	private void storageMove(String direction) {
		switch (direction) {
			case EAST:
				currentLocation = ART_MUSEUM;
				break;
			case SOUTH:
				currentLocation = DUNGEON;
				break;
			default:
				System.out.println("???");
		}
		
	}
	
	private void dungeonMove(String direction) {
		switch (direction) {
			case EAST:
				currentLocation = ART_MUSEUM;
				break;
			case NORTH:
				currentLocation = DUNGEON;
				break;
			default:
				System.out.println("???");
		}
		
	}
	
	/*
	
	public String startLocation() {
		String command;
		System.out.println("You are standing on a brick path. In front of you is a "
				+ "large mansion. To the east is a forest.");
		command = s.nextLine();
		return command;	
	}
	
	public String forest() {
		String command;
		System.out.println("You are in the forest. There is a set of stairs.");
		command = s.nextLine();
		return command;	
		
	}
	
	public String zenGarden() {
		String command;
		System.out.println("Welcome to the Zen Garden!! Calming music is playing."
				+ "There is a gentle stream flowing. And a bench. Have a rest.");
		command = s.nextLine();
		return command;	
	}
	
	public String Mansion() {
		String command;
		System.out.println("You have entered Bellarmine Mansion. To the east is a room. To the north"
				+ "is the Great Hall. To the west is the President's Study.");
		command = s.nextLine();
		return command;	
	}
	
	public String Study() {
		String command;
		System.out.println("You are standing in the President's Study.");
		command = s.nextLine();
		return command;	
	}
	
	public String greatHall() {
		String command;
		System.out.println("You are standing in the Great Hall.");
		command = s.nextLine();
		return command;	
	}
	
	public String hallOfPresidents() {
		String command;
		System.out.println("You are standing in the Hall of President's past. There are"
				+ "dimly lit stairs leading to the basement.");
		command = s.nextLine();
		return command;	
	}
	
	public String artMuseum() {
		String command;
		System.out.println("You have entered the Art Museum. To your west "
				+ "there are two rooms.");
		command = s.nextLine();
		return command;	
	}
	
	public String storageRoom() {
		String command;
		System.out.println("You are standing in the Storage Room.");
		command = s.nextLine();
		return command;	
	}
	
	public String dungeon() {
		String command;
		System.out.println("YOU HAVE ENTERED THE DUNGEON. BEWARE.");
		command = s.nextLine();
		return command;	
	}
	*/
	
	

}
