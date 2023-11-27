package com.project;

public class ReverseString {

    public static String reverse(String toReverse){
        if(toReverse.length() <= 1){
            return "String too short";
        }
        String reversed = "";
        for(int i = toReverse.length()-1; i>=0; i--){
            reversed = reversed + toReverse.charAt(i);
        }
        return reversed;
    }

}
