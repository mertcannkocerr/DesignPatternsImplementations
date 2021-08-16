package MediatorPattern;

public interface IUser {
    // Is an Interface for related objects
    // Related object may be in different types but in our chatroom example
    // User objects are only related with each other.

    void sendMessage(String toUsername, String message);
    void recieveMessage(String fromUsername, String message);
    String getName();
    IMediator getChatRoom();
}
