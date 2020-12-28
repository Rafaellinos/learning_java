package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code her
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        int myIntValue = 5 / 2; // out 2
        System.out.println(myIntValue);

        double pounds = 3d;

        double kilogramsUnit = 0.453592;

        double result = pounds * kilogramsUnit;
        System.out.println(result);



    }
}
