package CommandPattern;

import java.util.Stack;

// In this scenario this class acts as Invoker.
public class RemoteController {
    private ICommand turnOnCommand;
    private ICommand turnOffCommand;
    private ICommand increaseLightCommand;
    private ICommand decreaseLightCommand;
    private Stack<ICommand> undoStack = new Stack<>();

    public RemoteController(ICommand turnOnCommand, ICommand turnOffCommand, ICommand increaseLightCommand, ICommand decreaseLightCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.increaseLightCommand = increaseLightCommand;
        this.decreaseLightCommand = decreaseLightCommand;
    }

    public void clickUndo(){
        ICommand undoable = this.undoStack.pop();
        System.out.println("Undo operation is in process...");
        undoable.unexecute();
        System.out.println("Undo operation is done!");
    }

    public void clickTurnOnCommand(){
        this.undoStack.push(this.turnOnCommand);
        this.turnOnCommand.execute();
    }

    public void clickTurnOffCommand(){
        this.undoStack.push(this.turnOffCommand);
        this.turnOffCommand.execute();
    }

    public void clickIncreaseLightCommand(){
        this.undoStack.push(this.increaseLightCommand);
        this.increaseLightCommand.execute();
    }

    public void clickDecreaseLightCommand(){
        this.undoStack.push(this.decreaseLightCommand);
        this.decreaseLightCommand.execute();
    }
}
