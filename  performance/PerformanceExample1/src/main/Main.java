package main;

import java.time.Duration;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Thread.sleep(Duration.ofMinutes(5).toMillis());
	}

}
