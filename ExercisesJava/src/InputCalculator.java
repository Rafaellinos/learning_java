import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        while (true) {
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                sum += scanner.nextInt();
                count ++;
            } else {
                break;
            }
        }
        if (!(count == 0)) {
            average = Math.round((double) (sum / count));
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
