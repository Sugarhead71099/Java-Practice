package Composition.Computer;

/**
 * Created by braij on 4/5/2017.
 */
public class Case {

    //Instance Fields
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    // Default Constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    // Getters
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

}
