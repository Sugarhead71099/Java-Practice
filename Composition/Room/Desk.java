package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Desk {

    // Instance Fields
    private String material;
    private String color;
    private int numberOfLegs;
    private Lamp lamp;
    private Dimensions dimensions;

    // Default Constructor
    public Desk(String material, String color, int numberOfLegs, Lamp lamp, Dimensions dimensions) {
        this.material = material;
        this.color = color;
        this.numberOfLegs = numberOfLegs;
        this.lamp = lamp;
        this.dimensions = dimensions;
    }

    // Getters
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public int getNumberOfLegs() { return numberOfLegs; }
    public Lamp getLamp() { return lamp; }
    public Dimensions getDimensions() { return dimensions; }

    /* Other Methods */

    public void work() {
        lamp.toggle();
        lamp.toggleBrightness(3);
        System.out.println("You wrote an essay\n");
    }

}
