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
	
	public LocationNames getLocation() {
		return loc.currentLocation();
	}
	
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
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getScore(String item) {
		score += si.getItem(item);
		return score;
	}
	
	public void addToInventory(String item) {
		inventory.add(item);
	}

	
	public void getInventory() {
		System.out.println(inventory);;
	}
	
	public boolean findItem(String item) {
		if(inventory.contains(item))
			return true;
		else
			return false;
	}
	
	public void printScore() {
		System.out.println("Your current score is: " + score);
	}
	
	public int returnScore() {
		return score;
	}
	
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
	
	public int getCount() {
		return count;
	}
}
