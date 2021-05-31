package StrategyPattern;

public class RubberDuck extends Duck{
    public RubberDuck(IFlyBehavior f, IQuackBehavior q) {
        this.flyBehavior = f;
        this.quackBehavior = q;
    }
    @Override
    public void display() {
        System.out.println("I'm Rubber Duck.");
    }
}
