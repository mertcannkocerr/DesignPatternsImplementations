package AdapterPattern;

public class BritishAdapter implements IBritishAdapter{
    private ITurkishCharger turkishCharger;

    public BritishAdapter(ITurkishCharger charger) {
        System.out.println("Turkish charger is accepted.");
        this.turkishCharger = charger;
    }

    @Override
    public void charge() {
        System.out.println("Convertion is completed.");
        this.turkishCharger.chargeWithTwoSocket();
    }
}
