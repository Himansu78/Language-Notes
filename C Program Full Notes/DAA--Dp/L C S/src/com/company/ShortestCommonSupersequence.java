package com.company;

import java.util.Scanner;

//Here we will return the length og shortest common Supersequence between two strings
public class ShortestCommonSupersequence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first String: ");
            String s1 = sc.nextLine();
            System.out.print("Enter first String: ");
            String s2 = sc.nextLine();

            System.out.println("The length of Shortest common super-sequence is: "+scs(s1,s2,s1.length(),s2.length()));
        }
    public static int scs(String s1, String s2, int n, int m){
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
        int lcs = t[n][m];
        return (m+n)-lcs; // Length of shortest common super-sequence
    }
}
