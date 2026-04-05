/**
 * HelloApp.java - A simple Java application that greets multiple users by name if
 * provided as command-line arguments, or defaults to greeting "World" if no names are given.
 *
 * @author netrasriram30-creator
 * @version 4.0
 * @since UC1
 */
public class HelloApp {
    public static void main(String[] args) {
        String name = "World";

        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}