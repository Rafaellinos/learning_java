public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int count = 1;
        int total = 0;
        while (count < number) {
            if (number % count == 0) {
                total += count;
            }
            count ++;
        }
        return (total == number);
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
    }
}
