public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int lastNumber;
        int total = 0;
        while (number != 0) {
            lastNumber = number % 10;
            number /= 10;
            if (lastNumber % 2 == 0) {
                total += lastNumber;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }
}
