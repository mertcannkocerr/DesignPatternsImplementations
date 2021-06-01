package FactoryMethodPattern;

public class Note8 implements IMobilePhone{

    @Override
    public String getModel() {
        return "Note8";
    }

    @Override
    public float getPrice() {
        return 1299.0f;
    }

    @Override
    public float getWidth() {
        return 50.0f;
    }

    @Override
    public float getHeight() {
        return 120.0f;
    }
}
