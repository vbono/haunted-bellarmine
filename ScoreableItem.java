package milestone1package;
import java.util.Map;
import java.util.Iterator;

public class ScoreableItem {

	private Map<String, Integer> Items;
	
	public void displayCurrentItems() {
		init();
		iterator(Items);
		
	}
	
	public static void iterator(Map<String, Integer> Items) {
		Iterator<Map.Entry<String, Integer>> it = Items.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key = " + entry.getKey() + "value = " + entry.getValue());
		}
	}
	
	
	public Integer getItem(String key) {
		Integer value = Items.get(key);
		Items.remove(key);
		return value;
	}
	
	private Map<String, Integer> init() {
		Items.put("book", 5);
		Items.put("wand", 10);
		Items.put("sword", 10);
		Items.put("potion", 5);
		Items.put("rob", 20);
		Items.put("slay", 50);
		
		return Items;
	}
}
