package ObserverPattern;

public class WebApp implements IObserver{
    private IObservable observable;

    public WebApp(IObservable observable) {
        this.observable = observable;
        this.observable.register(this);
    }

    @Override
    public void update() {
        System.out.println("Measurements are changed in Web Application.");
        System.out.println(this.observable);
    }
}
