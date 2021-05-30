package AdapterPattern;

public class BritishCharger implements IBritishCharger {

    @Override
    public void chargeWithThreeSocket() {
        System.out.println("Charging...");
    }
}
