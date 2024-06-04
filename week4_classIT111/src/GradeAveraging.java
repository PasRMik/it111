package src;

import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int numberOfGrades = 5;

        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.println("Please enter your " + i + " numerical grade");
            double grade = scanner.nextDouble();
            sum += grade;
        }

        double average = sum / numberOfGrades;
        char letterGrade;
        String message;

        System.out.println("You have earned an average grade of " + average + " after providing us with " + numberOfGrades + " grades");

        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary";
        } else if (average >= 65 && average < 70) {
            letterGrade = 'D';
            message = "Squeaking by!";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";
        }

        System.out.println("You have earned the following letter grade of " + letterGrade + ", and here is the message: " + message);
        scanner.close();
    }
}