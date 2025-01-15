public class MyMethodsDemo {

    // Method to add two integers and return the sum
    public static int addition(int a, int b) {
        return a + b;
    }

    // Method to display the result
    public static void display(int result) {
        System.out.println("The sum is: " + result);
    }

    // Main method
    public static void main(String[] args) {
        // Define two integers
        int num1 = 10;
        int num2 = 20;

        // Call addition method and store the result
        int sum = addition(num1, num2);

        // Call display method to output the result
        display(sum);
    }
}
