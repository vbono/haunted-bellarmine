package g1s1Package;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class ScorableItem {
	private Map<String, Integer> Items;
	
	public ScorableItem() {
		Items = new HashMap<>();
		init();
	}
	
	public void displayCurrentItems() {

		Iterator<String> it = Items.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + Items.get(key));
		}
	}

	public int getItem(String key) {
		int score = Items.get(key);
		if (Items.containsKey(key))
			Items.remove(key);
		return score;
	}
	
	private Map<String, Integer> init() {
		Items.put("wand", 10);
		Items.put("book", 5);
		Items.put("sword", 10);
		Items.put("potion", 5);
		Items.put("rob", 20);
		Items.put("slay", 50);
		
		return Items;
	}
	
	

}
