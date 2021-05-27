package CommandPattern;

public class TurnOffCommand implements ICommand{
    private Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOff();
        System.out.println("Light is turned off.");
    }

    @Override
    public void unexecute() {
        this.lamp.turnOn();
        System.out.println("Light is turned on.");
    }
}
