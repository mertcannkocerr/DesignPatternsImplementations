package StrategyPattern;

public class CityDuck extends Duck{

    public CityDuck(IFlyBehavior f, IQuackBehavior q) {
        this.flyBehavior = f;
        this.quackBehavior = q;
    }

    @Override
    public void display() {
        System.out.println("I'm City Duck.");
    }
}
