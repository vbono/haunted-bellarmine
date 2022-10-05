package g1s1Package;

public class User {
	private String name;
	private Location loc;
	
	public User() {
		loc = new Location();
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
	
	
	

}
