package com.gla.string.Level2;

public class SimpleSplit
{
    static String[] manualSplit(String s)
    {
        int words=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                words++;
            }
        }
        String[] result = new String[words];
        int index=0;
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word= word+ s.charAt(i);
            }
            else{
                result[index]=word;
                index++;
                word="";
            }
        }
        result[index]= word;
        return result;
    }
    static boolean compare(String[] a, String[] b) {

    if (a.length != b.length)
        return false;

    for (int i = 0; i < a.length; i++) {
        if (!a[i].equals(b[i]))
            return false;
    }
    return true;
}
}
