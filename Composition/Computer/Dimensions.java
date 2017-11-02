package Composition.Computer;

/**
 * Created by braij on 4/5/2017.
 */
public class Dimensions {

    // Instance Field
    private int width;
    private int height;
    private int depth;

    // Constructor
    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Getters
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getDepth() {
        return depth;
    }
}
