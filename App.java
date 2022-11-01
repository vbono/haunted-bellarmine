package g1s1Package;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		App app = new App();
		app.process();

	}

	/**
	 * main interactive loop of program
	 * @return 
	 * 
	 */

	public void process() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("-- let's play! -- \n");
		User p1 = new User();
		
		System.out.println("What is your name?: ");
		String name = s.nextLine();
		
		p1.setName(name);
		System.out.println("Welcome to Haunted Bellarmine, " + name + "! \n"
				+ "You are standing on a brick path. In front of you is a large mansion. To the east is a forest. \n"
				+ "Type 'H' or 'Help' to get started.");
		
		// while score < 51
		while(true) {
			String command = s.nextLine();
			
			if (command.equalsIgnoreCase("h") || command.equalsIgnoreCase("help"))
				Help.helpMe();
			else if (command.equalsIgnoreCase("location"))
				System.out.println(p1.getLocation());
			else if (command.equalsIgnoreCase("inventory"))
				p1.getInventory();
			else if (command.equalsIgnoreCase("map"))
				Help.map();
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="zen garden") {
				p1.addToInventory("wand");
				p1.getScore("wand");
			}
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="study") {
				p1.addToInventory("book");
				p1.getScore("book");
			}
			else if (command.equalsIgnoreCase("use") && p1.getLocation()=="art museum" && p1.findItem("book") && p1.findItem("wand")) {
				p1.addToInventory("rob"); 
				p1.getScore("rob");
			}
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="storage room") {
				p1.addToInventory("potion");
				p1.getScore("potion");
			}
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="art museum" && p1.findItem("rob")) {
				p1.addToInventory("sword");
				p1.getScore("sword");
			}
			else if (command.equalsIgnoreCase("slay") && p1.getLocation()=="dungeon" && p1.findItem("potion") && p1.findItem("sword")) {
				p1.addToInventory("slay");
				p1.getScore("slay");
			}
			else
				p1.move(command);
		}
		
		// add prompts for items

	}

}
