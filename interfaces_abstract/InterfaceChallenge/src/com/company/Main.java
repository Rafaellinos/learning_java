package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Rafael", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        tim.setWeapon("Stormbringer");
        System.out.println(tim);
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);

        ISaveable werewolf = new Monster("WereWolf", 20, 40);
        System.out.println("Strength: " + ((Monster) werewolf).getStrength()); // cast to monster class
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n 1 to enter a string\n 0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i=0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
