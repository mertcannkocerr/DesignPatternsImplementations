package ObserverPattern;

public class MobileApp implements IObserver{
    private IObservable observable;

    public MobileApp(IObservable observable) {
        this.observable = observable;
        this.observable.register(this);
    }

    @Override
    public void update() {
        System.out.println("Measurements are changed in Mobile Application.");
        System.out.println(this.observable);
    }
}
