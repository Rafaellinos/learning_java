import java.util.ArrayList;

public class Customer {

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions.add(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    private ArrayList<Double> transactions = new ArrayList<>();

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
