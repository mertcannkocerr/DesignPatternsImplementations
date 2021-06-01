package DecoratorPattern;

public class Soy extends CondimentDecorator{

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost(){
        return this.beverage.cost() + 2.0f;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " with Soy";
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "desc='" + this.getDesc() + '\'' +
                ", cost:'" + this.cost() +
                '}';
    }
}
