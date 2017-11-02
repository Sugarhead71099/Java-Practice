package Composition.Computer;

/**
 * Created by braij on 4/5/2017.
 */
public class Monitor {

    // Instance Fields
    private String mode;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    // Default Constructor
    public Monitor(String mode, String manufacturer, int size, Resolution nativeResolution) {
        this.mode = mode;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // Getters
    public String getMode() {
        return mode;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getSize() {
        return size;
    }
    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }

}
