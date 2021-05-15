public class Hyundai extends Car{
    private int roadServiceMonths;

    public Hyundai(int roadServiceMonths) {
        super("Hyundai", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity==0)  // automatic gear
        {
            stop();
            changeGear(1);
        }else if(newVelocity>0 && newVelocity<=10)
        {
            changeGear(1);
        }
        else if(newVelocity>10 && newVelocity<=20)
        {
            changeGear(2);
        }
        else if(newVelocity>20 && newVelocity<=30)
        {
            changeGear(3);
        }
        else if(newVelocity>30 && newVelocity<=60)
        {
            changeGear(4);
        }
        else if(newVelocity>60 && newVelocity<=80)
        {
            changeGear(5);
        }
        else{
            changeGear(6);
        }

        if(newVelocity>0)
        {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}