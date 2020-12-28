package academy.learnprogramming;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        // empty constructor
        this("1234", 2.50, "Default Name",
                "Default Address", "Default Phone");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("999999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        setNumber(number);
        setBalance(balance);
        setCustomerName(customerName);
        setCustomerEmailAddress(customerEmailAddress);
        setCustomerPhoneNumber(customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if ((this.balance - withdrawalAmount) < 0 ) {
            System.out.println("Only "+ this.balance+ " available.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("With drawl of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
