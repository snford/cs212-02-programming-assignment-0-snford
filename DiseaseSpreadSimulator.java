// Programmers: Shane  
// Course: CS212, Mr. John 
// Due Date: 02/02/2024
// Programming Assignment: 0
/* Problem Statement: Develop a Java program that simulates the spread 
of a new disease based on the concept of the "R number." */
// Data In: R Number
// Data Out: day and case(s)
// Credits: none

import java.util.Scanner;

public class DiseaseSpreadSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the R number from the user
        System.out.print("What is the R number? ");
        double rNumber = scanner.nextDouble();

        // Print the header
        System.out.println("Day\tCase(s)");

        // Initialize variables
        double infectedCases = 1.0;

        // Simulate the spread for the first 10 days
        for (int day = 0; day <= 9; day++) {
            // Print day and corresponding cases
            System.out.println(day + "\t" + infectedCases);

            // Calculate new cases for the next day
            infectedCases *= rNumber;
        }

    }
}

