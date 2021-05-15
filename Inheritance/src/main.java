public class main {
    public static void main(String[] args) {
        Animal animal = new Animal(1, "Animal", 1, 5, 5);
        Dog dog = new Dog(8,"Tiger", 20, 4, 5, 2, 4, 1, "Silky", 11);
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish = new Fish(1,"Tuna", 5, 8,9,2,2,2);
    fish.swim(12);
    }
}
