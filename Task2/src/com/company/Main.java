package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");
        int numOfSubjects;
        do {
            System.out.print("Enter the number of subjects: ");
            numOfSubjects = scanner.nextInt();
        } while (numOfSubjects <= 0);

        int[] subjectMarks = new int[numOfSubjects];
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }


        int totalMarks = calculateTotalMarks(subjectMarks);


        double averagePercentage = calculateAveragePercentage(totalMarks, numOfSubjects);


        char grade = calculateGrade(averagePercentage);


        displayResults(totalMarks, averagePercentage, grade);
    }

    private static int calculateTotalMarks(int[] subjectMarks) {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    private static double calculateAveragePercentage(int totalMarks, int numOfSubjects) {
        return ((double) totalMarks / numOfSubjects);
    }

    private static char calculateGrade(double averagePercentage){
        if (averagePercentage >= 75){
            return 'A';
        }else if(averagePercentage >= 65){
            return 'B';
        }else if (averagePercentage >= 45){
            return 'C';
        }else if (averagePercentage >= 35){
            return 'S';
        }else {
            return 'F';
        }
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
