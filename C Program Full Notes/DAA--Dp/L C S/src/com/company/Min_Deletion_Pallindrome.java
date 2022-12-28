package com.company;

import java.util.Scanner;
    //Minimum number of deletion required on a string to make the string a palindrome

public class Min_Deletion_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = sc.nextLine();

        System.out.println("Min number of deletion to make the string palindrome: "+ (s1.length()-lps(s1,s1.length())));
    }

    public static int lps(String s1, int n){
        int m=n;
        String s2 = new StringBuilder(s1).reverse().toString();
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
