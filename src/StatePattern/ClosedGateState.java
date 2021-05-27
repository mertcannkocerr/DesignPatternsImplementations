package StatePattern;

public class ClosedGateState implements IGateState{
    private Gate gate;

    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Enter command is taken in Closed State.");
        this.gate.changeState(new ClosedGateState(this.gate));
        System.out.println("New state: Closed");
    }

    @Override
    public void payOk() {
        System.out.println("PayOk command is taken in Closed State.");
        this.gate.changeState(new OpenedGateState(this.gate));
        System.out.println("New state: Opened");

    }

    @Override
    public void payFailed() {
        System.out.println("PayFailed command is taken in Closed State.");
        this.gate.changeState(new ClosedGateState(this.gate));
        System.out.println("New state: Closed");
    }
}
