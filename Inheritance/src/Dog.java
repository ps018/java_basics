public class Dog extends Animal{            //inherits animal class parameters
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain, String name, int body, int size, int weight, int eyes, int legs, int tail, String coat, int teeth) {
        super(brain, name, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void chew()
    {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {         //override methods from base class
        System.out.println("Dog.eat() called");
        chew();
        super.eat();            //super.eat() represents eat method in base class or super class
    }
    public void walk()
    {
        System.out.println("Dog.walk() called");
        move(5);     //or super.move();
    }

    public void run()

    {
        System.out.println("Dog.run() called");
        move(10);
    }}
