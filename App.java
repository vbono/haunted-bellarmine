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
		
		while(true) {
			String command = s.nextLine();
			
			if (command.equalsIgnoreCase("h") || command.equalsIgnoreCase("help"))
				Help.helpMe();
			else if (command.equalsIgnoreCase("location"))
				System.out.println(p1.getLocation());
			else if (command.equalsIgnoreCase("map"))
				Help.map();
			else
				p1.move(command);
		}
		

	}

}
