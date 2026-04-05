/**
 * HelloApp.java - A simple Java application that greets the user by name if
 * provided as a command-line argument, or defaults to greeting "World" if no name is
 * given. This use case demonstrates how to handle optional command-line arguments and
 * provide default values in Java.
 *
 * @author netrasriram30-creator
 * @version 3.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
    }
}