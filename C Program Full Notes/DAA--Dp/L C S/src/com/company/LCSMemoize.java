package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Longest common subsequence Bottom-up DP or Memoize code
public class LCSMemoize {
    public static int  t[][] = new int[100][100]; // The dimension will be from constraints section of problem here 0 <= n <= 99

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int[] row:t) {
            Arrays.fill(row,-1);
        }

        System.out.print("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter first String: ");
        String s2 = sc.nextLine();

        System.out.println("The length of longest common subsequence is: "+lcs(s1,s2,s1.length(),s2.length()));
    }
    public static int lcs(String s1, String s2, int n,int m){
        if (n==0 || m==0)
            return 0;
        if (t[n][m] != -1){
            return t[n][m];
        }
        if (s1.charAt(n-1) == s2.charAt(m-1)){
            return t[n][m] = 1+lcs(s1, s2, n-1, m-1);
        }else{
            return t[n][m] = Math.max(lcs(s1, s2, n, m-1),lcs(s1, s2, n-1, m));
        }
    }
}
