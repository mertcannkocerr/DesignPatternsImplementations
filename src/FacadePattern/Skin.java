package FacadePattern;

public class Skin implements ISimulationPart{
    @Override
    public void createPart() {
        System.out.println("Skin part of simulation is created.");
    }
}
