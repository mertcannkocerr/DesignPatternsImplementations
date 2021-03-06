import CommandPattern.*;
import FactoryMethodPattern.IFactory;
import IteratorPattern.*;
import MediatorPattern.ChatRoom;
import MediatorPattern.ChatUser;
import MediatorPattern.IMediator;
import MediatorPattern.IUser;
import ProxyPattern.*;
import StatePattern.*;
import TemplateMethodPattern.*;
import AdapterPattern.*;
import FacadePattern.*;
import SingletonPattern.*;
import StrategyPattern.*;
import ObserverPattern.*;
import DecoratorPattern.*;
import FactoryMethodPattern.*;
import AbstractFactoryPattern.*;

public class Main {

    public static void main(String[] args) throws Exception {
        /* Run Static Example functions to see outputs*/

    }
    public static void runMediatorPatternExample(){
        // Creating a mediator that regularizes object communication,
        // Since we may have more than one mediator object we open object as Interface.
        // In our case mediator object is Chatroom.
        IMediator chatroom = new ChatRoom("Chatroom1");


        // Creating ChatUsers which are inherited from IUser Object.
        IUser Alice = new ChatUser("Alice", chatroom);
        IUser Bob = new ChatUser("Bob", chatroom);
        IUser Charlie = new ChatUser("Charlie", chatroom);

        Alice.getChatRoom().getAvailableUsers();
        System.out.println(); // For pretty looking

        // Then calling sendMessage method of these ChatUser objects.
        Alice.sendMessage("Bob", "Hi Bob, I'm Alice." );
        System.out.println(); // For pretty looking
        Alice.sendMessage("Charlie", "Hi Charlie, I'm Alice" );
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

    public static void runSingletonPatternExample(){
        DAO databaseAccessObject = DAO.getInstance();
        System.out.println(databaseAccessObject.getConnectionURL());
    }

    public static void runStrategyPatternExample(){
        Duck wildDuck = new WildDuck(new FlyRocketBehavior(), new LoudQuackBehavior());
        Duck cityDuck = new CityDuck(new FlyWithWingsBehavior(), new SilentQuackBehavior());
        Duck rubberDuck = new RubberDuck(new NoFlyBehavior(), new NoQuackBehavior());

        System.out.println("-------Wild Duck-------");
        wildDuck.display();
        wildDuck.fly();
        wildDuck.quack();
        System.out.println("-------City Duck-------");
        cityDuck.display();
        cityDuck.fly();
        cityDuck.quack();
        System.out.println("-------Rubber Duck-------");
        rubberDuck.display();
        rubberDuck.fly();
        rubberDuck.quack();
    };

    public static void runObserverPatternExample(){
        WeatherStation weatherStation = new WeatherStation(36.0f, 23.0f, 1.0f);
        MobileApp mobileApp = new MobileApp(weatherStation);
        WebApp webApp = new WebApp(weatherStation);
        DesktopApp desktopApp = new DesktopApp(weatherStation);

        System.out.println("----Initial Status of Weather Station-----");
        System.out.println(weatherStation);
        System.out.println("------------------------------------------\n");

        weatherStation.setHum(24.0f);
        weatherStation.setTemp(38.0f);
        weatherStation.setPress(2.0f);
    }

    public static void runDecoratorPatternExample(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage);

        beverage = new Soy(beverage);
        System.out.println(beverage);

        beverage = new Whip(beverage);
        System.out.println(beverage);

        beverage = new Soy(beverage);
        System.out.println(beverage);
    }

    public static void runFactoryMethodPatternExample() throws Exception {
        IFactory phoneFactory = new MobilePhoneFactory();
        IMobilePhone mobilePhone = phoneFactory.getInstance("Note8");
        System.out.println(mobilePhone.getModel());
        System.out.println(mobilePhone.getPrice());
        System.out.println(mobilePhone.getHeight());
        System.out.println(mobilePhone.getWidth());
    }

    public static void runAbstractFactoryMethodExample(){
        WindowsUiFactory windowsUiFactory = new WindowsUiFactory();
        IButton windowsButton = windowsUiFactory.getButton("Red", 200, 200);
        ISlider windowsSlider = windowsUiFactory.getSlider("Green", 200);

        System.out.println("------------------------------------------");
        System.out.println(windowsButton);
        System.out.println(windowsSlider);

        System.out.println("------------------------------------------");
        MacOsUiFactory macOsUiFactory = new MacOsUiFactory();
        IButton macOsButton = new MacOsUiFactory().getButton("Blue", 300, 300);
        ISlider macOsSlider = new MacOsUiFactory().getSlider("Yellow", 300);
        System.out.println(macOsButton);
        System.out.println(macOsSlider);
        System.out.println("------------------------------------------");


    }
}

