import java.util.ArrayList;
 class IntClass{
    private int myValue;

     public IntClass(int myValue) {
         this.myValue = myValue;
     }

     public int getMyValue() {
         return myValue;
     }

     public void setMyValue(int myValue) {
         this.myValue = myValue;
     }
 }

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Tim");

      //  ArrayList<int> myInteger = new ArrayList<int>();//not appropriate
        ArrayList<Integer> integers = new ArrayList<Integer>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();

        Integer integer = new Integer(54);
        Double doubleValue = new Double(20.25);

        for(int i=0; i<=10; i++)
        {
            integers.add(Integer.valueOf(i));
        }

        for( int i=0; i<=10; i++)
        {
            System.out.println(i + " --> " + integers.get(i).intValue());
        }

//        Integer myIntValue = 56; // Integer.valueOf(56);
//        int myInt = myIntValue; // myInt.intValue();
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl =0; dbl<=10; dbl += 0.5)
        {
            myDoubleValues.add(Double.valueOf(dbl));    //.add(dbl)
        }

        for(int i=0; i< myDoubleValues.size(); i++)
        {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }
}
