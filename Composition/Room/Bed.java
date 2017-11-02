package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Bed {

    // Instance Fields
    private String type;
    private Dimensions dimensions;
    private int comfortRange;  // From 1 - 10
    private boolean hasBackboard;
    private boolean bedIsMade;

    // Default Constructor
    public Bed(String type, Dimensions dimensions, int comfortRange, boolean backboard, boolean bedIsMade) {
        this.type = type;
        this.dimensions = dimensions;
        this.comfortRange = comfortRange < 1 || comfortRange > 10 ? -1 : comfortRange;      // Check if comfortRange has a valid range (1 - 10)
        this.hasBackboard = backboard;
        this.bedIsMade = bedIsMade;
    }

    // Getters
    public String getType() { return type; }
    public Dimensions getDimensions() { return dimensions; }
    public int getComfortRange() { return comfortRange; }
    public boolean getHasBackboard() { return hasBackboard; }
    public boolean getBedIsMade() { return bedIsMade; }

    /* Other Methods */
    public void sleep() {
        bedIsMade = false;
        System.out.println("Slept bed is NOT made");
    }

    public void makeBed() {
        bedIsMade = true;
        System.out.println("Bed IS made");
    }

}
