package milestone1package;

public class Object {
	
	private String name;
	
	public Object(String name) {
		this.name = name;
	}
	
	public void objectCollected() {
		System.out.println("You have added this to your inventory!");
	}
	
	public String getName() {
		return name;
	}

}
