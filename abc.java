import java.util.Scanner;

public class abc{
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Print Hello World
        System.out.println("Hello, World!");

        // Ask for user's name
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Nice to meet you, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
