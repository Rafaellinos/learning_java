package academu.learnprogramming;

public class SwitchStatement {
    public static void SwitchCasePrint(int value) {
        switch (value) {
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value 3, 4, or 5");
                break;
            default:
                System.out.println("Not 1 ... 5");
                break;
        }
    }

    public static void SwitchCaseMonth(String value) {

        switch (value.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }

    public static void SwitchCaseString(char value) {
        switch (value) {
            case 'A':
                System.out.println("Value A");
                break;
            case 'B':
                System.out.println("Value B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value C, D, or E");
                break;
            default:
                System.out.println("Not A ... E");
                break;
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

}
