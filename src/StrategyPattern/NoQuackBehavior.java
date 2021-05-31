package StrategyPattern;

public class NoQuackBehavior implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("There is no quack behavior.");
    }
}
