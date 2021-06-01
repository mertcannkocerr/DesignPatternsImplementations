package ObserverPattern;

public class DesktopApp implements IObserver{
    private IObservable observable;

    public DesktopApp(IObservable observable) {
        this.observable = observable;
        this.observable.register(this);
    }

    @Override
    public void update() {
        System.out.println("Measurements are changed in Desktop Application.");
        System.out.println(this.observable);
    }
}
