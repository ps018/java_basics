public class Main {
    public static void main(String[] args) {
        ITelephone timPhone;                         //Use of ITelephone instead of DeskPhone also okay
        timPhone = new DeskPhone(1234560);
        timPhone.powerOn();
        timPhone.callPhone(1234560);
        timPhone.answer();

        timPhone = new MobilePhone(24565);
        timPhone.powerOn();
        timPhone.callPhone(24565);
        timPhone.answer();
    }
}
//use I before the name of the interface for convenience eg. ITelephone
//List is an interface inbuilt in java, can be used instead of linked list
//List<> one = new Vector<>();
