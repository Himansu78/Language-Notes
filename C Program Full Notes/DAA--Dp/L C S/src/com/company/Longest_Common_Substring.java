package com.company;

import java.util.Scanner;

public class Longest_Common_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter first String: ");
        String s2 = sc.nextLine();

        System.out.println("The length of longest common substring is: "+lcs(s1,s2,s1.length(),s2.length()));
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
                    t[i][j] = 0;
            }
        }
        return t[n][m];
    }
}
