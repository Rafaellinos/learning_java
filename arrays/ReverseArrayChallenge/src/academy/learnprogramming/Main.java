package academy.learnprogramming;

public class Main {

    private static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i -- ) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
	    int[] myInt = new int[] {1,3,4};
	    reverse(myInt);
    }
}
