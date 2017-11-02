package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Curtain {

    // Instance Fields
    private String type;    // Are they blinds, shades, curtains, etc...
    private String color;
    private Dimensions dimensions;
    private boolean isOpen;

    // Default Constructor
    public Curtain(String type, String color, Dimensions dimensions) {
        this.type = type;
        this.color = color;
        this.dimensions = dimensions;
        this.isOpen = false;
    }

    // Getters
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public boolean getIsOpen() {
        return isOpen;
    }

    /* Other Methods */
    public void toggle() {
        isOpen = isOpen ? false : true;
        System.out.println("Curtain is " + (isOpen == false ? "CLOSED" : "OPEN"));
    }

}
