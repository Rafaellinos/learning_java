
public class NumberOfDaysInMonth {


    public static boolean isLeapYear(int year){
        boolean isLeap = false;
        if (year < 1 || year > 9999) {
            return isLeap;
        }
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0) isLeap = true;
            }
            else
                isLeap = true;
        }
        return isLeap;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2018));
        System.out.println(getDaysInMonth(3, -2018));
    }
}
