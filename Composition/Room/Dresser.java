package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Dresser {

    // Instance Fields
    private String material;
    private int capacity;   // Amount of clothes it can hold
    private Dimensions dimensions;

    // Default Constructor
    public Dresser(String material, int capacity, Dimensions dimensions) {
        this.material = material;
        this.capacity = capacity;
        this.dimensions = dimensions;
    }

    // Getters
    public String getMaterial() { return material; }
    public int getcapacity() { return capacity; }
    public Dimensions getDimensions() {
        return dimensions;
    }

    /* Other Methods */
    public void changeClothes() {
        System.out.println("You have changed clothes from the DRESSER");
    }

}
