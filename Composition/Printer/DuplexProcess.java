package Composition.Printer;

/**
 * Created by braij on 4/7/2017.
 */
public class DuplexProcess {

    private UserLogin userLogin;
    private boolean isNetworkPrinter;
    private boolean isDuplexPrinter;

    // Default constructor
    protected DuplexProcess(UserLogin userLogin, boolean isNetworkPrinter, boolean isDuplexPrinter) {
        this.userLogin = userLogin;
        this.isNetworkPrinter = isNetworkPrinter;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    // Getters
    protected UserLogin getUserLogin() { return userLogin; }
    protected boolean isNetworkPrinter() { return isNetworkPrinter; }
    protected boolean isDuplexPrinter() { return isDuplexPrinter; }

    /* Other Methods */

}
