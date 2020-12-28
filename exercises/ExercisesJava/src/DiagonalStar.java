public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                //System.out.println("row: " + row);
                for (int column = 1; column <= number; column++) {
                    //System.out.println("column: " + column);
                    if (row == column || row == 1 || row == number || column == number || column == 1 || column == (number - row) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("X");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }
}
