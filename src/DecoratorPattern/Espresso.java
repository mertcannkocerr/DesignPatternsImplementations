package DecoratorPattern;

public class Espresso extends Beverage{

    public Espresso() {
        this.setDesc("Beverage: Espresso");
    }

    @Override
    public String getDesc(){
        return super.getDesc();
    }
    @Override
    public float cost() {
        return 8.0f;
    }


}
