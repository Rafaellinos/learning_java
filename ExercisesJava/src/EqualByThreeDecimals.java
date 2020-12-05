

public class EqualByThreeDecimals {

    public static boolean areEqualByThreeDecimalPlaces(double number, double number2) {
        return (int) (number * 1000) == (int) (number2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));



    }

}


