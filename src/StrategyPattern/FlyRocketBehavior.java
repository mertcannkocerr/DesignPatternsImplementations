package StrategyPattern;

public class FlyRocketBehavior implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("Rocket fly is enabled.");
    }
}
