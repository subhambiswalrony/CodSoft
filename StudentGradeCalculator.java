// write a program in JAVA to create Student Grade Calculator

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of Subjects: ");
        int numsubjects = sc.nextInt();

        int totalmarks = 0;
        for (int i = 1; i <= numsubjects; i++) {
            System.out.println("Enter marks obtained in subject" + i + ": ");
            int marks = sc.nextInt();

            totalmarks += marks;
        }
        float averagepercentage = (float) totalmarks/numsubjects;

        char grade;
        if (averagepercentage >= 90) {
            grade = 'A';
        } else if (averagepercentage >= 80) {
            grade = 'B';
        } else if (averagepercentage >= 70) {
            grade = 'C';
        } else if (averagepercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total marks obtained by Student is: " + totalmarks);
        System.out.println("Average percentage of Student is: " + averagepercentage);
        System.out.println("Grade of Student is: " + grade);

        sc.close();
    }
}
