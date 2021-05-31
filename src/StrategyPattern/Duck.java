package StrategyPattern;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();

    public void quack(){
        this.quackBehavior.quack();
    }

    public void fly(){
        this.flyBehavior.fly();
    }
}
