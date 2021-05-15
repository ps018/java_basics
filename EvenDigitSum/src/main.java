public class main {
    public static void main(String[] args) {
        System.out.println("The sum of all even numbers within the number 123456789 = "
        + EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("The sum of all even numbers within the number 252 = "
                + EvenDigitSum.getEvenDigitSum(252));
        System.out.println("The sum of all even numbers within the number -55 = "
                + EvenDigitSum.getEvenDigitSum(-55));
        System.out.println("The sum of all even numbers within the number 0 = "
                + EvenDigitSum.getEvenDigitSum(0));
    }
}
