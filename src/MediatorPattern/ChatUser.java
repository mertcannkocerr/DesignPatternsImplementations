package MediatorPattern;

public class ChatUser implements IUser {
    // Concrete Implementation of User interface
    private String name;
    private IMediator chatRoom;

    public ChatUser(String name, IMediator chatRoom) {
        // Creating user
        this.name = name;
        this.chatRoom = chatRoom;

        // Registering user objects into concrete mediator object.
        this.chatRoom.registerUser(this);
    }

    @Override
    public void sendMessage(String toUsername, String message) {
        // Informing user
        System.out.println(this.getName() + " sending message to " + toUsername + ": " + message );

        // Crucial part is this one. We are not going to send message directly to object.
        // We use mediator to send our message to other object.
        chatRoom.sendMessage(this.getName(), toUsername, message);
    }

    @Override
    public void recieveMessage(String fromUsername, String message) {
        // If concrete mediator object wants to notify us about our message,
        // it calls that method.
        System.out.println( this.getName() + " you have message from " + fromUsername + ": " + message);
    }

    public String getName() {
        return name;
    }


    public IMediator getChatRoom() {
        return chatRoom;
    }
}
