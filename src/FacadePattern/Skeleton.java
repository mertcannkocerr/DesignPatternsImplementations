package FacadePattern;

public class Skeleton implements ISimulationPart{
    @Override
    public void createPart() {
        System.out.println("Skeloton part of simulation is created.");
    }
}
