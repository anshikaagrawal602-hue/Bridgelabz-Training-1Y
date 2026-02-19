package com.gla.string.Level3;

class AnagramCheck {

    // Method to check whether two texts are anagrams
    public static boolean checkAnagram(String firstTxt, String secondTxt) {

        // Step i: check length
        if (firstTxt.length() != secondTxt.length()) {
            return false;
        }

        int[] freqOne = new int[256];
        int[] freqTwo = new int[256];

        // Step ii & iii: count frequency
        for (int i = 0; i < firstTxt.length(); i++) {
            freqOne[firstTxt.charAt(i)]++;
            freqTwo[secondTxt.charAt(i)]++;
        }

        // Step iv: compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freqOne[i] != freqTwo[i]) {
                return false;
            }
        }

        return true;
    }
}

