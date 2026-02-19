package com.gla.string.Level2;
import java.util.*;
import java.util.Arrays;

import static com.gla.string.Level2.CountVowelConsonants.countVowelConsonants;
import static com.gla.string.Level2.ManualTrim.*;
import static com.gla.string.Level2.RockPaperScissors.*;
import static com.gla.string.Level2.ShortestLongestWord.findShortestLongest;
import static com.gla.string.Level2.SimpleSplit.compare;
import static com.gla.string.Level2.SimpleSplit.manualSplit;
import static com.gla.string.Level2.StudentGradeCard.*;
import static com.gla.string.Level2.VotingEligibility.checkVoting;
import static com.gla.string.Level2.VotingEligibility.getAges;
import static com.gla.string.Level2.VowelConsonantCheck.analyzeString;
import static com.gla.string.Level2.VowelConsonantCheck.display;
import static com.gla.string.Level2.WordLength2D.wordWithLength;

public class Runner {
    public static void main(String[] args) {
        /// ///////////////////////////////////////////////////////////5
        int arr[]= countVowelConsonants("Anshika");
        System.out.println(Arrays.toString(arr));

        /// ////////////////////////////////////////////////////////////2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] userSplit = manualSplit(text);
        String[] builtIn = text.split(" ");
        System.out.println("\nManual Split Output:");
        for(int i=0;i< userSplit.length;i++){
            System.out.println(userSplit[i]);
        }
        System.out.println("\nBuilt-in Split Output:");
        for(int i=0;i< builtIn.length;i++){
            System.out.println(builtIn[i]);
        }
        boolean result = compare(userSplit, builtIn);
        System.out.println("\nSame result? " + compare(userSplit, builtIn));

        /// /////////////////////////////////////////////3
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the text:");
        String t = sc.nextLine();

        String[] words = manualSplit(t);
        String[][] data = wordWithLength(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]); // String → Integer
            System.out.println(data[i][0] + "\t" + len);
        }

       /// ///////////////////////////////////////////////////////4
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the text:");
        String s1 = sc.nextLine();

        String[] word = manualSplit(text);
        String[][] data1 = wordWithLength(word);
        int[] result1 = findShortestLongest(data1);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < data1.length; i++) {
            System.out.println(data1[i][0] + "\t" + Integer.parseInt(data1[i][1]));
        }

        System.out.println("\nShortest Word: " + data1[result1[0]][0]);
        System.out.println("Longest Word : " + data1[result1[1]][0]);

        /// //////////////////////////////////////////////////////////////////6
        Scanner b = new Scanner(System.in);

        System.out.println("enter a string");
        String s2 = b.nextLine();

        String[][] data2 = analyzeString(s2);
        display(data2);

        /// //////////////////////////////////////////////////////////7
        Scanner c = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s3 = c.nextLine();

        // Manual trim
        int[] indexes = findTrimIndexes(s3);
        String manualTrimmed = manualSubstring(s3, indexes[0], indexes[1]);

        // Built-in trim
        String builtInTrimmed = s3.trim();

        // Compare both strings
        boolean result2 = compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("\nManual Trimmed String : [" + manualTrimmed + "]");
        System.out.println("Built-in Trimmed String: [" + builtInTrimmed + "]");
        System.out.println("Are both strings same? " + result);

        /// //////////////////////////////////////////////////////8
        int n = 10; // number of students

        int[] ages = getAges(n);
        String[][] votingData = checkVoting(ages);
        display(votingData);

        /// ///////////////////////////////////////////////////9
        Scanner d = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = d.nextInt();
        d.nextLine(); // clear buffer

        int userWins = 0;
        int compWins = 0;

        System.out.println("\nEnter your choice (rock / paper / scissors)");

        for (int i = 1; i <= games; i++) {

            System.out.print("\nGame " + i + " - Your choice: ");
            String user = sc.nextLine().toLowerCase();

            String comp = computerChoice();
            String winner = findWinner(user, comp);

            System.out.println("Computer choice: " + comp);
            System.out.println("Winner: " + winner);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);

        /// ///////////////////////////////////////////////////////10
        int students = 5;   // number of students

        int[][] scores = generateScores(students);
        double[][] result3 = calculateResult(scores);
        String[] grades = calculateGrade(result3);

        displayScoreCard(scores, result3, grades);
    }
}

