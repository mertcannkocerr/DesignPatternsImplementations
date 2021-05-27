package StatePattern;

public interface IGateState {
    void enter();
    void payOk();
    void payFailed();
}
