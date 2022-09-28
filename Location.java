package g1s1Package;
import java.util.Scanner;

public class Location {
	Scanner myScanner = new Scanner(System.in);
	
	private String currentLocation;
	private static final String START = "start";
	private static final String FOREST = "forest";
	private static final String ZEN_GARDEN = "zen garden";
	private static final String MANSION = "mansion";
	private static final String STUDY = "study";
	private static final String GREAT_HALL = "great hall";
	private static final String ROOM = "room";
	private static final String DOWNSTAIRS = "stairs";
	private static final String ART_MUSEUM = "art museum";
	private static final String STORAGE = "storage room";
	private static final String DUNGEON = "dungeon";
	private static final String E = "E";
	private static final String W = "W";
	private static final String N = "N";	
	private static final String S = "S";
	
	public Location() {
		currentLocation = START;
		
	}
	
	public String startLocation() {
		String command;
		System.out.println("You are standing on a brick path. In front of you is a "
				+ "large mansion. To the east is a forest.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String forest() {
		String command;
		System.out.println("You are in the forest. There is a set of stairs.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String zenGarden() {
		String command;
		System.out.println("Welcome to the Zen Garden!! Calming music is playing."
				+ "There is a gentle stream flowing. And a bench. Have a rest.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String Mansion() {
		String command;
		System.out.println("You have entered Bellarmine Mansion. To the east is a room. To the north"
				+ "is the Great Hall. To the west is the President's Study.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String Study() {
		String command;
		System.out.println("You are standing in the President's Study.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String greatHall() {
		String command;
		System.out.println("You are standing in the Great Hall.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String hallOfPresidents() {
		String command;
		System.out.println("You are standing in the Hall of President's past. There are"
				+ "dimly lit stairs leading to the basement.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String artMuseum() {
		String command;
		System.out.println("You have entered the Art Museum. To your west "
				+ "there are two rooms.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String storageRoom() {
		String command;
		System.out.println("You are standing in the Storage Room.");
		command = myScanner.nextLine();
		return command;	
	}
	
	public String dungeon() {
		String command;
		System.out.println("YOU HAVE ENTERED THE DUNGEON. BEWARE.");
		command = myScanner.nextLine();
		return command;	
	}
	
	

}
