package com.company;

import java.util.Scanner;

//Longest repeating subsequence problem
public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        System.out.println("The length og longest repeating subsequence: "+lrs(s));
    }
    public static int lrs(String s){
        String s1,s2;
        s1 = s2 = s;
        int[][] t = new int[s.length()+1][s.length()+1];
       //Initialization of first row and column
        for (int i=0;i<=s.length();i++){
            t[i][0] = 0;
            t[0][i] = 0;
        }

        for (int i=1;i<=s.length();i++){
            for (int j=1;j<=s.length();j++){
                if (s1.charAt(i-1)==s2.charAt(j-1) && i!=j){
                    t[i][j] = t[i-1][j-1]+1;
                }else{
                    t[i][j] = Math.max(t[i][j-1], t[i-1][j]);
                }
            }
        }
        return t[s.length()][s.length()];
    }
}
