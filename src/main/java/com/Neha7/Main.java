
        package com.Neha7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextComparator comparator = new TextComparator();

        while (true) {

            System.out.println("\n================================");
            System.out.println("   TEXT-BASED PLAGIARISM CHECKER");
            System.out.println("================================");
            System.out.println("1. Compare Two Texts");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine().trim());

                switch (choice) {

                    case 1:
                        try {
                            System.out.println("\nEnter Text 1:");
                            String textA = sc.nextLine();

                            System.out.println("\nEnter Text 2:");
                            String textB = sc.nextLine();

                            TextDocument documentA =
                                    new TextDocument(textA);

                            TextDocument documentB =
                                    new TextDocument(textB);

                            ComparisonReport report =
                                    comparator.compare(
                                            documentA,
                                            documentB
                                    );

                            report.displayReport();

                        } catch (EmptyTextException e) {
                            System.out.println(
                                    "Input Error: " + e.getMessage()
                            );
                        }

                        break;

                    case 2:
                        System.out.println(
                                "Thank you for using the program!"
                        );

                        sc.close();
                        return;

                    default:
                        System.out.println(
                                "Invalid choice! Enter 1 or 2."
                        );
                }

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input! Please enter a number."
                );
            }
        }
    }
}