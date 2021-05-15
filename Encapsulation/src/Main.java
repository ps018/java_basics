public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Priya";      //we can change the parameters directly in main class coz parameters are in public scope in player class
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Priya", "Sword", 90); // if health>100, it assigns the value of 100.
        System.out.println("Initial health is " + player.getHealth());
    }
}
