package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Lamp {

    // Instance Fields
    private String lightColor;
    private int brightness; // Brightness of lamp ranges 1 - 5
    private boolean isOn;

    // Default Constructor
    public Lamp() {
        this.lightColor = "yellow";
        this.brightness = 1;
        this.isOn = false;
    }

    // Getters
    public String getLightColor() { return lightColor; }
    public int getBrightness() { return brightness; }
    public boolean getIsOn() { return isOn; };

    // Setters
    public void toggleBrightness(int brightness) {
        if(brightness > 5 || brightness < 1)
            System.out.println("Error: Invalid brightness given.\nUse values between 1 - 5");
        else
            this.brightness = brightness;
        System.out.println("Lamp brightness:\t" + brightness);
    }

    public void toggleLightColor(String color) {
        lightColor = color;
        System.out.println("Light color changed to " + lightColor.toUpperCase());
    }

    public void toggle() {
        isOn = isOn == false ? true : false;
        System.out.println("Lamp is turned " + (isOn == false ? "OFF" : "ON with a brightness of " + brightness));
    }

}
