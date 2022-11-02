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
		
		int score = p1.returnScore();
		
		while(score<51) {
			String command = s.nextLine();
			
			if (command.equalsIgnoreCase("h") || command.equalsIgnoreCase("help"))
				Help.helpMe();
			else if (command.equalsIgnoreCase("quit")) {
				System.out.println("Ok, see ya next time!");
				break;
			}
			else if (command.equalsIgnoreCase("location"))
				System.out.println(p1.getLocation());
			else if (command.equalsIgnoreCase("map"))
				Help.map();
			else if (command.equalsIgnoreCase("inventory"))
				p1.getInventory();
			else if (command.equalsIgnoreCase("score"))
				p1.printScore();
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="zen garden") {
				p1.getScore("wand");
				p1.addToInventory("wand");
				p1.genericRetrieved();
				score = p1.returnScore();
			}
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="study") {
				int count = p1.getCount();
				
				if (count%2!=0 || count==0) {
					p1.addToInventory("book");
					p1.getScore("book");
					score = p1.returnScore();
					count = p1.getCount();
					System.out.println("You have added this to your inventory! The book has a chapter \n"
						+ "describing a spell that can be used to wake the ghost of Robert Bellarmine. \n"
						+ "In case you come across him, say 'AWAKEN' to speak with his ghost. \n"
						+ "The book also tells you that if you say 'NAMASTE' when you're in the Great Hall, \n"
						+ "you get transported to the Zen Garden, where something useful awaits. Give it a try!");
				}
				else {
					System.out.println("There's nothing here to take!");
					count = p1.getCount();
				}
			}
			else if (command.equalsIgnoreCase("AWAKEN") && p1.getLocation()=="art museum" && p1.findItem("book") && p1.findItem("wand")) {
				p1.addToInventory("rob");
				p1.getScore("rob");
				score = p1.returnScore();
				System.out.println("Robert Bellarmine's ghost floats out of the statue and tells you \n"
						+ "that to defeat the beast in the dungeon, you will need protection. \n"
						+ "There is a green potion you must drink to stay safe. Once you have had \n"
						+ "the potion, Robert says he will give you the final tool you will need \n"
						+ "to complete your quest.");
			}
			else if (command.equalsIgnoreCase("drink") && p1.getLocation()=="storage room") {
				p1.addToInventory("potion");
				p1.getScore("potion");
				score = p1.returnScore();
				System.out.println("It tastes better than you think.");
			}
			else if (command.equalsIgnoreCase("take") && p1.getLocation()=="art museum" && p1.findItem("rob")) {
				p1.addToInventory("sword");
				p1.getScore("sword");
				p1.genericRetrieved();
				score = p1.returnScore();
			}
			else if (command.equalsIgnoreCase("slay") && p1.getLocation()=="dungeon" && p1.findItem("sword") && p1.findItem("potion")) {
				p1.addToInventory("slay");
				p1.getScore("slay");
				score = p1.returnScore();
				//break;
			}
			else {
				p1.move(command);
				
				if (p1.getLocation()=="zen garden" && p1.findItem("wand")==false)
					System.out.println("There is a wand lying on the bench. To pick it up, say 'take'.");
				else if(p1.getLocation()=="study" && p1.findItem("book")==false)
					p1.intermittent();
				else if(p1.getLocation()=="art museum" && p1.findItem("rob")==false)
					System.out.println("There is a statue of Robert Bellarmine in the corner. To wake him, use the \n"
							+ "spell that you read about in the book.");
				else if(p1.getLocation()=="storage room" && p1.findItem("potion")==false)
					System.out.println("There is a chest that looks like the one Robert Bellarmine described. \n"
							+ "Inside the chest is a vial of a green liquid. Say 'drink' to take this potion.");
				else if(p1.getLocation()=="art museum" && p1.findItem("sword")==false && p1.findItem("rob") && p1.findItem("potion"))
					System.out.println("Robert Bellarmine presents a sword to aid you in your final quest. Take it from him. Good luck!"); 
				else if(p1.getLocation()=="dungeon" && p1.findItem("slay")==false)
					System.out.println("AHHH! There is a terrifying dragon in here!");
			}
			
		}
		if (score>50)
			System.out.println("You have successfully slain the dragon! Congratulations!");
		
		// add prompts for items

	}

}
