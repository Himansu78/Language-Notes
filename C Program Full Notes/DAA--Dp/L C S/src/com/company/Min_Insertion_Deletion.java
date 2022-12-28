package com.company;

import java.util.Scanner;

//Here we will find the number of insertion and deletion required
    // to be performed on a string such that it will be converted to another string
public class Min_Insertion_Deletion {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first String: ");
            String s1 = sc.nextLine();
            System.out.print("Enter first String: ");
            String s2 = sc.nextLine();

            int lcs = lcs(s1,s2,s1.length(),s2.length());
            System.out.println("Min No of Deletion: "+ (s1.length()-lcs));
            System.out.println("Min No of Insertion: "+ (s2.length()-lcs));
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
