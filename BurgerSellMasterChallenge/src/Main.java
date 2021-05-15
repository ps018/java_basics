public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.25,"White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato",0.24);
        hamburger.addHamburgerAddition2("Cheese",2.12);
        hamburger.addHamburgerAddition3("Lettuce",.22);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthyAddition1("Egg",5.28);
        healthyBurger.addHealthyAddition2("Lentils",0.66);
        System.out.println("Total Healthy Burger Price is "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Fish",6.4);
        System.out.println("Total price for deluxe burger is " +db.itemizeHamburger());

    }
}
