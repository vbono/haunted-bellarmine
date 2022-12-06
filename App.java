package g1s1Package;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		App app = new App();
		app.process();
	}
	


	public void process() {
		Scanner s = new Scanner(System.in);
		
		// create access to other classes/constant interface
		User p1 = new User();
		ConstantInterface c = new Constants();
		Book book = new Book("book");
		Wand wand = new Wand("wand");
		Potion potion = new Potion("potion");
		Rob rob = new Rob("rob");
		Sword sword = new Sword("sword");

		//prints start message
		c.startMessage();
		// captures & sets name
		String name = c.getName();
		p1.setName(name);
		//start game printouts
		c.welcome(name);
		c.Start();

		
		int score = p1.returnScore();
		
		// user must collect all 50 points & slay dragon to beat the game
		while(score<51) {
			
			String commandString = s.nextLine().toUpperCase();
			
			
			// takes user command input and decides what to execute
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
					c.quit(name);
					return;
					
				// logic to deal with objects & inventory	
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
						book.objectCollected();
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
			c.endMessage(name);

	}

}
