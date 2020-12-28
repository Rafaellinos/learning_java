import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.println("Enter a number: " + count);
            int result;
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                result = scanner.nextInt();
                if (result == count) {
                    System.out.println("Thats Correct!");

                    if (count == 10) {
                        break;
                    }
                    count++;
                } else {
                    System.out.println("Wrong number, try again!");
                }
            } else {
                System.out.println("Invalid Number, try again!");
            }
            scanner.nextLine(); // handle next line (enter key)
        }
        scanner.close();
    }
}
