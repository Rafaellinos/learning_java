import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers = new ArrayList<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setBranchName(String branchName) {
        this.name = branchName;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i ++) {
            if (this.customers.get(i).getName().contains(customerName)) {
                return this.customers.get(0);
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer foundCustomer = findCustomer(customerName);
        if (foundCustomer != null) {
            foundCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public Branch(String branchName) {
        super();
        this.name = branchName;
    }

    public ArrayList<Customer> addCustomer(Customer customer) {
        this.customers.add(customer);
        return customers;
    }

    public Customer makeTransaction(Customer customer, double transactionAmount) {
        customer.getTransactions().add(transactionAmount);
        return customer;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
