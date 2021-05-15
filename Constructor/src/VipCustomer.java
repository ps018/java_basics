public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer()
    {
        this("Priya", "priya@gmail.com" , 30000);
        System.out.println("Empty Constructor called");
    }

    public VipCustomer(String name, String emailAddress)
    {
        this(name, emailAddress, 50000);
        System.out.println("Constructor with 2 parameters called");
    }

    public VipCustomer(String name, String emailAddress, double creditLimit)
    {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with 3 parameters called");
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
