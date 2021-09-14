package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {
    //private int[] myNumbers = new int[50]; // tipo primitivo
    private ArrayList<String> groceryList = new ArrayList<String>(); // é uma classe, por isso o construtor em branco

    public void addGroceryItem(String item) {
        //myNumbers[5] = 2;
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println(groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem) {
        int position = findItem(newItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public String removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        return theItem;
    }

    public Integer findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem); // return the index of the element
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
        return groceryList.indexOf(searchItem);
    }
}
