package Composition.Room;

/**
 * Created by braij on 4/6/2017.
 */
public class Lightswitch {

    // Instance Fields
    private boolean switchIsUp;
    private boolean onState;

    // Default Constructor
    public Lightswitch() {
        this.switchIsUp = false;
        this.onState = false;
    }

    // Getters
    public boolean getOnState() { return onState; }

    /* Other Methods */

    public void toggle() {
        switchIsUp = switchIsUp ? false : true;
        onState = switchIsUp ? true : false;
        System.out.println((onState ? "Lights are ON" : "Lights are OFF"));
    }

}
