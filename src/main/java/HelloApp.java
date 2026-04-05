/**
 * HelloApp.java - A simple Java application that accepts multiple names as
 * command-line arguments and displays a personalized greeting for each user using
 * substring to remove the trailing delimiter.
 * If no names are provided, it should display "Hello, World!".
 *
 * @author netrasriram30-creator
 * @version 6.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }
            if (nameBuilder.length() > 0) {
                name = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}