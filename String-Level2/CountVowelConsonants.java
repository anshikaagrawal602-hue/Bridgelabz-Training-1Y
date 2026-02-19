package com.gla.string.Level2;
import java.util.*;

public class CountVowelConsonants {
    static int[] countVowelConsonants(String text)
    {
        int vowels=0;
        int consonants=0;
        for(int i=0;i<text.length();i++)
        {
            char ch= text.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u'||ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
            {
                vowels++;
            }
            else if((ch>'a' && ch<'z')||(ch>'A' && ch<'Z'))
            {
                consonants++;
            }
            else
            {
                System.out.println("invalid");
            }
        }
        return new int[]{vowels,consonants};
    }
}
