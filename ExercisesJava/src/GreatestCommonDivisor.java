public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int maxCommonDivisor = 0;
        int count = 1;
        int greatestNumber = first > second ? first : second;
        while (true) {
            if (count == greatestNumber) {
                break;
            }
            if (first % count == 0 && second % count == 0) {
                maxCommonDivisor = count;
            }
            count ++;
        }
        return maxCommonDivisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
