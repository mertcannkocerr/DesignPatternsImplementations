package MediatorPattern;

import java.util.ArrayList;

public class ChatRoom implements IMediator{
    // Concrete implementation of Mediator interface.
    private String name;
    // To forward message to right user we need to store all users.
    private ArrayList<IUser> registeredUsers;

    public ChatRoom(String name) {
        // Initializing Chatroom object.
        this.name = name;
        this.registeredUsers= new ArrayList<>();
    }

    @Override
    public void registerUser(IUser user) {
        // When concrete IUser object is created it will directly added into
        // its chatroom objects list.
        this.registeredUsers.add(user);
    }

    @Override
    public void getAvailableUsers() {
        System.out.print("Available users are: ");
        this.registeredUsers.forEach(user -> System.out.print(user.getName() + " "));
        System.out.println();
    }

    @Override
    public void sendMessage(String fromUsername, String toUsername, String message) {
        // When user calls that method we need to find and forward that message to
        // appropriate user.
        for (IUser reciever: this.registeredUsers){
            if (reciever.getName().equals(toUsername)){
                reciever.recieveMessage(fromUsername, message);
            }
        }
    }

}
