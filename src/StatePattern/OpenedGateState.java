package StatePattern;

public class OpenedGateState implements IGateState{
    private Gate gate;

    public OpenedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Enter command is taken in Opened State.");
        this.gate.changeState(new ClosedGateState(this.gate));
        System.out.println("New state: Closed");

    }

    @Override
    public void payOk() {
        System.out.println("PayOk command is taken in Opened State.");
        this.gate.changeState(new OpenedGateState(this.gate));
        System.out.println("New state: Opened");

    }

    @Override
    public void payFailed() {
        System.out.println("PayFailed command is taken in Opened State.");
        this.gate.changeState(new OpenedGateState(this.gate));
        System.out.println("New state: Opened");

    }
}
