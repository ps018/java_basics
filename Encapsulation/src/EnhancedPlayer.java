public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int hitPoints = 100;
    //encapsulation: private parameters which could not be changed directly in main class

    public EnhancedPlayer(String name, String weapon, int hitPoints) {
        this.name = name;
        this.weapon = weapon;
        if(hitPoints >0 && hitPoints <=100) {
            this.hitPoints = hitPoints;
        }
    }
    public void loseHealth(int damage)
    {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0)
        {
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return hitPoints;
    }
}
