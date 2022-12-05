package milestone1package;
import java.util.Scanner;
//import milestone1package.Commands;

public class App {
	
	public static void main(String[] args) {
		App app = new App();
		app.process();

	}

	public void process() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("-- let's play! -- \n");
		User p1 = new User();
		Book book = new Book("book");
		Wand wand = new Wand("wand");
		Potion potion = new Potion("potion");
		Rob rob = new Rob("rob");
		Sword sword = new Sword("sword");
		
		System.out.println("What is your name?: ");
		String name = s.nextLine().toUpperCase();
		
		p1.setName(name);
		System.out.println("Welcome to Haunted Bellarmine, " + name + ". You are standing on a brick path. \n"
				+ "In front of you is a large mansion. To the east is a forest. \n"
				+ "Type 'Help' to get started or trying moving around.");
		
		int score = p1.returnScore();
		
		
		while(score<51) {
			
			String commandString = s.nextLine().toUpperCase();
			
			if(Commands.CommandList().contains(commandString)) {
			
				Commands command = Commands.valueOf(commandString);

				switch(command) {

				case HELP:
					Help.helpMe();
					break;
				case MAP:
					Help.map();
					break;
				case LOCATION:
					System.out.println(p1.getLocation());
					break;
				case SCORE:
					p1.printScore();
					break;
				case QUIT:
					System.out.println("Ok, see ya next time!");
					return;
				case TAKE:
					if (p1.getLocation()==LocationNames.ZEN_GARDEN) {
						p1.getScore(wand.getName());
						p1.addToInventory(wand.getName());
						score = p1.returnScore();
						wand.objectCollected();
					}
					else if (p1.getLocation()==LocationNames.STUDY) {
						p1.addToInventory(book.getName());
						p1.getScore(book.getName());
						score = p1.returnScore();
						book.objectCollcted();
					}
					else if (p1.getLocation()==LocationNames.ART_MUSEUM2 && p1.findItem("rob")) {
						p1.addToInventory(sword.getName());
						p1.getScore(sword.getName());
						score = p1.returnScore();
						sword.objectCollected();
					}
					else {
						p1.notQuite();
					}
					break;
				case AWAKEN:
					if (p1.getLocation()==LocationNames.ART_MUSEUM2 && p1.findItem("book") && p1.findItem("wand")) {
						p1.addToInventory(rob.getName());
						p1.getScore(rob.getName());
						score = p1.returnScore();
						rob.objectCollcted();
					}
					else {
						p1.notQuite();
					}
					break;
				case DRINK:
					if (p1.getLocation()==LocationNames.STORAGE) {
						p1.addToInventory(potion.getName());
						p1.getScore(potion.getName());
						score = p1.returnScore();
						potion.objectCollcted();
					}
					else {
						p1.notQuite();
					}
					break;
				case SLAY:
					if (p1.getLocation()==LocationNames.DUNGEON && p1.findItem("sword") && p1.findItem("potion")) {
						p1.addToInventory("slay");
						p1.getScore("slay");
						score = p1.returnScore();
					}
					else {
						p1.notQuite();
					}
					break;
				default:
					p1.move(command);

				} 
			}
			else {
				System.out.println("I don't understand that command. Try something else or say 'help' for help.");
			}
			
		}
		
		if (score>50)
			System.out.println("You have successfully slain the dragon! Congratulations! \n"
					+ "Play again soon.");

	}

}
