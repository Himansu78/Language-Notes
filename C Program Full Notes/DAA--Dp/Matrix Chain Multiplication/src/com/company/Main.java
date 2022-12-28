package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       String s1 = "ABCD";
       String s2 = "BDCA";
        System.out.println("Two strings are rotation: "+solve(s1,s2));

    }

    public static boolean solve(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        if(s1.compareTo(s2) == 0){
            return true;
        }

        for (int i=0;i<s1.length();i++){
            s2 = rotate(s2);
            if( s1.compareTo(s2) == 0){
                return true;
            }
        }
        return false;
    }
    public static String rotate(String s){
        String first = s.substring(0,1);
        String rest = s.substring(1);
        return rest.concat(first);

    }

}
