public class DigitSumChallenge {


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        } else {
            int lastNumber;
            int total = 0;
            while (number != 0) {
                lastNumber = number % 10; // pega o ultimo número
                number /= 10; // remove o ultimo número
                total += lastNumber;
            }
            return total;

        }
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(-125)); // should return 8 = 1+2+5
    }
}
