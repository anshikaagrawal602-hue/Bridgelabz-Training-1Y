package com.gla.string.Level1;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static com.gla.string.Level1.CharacterArrayCompare.arr;
import static com.gla.string.Level1.CharacterArrayCompare.arrays;
import static com.gla.string.Level1.LowerCaseCompare.compareStrings;
import static com.gla.string.Level1.LowerCaseCompare.convertToLower;
import static com.gla.string.Level1.SubstringComparison.createSubstring;
import static com.gla.string.Level1.UpperCaseCompare.convertToUpper;
import static java.lang.Boolean.compare;

public class Runner {
    public static void main(String[] args) {
        //Compare string by character
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string 1:");
        String s1 = sc.next();
        System.out.println("enter string 2:");
        String s2 = sc.next();
        CompareString c1 = new CompareString();
        boolean result1 = c1.compare(s1, s2);
        boolean result2 = s1.equals(s2);
        System.out.println("Result using charAt method: " + result1);
        System.out.println("Result using equals method: " + result2);
        if (result1 == result2) {
            System.out.println("both methods are equal");
        } else {
            System.out.println("both methods are different");
        }

        /// ////////////////////////////////////////////////
        //compare string using charAt()
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Substring using charAt()
        String sub1 = createSubstring(str, start, end);
        //Substring using built in method
        String sub2 = str.substring(start, end);
        boolean result = compare(sub1, sub2);
        if(result){
            System.out.println("both substrings are equal");
        }
        else{
            System.out.println("both are different");
        }

        /// //////////////////////////////////////////////////////////////
        //character Array comparison
        System.out.println("enter string:");
        String string = sc.next();
        char[] user = arr(string);
        char[] built_in = string.toCharArray();
        boolean r = arrays(user, built_in);
        for (char ch : user) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch : built_in) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("Are both arrays equal?" + r);


        //Lower case
        System.out.println("Enter text");
        String alp = sc.nextLine();

        String manualLower = convertToLower(alp);
        String builtInLower = alp.toLowerCase();

        boolean result3 = compareStrings(manualLower, builtInLower);
        System.out.println("Manual Lowercase: " + manualLower);
        System.out.println("Built-in-LowerCase: " + builtInLower);
        System.out.println("Are both same? "+result3);


        //Upper case
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        String manualUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        boolean res = compareStrings(manualUpper, builtInUpper);

        System.out.println("Manual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Are both same? " + res);
    }

    private static boolean compare(String sub1, String sub2) {
        return true;
    }

}
//to kal tanmay se puch enge abhii kaam khtm kr let hain aur sun mere project ka name bhi change kr de
//advance nhi karna na? haa string kr de