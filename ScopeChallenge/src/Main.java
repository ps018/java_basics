import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
//non static methods can be called from non static methods only
//non static methods if present in the same class, can be accessed by any method of this class whether static or non static
//static methods can be called from static or non static methods
//main() is static and therefore can not be called from any other class
//static methods can access non static fields in methods in other class as an instance is created for the other class
