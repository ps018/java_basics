public class Main {

    public static void main(String[] args) {
//	    SomeClass one = new SomeClass("one");
//	    SomeClass two = new SomeClass("two");
//	    SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//        //Math m = new Math();//cannot create Math instance as it is private constructor
//
//        int pw = 674312;
//        Password password = new Password(pw);
//        password.storePassword();
//        password.letMeIn(674312);
//        password.letMeIn(6712);
//        password.letMeIn(952);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
