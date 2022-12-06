package g1s1Package;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// time delay used for printout flair
import util.TimeDelay;

public class Constants implements ConstantInterface {
	Scanner s = new Scanner(System.in);
	
	// constant print outs for the start of game, current location(s), end of game
	
	public void startMessage() {
		System.out.println("-- let's play! -- \n");
		s.nextLine();
		
	}

	public String getName() {
		System.out.println("What is your name? ");
		String name = s.nextLine().toUpperCase();
		return name;
		
	}
	
	public void welcome(String name) {
		try {
			TimeDelay.printWithDelays("Welcome to Haunted Bellarmine,", TimeUnit.MILLISECONDS, 50);
			TimeDelay.printWithDelays(" ", TimeUnit.MILLISECONDS, 150);
			TimeDelay.printWithDelays(name + "! ", TimeUnit.MILLISECONDS, 50);
			TimeDelay.printWithDelays("              \n", TimeUnit.MILLISECONDS, 75);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Press enter to continue.");
		s.nextLine();
		
	}
	
	public void quit(String name) {
		System.out.println("Ok, see ya next time, " + name + "!");
	}

	
	public void Start() {
		System.out.println("You are standing on a brick path. In front of you is a \n"
				+ "large mansion. To the east is a forest.");
	}
	public void Forest() {
		System.out.println("You are in the forest. There is a set of stairs.");
	}
	
	public void zenGarden() {
		System.out.print("Welcome to the Zen Garden!! Calming music is playing.");
		try {
			TimeDelay.printWithDelays("    \n", TimeUnit.MILLISECONDS, 200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("There is a gentle stream flowing. And a bench. Have a rest. \n"
				+ "Or go back up the stairs I guess . . .");	
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}
	
	public void Mansion() {
		System.out.print("You have entered Bellarmine Mansion.");
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("To the east is the President's Hall. \n"
				+ "To the north is the Great Hall. \n"
				+ "To the west is the President's Study.");
				
					}
	
	public void Study() {
		System.out.print("You are standing in the President's Study.");
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("To the north is the Great Hall. \n"
				+ "To the east is the President's Hall.");
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
	
	public void greatHall() {
		System.out.print("You are standing in the Great Hall.");
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Go south to return to the Mansion lobby.");
	}
	
	public void presidentsHall() {
		System.out.println("You are standing in the Hall of President's Past. \n"
				+ "There are dimly lit stairs leading to the basement.");
	}
	
	public void artMuseum() {
		System.out.println("You have entered the Art Museum. There's a room to the west, "
				+ "but the museum is pretty big. Try going north, if you haven't already.");
	}
	
	public void artMuseum2() {
		System.out.println("You are in the Art Museum. I told you it was a big room. \n"
				+ "There is a dusty door to the west.");
	}
	
	public void storageRoom() {
		System.out.print("You are standing in the Storage Room.");
		try {
			TimeDelay.printWithDelays("        \n", TimeUnit.MILLISECONDS, 250);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Go east to return to the Art Museum. Go south if you dare...");
	}
	
	public void Dungeon() {
		System.out.println("YOU HAVE ENTERED THE DUNGEON. BEWARE.");
	}
	
	public void nothing() {
		System.out.println("There's nothing in that direction!");
	}
	
	public void Default() {
		System.out.println("I don't understand this command.");
	}
	
	
	public void endMessage(String name) {
		System.out.println("You have successfully slain the dragon, " + name + ". Congratulations! \n"
				+ "Play again soon.");
		
	}


}
