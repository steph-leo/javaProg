public class Method {

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
        // Hardcoded arguments
        String title = "Adding Two Integers:";
        int num1 = 5;
        int num2 = 10;

        // Calling methods
        myMethod(title);         // Displays the title
        addition(num1, num2);    // Displays the sum
    }
}
