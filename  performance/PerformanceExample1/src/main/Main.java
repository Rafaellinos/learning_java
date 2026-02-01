package main;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Thread.sleep(Duration.ofMinutes(5).toMillis());
	}

	public Map<String, String> getMap() {
		var test = new HashMap<String, String>() {{
			put("value1", "result1");
		}};
		return Collections.unmodifiableMap(test);
	}

}
