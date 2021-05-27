package StatePattern;

public class Gate {
    private IGateState state;

    public Gate(){
        System.out.println("Gate is initialized with default state.");
        this.state = new ClosedGateState(this);
    }

    public void enter() {
        this.state.enter();
    }

    public void payOk() {
        this.state.payOk();
    }

    public void payFailed() {
        this.state.payFailed();
    }

    public void changeState(IGateState newState){
        this.state = newState;
    }

}
