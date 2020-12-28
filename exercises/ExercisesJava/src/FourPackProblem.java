public class FourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        while (bigCount > 0){
            if (goal < 5) break;
            goal -= 5;
            bigCount --;
        }
        while (smallCount > 0) { // small 2, goal 1
            if (goal <= 0) break;
            goal -= 1;
            smallCount --;
        }
        return (goal == 0 || goal == 0 && smallCount > 0);
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 0, 9));
    }
}
