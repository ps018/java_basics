public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 44.05);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 112.25);

        bank.addCustomerTransaction("Adelaide", "Mike", 12.44);
        bank.addCustomerTransaction("Adelaide", "Tim", 100.0);
        bank.addCustomerTransaction("Adelaide", "Percy", 22.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.34))
        {
            System.out.println("Error Melbourne does not exist");
        }

        if(!bank.addBranch("Adelaide"))
        {
            System.out.println("Adelaide branch already exists");
        }
    }
}
