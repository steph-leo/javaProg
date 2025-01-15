import java.util.Scanner;

public class OverloadedAddition {

    // Overloaded method to add two integers
    public static int addition(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two doubles
    public static double addition(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int addition(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to concatenate two strings
    public static String addition(String str1, String str2) {
        return str1 + str2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for two integers
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();

        // Input for two doubles
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();

        // Input for three integers
        System.out.print("Enter first integer for three-int addition: ");
        int int3_1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int3_2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int int3_3 = scanner.nextInt();

        // Input for two strings
        scanner.nextLine(); // Consume newline left from nextInt()
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Display results
        System.out.println("\nResults:");
        System.out.println("Sum of two integers: " + addition(int1, int2));
        System.out.println("Sum of two doubles: " + addition(double1, double2));
        System.out.println("Sum of three integers: " + addition(int3_1, int3_2, int3_3));
        System.out.println("Concatenation of two strings: " + addition(str1, str2));

        scanner.close();
    }
}
