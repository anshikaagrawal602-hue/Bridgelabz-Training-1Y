package com.gla.string.Level2;

public class ShortestLongestWord {
    // Method to find length without using length()
    static int findLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split text manually into words
    static String[] manualSplit(String s) {

        int wordCount = 1;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ')
                wordCount++;
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) != ' ') {
                word = word + s.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;   // last word

        return words;
    }

    // Method to create 2D array of word and its length
    static String[][] wordWithLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }
    // Method to find shortest and longest word index
    static int[] findShortestLongest(String[][] data) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);

            if (len < Integer.parseInt(data[minIndex][1])) {
                minIndex = i;
            }

            if (len > Integer.parseInt(data[maxIndex][1])) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }
}
