package MediatorPattern;

public interface IMediator {
    void registerUser(IUser user);
    void getAvailableUsers();
    void sendMessage(String fromUsername, String toUsername, String message);
}
