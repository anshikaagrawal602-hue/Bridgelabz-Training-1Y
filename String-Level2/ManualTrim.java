package com.gla.string.Level2;

public class ManualTrim {
    // a) Method to find start and end index after trimming spaces
    static int[] findTrimIndexes(String s) {

        int start = 0;
        int end = s.length() - 1;

        // Trim leading spaces
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // b) Method to create substring using charAt()
    static String manualSubstring(String s, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }

    // c) Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

}
