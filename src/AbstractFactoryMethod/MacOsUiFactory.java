package AbstractFactoryMethod;

public class MacOsUiFactory implements IUiFactory{

    @Override
    public IButton getButton(String color, float height, float width) {
        return new MacOsButton(color, height, width);
    }

    @Override
    public ISlider getSlider(String color, float width) {
        return new MacOsSlider(color, width);
    }
}
