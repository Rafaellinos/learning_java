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
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10; // extrair o ultimo digito
            reversed = (reversed * 10) + digit;
            number /= 10;
        }
        return reversed;
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
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int lastNumber;
            int numberBkp = number;
            number = reverse(number);
            while (number > 0) {
                lastNumber = number % 10;
                number /= 10;
                System.out.println(numberToWord(lastNumber));
            }
            int i = getDigitCount(numberBkp) - getDigitCount(reverse(numberBkp));
            for (; i > 0; i --) {
                System.out.println(numberToWord(0));
            }
        }

    }

    public static void main(String[] args) {
        numberToWords(100);
        System.out.println("-----");
        numberToWords(1010);
        System.out.println("-----");
        numberToWords(1000);
        System.out.println("-----");
        numberToWords(-12);
    }
}
