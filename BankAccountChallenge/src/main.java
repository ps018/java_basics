public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(105879305);
        bankAccount.setBalance(3085.58);
        bankAccount.setCustomerName("Priya Sinha");
        bankAccount.setEmail("priya@gmail.com");
        bankAccount.setPhoneNumber(985702314);
        System.out.println("Account Number = " + bankAccount.getAccountNumber());
        System.out.println("Customer Name = " + bankAccount.getCustomerName());
        System.out.println("Balance = " + bankAccount.getBalance());
        System.out.println("Email = " + bankAccount.getEmail());
        System.out.println("Phone Number = " + bankAccount.getPhoneNumber());
        bankAccount.depositFund(5000);
        bankAccount.withdrawFund(1000);
    }
}
