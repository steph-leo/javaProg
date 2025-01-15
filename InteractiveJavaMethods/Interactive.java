import java.util.Scanner; // Importing the Scanner class

public class Interactive {

    // Method to display a message with a title
    public static void myMethod(String title) {
        System.out.println(title);
    }

    // Method to calculate and display the sum of two integers
    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating Scanner object

        // Getting the title from the user
        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        // Getting the two integers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calling methods
        myMethod(title);         // Displays the user-provided title
        addition(num1, num2);    // Displays the sum of the two numbers

        scanner.close(); // Closing the Scanner to free resources
    }
}
