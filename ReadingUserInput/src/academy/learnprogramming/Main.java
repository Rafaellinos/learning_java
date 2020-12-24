package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    // scanner para ler input
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt(); // check se tem próximo número inteiro
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character key, when reading a number
            System.out.println("Enter Your name: ");
            String name = scanner.nextLine(); //
            int age = 2020 - yearOfBirth;
            System.out.println(name + " age: " + age);
        } else {
            System.out.println("Invalid Integer");
        }
        scanner.close();
    }
}
