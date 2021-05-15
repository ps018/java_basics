public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

//    public SomeClass() {
//      //  instanceNumber = 1;//final private field cannot be reassigned
//    }


    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
