package com.gla.string.Level2;

public class WordLength2D {

    // Method to find length without using length()
    static int findLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count++;
        }
        return count;
    }

    // Method to split text into words manually
    static String[] manualSplit(String s) {

        int words = 1;
        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) == ' ')
                words++;
        }

        String[] arr = new String[words];
        int index = 0;
        String word = "";

        for (int i = 0; i < findLength(s); i++) {
            if (s.charAt(i) != ' ') {
                word = word + s.charAt(i);
            } else {
                arr[index++] = word;
                word = "";
            }
        }
        arr[index] = word;   // last word

        return arr;
    }
    // Method to create 2D array (word + length)
    static String[][] wordWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                       // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }

        return result;
    }
}
