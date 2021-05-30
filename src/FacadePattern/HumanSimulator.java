package FacadePattern;

public class HumanSimulator {
    public void createHumanSimulation(){
        Skeleton skeletonSimulator = new Skeleton();
        skeletonSimulator.createPart();

        Muscle muscleSimulator = new Muscle();
        muscleSimulator.createPart();

        Skin skinSimulator = new Skin();
        skinSimulator.createPart();

        System.out.println("Human Simulation is started!");
    }
}
