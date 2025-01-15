public class Student {

    // Instance variables
    private String name;
    private String regNumber;
    private int yearOfStudy;
    private String gender;

    // Set and Get methods
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

    // Method to calculate total and average of scores
    public double[] calculateScores(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        return new double[] {total, average};
    }
    
}
