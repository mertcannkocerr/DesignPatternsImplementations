package CommandPattern;

public class DecreaseLightCommand implements ICommand{
    private Lamp lamp;

    public DecreaseLightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.decreaseLight();
        System.out.println("Light is decreased. (Level: "+ this.lamp.getLightLevel() + ")");
    }

    @Override
    public void unexecute() {
        this.lamp.increaseLight();
        System.out.println("Light is increased. (Level: "+ this.lamp.getLightLevel() + ")");
    }
}
