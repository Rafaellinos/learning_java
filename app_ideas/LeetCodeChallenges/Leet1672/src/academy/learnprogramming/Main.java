package academy.learnprogramming;

public class Main {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i ++) {
            int currentMax = 0;
            for (int j = 0; j < accounts[i].length; j ++) {
                currentMax += accounts[i][j];
            }
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 1}, {1, 3, 2}};
        System.out.println(maximumWealth(matrix));
        int[][] matrix1 = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(matrix1));
        int[][] matrix2 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(matrix2));

    }
}
