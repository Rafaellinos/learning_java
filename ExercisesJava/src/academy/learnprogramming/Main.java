package academy.learnprogramming;

public class Main {

    public static long toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0){
            return -1;
        }
        return Math.round(kilometerPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        }

    }

    public static void main(String[] args) {
	// write your code here

        printConversion(1.25);

    }
}
