package milestone1package;

public class Book extends Object {
	
	public Book(String name) {
		super(name);
	}
	
	
	public void objectCollcted() {
		System.out.println("You have added this to your inventory! The book has a chapter \n"
				+ "describing a spell that can be used to wake the ghost of Robert Bellarmine. \n"
				+ "In case you come across him, say 'AWAKEN' to speak with his ghost. \n"
				+ "The book also tells you that if you say 'NAMASTE' when you're in the Great Hall, \n"
				+ "you get transported to the zen garden, where something useful awaits. Give it a try!");
	}
}
