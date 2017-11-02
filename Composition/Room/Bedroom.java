package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Bedroom {

    // Instance Fields
    private Bed bed;
    private Desk desk;
    private Dresser dresser;
    private Closet closet;
    private Lightswitch lightswitch;
    private Curtain curtain;
    private Window window;
    private Dimensions dimensions;

    // Default Constructor
    public Bedroom(Bed bed, Desk desk, Dresser dresser, Closet closet, Lightswitch lightswitch, Curtain curtain, Window window, Dimensions dimensions) {
        this.bed = bed;
        this.desk = desk;
        this.dresser = dresser;
        this.closet = closet;
        this.lightswitch = lightswitch;
        this.curtain = curtain;
        this.window = window;
        this.dimensions = dimensions;
    }

    // Getters
    public Bed getBed() {
        return bed;
    }
    public Desk getDesk() {
        return desk;
    }
    public Dresser getDresser() {
        return dresser;
    }
    public Closet getCloset() {
        return closet;
    }
    public Lightswitch getLightswitch() { return lightswitch; }
    public Curtain getCurtain() { return curtain; }
    public Window getWindow() { return window; }
    public Dimensions getDimensions() { return dimensions; }

    /* Other Methods */

    public static void furniture() {
        System.out.println("-Bed\n-Desk\n-Dresser\n-Closet\n");
    }

    public void room() {
        System.out.println(this.getClass().toString().substring(6) + "\n");
    }

    public void goIn() {
        bed.makeBed();
        lightswitch.toggle();
        curtain.toggle();
        window.toggle();
        System.out.println("");
    }

    public void goOut() {
        bed.makeBed();
        if(lightswitch.getOnState()) lightswitch.toggle();
        if(window.getIsOpen()) window.toggle();
        if(curtain.getIsOpen()) curtain.toggle();
        System.out.println("");
    }

}
