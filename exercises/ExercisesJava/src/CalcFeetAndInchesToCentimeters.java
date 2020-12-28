public class CalcFeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (!(feet >= 0) || !(inches >= 0 && inches <= 12)){
            System.out.println("invalid");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(0,13));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(157));
    }
}
