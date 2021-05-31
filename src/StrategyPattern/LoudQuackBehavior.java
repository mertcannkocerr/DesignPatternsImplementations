package StrategyPattern;

public class LoudQuackBehavior implements IQuackBehavior{
    @Override
    public void quack() {
        System.out.println("Loud quack is enabled.");
    }
}
