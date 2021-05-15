public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, String name, int body, int size, int weight, int gills, int fins, int eyes) {
        super(brain, name, body, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.gills = gills;
    }

    private void rest()
    {

    }

    private void moveMuscles()
    {

    }
    private void moveBackFin(){

    }

    public void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
