import CommandPattern.*;
import IteratorPattern.*;
import ProxyPattern.*;
import StatePattern.*;
import TemplateMethodPattern.*;
import AdapterPattern.*;
import FacadePattern.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // runProxyPatternExample();
        // runStatePatternExample();
        // runTemplateMethodPatternExample();
        // runIteratorPatternExample();
        // runCommandPatternExample();
        // runAdapterPatternExample();
           runFacadePatternExample();
    }

    public static void runTemplateMethodPatternExample(){
        User user1 = new User(17);
        user1.save();

        User user2 = new User(20);
        user2.save();
    }

    public static void runStatePatternExample(){
        Gate gate = new Gate();

        // Gate is closed
        gate.enter();
        gate.payFailed();
        gate.payOk();

        // Gate is supposed to be opened
        gate.payOk();
        gate.payFailed();
        gate.enter();
    }

    public static void runProxyPatternExample() throws InterruptedException {
        LazyDocumentProxy documentProxy = new LazyDocumentProxy("Very Long Document Content...");
        System.out.println("(1st call) Number of characters in document is: " + documentProxy.getNumberOfCharacters());
        System.out.println("(2nd call) Number of characters in document is: " + documentProxy.getNumberOfCharacters());
    }

    public static void runIteratorPatternExample(){
        Item rightItem = new  Item("RightSword", 90);
        Item leftItem = new  Item("LeftSword", 80);

        HandHeldInventory inventory = new HandHeldInventory(rightItem, leftItem);
        InventoryIterator iterator = new HandHeldInventoryIterator(inventory);

        while(!iterator.isDone()){
            Item temp = iterator.current();
            System.out.println(temp);
            iterator.next();
        }

    }

    public static void runCommandPatternExample(){
        Lamp lamp = new Lamp();
        RemoteController remoteController = new RemoteController(new TurnOnCommand(lamp), new TurnOffCommand(lamp), new IncreaseLightCommand(lamp), new DecreaseLightCommand(lamp));
        remoteController.clickTurnOnCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickIncreaseLightCommand();
        remoteController.clickDecreaseLightCommand();
        remoteController.clickDecreaseLightCommand();
        remoteController.clickDecreaseLightCommand();
        remoteController.clickUndo();
        remoteController.clickUndo();
        remoteController.clickUndo();
        remoteController.clickUndo();
        remoteController.clickTurnOffCommand();
    }

    public static void runAdapterPatternExample(){
        BritishCharger britishCharger = new BritishCharger();
        TurkishCharger turkishCharger = new TurkishCharger();

        IBritishAdapter britishAdapter = new BritishAdapter(turkishCharger);
        britishAdapter.charge();
    }

    public static void runFacadePatternExample(){
        HumanSimulator humanSimulator = new HumanSimulator();
        humanSimulator.createHumanSimulation();
    }
}
