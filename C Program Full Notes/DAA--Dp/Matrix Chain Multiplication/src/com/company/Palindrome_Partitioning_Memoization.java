package com.company;

import java.util.Arrays;
import java.util.Scanner;

//Palindrome Partitioning problem : Bottom-up DP
public class Palindrome_Partitioning_Memoization {
    public static int[][] t = new int[100][100]; //To be decided according the constraints in the question
    public static void main(String[] args) {
        for (int[] ar: t){
            Arrays.fill(ar,-1);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("The minimum number of partitions required to make the string palindrome: "+solve(s,0,s.length()-1));
    }

    public static int solve(String s, int i, int j){
        if (i>=j)
            return 0;

        if (isPalindrome(s,i,j) == true)
            return 0;

        if (t[i][j] != -1){
            return t[i][j];
        }

        int mn = Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int tempAns = solve(s,i,k) + solve(s,k+1,j) + 1;

            mn = Math.min(mn,tempAns);
        }
        return t[i][j] = mn;
    }

    public static boolean isPalindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }
        while(i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }

}
