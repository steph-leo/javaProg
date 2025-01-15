import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Student object
        Student student = new Student();

        // Input student details
        System.out.print("Enter student name: ");
        student.setName(scanner.nextLine());
        System.out.print("Enter registration number: ");
        student.setRegNumber(scanner.nextLine());
        System.out.print("Enter year of study: ");
        student.setYearOfStudy(scanner.nextInt());
        System.out.print("Enter gender: ");
        scanner.nextLine(); // Consume newline
        student.setGender(scanner.nextLine());

        // Input scores
        System.out.print("Enter the number of scores: ");
        int numScores = scanner.nextInt();
        int[] scores = new int[numScores];
        System.out.println("Enter the scores:");
        for (int i = 0; i < numScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Calculate and display total and average
        double[] results = student.calculateScores(scores);

        // Display student details and results
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Registration Number: " + student.getRegNumber());
        System.out.println("Year of Study: " + student.getYearOfStudy());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Total Score: " + results[0]);
        System.out.println("Average Score: " + results[1]);

        scanner.close();
    }
}
