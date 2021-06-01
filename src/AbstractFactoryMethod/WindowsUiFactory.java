package AbstractFactoryMethod;

public class WindowsUiFactory implements IUiFactory {

    @Override
    public IButton getButton(String color, float height, float width) {
        return new WindowsButton(color, height, width);
    }

    @Override
    public ISlider getSlider(String color, float width) {
        return new WindowsSlider(color, width);
    }
}
