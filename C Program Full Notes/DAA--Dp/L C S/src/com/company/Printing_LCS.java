package com.company;

import java.util.Scanner;

//Here we going to print longest common sub sequence between two strings using top-down dp
public class Printing_LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter first String: ");
        String s2 = sc.nextLine();

        System.out.println("The longest common subsequence is: "+ lcs(s1,s2,s1.length(),s2.length()));
    }
    public static String lcs(String s1, String s2, int n, int m) {
        int[][] t = new int[n+1][m+1];

        //Initialization of First row and column with Zero
        for (int i = 0; i<=n; i++) {
            t[i][0] = 0;
        }
        for (int i = 0; i<=m; i++) {
            t[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    t[i][j] = 1 + t[i - 1][j - 1];
                else
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
            }
        }

        //Additional code after lcs
        String s="";
        int i=n, j=m;
        while (i>0 && j>0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                s = s + s1.charAt(i-1);
                i--;
                j--;
            } else {
                if (t[i - 1][j] > t[i][j - 1]) {
                    i--;
                } else {
                    j--;
                }
            }
        }
        return new StringBuilder(s).reverse().toString();
    }
}
