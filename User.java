package milestone1package;
import java.util.ArrayList;

public class User {
	private String name;
	private Location loc;
	private ArrayList<String> inventory;
	private int score;
	private ScoreableItem si;
	private int count;
	

	
	public User() {
		loc = new Location();
		si = new ScoreableItem();
		inventory = new ArrayList<String>();
		score = 0;
		count = 0;
	}
	
	//returns player's current location
	public LocationNames getLocation() {
		return loc.currentLocation();
	}
	
	//employs the move method from Location to change player location
	//prints description of item in that location if the player does not have it in their inventory
	public void move(Commands command) {
		loc.move(command);
		
		if (loc.currentLocation()==LocationNames.ZEN_GARDEN && inventory.contains("wand")==false)
			System.out.println("There is a wand lying on the bench. To pick it up, say 'take'.");
		else if(loc.currentLocation()==LocationNames.STUDY && inventory.contains("book")==false)
			intermittent();
		else if(loc.currentLocation()==LocationNames.ART_MUSEUM2 && inventory.contains("rob")==false)
			System.out.println("There is a statue of Robert Bellarmine in the corner. To wake him, use the \n"
					+ "spell that you read about in the book.");
		else if(loc.currentLocation()==LocationNames.STORAGE && inventory.contains("potion")==false)
			System.out.println("There is a chest that looks like the one Robert Bellarmine described. \n"
					+ "Inside the chest is a vial of a green liquid. Say 'drink' to take this potion.");
		else if(loc.currentLocation()==LocationNames.ART_MUSEUM2 && inventory.contains("sword")==false && inventory.contains("rob") && inventory.contains("potion"))
			System.out.println("Robert Bellarmine presents a sword to aid you in your final quest. Take it from him. Good luck!"); 
		else if(loc.currentLocation()==LocationNames.DUNGEON && inventory.contains("slay")==false)
			System.out.println("AHHH! There is a terrifying dragon in here! \n"
					+ "You need a sword to defeat the dragon. If you have it, try using words like \n"
					+ "'defeat', 'attack', or 'slay'. One of them might work!");
	}
	
	public String getName() {
		return name;
	}
	
	//sets the player's name
	public void setName(String name) {
		this.name=name;
	}
	
	//adds value of item collected to player's score
	public int getScore(String item) {
		score += si.getItem(item);
		return score;
	}
	
	//adds item to inventory after player has collected it
	public void addToInventory(String item) {
		inventory.add(item);
	}

	//gets player's inventory
	public void getInventory() {
		System.out.println(inventory);;
	}
	
	//displays inventory when prompted, accordingly
	public void displayInventory() {
		
		if (inventory.size() == 0)
			System.out.println("There's nothing in your inventory yet. Go find some objects!");
		else if (inventory.size() == 1) {
			System.out.println("You have these items in your inventory: ");
			for (String obj : inventory)
				System.out.print(obj + " ");
		}
		else {
			System.out.println("You have these items in your inventory: ");
			for (String obj : inventory)
				System.out.print(obj + ", ");
		}
	}
	
	//tells if item is in player's inventory
	public boolean findItem(String item) {
		if(inventory.contains(item))
			return true;
		else
			return false;
	}
	
	//prints out player's score
	public void printScore() {
		System.out.println("Your current score is: " + score);
	}
	
	//returns player's score as an int
	public int returnScore() {
		return score;
	}
	
	//every other time the player goes into the study, a book is sitting on the desk
	public void intermittent() {
		while(true) {
			if (count%2==0 || count ==0) {
				System.out.println("There is a book sitting on the President's desk.");
				count ++;
				break;
			}
			else {
				System.out.println("Hey, wasn't there something here last time?");
				count ++;
				break;
			}
		}
	}
	
	//runs when a command is given but the requirements aren't met
	public void notQuite() {
		System.out.println("You don't have what you need yet. Try collecting some items first!");
	}
}
