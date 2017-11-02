package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Closet {

    // Instance Fields
    private String size;    // Size of closet ('Small', 'Medium', or 'Large') are valid values
    private int capacity;   // Amount of clothes it can hold
    private Dimensions dimensions;
    private boolean isWalkIn;
    private boolean isOpen;

    // Default Constructor
    public Closet(String size, int capacity, Dimensions dimensions, boolean isWalkIn) {
        this.size = size;
        this.capacity = capacity;
        this.dimensions = dimensions;
        this.isWalkIn = isWalkIn;
        this.isOpen = false;
    }

    // Getters
    public String getSize() {
        return size;
    }
    public int getcapacity() {
        return capacity;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public boolean isWalkIn() {
        return isWalkIn;
    }

    /* Other Methods */

    public void changeClothes() {
       System.out.println((isOpen ? "You have changed clothes from the CLOSET" : "You can't change clothes, your closet isn't open!"));
    }

}
