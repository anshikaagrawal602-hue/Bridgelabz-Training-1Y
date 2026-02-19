package com.gla.string.Level2;
import java.util.*;

public class VotingEligibility {
    // a) Method to take age input and return 1D array
    static int[] getAges(int n) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // b) Method to check voting eligibility
    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); // age as String

            if (ages[i] < 0) {
                result[i][1] = "false";   // invalid age
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";    // can vote
            }
            else {
                result[i][1] = "false";   // cannot vote
            }
        }

        return result;
    }

    // c) Method to display 2D array in table format
    static void display(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + Boolean.parseBoolean(data[i][1]));
        }
    }

}
