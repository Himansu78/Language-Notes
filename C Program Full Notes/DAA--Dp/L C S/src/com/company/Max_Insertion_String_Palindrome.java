package com.company;

import java.util.Scanner;

//Maximum number of insertion required in the string to make it palindrome
        //No. of insertion == No. of deletion
public class Max_Insertion_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        System.out.println("Minimum number of insertion required to make the String palindrome is: "+misp(s));
    }

    public static int misp(String s){
        int ins = s.length()-lps(s);
        return ins;
    }

    public static int lps(String s){
        int lps = lcs(s, new StringBuilder(s).reverse().toString(),s.length(),s.length());
        return lps;
    }

    public static int lcs(String s1, String s2, int n, int m){
        int[][] t = new int[n+1][m+1];

        //Initialization of First row and column with Zero
        for (int i=0;i<=n;i++){
            t[i][0] = 0;
        }
        for (int i=0;i<=m;i++){
            t[0][i] = 0;
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++){
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        return t[n][m];
    }
}
