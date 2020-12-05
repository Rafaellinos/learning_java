public class LeapYear {

    public static boolean isLeapYear(int year){
        boolean isLeap;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        return isLeap;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }
}
