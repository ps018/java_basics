public class main {
    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer();
        System.out.println("Name: " + customer.getName() + " email Id: "
        + customer.getEmailAddress() + " Credit Limit: " + customer.getCreditLimit());
        VipCustomer newCustomer = new VipCustomer("Kylie", "kill@gmail.com" , 100000);
        System.out.println("Name: " + newCustomer.getName() + " email Id: "
                + newCustomer.getEmailAddress() + " Credit Limit: " + newCustomer.getCreditLimit());
        VipCustomer vipCustomer = new VipCustomer("Naina", "naina@gmail.com");
        System.out.println("Name: " + vipCustomer.getName() + " email Id: "
                + vipCustomer.getEmailAddress() + " Credit Limit: " + vipCustomer.getCreditLimit());
    }
}
