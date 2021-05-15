public interface ITelephone {       //methods are defined in interface
    void powerOn();          //we can add public/private or nothing, works the same
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
    //no further code is written in interface. everything would be in the class.
}
