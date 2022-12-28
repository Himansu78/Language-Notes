package com.company;
    //Sequence Pattern Matching Problem:two strings are given we have
    // to find one string is present in another string or not

import java.util.Scanner;

public class SequencePatternMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string A:" );
        String s1 = sc.nextLine();
        System.out.print("Enter string B:" );
        String s2 = sc.nextLine();

        if (spm(s1,s2) == true){
            System.out.println("String A is Present in B");
        }else{
            System.out.println("String A is not Present in B");
        }

    }
    
    public static boolean spm(String s1, String s2){
        int lcs = lcs(s1,s2,s1.length(),s2.length());

        if (lcs == s1.length()){
            return true;
        }else{
            return false;
        }
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
