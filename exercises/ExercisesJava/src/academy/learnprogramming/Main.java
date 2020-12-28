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

        // in this file above
        //printConversion(1.25);

        //sum calculator
//        SumCalculator sc = new SumCalculator();
//        sc.setFirstNumber(5.0);
//        sc.setSecondNumber(4);
//        System.out.println(sc.getAdditionResult());
//        System.out.println(sc.getSubtractionResult());
//        System.out.println(sc.getMultiplicationResult());
//        System.out.println(sc.getDivisionResult());

        //wall area
//        WallArea wall = new WallArea(5, 4);
//        System.out.println(wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println(wall.getWidth());
//        System.out.println(wall.getHeight());
//        System.out.println(wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2, 2));
        Point point = new Point();
        System.out.println(point.distance());
    }
}
