package CommandPattern;

public class IncreaseLightCommand implements ICommand{
    private Lamp lamp;

    public IncreaseLightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.increaseLight();
        System.out.println("Light is increased. (Level: "+ this.lamp.getLightLevel() + ")");
    }

    @Override
    public void unexecute() {
        this.lamp.decreaseLight();
        System.out.println("Light is decreased. (Level: "+ this.lamp.getLightLevel() + ")");
    }
}
