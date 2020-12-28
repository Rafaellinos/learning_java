public class LargestPrime {

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int largestPrime = -1;
//        for (int i = 2; ) TODO
        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}
