package AbstractFactoryMethod;

public class WindowsSlider implements ISlider{
    private String color;
    private float width;

    public WindowsSlider(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "WindowsSlider{" +
                "color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
