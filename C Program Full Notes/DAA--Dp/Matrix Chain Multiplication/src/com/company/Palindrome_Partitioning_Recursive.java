package com.company;

import java.util.Scanner;

//Recursive code: Palindrome Partitioning problem
public class Palindrome_Partitioning_Recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("The minimum number of partitions required to make the string palindrome: "+solve(s,0,s.length()-1));
    }

    public static int solve(String s, int i, int j){
        if (i>=j){
            return 0;
        }
        if (isPalindrome(s,i,j) == true){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int tempAns = solve(s,i,k) + solve(s,k+1,j) + 1;

            if (min > tempAns)
                min = tempAns;
        }
        return min;
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
