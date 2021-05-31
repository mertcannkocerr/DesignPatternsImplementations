package StrategyPattern;

public class SilentQuackBehavior implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence quack is enabled.");
    }
}
