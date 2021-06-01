package DecoratorPattern;

public abstract class Beverage {
    private String desc = "Beverage";
    public abstract float cost();

    public String getDesc(){
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "desc='" + this.getDesc() + '\'' +
                ", cost:'" + this.cost() +
                '}';
    }
}
