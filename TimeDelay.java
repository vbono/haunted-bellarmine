package util;
import java.util.concurrent.TimeUnit;

public class TimeDelay {

	
	public static void main(String[] args) throws Exception {

	}

	public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
		for (char ch : data.toCharArray()) {
			System.out.print(ch);
			unit.sleep(delay);
		}
	}
	
	
}
