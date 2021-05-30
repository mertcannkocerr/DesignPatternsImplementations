package FacadePattern;

public class Muscle implements ISimulationPart{
    @Override
    public void createPart() {
        System.out.println("Muscle part of simulation is created");
    }
}
