package AbstractFactoryMethod;

public class MacOsButton implements IButton{
    private float width;
    private float height;
    private String color;

    public MacOsButton(String color, float height, float width) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public float getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "MacOsButton{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
