public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double deposit)
    {
        this.balance = balance + deposit;
        System.out.println("Deposit = " + deposit);
        System.out.println("New Balance after deposit = " + this.balance);
    }

    public void withdrawFund(double withdraw)
    {
        if(balance<withdraw)
        {
            System.out.println("Insufficient Balance");
        }else {
            this.balance = balance - withdraw;
            System.out.println("Withdrawal = " + withdraw);
            System.out.println("New Balance after withdrawal = " + this.balance);
        }
    }
}
