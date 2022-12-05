package g1s1Package;

public enum Commands {
	
	EAST, WEST, NORTH, SOUTH, STAIRS, DOWNSTAIRS,
	UPSTAIRS, NAMASTE, HELP, QUIT, LOCATION,
	INVENTORY, MAP, SCORE, TAKE, AWAKEN, DRINK, SLAY;
	
	
	public static ArrayList<String> CommandList() {
		ArrayList<Commands> CommandList = new ArrayList<>();
		ArrayList<String> CommandList2 = new ArrayList<>();
		
		for (Commands c: Commands.values()) {
			CommandList.add(c);
		}
		
		for (Commands c: CommandList) {
			CommandList2.add(c.toString());
		}
		
		return CommandList2;
	}

}
