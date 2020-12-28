package academy.learnprogramming;

public class Main {

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	    for (int i = 8; i >= 2; i--) {
            System.out.println("10_000 at "+ i +"% interest = " + String.format("%.2f", calculateInterest(10_000, i)));
            // java convert int para double quando passado por parâmetro
        }
        int count = 0;
	    for (int i = 1; i <= 100; i ++) {
            System.out.println("atualmente na linha: " + i + "e o prime result é: " + isPrime(i));
	        count += isPrime(i) ? 1 : 0;
	        if (count == 3) {
	            break;
            }
        }
        int sum = 0;
	    count = 0;
	    for (int i = 1; i <= 100; i++) {
	        if ((i % 3 == 0) && (i % 5 == 0)) {
	            sum += i; count ++;
	            if (count == 5) break;
            }
        }
        System.out.println(sum);

    }
}
