package StrategyPattern;

public class WildDuck extends Duck{
    public WildDuck(IFlyBehavior f, IQuackBehavior q) {
        this.flyBehavior = f;
        this.quackBehavior = q;
    }

    @Override
    public void display() {
        System.out.println("I'm Wild Duck.");
    }
}
