package Composition.Computer;

/**
 * Created by braij on 4/5/2017.
 */
public class PC {

    // Instance Fields
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Default Constructor;
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Getters
    public Case getTheCase() {
        return theCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }

}
