import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Create an array to store the marks in each subject
        int[] marks = new int[numberOfSubjects];

        // Get the marks in each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            totalMarks += marks[i];
        }

        // Calculate the average percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;

        // Calculate the grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
