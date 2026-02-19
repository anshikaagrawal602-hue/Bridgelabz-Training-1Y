package com.gla.string.Level3;

class NestedFrequency {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String textData) {

        char[] charArr = textData.toCharArray();
        int[] freqArr = new int[charArr.length];

        // Step ii: nested loop frequency calculation
        for (int i = 0; i < charArr.length; i++) {
            freqArr[i] = 1;

            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    freqArr[i]++;
                    charArr[j] = '0';   // mark duplicate
                }
            }
        }

        // Count valid characters
        int count = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != '0') {
                count++;
            }
        }

        // Step iii: create 1D String array
        String[] resultArr = new String[count];
        int index = 0;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != '0') {
                resultArr[index] = charArr[i] + " = " + freqArr[i];
                index++;
            }
        }

        return resultArr;
    }
}
