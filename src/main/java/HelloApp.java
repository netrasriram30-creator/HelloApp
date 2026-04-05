/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC1 by accepting a user's name as a command-line argument and displaying
 * a personalized greeting.
 *
 * @author netrasriram30-creator
 * @version 1.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        // Get the name from command-line argument
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}