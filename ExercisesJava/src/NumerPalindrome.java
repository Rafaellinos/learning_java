public class NumerPalindrome {

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int lastNumber = 0;
        int numberBkp = number;
        int sum = 0;
        while (number > 0) {
            lastNumber = number % 10;
            sum = (sum*10)+lastNumber;
            number /= 10;
        }
        return numberBkp == sum;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
}
