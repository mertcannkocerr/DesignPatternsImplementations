package StrategyPattern;

public class NoFlyBehavior implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("There is no flying behavior.");
    }
}
