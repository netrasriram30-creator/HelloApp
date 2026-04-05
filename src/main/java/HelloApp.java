/**
 * HelloApp.java - A simple Java application that accepts multiple names as
 * command-line arguments and displays a personalized greeting for each user using
 * an enhanced for loop. If no names are provided, it should display "Hello, World!".
 *
 * @author netrasriram30-creator
 * @version 5.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;
            for (String arg : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(arg);
                first = false;
            }
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}