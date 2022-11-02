package g1s1Package;
import java.util.ArrayList;

public class User {
	private String name;
	private Location loc;
	private ScorableItem si;
	private ArrayList<String> inventory;
	private int score;
	
	public User() {
		loc = new Location();
		si = new ScorableItem();
		inventory = new ArrayList<String>();
		score = 0;
	}
	
	public String getLocation() {
		return loc.currentLocation();
	}
	
	public void move(String direction) {
		loc.move(direction);
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
	
	public void genericRetrieved() {
		loc.RetrievedItem();
	}
	
	public boolean findItem(String item) {
		if (inventory.contains(item))
			return true;
		else
			return false;
	}
	
	public void getInventory() {
		System.out.println(inventory);
		
	}
	 	
	public void printScore() {
		System.out.println("Your current score is: " + score);
	}
	

}
