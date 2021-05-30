package AdapterPattern;

public class TurkishCharger implements ITurkishCharger{

    @Override
    public void chargeWithTwoSocket() {
        System.out.println("Charging..");
    }
}
