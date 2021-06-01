package DecoratorPattern;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.setDesc("Beverage: House Blend");
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public float cost() {
        return 10.0f;
    }
}
