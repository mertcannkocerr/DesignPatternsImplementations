package StrategyPattern;

public class FlyWithWingsBehavior  implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with wings is enabled");
    }
}
