package FactoryMethodPattern;

public class GalaxyS8 implements IMobilePhone{
    @Override
    public String getModel() {
        return "GalaxyS8";
    }

    @Override
    public float getPrice() {
        return 1599.0f;
    }

    @Override
    public float getWidth() {
        return 40.0f;
    }

    @Override
    public float getHeight() {
        return 110.0f;
    }
}
