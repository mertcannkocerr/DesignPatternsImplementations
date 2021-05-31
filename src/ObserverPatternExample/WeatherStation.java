package ObserverPatternExample;

import java.util.ArrayList;

public class WeatherStation implements IObservable{
    private float temp;
    private float hum;
    private float press;

    private ArrayList<IObserver> observers;

    public WeatherStation(float temp, float hum, float press) {
        this.observers = new ArrayList<>();
        this.temp = temp;
        this.hum = hum;
        this.press = press;
    }

    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver o: this.observers){
            o.update();
        }
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        notifyObservers();
    }

    public float getHum() {
        return hum;
    }

    public void setHum(float hum) {
        this.hum = hum;
        notifyObservers();
    }

    public float getPress() {
        return press;
    }

    public void setPress(float press) {
        this.press = press;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temp=" + temp +
                ", hum=" + hum +
                ", press=" + press +
                ", observers=" + observers +
                '}';
    }
}
