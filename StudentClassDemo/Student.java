public class Student {

    // Instance variables
    private String name;
    private String regNumber;
    private int yearOfStudy;
    private String gender;

    // Set and Get methods for each variable
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    // Method to calculate the average of scores
    public double calculateAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return (double) total / scores.length;
    }

    // Main method
    public static void main(String[] args) {
        // Create Student object
        Student student = new Student();

        // Hardcode values using set methods
        student.setName("Alice");
        student.setRegNumber("2025/001");
        student.setYearOfStudy(3);
        student.setGender("Female");

        // Print student details using get methods
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Registration Number: " + student.getRegNumber());
        System.out.println("Year of Study: " + student.getYearOfStudy());
        System.out.println("Gender: " + student.getGender());

        // Array of scores
        int[] scores = {85, 90, 78, 92, 88};

        // Calculate and display the average
        System.out.println("Average Score: " + student.calculateAverage(scores));
    }
}
