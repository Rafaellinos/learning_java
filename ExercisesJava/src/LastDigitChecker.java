public class LastDigitChecker {

    public static boolean isValid (int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)){
            return false;
        }
        boolean hasDigit2 = false;
        boolean hasDigit3 = false;
        int lastDigit2 = number2 % 10;
        int lastDigit3 = number3 % 10;
        int lastCurrentDigit = 0;

        while (number1 > 0) {
            lastCurrentDigit = number1 % 10;
            number1 /= 10;
            if (lastCurrentDigit == lastDigit2) {
                hasDigit2 = true;
            }
            if (lastCurrentDigit == lastDigit3) {
                hasDigit3 = true;
            }
        }
        return (hasDigit2 || hasDigit3);

    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32, 42));
    }
}
