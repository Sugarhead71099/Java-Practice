package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Dimensions {

    // Instance Fields - All recorded in inches
    private String objectName;
    private double width;
    private double height;
    private double depth;

    // Default Constructor
    public Dimensions(String objectName, double width, double height, double depth) {
        this.objectName = objectName;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Getters
    public String getObjectName() { return objectName; }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getDepth() {
        return depth;
    }

    // Mutators
    @Override
    public String toString() {
        return String.format("Dimensions of %s%nWidth:\t%f%nHeight:\t%f%nDepth:\t%f%n", objectName, width, height, depth);
    }

}
