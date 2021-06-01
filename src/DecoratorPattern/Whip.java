package DecoratorPattern;

public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return this.beverage.cost() + 3.0f;
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + " with Whip";
    }
}
