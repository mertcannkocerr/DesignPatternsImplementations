package AbstractFactoryMethod;

public class MacOsSlider implements ISlider {
    private String color;
    private float width;

    public MacOsSlider(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public String getColor() {
        return this.color;
    }

    public float getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "MacOsSlider{" +
                "color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
