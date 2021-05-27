package CommandPattern;

public class TurnOnCommand implements ICommand{
    private Lamp lamp;

    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOn();
        System.out.println("Light is turned on.");
    }

    @Override
    public void unexecute() {
        this.lamp.turnOff();
        System.out.println("Light is turned off.");
    }
}
