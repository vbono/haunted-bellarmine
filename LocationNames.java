package milestone1package;

public enum LocationNames {

	START ("start"), FOREST ("forest"), ZEN_GARDEN ("zen garden"), MANSION ("manison"), STUDY ("study"), 
	GREAT_HALL ("great hall"), ROOM ("room"), PRESIDENTS_HALL ("presidents hall"), DOWNSTAIRS ("downstairs"), 
	ART_MUSEUM ("art museum"), ART_MUSEUM2 ("art musuem2"), STORAGE ("storage"), DUNGEON ("dungeon");
	
	private final String loc;
	
	LocationNames(String loc) {
		this.loc = loc;
	}
}
