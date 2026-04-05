/**
 * HelloApp.java - A simple Java application that greets multiple users by name if
 * provided as command-line arguments using the String.join() method, or defaults
 * to greeting "World" if no names are given.
 *
 * @author netrasriram30-creator
 * @version 6.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        String names = "World";

        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}