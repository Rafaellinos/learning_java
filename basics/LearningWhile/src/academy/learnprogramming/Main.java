package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 1;

	    while (count != 6) {
            System.out.println("Count Value is " + count);
	        count ++;
        }
	    count = 1;
	    while (true) {
	        if (count == 5) {
	            break;
            }
	        count ++;
        }
        // mesma coisa
	    for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }
	    count = 1;
	    do {
            System.out.println("current number is " + count);
            count ++;
        } while(count != 6);

	    int number = 4;
	    int finishNumber = 20;
	    while (number <= finishNumber) {
	        number ++;
	        if (number % 2 != 0) {
	            continue;
            }
            System.out.println(" is Even: " + number);
        }
    }
}
