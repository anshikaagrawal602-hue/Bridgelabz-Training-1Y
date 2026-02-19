package com.gla.string.Level1;

public class SubstringComparison {
    //method to compare substring using charAt()
    public static String createSubstring(String str,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result= result + str.charAt(i);
        }
        return result;
    }
    public boolean compare(String s1,String s2){
        // If lengths are not equal, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!= s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
