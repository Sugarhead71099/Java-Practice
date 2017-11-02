package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Window {

    // Instance Fields
    private Dimensions dimensions;
    private boolean isOpen;

    // Default Constructor
    public Window(Dimensions dimensions) {
        this.dimensions = dimensions;
        isOpen = false;
    }

    // Getters
    public Dimensions getDimensions() {
        return dimensions;
    }
    public boolean getIsOpen() {
        return isOpen;
    }

    /* Other Methods */
    public void toggle() {
        isOpen = isOpen ? false : true;
        System.out.println("Window is " + (isOpen == false ? "CLOSED" : "OPEN"));
    }

}
