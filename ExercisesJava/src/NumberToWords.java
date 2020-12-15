public class NumberToWords {

    public static String numberToWord(int number) {
        switch (number) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Tree";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Zero";
        }
    }

    public static int reverse(int number) {
        int reversedNumber;
        int toReverseNumber = Math.abs(number);
        int lastCurrentNumber;
        while (toReverseNumber > 0) {
//             = toReverseNumber % 10;
            toReverseNumber /= 10;
        }

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (true) {
            count ++;
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        return count;
    }

    public static void numberToWords(int number) {
        int lastNumber;
        while (number > 0) {
            lastNumber = number % 10;
            number /= 10;
            System.out.println(numberToWord(lastNumber));
        }
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }
}
