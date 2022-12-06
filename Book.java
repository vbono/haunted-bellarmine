package milestone1package;

public class Book extends Object {
	
	public Book(String name) {
		super(name);
	}
	
	
	public void objectCollected() {
		System.out.println("You grabbed the book!\n"
				+ "The book has a chapter describing a spell that can be used to wake the ghost of Robert Bellarmine. \n"
				+ "In case you come across him, say 'AWAKEN' to speak with his ghost. \n"
				+ "The book also tells you that if you say 'NAMASTE' when you're in the Great Hall, \n"
				+ "you get transported to the zen garden, where something useful awaits. Give it a try!");
	}
}
