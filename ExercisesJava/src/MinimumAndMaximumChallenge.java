import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        for (int i = 0; i < 10; i ++) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int result = scanner.nextInt();
                if (first) { // check if is the first
                    first = false;
                    min = result;
                    max = result;
                }
                if (result > max) {
                    max = result;
                }
                if (result < min) {
                    min = result;
                }
            } else {
                System.out.println("Invalid Number!");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
