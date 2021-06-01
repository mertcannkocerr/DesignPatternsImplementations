package AbstractFactoryPattern;

public interface IUiFactory {
    IButton getButton(String color, float height, float width);
    ISlider getSlider(String color, float width);
}
