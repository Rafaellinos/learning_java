package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = new int[10]; // 10 espaços vazios com zeros
        int[] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myIntArray[5] = 50;
        System.out.println(myIntArray[0]);
        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray1.length);
        for (int i = 0; i < myIntArray1.length; i ++) {
            System.out.println(myIntArray1[i] * 10);
        }
    }
}
