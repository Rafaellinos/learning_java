import java.util.ArrayList;

public class Bank {

    public Bank(String bankName) {
        super();
        this.bankName = bankName;
    }

    private String bankName = "";

    private ArrayList<Branch> findBranches(String branchName) {
        ArrayList<Branch> branchesFound = new ArrayList<>();
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().contains(branchName)) {
                branchesFound.add(this.branches.get(i));
            }
        }
        return branchesFound;
    }

    private Branch findBranch(String branchName) {
        ArrayList<Branch> branchesFound = findBranches(branchName);
        if (branchesFound.size() > 0) {
            return branchesFound.get(0);
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    private ArrayList<Branch> branches = new ArrayList<>();

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customers details for branch: " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i=0; i < branchCustomers.size(); i ++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j=0; j < transactions.size(); j ++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

}
