package com.gla.string.Level2;

public class RockPaperScissors {
    // b) Method to generate computer choice
    static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // c) Method to find winner
    static String findWinner(String user, String comp) {

        if (user.equals(comp))
            return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    // d) Method to calculate stats & percentage
    static String[][] calculateStats(int userWin, int compWin, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWin * 100.0) / totalGames;
        double compPercent = (compWin * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWin);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWin);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    // e) Method to display final results
    static void displayStats(String[][] stats) {

        System.out.println("\nPlayer\tWins\tWin Percentage");
        System.out.println("--------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

}
