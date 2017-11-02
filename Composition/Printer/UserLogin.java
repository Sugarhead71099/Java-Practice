package Composition.Printer;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

/**
 * Created by braij on 4/7/2017.
 */

/* Login the user if given credentials, otherwise login anonymously or register the user */

public class UserLogin {

    // Instance Fields
    private Scanner userInput;
    private String login;
    private String password;
    private boolean registeredUser;

    // Default Constructor
    protected UserLogin(String login, String password) {
        this.userInput = new Scanner(System.in);
        this.login = login;
        this.password = password;
        this.registeredUser = true;
    }

    // Overloaded Constructors
    protected UserLogin() {
        this("FakeUser", "Password");
    }

    // Getters
    protected Scanner getUserInput() {
        return userInput;
    }
    protected String getLogin() {
        return login;
    }
    @Contract(pure = true)
    private String getPassword() {
        return password;
    }
    protected boolean isregisteredUser() {
        return registeredUser;
    }

    /* Other Methods */

    protected void authenticate() {
        System.out.println("User has been authenticated");
    }

}
