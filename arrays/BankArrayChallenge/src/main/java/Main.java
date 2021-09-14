import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Australia bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 22.1);

        bank.listCustomers("Adelaide", true);

//        bank.addBranch("Sydney");
//        bank.addCustomer("Sydney", "Tim", 150.54);
//        bank.addCustomer("Sydney", "Tim", 12.44);
//        bank.addCustomer("Sydney", "Mike", 1.65);
//
//        bank.listCustomers("Adelaide", true);
//        bank.listCustomers("Sydney", true);

    }
}
