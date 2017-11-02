package Composition.Computer;

/**
 * Created by braij on 4/5/2017.
 */
public class Motherboard {

    // Instance Fields
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    // Constructor
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    // Getters
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public int getCardSlots() {
        return cardSlots;
    }
    public String getBios() {
        return bios;
    }

    public void loadProgram(String program) {
        System.out.println("Program " + program + " is now loading...");
    }

}
